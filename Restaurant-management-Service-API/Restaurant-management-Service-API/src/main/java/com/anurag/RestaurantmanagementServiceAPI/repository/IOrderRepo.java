package com.anurag.RestaurantmanagementServiceAPI.repository;

import com.anurag.RestaurantmanagementServiceAPI.model.Order;
import com.anurag.RestaurantmanagementServiceAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order,Long> {
    Order findFirstByUser(User user);
}