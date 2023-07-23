package com.anurag.Instagram_Project.repository;

import com.anurag.Instagram_Project.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
