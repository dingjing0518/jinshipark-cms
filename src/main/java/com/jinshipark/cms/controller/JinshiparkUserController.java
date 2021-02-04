package com.jinshipark.cms.controller;

import com.jinshipark.cms.bo.JinshiparkUserBO;
import com.jinshipark.cms.service.JinshiparkUserService;
import com.jinshipark.cms.utils.JinshiparkJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 商户后台用户管理类
 */
@Controller
@RequestMapping("/user")
public class JinshiparkUserController {

    @Autowired
    private JinshiparkUserService jinshiparkUserService;

    /**
     * 登录
     *
     * @param loginName 用户名
     * @param password  密码
     * @return 处理结果
     */
    @CrossOrigin
    @GetMapping(value = "/login")
    @ResponseBody
    public JinshiparkJSONResult login(@RequestParam("loginName") String loginName,
                                      @RequestParam("password") String password) {
        return jinshiparkUserService.login(loginName, password);
    }

    /**
     * 修改密码
     *
     * @param jinshiparkUserBO 参数实体
     * @return 处理结果
     */
    @CrossOrigin
    @PostMapping(value = "/updatePassword")
    @ResponseBody
    public JinshiparkJSONResult updatePassword(@RequestBody JinshiparkUserBO jinshiparkUserBO) {
        return jinshiparkUserService.updatePassword(jinshiparkUserBO);
    }

}
