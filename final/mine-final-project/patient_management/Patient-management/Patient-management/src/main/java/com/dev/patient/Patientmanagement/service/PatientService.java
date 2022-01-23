package com.dev.patient.Patientmanagement.service;

import com.dev.patient.Patientmanagement.domain.Patient;
import com.dev.patient.Patientmanagement.dto.PatientDto;

import java.util.List;

public interface PatientService {

    void createPatientRegistration(Patient Pd);

    int updatePatientDetails(Patient Pd);

    void deletePatient(Long id);

    Patient findPatientId(Long PId);

    List<Patient> nameStartingWith(String prefix);

    List<Patient> findAllPatient();

    List<Patient> findByAgeBetween(Integer startAge, Integer endAge);
}
