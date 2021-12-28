package com.schoolapp.schoolapp_backend.controller;

import java.util.List;
import com.schoolapp.schoolapp_backend.module.Teacher;
import com.schoolapp.schoolapp_backend.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TeacherController {


    @Autowired(required = true)
    private TeacherService teacherService;

    
    /**
     * Get all the teacher
     * @return
     * @throws Exception
     */
    @GetMapping("/getAllTeacher")
    public List<Teacher> getAllStudent() throws Exception{
        return this.teacherService.getAllTeacher();
    }
}
