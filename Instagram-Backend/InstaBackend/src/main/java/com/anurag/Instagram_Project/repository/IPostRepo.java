package com.anurag.Instagram_Project.repository;

import com.anurag.Instagram_Project.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Integer> {
}
