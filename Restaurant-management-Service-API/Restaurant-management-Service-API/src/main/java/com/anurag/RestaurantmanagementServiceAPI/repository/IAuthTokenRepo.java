package com.anurag.RestaurantmanagementServiceAPI.repository;

import com.anurag.RestaurantmanagementServiceAPI.model.AuthenticationToken;
import com.anurag.RestaurantmanagementServiceAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthTokenRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);
}
