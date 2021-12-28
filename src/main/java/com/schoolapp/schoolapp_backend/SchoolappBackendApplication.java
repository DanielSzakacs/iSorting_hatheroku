package com.schoolapp.schoolapp_backend;

import com.schoolapp.schoolapp_backend.config.CommandLineAppStartupRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@EnableAutoConfiguration
@PropertySources({
		@PropertySource("classpath:application.properties"),
})
public class SchoolappBackendApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SchoolappBackendApplication.class, args);
	}
	
	@Bean
    public CommandLineAppStartupRunner schedulerRunner() { //this is responsible for saving data to DB in the beginning 
        return new CommandLineAppStartupRunner();
    }

}