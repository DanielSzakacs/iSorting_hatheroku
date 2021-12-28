package com.schoolapp.schoolapp_backend.service;

import java.util.List;

import com.schoolapp.schoolapp_backend.DAO.StudentRepository;
import com.schoolapp.schoolapp_backend.module.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired(required = true)
    private StudentRepository studentRepository;

    public List<Student> getAllStudent(){
        return this.studentRepository.findAll();
    }

    public void saveNewStudent(Student student){
        this.studentRepository.save(student);
    }

    public void saveAllNewStudent(List<Student> listOfStudent){
        this.studentRepository.saveAll(listOfStudent);
    }

    public void updateUserDescription(String details, int id){
        this.studentRepository.updateUserData(details, String.valueOf(id));
    }

    public void deleteStudent(Student student){
        this.studentRepository.delete(student);
    }
    
}
