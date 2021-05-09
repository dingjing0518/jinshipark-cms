package com.jinshipark.cms.service;

import com.jinshipark.cms.bo.SearchBO;
import com.jinshipark.cms.utils.JinshiparkJSONResult;

import java.text.ParseException;

public interface SummaryService {
    JinshiparkJSONResult financialSummary(SearchBO searchBO) throws ParseException;
}
