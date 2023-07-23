package com.anurag.Instagram_Project.repository;

import com.anurag.Instagram_Project.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepo extends JpaRepository<Comment,Integer> {
}
