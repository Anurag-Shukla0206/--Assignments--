package com.anurag.DoctorAPP.repository;

import com.anurag.DoctorAPP.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
