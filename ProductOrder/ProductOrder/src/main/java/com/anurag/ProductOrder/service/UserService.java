package com.anurag.ProductOrder.service;

import com.anurag.ProductOrder.model.User;
import com.anurag.ProductOrder.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public Iterable<User> getAllUser() {
        return userRepo.findAll();
    }

    public User getUserbyid(Long userId) {

        Optional<User> optional= userRepo.findById(userId);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;

    }

    public String addUser(User user) {
        userRepo.save(user);
        return "User Added";
    }
}
