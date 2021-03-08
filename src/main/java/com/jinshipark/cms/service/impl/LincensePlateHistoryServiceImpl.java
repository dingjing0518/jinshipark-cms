package com.jinshipark.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshipark.cms.bo.SearchBO;
import com.jinshipark.cms.mapper.LincensePlateHistoryMapper;
import com.jinshipark.cms.model.LincensePlateHistory;
import com.jinshipark.cms.model.LincensePlateHistoryExample;
import com.jinshipark.cms.service.LincensePlateHistoryService;
import com.jinshipark.cms.utils.PagedGridResult;
import com.jinshipark.cms.vo.LincensePlateHistoryVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service
public class LincensePlateHistoryServiceImpl implements LincensePlateHistoryService {
    @Autowired
    private LincensePlateHistoryMapper lincensePlateHistoryMapper;
    @Override
    public PagedGridResult searchLincensePlateHistory(SearchBO searchBO) throws ParseException {
        List<LincensePlateHistoryVO> lincensePlateHistoryVOS = new ArrayList<>();
        LincensePlateHistoryExample example = new LincensePlateHistoryExample();
        LincensePlateHistoryExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("lp_inbound_time desc");
        criteria.andLpParkingNameEqualTo(searchBO.getParkId());
        criteria.andLpDepartureTimeGreaterThan(searchBO.getDateForStartTime());
        criteria.andLpDepartureTimeLessThanOrEqualTo(searchBO.getDateForEndTime());
        criteria.andLpLincensePlateIdCarLike("%" + searchBO.getKeyWord() + "%");
        if (StringUtils.isNotBlank(searchBO.getLpOrderState())) {
            criteria.andLpOrderStateEqualTo(searchBO.getLpOrderState());
        }
        // 分页
        PageHelper.startPage(searchBO.getPageNum(), searchBO.getPageSize());
        List<LincensePlateHistory> lincensePlateHistories = lincensePlateHistoryMapper.selectByExample(example);
        for (LincensePlateHistory lincensePlateHistory : lincensePlateHistories) {
            LincensePlateHistoryVO lincensePlateHistoryVO = new LincensePlateHistoryVO();
            BeanUtils.copyProperties(lincensePlateHistory, lincensePlateHistoryVO);
            lincensePlateHistoryVOS.add(lincensePlateHistoryVO);
        }
        PageInfo<?> pageList = new PageInfo<>(lincensePlateHistories);
        PagedGridResult grid = new PagedGridResult();
        grid.setPage(searchBO.getPageNum());
        grid.setRows(lincensePlateHistoryVOS);
        grid.setTotal(pageList.getPages());
        grid.setRecords(pageList.getTotal());
        return grid;
    }
}
