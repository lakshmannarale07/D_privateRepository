package com.dev.patient.Patientmanagement.service;

import com.dev.patient.Patientmanagement.domain.Patient;
import com.dev.patient.Patientmanagement.repository.PatientRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
@Getter
@Setter
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepository repository;


    @Override
    public void createPatientRegistration(Patient Pd) {
         repository.save(Pd);
    }

    public int updatePatientDetails(Patient Pd) {
         repository.save(Pd);
        return 1;
    }

    @Override
    public void deletePatient(Long id) {
        repository.deletePatient(id);
    }

    @Override
    public Patient findPatientId(Long PId) {
        return null;
    }


    @Override
    public List<Patient> nameStartingWith(String prefix) {
       return repository.findByNameStartingWith(prefix);

    }

    @Override
    public List<Patient> findAllPatient() {
        return null;
    }

    @Override
    public List<Patient> findByAgeBetween(Integer startAge, Integer endAge) {
        return repository.findByAgeBetween(startAge,endAge);
    }

}

