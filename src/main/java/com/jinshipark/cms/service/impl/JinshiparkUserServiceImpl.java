package com.jinshipark.cms.service.impl;

import com.jinshipark.cms.bo.JinshiparkUserBO;
import com.jinshipark.cms.mapper.JinshiparkApakeyMapper;
import com.jinshipark.cms.mapper.JinshiparkUserMapper;
import com.jinshipark.cms.model.JinshiparkApakey;
import com.jinshipark.cms.model.JinshiparkApakeyExample;
import com.jinshipark.cms.model.JinshiparkUser;
import com.jinshipark.cms.model.JinshiparkUserExample;
import com.jinshipark.cms.service.JinshiparkUserService;
import com.jinshipark.cms.utils.JinshiparkJSONResult;
import com.jinshipark.cms.utils.MD5Utils;
import com.jinshipark.cms.vo.JinshiparkUserVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
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

    @Autowired
    private JinshiparkApakeyMapper jinshiparkApakeyMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public JinshiparkJSONResult login(JinshiparkUserBO jinshiparkUserBO) throws NoSuchAlgorithmException {
        if (StringUtils.isBlank(jinshiparkUserBO.getParkName())) {
            return JinshiparkJSONResult.errorMsg("车场名称不能为空");
        }
        if (StringUtils.isBlank(jinshiparkUserBO.getLoginName()) || StringUtils.isBlank(jinshiparkUserBO.getPassword())) {
            return JinshiparkJSONResult.errorMsg("用户名或者密码不能为空");
        }
        //判断车场名称是否存在
        JinshiparkApakeyExample jinshiparkApakeyExample = new JinshiparkApakeyExample();
        JinshiparkApakeyExample.Criteria jinshiparkApakeyExampleCriteria = jinshiparkApakeyExample.createCriteria();
        jinshiparkApakeyExampleCriteria.andParknameEqualTo(jinshiparkUserBO.getParkName());
        List<JinshiparkApakey> jinshiparkApakeys = jinshiparkApakeyMapper.selectByExample(jinshiparkApakeyExample);
        if (jinshiparkApakeys.size() == 0) {
            return JinshiparkJSONResult.errorMsg("车场名称不存在");
        }
        JinshiparkApakey jinshiparkApakey = jinshiparkApakeys.get(0);

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
        criteria.andParkidEqualTo(jinshiparkApakey.getParkid());
        List<JinshiparkUser> list = jinshiparkUserMapper.selectByExample(example);
        if (null == list || list.size() == 0) {
            return JinshiparkJSONResult.errorMsg("用户名密码或者车场名称错误");
        }
        JinshiparkUserVO jinshiparkUserVO = new JinshiparkUserVO();
        BeanUtils.copyProperties(list.get(0), jinshiparkUserVO);
        return JinshiparkJSONResult.ok(jinshiparkUserVO);
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
