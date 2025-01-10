package com.example.testtech.Mapper;

import com.example.testtech.DTO.Sameple;
import org.apache.ibatis.annotations.Lang;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.javassist.tools.reflect.Sample;
import org.mybatis.scripting.freemarker.FreeMarkerLanguageDriver;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface SampleMapper {

    @Lang(FreeMarkerLanguageDriver.class)
    @Select("/sql/findById.ftl")
    List<Sameple> selectAll(@Param("id") String id);
}
