package com.jinshipark.cms.mapper;

import com.jinshipark.cms.vo.SummaryVO;

import java.util.List;
import java.util.Map;

public interface JinshiparkReturnmoneyCustomizeMapper {

    SummaryVO summary(Map<String, Object> map);

    List<SummaryVO> dailySummary();

}
