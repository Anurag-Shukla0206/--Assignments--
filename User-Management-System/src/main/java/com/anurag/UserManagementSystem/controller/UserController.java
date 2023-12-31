package com.anurag.UserManagementSystem.controller;

import com.anurag.UserManagementSystem.model.User;
import com.anurag.UserManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;



    @GetMapping(value = "users")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @GetMapping("users/search/{userId}")
    public User getUserByUserid(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }

    @PostMapping("users") // add user
    public String addUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }

    @DeleteMapping("users/delete/{userId}")

    public String DeleteUserById (@PathVariable Integer userId ){

        return userService.DeleteUser(userId);
    }

    @PutMapping("users/{userId}/{userContact}")
    public String UpdateUser(@PathVariable Integer userId,@PathVariable String userContact)
    {
        return userService.updateUserContact(userId,userContact);
    }

}