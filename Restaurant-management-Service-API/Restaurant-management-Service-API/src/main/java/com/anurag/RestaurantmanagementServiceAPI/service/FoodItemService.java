package com.anurag.RestaurantmanagementServiceAPI.service;

import com.anurag.RestaurantmanagementServiceAPI.model.FoodItem;
import com.anurag.RestaurantmanagementServiceAPI.repository.IFoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {
    @Autowired
    IFoodItemRepo foodItemRepo;
    public String addAllFoodItems(List<FoodItem> foodItem) {
        foodItemRepo.saveAll(foodItem);
        return "Food List added";
    }
}
