package com.jinshipark.cms.controller;

import com.jinshipark.cms.bo.SearchBO;
import com.jinshipark.cms.service.SummaryService;
import com.jinshipark.cms.utils.JinshiparkJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@Controller
public class SummaryController {
    @Autowired
    private SummaryService summaryService;

    /**
     * 当日汇总
     */
    @CrossOrigin
    @RequestMapping(value = "/todaySummary", method = RequestMethod.POST)
    @ResponseBody
    public JinshiparkJSONResult financialSummary(@RequestBody SearchBO searchBO) throws ParseException {
        return summaryService.financialSummary(searchBO);
    }
}
