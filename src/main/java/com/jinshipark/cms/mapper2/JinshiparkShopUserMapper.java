package com.jinshipark.cms.mapper2;

import com.jinshipark.cms.model.JinshiparkShopUser;
import com.jinshipark.cms.model.JinshiparkShopUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JinshiparkShopUserMapper {
    long countByExample(JinshiparkShopUserExample example);

    int deleteByExample(JinshiparkShopUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JinshiparkShopUser record);

    int insertSelective(JinshiparkShopUser record);

    List<JinshiparkShopUser> selectByExample(JinshiparkShopUserExample example);

    JinshiparkShopUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JinshiparkShopUser record, @Param("example") JinshiparkShopUserExample example);

    int updateByExample(@Param("record") JinshiparkShopUser record, @Param("example") JinshiparkShopUserExample example);

    int updateByPrimaryKeySelective(JinshiparkShopUser record);

    int updateByPrimaryKey(JinshiparkShopUser record);
}