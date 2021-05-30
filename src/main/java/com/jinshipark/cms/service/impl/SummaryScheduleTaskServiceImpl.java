package com.jinshipark.cms.service.impl;

import com.jinshipark.cms.mapper.*;
import com.jinshipark.cms.service.SummaryScheduleTaskService;
import com.jinshipark.cms.vo.SummaryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummaryScheduleTaskServiceImpl implements SummaryScheduleTaskService {
    @Autowired
    private JinshiparkDaysumCustomizeMapper jinshiparkDaysumCustomizeMapper;

    @Autowired
    private LincensePlateHistoryCustomizeMapper lincensePlateHistoryCustomizeMapper;

    @Autowired
    private JinshiparkReturnmoneyCustomizeMapper jinshiparkReturnmoneyCustomizeMapper;

    @Override
    public void summaryTask() {
        List<SummaryVO> plateHistoryList = lincensePlateHistoryCustomizeMapper.dailySummary();
        List<SummaryVO> dailySummaryByPaymentType = lincensePlateHistoryCustomizeMapper.dailySummaryByPaymentType();
        //更新支付类型的金额
        for (SummaryVO summaryVO : plateHistoryList) {
            summaryVO.setManualMoney("0.0");
            summaryVO.setScanPayMoney("0.0");
            summaryVO.setPrePayMoney("0.0");
            for (SummaryVO s : dailySummaryByPaymentType) {
                if (summaryVO.getParkId().equals(s.getParkId())) {
                    for (SummaryVO vo : s.getSummaryVOList()) {
                        if (vo.getPaymentType().equals("扫码支付出场")) {
                            summaryVO.setScanPayMoney(vo.getRealCost());
                        } else if (vo.getPaymentType().equals("预付款出场")) {
                            summaryVO.setPrePayMoney(vo.getRealCost());
                        } else if (vo.getPaymentType().equals("人工收费出场")) {
                            summaryVO.setManualMoney(vo.getRealCost());
                        }
                    }
                }
            }
        }
        List<SummaryVO> returnMoneyList = jinshiparkReturnmoneyCustomizeMapper.dailySummary();
        for (SummaryVO summaryVO : plateHistoryList) {
            if (summaryVO.getServiceFee() == null) {
                summaryVO.setServiceFee("0.0");
            }
            summaryVO.setRefundMoney("0.0");
            summaryVO.setRefundServiceFee("0.0");
            for (SummaryVO sub : returnMoneyList) {
                if (summaryVO.getParkId().equals(sub.getParkId())) {
                    summaryVO.setRefundMoney(sub.getRefundMoney() == null ? "0.0" : sub.getRefundMoney());
                    summaryVO.setRefundServiceFee(sub.getRefundServiceFee() == null ? "0.0" : sub.getRefundServiceFee());
                    break;
                }
            }
        }
        jinshiparkDaysumCustomizeMapper.batchInsert(plateHistoryList);
    }
}
