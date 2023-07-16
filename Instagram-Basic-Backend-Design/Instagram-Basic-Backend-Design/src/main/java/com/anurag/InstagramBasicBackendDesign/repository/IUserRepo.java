package com.anurag.InstagramBasicBackendDesign.repository;

import com.anurag.InstagramBasicBackendDesign.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Long> {
    User findFirstByUserEmail(String email);
}
