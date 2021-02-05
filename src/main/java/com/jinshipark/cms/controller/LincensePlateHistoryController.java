package com.jinshipark.cms.controller;

import com.jinshipark.cms.bo.SearchBO;
import com.jinshipark.cms.service.LincensePlateHistoryService;
import com.jinshipark.cms.utils.JinshiparkJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@Controller
@RequestMapping("/lincensePlateHistory")
public class LincensePlateHistoryController {
    @Autowired
    private LincensePlateHistoryService lincensePlateHistoryService;

    @CrossOrigin
    @RequestMapping(value = "/searchLincensePlateHistory", method = RequestMethod.POST)
    @ResponseBody
    public JinshiparkJSONResult searchLincensePlateHistory(@RequestBody SearchBO searchBO) throws ParseException {
        return JinshiparkJSONResult.ok(lincensePlateHistoryService.searchLincensePlateHistory(searchBO));
    }
}
