package com.jinshipark.cms.mapper;

import com.jinshipark.cms.model.JinshiparkDaysum;
import com.jinshipark.cms.model.JinshiparkDaysumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JinshiparkDaysumMapper {
    long countByExample(JinshiparkDaysumExample example);

    int deleteByExample(JinshiparkDaysumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JinshiparkDaysum record);

    int insertSelective(JinshiparkDaysum record);

    List<JinshiparkDaysum> selectByExample(JinshiparkDaysumExample example);

    JinshiparkDaysum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JinshiparkDaysum record, @Param("example") JinshiparkDaysumExample example);

    int updateByExample(@Param("record") JinshiparkDaysum record, @Param("example") JinshiparkDaysumExample example);

    int updateByPrimaryKeySelective(JinshiparkDaysum record);

    int updateByPrimaryKey(JinshiparkDaysum record);
}