package com.jinshipark.cms.mapper;

import com.jinshipark.cms.vo.SummaryVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface JinshiparkDaysumCustomizeMapper {

    int batchInsert(@Param("jinshiparkDaysumList") List<SummaryVO> summaryVOList);

    List<SummaryVO> dailySummary(Map<String, Object> map);

    List<SummaryVO> monthlySummary(Map<String, Object> map);

    List<SummaryVO> annuallySummary(Map<String, Object> map);
}
