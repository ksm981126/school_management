package com.greenart.school_management.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DashboardMapper {
    public Integer getTotalDepartmentCnt();
    public Integer getActiveDepartmentCnt();
    public Integer getDeactivDepartmentCnt();

    public Integer getTotalTeacherCnt();
    public Integer getWorkTeacherCnt();
    public Integer getDayoffTeacherCnt();

    public Integer getTotalStudentCnt();
    public Integer getAttendStudentCnt();
    public Integer getDayoffStudentCnt();
    public Integer getLeaveStudentCnt();

    public Integer getTotalSubjectCnt();
    public Integer getActiveSubjectCnt();
    public Integer getDeactiveSubjectCnt();
    public Integer getFinishSubjectCnt();
}
