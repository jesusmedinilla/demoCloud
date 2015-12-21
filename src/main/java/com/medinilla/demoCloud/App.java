package com.medinilla.demoCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.medinilla.demoCloud.config.MyWebConfiguration;

@Import(MyWebConfiguration.class)
@SpringBootApplication
public class App {

    public static void main(String[] args) { 
        SpringApplication.run(App.class, args);
    }
}

