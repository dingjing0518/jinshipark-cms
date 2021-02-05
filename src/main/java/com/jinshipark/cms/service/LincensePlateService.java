package com.jinshipark.cms.service;

import com.jinshipark.cms.bo.SearchBO;
import com.jinshipark.cms.utils.PagedGridResult;

import java.text.ParseException;

public interface LincensePlateService {

    PagedGridResult searchLincensePlate(SearchBO searchBO) throws ParseException;
}
