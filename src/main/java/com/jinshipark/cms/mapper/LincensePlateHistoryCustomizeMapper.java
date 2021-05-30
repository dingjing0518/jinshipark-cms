package com.jinshipark.cms.mapper;

import com.jinshipark.cms.vo.SummaryVO;

import java.util.List;
import java.util.Map;

public interface LincensePlateHistoryCustomizeMapper {

    List<SummaryVO> summary(Map<String, Object> map);

    List<SummaryVO> summaryByPaymentType(Map<String, Object> map);

    List<SummaryVO> dailySummary();

    List<SummaryVO> dailySummaryByPaymentType();
}