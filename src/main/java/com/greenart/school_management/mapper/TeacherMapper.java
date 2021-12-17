package com.greenart.school_management.mapper;

import java.util.List;

import com.greenart.school_management.data.TeacherVo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {
    public void addTeacherInfo(TeacherVo data);
    public List<TeacherVo> getTeacherList(String type, String keyword, Integer offset);
    public Integer getTeacherCnt(String type, String keyword);
}
