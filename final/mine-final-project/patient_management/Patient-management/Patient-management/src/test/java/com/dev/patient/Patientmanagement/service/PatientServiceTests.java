package com.dev.patient.Patientmanagement.service;

import com.dev.patient.Patientmanagement.domain.Patient;
import com.dev.patient.Patientmanagement.repository.PatientRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class PatientServiceTests {

    @Mock
    private PatientRepository repository;

    @InjectMocks
    private PatientService service = new PatientServiceImpl();


    @Test
    void testSize() {
        var abc = new Patient();
        Assertions.assertNotNull(abc);
    }
}
