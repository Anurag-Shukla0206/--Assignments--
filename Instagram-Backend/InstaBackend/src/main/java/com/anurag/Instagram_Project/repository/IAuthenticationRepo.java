package com.anurag.Instagram_Project.repository;

import com.anurag.Instagram_Project.model.AuthenticationToken;
import com.anurag.Instagram_Project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {


    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);
}
