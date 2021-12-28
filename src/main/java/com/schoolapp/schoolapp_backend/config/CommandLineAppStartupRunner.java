package com.schoolapp.schoolapp_backend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.schoolapp.schoolapp_backend.service.SetupService;

public class CommandLineAppStartupRunner implements CommandLineRunner {

    @Autowired
    SetupService dbDataService;


    @Override
    public void run(String...args) throws Exception {
        dbDataService.setUpDatabase();
    }

}