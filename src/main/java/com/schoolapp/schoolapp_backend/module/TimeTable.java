package com.schoolapp.schoolapp_backend.module;

import java.util.List;
import java.util.Map;

import com.schoolapp.schoolapp_backend.service.TimeTableService;



/**
 * Not a real Entity. It is not save in to the DB 
 */
public class TimeTable {
    
    private Map<Day, List<String>> classesOfTheWeek;

    public TimeTable(){
        this.classesOfTheWeek = new TimeTableService().getRandomTimeTable();
    }

    public Map<Day, List<String>> getClassesOfTheWeek() {
        return classesOfTheWeek;
    }
    public void setClassesOfTheWeek(Map<Day, List<String>> classesOfTheWeek) {
        this.classesOfTheWeek = classesOfTheWeek;
    }
    

}