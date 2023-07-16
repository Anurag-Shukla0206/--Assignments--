package com.anurag.InstagramBasicBackendDesign.repository;

import com.anurag.InstagramBasicBackendDesign.model.AuthenticationToken;
import com.anurag.InstagramBasicBackendDesign.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthTokenRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);

}
