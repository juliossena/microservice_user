package com.julio.microservice_user.config;

import java.text.ParseException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class DevConfig {


    @Bean
    public boolean instantiateDatabase() throws ParseException {
        // this.dbService.instantiateTestDatabase();
        return true;
    }

}
