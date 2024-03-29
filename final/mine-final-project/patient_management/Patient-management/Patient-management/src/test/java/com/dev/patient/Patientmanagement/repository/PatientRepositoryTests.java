package com.dev.patient.Patientmanagement.repository;

import com.dev.patient.Patientmanagement.domain.Patient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.swing.*;
import java.time.LocalDate;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE )
public class PatientRepositoryTests {
    @Autowired
    private PatientRepository repository;

    @DisplayName("Patient Repo : Creating Patient")
    @Test
    public void testcreatePatientRegistration(){

        var abc = new Patient();
        abc.setId(565L);
        abc.setName("abc");
        abc.setNum("41343");
        abc.setLastVisited(LocalDate.now());

        repository.save(abc);

    }


}
