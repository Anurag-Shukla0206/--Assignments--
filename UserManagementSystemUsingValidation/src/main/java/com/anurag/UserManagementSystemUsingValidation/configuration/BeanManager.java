package com.anurag.UserManagementSystemUsingValidation.configuration;

import com.anurag.UserManagementSystemUsingValidation.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {
    @Bean
    public List<User> getInitializedList()
    {

        List<User> initList = new ArrayList<>();

        return initList;
    }
}
