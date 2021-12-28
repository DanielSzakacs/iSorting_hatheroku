package com.schoolapp.schoolapp_backend.DAO;


import java.util.List;

import com.schoolapp.schoolapp_backend.module.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

    List<Student> findAll();
    
    @Transactional
    @Modifying
    @Query("UPDATE Student student set student.details = (:details) where student.id like (:id) ")
    void updateUserData(@Param("details") String description, @Param("id") String id);
}
