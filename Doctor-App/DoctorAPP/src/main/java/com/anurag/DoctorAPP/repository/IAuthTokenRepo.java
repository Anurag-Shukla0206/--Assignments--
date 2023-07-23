package com.anurag.DoctorAPP.repository;

import com.anurag.DoctorAPP.model.AuthenticationToken;
import com.anurag.DoctorAPP.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IAuthTokenRepo extends JpaRepository<AuthenticationToken,Long> {


    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByPatient(Patient patient);
}
