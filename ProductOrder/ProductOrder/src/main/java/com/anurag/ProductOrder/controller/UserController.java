package com.anurag.ProductOrder.controller;

import com.anurag.ProductOrder.model.Address;
import com.anurag.ProductOrder.model.User;
import com.anurag.ProductOrder.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("user")
    public Iterable<User> getAllUser(){
        return userService.getAllUser();
    }


    @GetMapping("userwithid")
    public User getUserbyid(@RequestParam("id") Long userId)
    {
        return userService.getUserbyid(userId);
    }

    @PostMapping("user")
    public String addUser(@RequestBody @Valid User user)
    {
        return userService.addUser(user);
    }
}
