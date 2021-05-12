package com.jinshipark.cms.service.impl;

import com.jinshipark.cms.mapper.JinshiparkDaysumMapper;
import com.jinshipark.cms.mapper.JinshiparkReturnmoneyMapper;
import com.jinshipark.cms.mapper.LincensePlateHistoryMapper;
import com.jinshipark.cms.service.SummaryScheduleTaskService;
import com.jinshipark.cms.vo.SummaryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummaryScheduleTaskServiceImpl implements SummaryScheduleTaskService {
    @Autowired
    private JinshiparkDaysumMapper jinshiparkDaysumMapper;

    @Autowired
    private LincensePlateHistoryMapper lincensePlateHistoryMapper;

    @Autowired
    private JinshiparkReturnmoneyMapper jinshiparkReturnmoneyMapper;

    @Override
    public void summaryTask() {
        List<SummaryVO> plateHistoryList = lincensePlateHistoryMapper.dailySummary();
        List<SummaryVO> returnMoneyList = jinshiparkReturnmoneyMapper.dailySummary();
        for (SummaryVO summaryVO : plateHistoryList) {
            summaryVO.setRefundMoney("0.0");
            for (SummaryVO sub : returnMoneyList) {
                if (summaryVO.getParkId().equals(sub.getParkId())) {
                    summaryVO.setRefundMoney(sub.getRefundMoney());
                    break;
                }
            }
        }
        jinshiparkDaysumMapper.batchInsert(plateHistoryList);
    }
}
