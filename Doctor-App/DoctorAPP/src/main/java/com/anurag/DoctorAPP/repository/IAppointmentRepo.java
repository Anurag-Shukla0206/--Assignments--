package com.anurag.DoctorAPP.repository;

import com.anurag.DoctorAPP.model.Appointment;
import com.anurag.DoctorAPP.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment,Long> {

    Appointment findFirstByPatient(Patient patient);
}
