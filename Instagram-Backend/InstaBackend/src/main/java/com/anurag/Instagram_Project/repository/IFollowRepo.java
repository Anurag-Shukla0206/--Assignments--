package com.anurag.Instagram_Project.repository;

import com.anurag.Instagram_Project.model.Follow;
import com.anurag.Instagram_Project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFollowRepo extends JpaRepository<Follow,Integer> {
    List<Follow> findByCurrentUserAndCurrentUserFollower(User targetUser, User follower);
}
