package com.anurag.DoctorAPP.service;


import com.anurag.DoctorAPP.model.Patient;
import com.anurag.DoctorAPP.repository.IAppointmentRepo;
import com.anurag.DoctorAPP.model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    IAppointmentRepo appointmentRepo;





    public List<Appointment> getAllAppointments() {
        return appointmentRepo.findAll();
    }

    public void saveAppointment(Appointment appointment) {

        appointment.setAppointmentCreationTime(LocalDateTime.now());
        appointmentRepo.save(appointment);
    }

    public Appointment getAppointmentForPatient(Patient patient) {
        return appointmentRepo.findFirstByPatient(patient);
    }

    public void cancelAppointment(Appointment appointment) {

        appointmentRepo.delete(appointment);
    }
}
