package com.jinshipark.cms.service.impl;

import com.jinshipark.cms.bo.JinshiparkUserBO;
import com.jinshipark.cms.mapper.JinshiparkUserMapper;
import com.jinshipark.cms.model.JinshiparkUser;
import com.jinshipark.cms.model.JinshiparkUserExample;
import com.jinshipark.cms.service.JinshiparkUserService;
import com.jinshipark.cms.utils.JinshiparkJSONResult;
import com.jinshipark.cms.utils.MD5Utils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class JinshiparkUserServiceImpl implements JinshiparkUserService {

    @Autowired
    private JinshiparkUserMapper jinshiparkUserMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public JinshiparkJSONResult login(JinshiparkUserBO jinshiparkUserBO) throws NoSuchAlgorithmException {
        if (StringUtils.isBlank(jinshiparkUserBO.getParkId())) {
            return JinshiparkJSONResult.errorMsg("车场名称不能为空");
        }
        if (StringUtils.isBlank(jinshiparkUserBO.getLoginName()) || StringUtils.isBlank(jinshiparkUserBO.getPassword())) {
            return JinshiparkJSONResult.errorMsg("用户名或者密码不能为空");
        }
        //判断车场名称是否存在
        JinshiparkUserExample exampleParkId = new JinshiparkUserExample();
        JinshiparkUserExample.Criteria criteriaParkId = exampleParkId.createCriteria();
        criteriaParkId.andParkidEqualTo(jinshiparkUserBO.getParkId());
        long countParkId = jinshiparkUserMapper.countByExample(exampleParkId);

        if (countParkId < 1) {
            return JinshiparkJSONResult.errorMsg("车场名称不存在");
        }

        //用户名为admin
        if (jinshiparkUserBO.getLoginName().equals("admin")) {
            if (jinshiparkUserBO.getPassword().equals(MD5Utils.encode("123456"))) {
                JinshiparkUser jinshiparkUser = new JinshiparkUser();
                jinshiparkUser.setLoginname("admin");
                jinshiparkUser.setPassword(MD5Utils.encode("123456"));
                jinshiparkUser.setParkid(jinshiparkUserBO.getParkId());
                jinshiparkUser.setRoleName("admin");
                return JinshiparkJSONResult.ok(jinshiparkUser);
            } else {
                return JinshiparkJSONResult.errorMsg("密码错误");
            }
        }
        //用户名为guest
        if (jinshiparkUserBO.getLoginName().equals("guest")) {
            if (jinshiparkUserBO.getPassword().equals(MD5Utils.encode("123456"))) {
                JinshiparkUser jinshiparkUser = new JinshiparkUser();
                jinshiparkUser.setLoginname("guest");
                jinshiparkUser.setPassword(MD5Utils.encode("123456"));
                jinshiparkUser.setParkid(jinshiparkUserBO.getParkId());
                jinshiparkUser.setRoleName("guest");
                return JinshiparkJSONResult.ok(jinshiparkUser);
            } else {
                return JinshiparkJSONResult.errorMsg("密码错误");
            }
        }
        //判断用户名是否存在
        JinshiparkUserExample exampleLoginName = new JinshiparkUserExample();
        JinshiparkUserExample.Criteria criteriaLoginName = exampleLoginName.createCriteria();
        criteriaLoginName.andLoginnameEqualTo(jinshiparkUserBO.getLoginName());
        long countLoginName = jinshiparkUserMapper.countByExample(exampleLoginName);
        if (countLoginName < 1) {
            return JinshiparkJSONResult.errorMsg("用户名不存在");
        }

        JinshiparkUserExample example = new JinshiparkUserExample();
        JinshiparkUserExample.Criteria criteria = example.createCriteria();
        criteria.andLoginnameEqualTo(jinshiparkUserBO.getLoginName());
        criteria.andPasswordEqualTo(jinshiparkUserBO.getPassword());
        criteria.andParkidEqualTo(jinshiparkUserBO.getParkId());
        List<JinshiparkUser> list = jinshiparkUserMapper.selectByExample(example);
        if (null == list || list.size() == 0) {
            return JinshiparkJSONResult.errorMsg("密码或者车场名称错误");
        }
        return JinshiparkJSONResult.ok(list.get(0));
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public JinshiparkJSONResult updatePassword(JinshiparkUserBO jinshiparkUserBO) {
        JinshiparkUser record = new JinshiparkUser();
        record.setId(jinshiparkUserBO.getId());
        record.setPassword(jinshiparkUserBO.getPassword());
        int result = jinshiparkUserMapper.updateByPrimaryKeySelective(record);
        if (result > 0) {
            return JinshiparkJSONResult.ok();
        }
        return JinshiparkJSONResult.errorMsg("修改密码失败");
    }
}
