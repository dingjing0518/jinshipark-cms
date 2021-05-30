package com.jinshipark.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshipark.cms.bo.SearchBO;
import com.jinshipark.cms.mapper.*;
import com.jinshipark.cms.service.SummaryService;
import com.jinshipark.cms.utils.JinshiparkJSONResult;
import com.jinshipark.cms.utils.PagedGridResult;
import com.jinshipark.cms.vo.SummaryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SummaryServiceImpl implements SummaryService {
    @Autowired
    private LincensePlateHistoryCustomizeMapper lincensePlateHistoryCustomizeMapper;

    @Autowired
    private JinshiparkReturnmoneyCustomizeMapper jinshiparkReturnmoneyCustomizeMapper;

    @Autowired
    private JinshiparkDaysumCustomizeMapper jinshiparkDaysumCustomizeMapper;

    @Override
    public JinshiparkJSONResult todaySummary(SearchBO searchBO) throws ParseException {
        List<SummaryVO> result = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("parkId", searchBO.getParkId());
        map.put("startTime", searchBO.getDateForStartTime());
        map.put("endTime", searchBO.getDateForEndTime());
        List<SummaryVO> list = lincensePlateHistoryCustomizeMapper.summary(map);
        List<SummaryVO> summaryVOList = lincensePlateHistoryCustomizeMapper.summaryByPaymentType(map);
        SummaryVO summaryVO = jinshiparkReturnmoneyCustomizeMapper.summary(map);
        if (list.size() > 0) {
            SummaryVO s = list.get(0);
            s.setPrePayMoney("0.0");
            s.setScanPayMoney("0.0");
            s.setManualMoney("0.0");
            if (s.getServiceFee() == null) {
                s.setServiceFee("0.0");
            }
            s.setRefundMoney("0.0");
            s.setRefundServiceFee("0.0");
            for (SummaryVO summary : summaryVOList) {
                switch (summary.getPaymentType()) {
                    case "扫码支付出场":
                        s.setScanPayMoney(summary.getRealCost() == null ? "0.0" : summary.getRealCost());
                        break;
                    case "预付款出场":
                        s.setPrePayMoney(summary.getRealCost() == null ? "0.0" : summary.getRealCost());
                        break;
                    case "人工收费出场":
                        s.setManualMoney(summary.getRealCost() == null ? "0.0" : summary.getRealCost());
                        break;
                }
            }
            if (summaryVO != null) {
                s.setRefundMoney(summaryVO.getRefundMoney() == null ? "0.0" : summaryVO.getRefundMoney());
                s.setRefundServiceFee(summaryVO.getRefundServiceFee() == null ? "0.0" : summaryVO.getRefundServiceFee());
            }
            result.addAll(list);
        } else {
            if (summaryVO != null) {
                summaryVO.setCarNum("0");
                summaryVO.setParkingCost("0.0");
                summaryVO.setRealCost("0.0");
                summaryVO.setPrePayMoney("0");
                summaryVO.setScanPayMoney("0.0");
                summaryVO.setManualMoney("0.0");
                if (summaryVO.getRefundMoney() == null) {
                    summaryVO.setRefundMoney("0.0");
                }
                if (summaryVO.getRefundServiceFee() == null) {
                    summaryVO.setRefundServiceFee("0.0");
                }
                result.add(summaryVO);
            }
        }
        return JinshiparkJSONResult.ok(result);
    }

    @Override
    public PagedGridResult dailySummary(SearchBO searchBO) {
        Map<String, Object> map = new HashMap<>();
        map.put("parkId", searchBO.getParkId());
        map.put("startTime", searchBO.getStartTime());
        map.put("endTime", searchBO.getEndTime());
        //分页
        PageHelper.startPage(searchBO.getPageNum(), searchBO.getPageSize());
        List<SummaryVO> result = jinshiparkDaysumCustomizeMapper.dailySummary(map);

        PageInfo<?> pageList = new PageInfo<>(result);
        PagedGridResult grid = new PagedGridResult();
        grid.setPage(searchBO.getPageNum());
        grid.setRows(result);
        grid.setTotal(pageList.getPages());
        grid.setRecords(pageList.getTotal());
        return grid;
    }

    @Override
    public PagedGridResult monthlySummary(SearchBO searchBO) {
        Map<String, Object> map = new HashMap<>();
        map.put("parkId", searchBO.getParkId());
        map.put("startTime", searchBO.getStartTime());
        map.put("endTime", searchBO.getEndTime());
        //分页
        PageHelper.startPage(searchBO.getPageNum(), searchBO.getPageSize());
        List<SummaryVO> result = jinshiparkDaysumCustomizeMapper.monthlySummary(map);

        PageInfo<?> pageList = new PageInfo<>(result);
        PagedGridResult grid = new PagedGridResult();
        grid.setPage(searchBO.getPageNum());
        grid.setRows(result);
        grid.setTotal(pageList.getPages());
        grid.setRecords(pageList.getTotal());
        return grid;
    }

    @Override
    public PagedGridResult annuallySummary(SearchBO searchBO) {
        Map<String, Object> map = new HashMap<>();
        map.put("parkId", searchBO.getParkId());
        map.put("startTime", searchBO.getStartTime());
        map.put("endTime", searchBO.getEndTime());
        //分页
        PageHelper.startPage(searchBO.getPageNum(), searchBO.getPageSize());
        List<SummaryVO> result = jinshiparkDaysumCustomizeMapper.annuallySummary(map);

        PageInfo<?> pageList = new PageInfo<>(result);
        PagedGridResult grid = new PagedGridResult();
        grid.setPage(searchBO.getPageNum());
        grid.setRows(result);
        grid.setTotal(pageList.getPages());
        grid.setRecords(pageList.getTotal());
        return grid;
    }
}
