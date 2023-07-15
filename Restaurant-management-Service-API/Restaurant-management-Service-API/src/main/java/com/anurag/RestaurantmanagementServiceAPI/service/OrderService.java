package com.anurag.RestaurantmanagementServiceAPI.service;

import com.anurag.RestaurantmanagementServiceAPI.model.Order;
import com.anurag.RestaurantmanagementServiceAPI.model.User;
import com.anurag.RestaurantmanagementServiceAPI.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    IOrderRepo orderRepo;

    public List<Order> getAllOrder() {
        return orderRepo.findAll();
    }

    public void saveOrder(Order order) {

        order.setLocalDateTime(LocalDateTime.now());
        orderRepo.save(order);
    }

    public Order getOrderForUser(User user) {

        return orderRepo.findFirstByUser(user);
    }

    public void cancelOrder(Order order) {

        orderRepo.delete(order);
    }
}
