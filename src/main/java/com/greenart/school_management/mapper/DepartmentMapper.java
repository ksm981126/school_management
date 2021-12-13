package com.greenart.school_management.mapper;

import java.util.List;

import com.greenart.school_management.data.DepartmentVo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper {
    public List<DepartmentVo> getDepartmentInfo(Integer offset);
    public Integer getDepartmentCount();
    public void addDepartment(DepartmentVo data);
    public void deleteDepartment(Integer seq);
}
