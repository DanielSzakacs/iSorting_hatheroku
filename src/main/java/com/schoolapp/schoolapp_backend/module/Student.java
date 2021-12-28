package com.schoolapp.schoolapp_backend.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "Student")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String details; //some random information about the student
    private String dateOfBorn;

    private Groupe groupe; //house
    private String yearOfBorn;
    private MagicWand magicWand;
    private String ancestry;

    private String image;

    @Transient 
    private TimeTable timeTable = new TimeTable(); //this is a random timetable. at the moment it's not saved to the DB

    public Student(){}

    public Student(String name, String dateOfBorn, String details, Groupe groupe, MagicWand magicWand, String ancestry, String image){
        this.name = name;
        this.dateOfBorn = dateOfBorn;

        this.groupe = groupe;
        this.magicWand = magicWand;
        this.ancestry = ancestry;
        this.details = details;
        this.image = image;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDateOfBorn() {
        return dateOfBorn;
    }
    public void setDateOfBorn(String dateOfBorn) {
        this.dateOfBorn = dateOfBorn;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public Long getId() {
        return id;
    }
    
    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }
    public Groupe getGroupe() {
        return groupe;
    }
    public String getAncestry() {
        return ancestry;
    }
    public void setAncestry(String ancestry) {
        this.ancestry = ancestry;
    }
    public void setMagicWand(MagicWand magicWand) {
        this.magicWand = magicWand;
    }
    public MagicWand getMagicWand() {
        return magicWand;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public TimeTable getTimeTable() {
        return timeTable;
    }
    public void setTimeTable(TimeTable timeTable) {
        this.timeTable = timeTable;
    }
    public String getYearOfBorn() {
        return yearOfBorn;
    }
    public void setYearOfBorn(String yearOfBorn) {
        this.yearOfBorn = yearOfBorn;
    }
}
