package com.schoolapp.schoolapp_backend.DAO;
import java.util.List;

import com.schoolapp.schoolapp_backend.module.Teacher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{
    List<Teacher> findAll();
}
