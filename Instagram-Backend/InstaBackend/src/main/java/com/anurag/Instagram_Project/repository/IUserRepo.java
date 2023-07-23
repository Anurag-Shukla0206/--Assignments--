package com.anurag.Instagram_Project.repository;

import com.anurag.Instagram_Project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
    User findFirstByUserEmail(String newEmail);
}
