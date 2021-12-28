package com.schoolapp.schoolapp_backend.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import com.schoolapp.schoolapp_backend.module.Student;
import com.schoolapp.schoolapp_backend.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class StudentController {


    @Autowired(required = true)
    private StudentService studentService;

    /**
     * Get all the students
     * @return
     * @throws Exception
     */
    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent() throws Exception{
        return this.studentService.getAllStudent();
    }

    /**
     * Endpoint for saving new users
     * @param student
     */
    @PostMapping("/saveNewStudent")
    public void saveNewsStudent(@RequestBody Student student){
        this.studentService.saveNewStudent(student);
    }

    /**
     * We can update the 'Other informations' by ID 
     * @param id
     * @param details
     */
    @PutMapping("/updateUser/{id}")
    public void updateUser(@PathParam("id") int id, @RequestBody String details){
        this.studentService.updateUserDescription(details, id);
    }

}
