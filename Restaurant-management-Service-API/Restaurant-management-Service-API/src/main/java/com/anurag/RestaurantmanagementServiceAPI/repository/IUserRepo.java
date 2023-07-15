package com.anurag.RestaurantmanagementServiceAPI.repository;

import com.anurag.RestaurantmanagementServiceAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Long> {
    User findFirstByUserEmail(String email);
}
