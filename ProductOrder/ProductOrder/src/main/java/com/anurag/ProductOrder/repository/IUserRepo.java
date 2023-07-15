package com.anurag.ProductOrder.repository;

import com.anurag.ProductOrder.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User,Long> {

}
