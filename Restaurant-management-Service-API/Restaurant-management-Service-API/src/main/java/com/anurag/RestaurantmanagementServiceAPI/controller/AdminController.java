package com.anurag.RestaurantmanagementServiceAPI.controller;

import com.anurag.RestaurantmanagementServiceAPI.model.User;
import com.anurag.RestaurantmanagementServiceAPI.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class AdminController {
    @Autowired
    AdminService adminService;


    @GetMapping("users")
    public List<User> getAllUsers()
    {
        return adminService.getAllUser();
    }
}