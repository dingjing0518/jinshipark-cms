package com.jinshipark.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshipark.cms.bo.SearchBO;
import com.jinshipark.cms.mapper.JinshiparkDaysumMapper;
import com.jinshipark.cms.mapper.JinshiparkReturnmoneyMapper;
import com.jinshipark.cms.mapper.LincensePlateHistoryMapper;
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
    private LincensePlateHistoryMapper lincensePlateHistoryMapper;

    @Autowired
    private JinshiparkReturnmoneyMapper jinshiparkReturnmoneyMapper;

    @Autowired
    private JinshiparkDaysumMapper jinshiparkDaysumMapper;

    @Override
    public JinshiparkJSONResult todaySummary(SearchBO searchBO) throws ParseException {
        List<SummaryVO> result = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("parkId", searchBO.getParkId());
        map.put("startTime", searchBO.getDateForStartTime());
        map.put("endTime", searchBO.getDateForEndTime());
        List<SummaryVO> list = lincensePlateHistoryMapper.summary(map);
        SummaryVO summaryVO = jinshiparkReturnmoneyMapper.summary(map);
        if (list.size() > 0) {
            if (summaryVO != null) {
                list.get(0).setRefundMoney(summaryVO.getRefundMoney());
            }
            result.addAll(list);
        } else {
            if (summaryVO != null) {
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
        List<SummaryVO> result = jinshiparkDaysumMapper.dailySummary(map);

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
        List<SummaryVO> result = jinshiparkDaysumMapper.monthlySummary(map);

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
        List<SummaryVO> result = jinshiparkDaysumMapper.annuallySummary(map);

        PageInfo<?> pageList = new PageInfo<>(result);
        PagedGridResult grid = new PagedGridResult();
        grid.setPage(searchBO.getPageNum());
        grid.setRows(result);
        grid.setTotal(pageList.getPages());
        grid.setRecords(pageList.getTotal());
        return grid;
    }
}
