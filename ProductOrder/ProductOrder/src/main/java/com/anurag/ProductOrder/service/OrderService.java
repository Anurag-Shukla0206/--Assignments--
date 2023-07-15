package com.anurag.ProductOrder.service;

import com.anurag.ProductOrder.model.Order;
import com.anurag.ProductOrder.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;
    public Iterable<Order> getAllOrder() {
        return orderRepo.findAll();
    }

    public Order getOrderbyid(Long orderId) {

        Optional<Order> optional= orderRepo.findById(orderId);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    public String addOrder(Order order) {
        orderRepo.save(order);
        return "Order Added";
    }
}
