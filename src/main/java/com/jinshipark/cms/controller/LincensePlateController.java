package com.jinshipark.cms.controller;

import com.jinshipark.cms.bo.SearchBO;
import com.jinshipark.cms.service.LincensePlateService;
import com.jinshipark.cms.utils.JinshiparkJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@Controller
@RequestMapping("/lincensePlate")
public class LincensePlateController {

    @Autowired
    private LincensePlateService lincensePlateService;

    @CrossOrigin
    @RequestMapping(value = "/searchLincensePlate", method = RequestMethod.POST)
    @ResponseBody
    public JinshiparkJSONResult searchLincensePlate(@RequestBody SearchBO searchBO) throws ParseException {
        return JinshiparkJSONResult.ok(lincensePlateService.searchLincensePlate(searchBO));
    }

}
