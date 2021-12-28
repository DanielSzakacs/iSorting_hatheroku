package com.schoolapp.schoolapp_backend.module;

import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String position;

    @Column(length = 450)
    private String details;

    @Column(length = 350)
    private String image; // this is just a path of the image.

    public Teacher(){}

    public Teacher(String name, String position, String details, String image){
        this.name = name;
        this.position = position;
        this.details = details;
        this.image = image;
    }
    
    public String getDetails() {
        return details;
    }public void setDetails(String details) {
        this.details = details;
    }
    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }
    public String getImage() {
        return image;
    }public void setImage(String image) {
        this.image = image;
    }
    public Long getId() {
        return id;
    }
    public String getPosition() {
        return position;
    }public void setPosition(String position) {
        this.position = position;
    }
}
