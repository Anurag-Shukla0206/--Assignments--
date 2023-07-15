package com.anurag.ProductOrder.controller;

import com.anurag.ProductOrder.model.Address;
import com.anurag.ProductOrder.model.Order;
import com.anurag.ProductOrder.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController
{
    @Autowired
    OrderService orderService;

    @GetMapping("order")
    public Iterable<Order> getAllOrder(){
        return orderService.getAllOrder();
    }


    @GetMapping("orderwithid")
    public Order getOrderbyid(@RequestParam("id") Long orderId)
    {
        return orderService.getOrderbyid(orderId);
    }

    @PostMapping("order")
    public String addOrder(@RequestBody @Valid Order order)
    {
        return orderService.addOrder(order);
    }

}
