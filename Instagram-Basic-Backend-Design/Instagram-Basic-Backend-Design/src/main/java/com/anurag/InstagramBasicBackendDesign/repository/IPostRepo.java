package com.anurag.InstagramBasicBackendDesign.repository;

import com.anurag.InstagramBasicBackendDesign.model.Post;
import com.anurag.InstagramBasicBackendDesign.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Long> {

    Post findFirstByUser(User user);
}
