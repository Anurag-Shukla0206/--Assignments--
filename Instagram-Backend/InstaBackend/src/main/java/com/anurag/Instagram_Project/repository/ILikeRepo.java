package com.anurag.Instagram_Project.repository;

import com.anurag.Instagram_Project.model.Like;
import com.anurag.Instagram_Project.model.Post;
import com.anurag.Instagram_Project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILikeRepo extends JpaRepository<Like,Integer> {

    List<Like> findByInstaPostAndLiker(Post instaPost, User liker);

    List<Like> findByInstaPost(Post validPost);
}
