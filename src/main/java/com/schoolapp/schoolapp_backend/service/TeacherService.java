package com.schoolapp.schoolapp_backend.service;

import java.util.List;

import com.schoolapp.schoolapp_backend.DAO.TeacherRepository;
import com.schoolapp.schoolapp_backend.module.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    
    @Autowired(required = true)
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeacher(){
        return this.teacherRepository.findAll();
    }

    public void saveAllTeacher(List<Teacher> teachers){
        this.teacherRepository.saveAll(teachers);
    }
}
