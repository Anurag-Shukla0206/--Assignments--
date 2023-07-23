package com.anurag.DoctorAPP.repository;

import com.anurag.DoctorAPP.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepo extends JpaRepository<Doctor,Long> {
}
