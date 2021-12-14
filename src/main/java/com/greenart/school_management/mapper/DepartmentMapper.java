package com.greenart.school_management.mapper;

import java.util.List;

import com.greenart.school_management.data.DepartmentHistoryVo;
import com.greenart.school_management.data.DepartmentVo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper {
    public List<DepartmentVo> getDepartmentInfo(Integer offset, String keyword);
    public Integer getDepartmentCount(String keyword);
    public void addDepartment(DepartmentVo data);
    public void deleteDepartment(Integer seq);
    public DepartmentVo getDepartmentInfoBySeq(Integer seq);

    public void updateDepartment(DepartmentVo data);
    public Integer selectLatesDataSeq();

    public void insertDepartmentHistory(DepartmentHistoryVo data);
}
