package com.vinculum.ondc;

import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;

import com.vinculum.ondc.business.AbstractExecutorCaller;
import com.vinculum.ondc.constants.Constants;

@SpringBootApplication

@ComponentScan(basePackages = {"com.vinculum.ondc","com.vinculum.ondc.business.*"})
/*
@ComponentScan(basePackages = {"com.vinculum.ondc"},
excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
                                       classes = AbstractExecutorCaller.class))*/

public class OndcSearchApplication implements CommandLineRunner{

    @Value("${myapp.name}")
    private  String appName;
    
    @Autowired
    private EnvironmentProperties env;
    
    

   

    public static void main(String[] args) {
        // Put Unique Key For Main Logging
        MDC.put(Constants.UNIQUE, Constants.MAIN);
        
        // Run
        SpringApplication.run(OndcSearchApplication.class, args);

        // Remove The Key
        MDC.remove(Constants.UNIQUE);
    }

    public void run(String... args) throws Exception {
        // Print application properties
        System.out.println("Application Name: " + appName);
        
        // Example: Print the additional properties
        System.out.println("env: " + env.getEnv());
        System.out.println("web: " + env.getWeb());
        System.out.println("schedule: " + env.getSchedule());
        System.out.println("logbackConfigurationFile: " + env.getLogbackConfigurationFile());
        System.out.println("javaxXmlBindContextFactory: " + env.contextFactoryBean());

        
        
        
        //System.out.println("Application Version: " + appVersion);
       // String path = env.getProperty("myapp.name");
    }
}
