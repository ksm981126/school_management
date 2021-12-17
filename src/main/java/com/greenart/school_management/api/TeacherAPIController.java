package com.greenart.school_management.api;

import java.util.Map;

import com.greenart.school_management.data.TeacherVo;
import com.greenart.school_management.service.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherAPIController {
    @Autowired TeacherService service;
    @PostMapping("/teacher/add")
    public Map<String, Object> postTeacherAdd(@RequestBody TeacherVo data) throws Exception{
        return service.addTeacherInfo(data);
    }
}
