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
    public JinshiparkJSONResult todaySummary(@RequestBody SearchBO searchBO) throws ParseException {
        return summaryService.todaySummary(searchBO);
    }

    /**
     * 每日汇总
     */
    @CrossOrigin
    @RequestMapping(value = "/dailySummary", method = RequestMethod.POST)
    @ResponseBody
    public JinshiparkJSONResult dailySummary(@RequestBody SearchBO searchBO){
        return JinshiparkJSONResult.ok(summaryService.dailySummary(searchBO));
    }


    /**
     * 每月汇总
     */
    @CrossOrigin
    @RequestMapping(value = "/monthlySummary", method = RequestMethod.POST)
    @ResponseBody
    public JinshiparkJSONResult monthlySummary(@RequestBody SearchBO searchBO){
        return JinshiparkJSONResult.ok(summaryService.monthlySummary(searchBO));
    }

    /**
     * 每年汇总
     */
    @CrossOrigin
    @RequestMapping(value = "/annuallySummary", method = RequestMethod.POST)
    @ResponseBody
    public JinshiparkJSONResult annuallySummary(@RequestBody SearchBO searchBO){
        return JinshiparkJSONResult.ok(summaryService.annuallySummary(searchBO));
    }
}
