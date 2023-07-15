package com.anurag.RestaurantmanagementServiceAPI.service;

import com.anurag.RestaurantmanagementServiceAPI.model.Order;
import com.anurag.RestaurantmanagementServiceAPI.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    UserService userService;
    @Autowired
    OrderService orderService;

    public List<User> getAllUser() {

        return userService.getAllUser();
    }

    public List<Order> getAllOrder() {
        return orderService.getAllOrder();

    }
}
