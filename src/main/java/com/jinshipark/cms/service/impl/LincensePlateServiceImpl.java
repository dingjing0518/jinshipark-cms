package com.jinshipark.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshipark.cms.bo.SearchBO;
import com.jinshipark.cms.mapper.LincensePlateMapper;
import com.jinshipark.cms.model.LincensePlate;
import com.jinshipark.cms.model.LincensePlateExample;
import com.jinshipark.cms.service.LincensePlateService;
import com.jinshipark.cms.utils.PagedGridResult;
import com.jinshipark.cms.vo.LincensePlateVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service
public class LincensePlateServiceImpl implements LincensePlateService {
    @Autowired
    private LincensePlateMapper lincensePlateMapper;

    @Override
    public PagedGridResult searchLincensePlate(SearchBO searchBO) throws ParseException {
        List<LincensePlateVO> lincensePlateVOS = new ArrayList<>();
        LincensePlateExample example = new LincensePlateExample();
        LincensePlateExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("lp_create_time desc");
        criteria.andLpParkingNameEqualTo(searchBO.getParkId());
        criteria.andLpCreateTimeGreaterThan(searchBO.getDateForStartTime());
        criteria.andLpCreateTimeLessThanOrEqualTo(searchBO.getDateForEndTime());
        criteria.andLpLincensePlateIdCarLike("%" + searchBO.getKeyWord() + "%");
        if (StringUtils.isNotBlank(searchBO.getLpOrderState())) {
            criteria.andLpOrderStateEqualTo(searchBO.getLpOrderState());
        }
        // 分页
        PageHelper.startPage(searchBO.getPageNum(), searchBO.getPageSize());
        List<LincensePlate> lincensePlates = lincensePlateMapper.selectByExample(example);
        for (LincensePlate lincensePlate : lincensePlates) {
            LincensePlateVO lincensePlateVO = new LincensePlateVO();
            BeanUtils.copyProperties(lincensePlate, lincensePlateVO);
            lincensePlateVOS.add(lincensePlateVO);
        }
        PageInfo<?> pageList = new PageInfo<>(lincensePlates);
        PagedGridResult grid = new PagedGridResult();
        grid.setPage(searchBO.getPageNum());
        grid.setRows(lincensePlateVOS);
        grid.setTotal(pageList.getPages());
        grid.setRecords(pageList.getTotal());
        return grid;
    }
}
