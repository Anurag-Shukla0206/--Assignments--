package com.anurag.RestaurantmanagementServiceAPI.repository;

import com.anurag.RestaurantmanagementServiceAPI.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodItemRepo extends JpaRepository<FoodItem,Long> {
}
