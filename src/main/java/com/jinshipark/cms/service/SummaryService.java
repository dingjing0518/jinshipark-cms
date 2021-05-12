package com.jinshipark.cms.service;

import com.jinshipark.cms.bo.SearchBO;
import com.jinshipark.cms.utils.JinshiparkJSONResult;
import com.jinshipark.cms.utils.PagedGridResult;

import java.text.ParseException;

public interface SummaryService {
    JinshiparkJSONResult todaySummary(SearchBO searchBO) throws ParseException;

    PagedGridResult dailySummary(SearchBO searchBO);

    PagedGridResult monthlySummary(SearchBO searchBO);

    PagedGridResult annuallySummary(SearchBO searchBO);

}
