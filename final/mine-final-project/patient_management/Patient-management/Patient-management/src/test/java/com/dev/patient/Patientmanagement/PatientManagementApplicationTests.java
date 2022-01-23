package com.dev.patient.Patientmanagement;

import com.dev.patient.Patientmanagement.controller.PatientController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PatientManagementApplicationTests {
	@Autowired
	private PatientController controller;
	@Test
	void contextLoads() {
		Assertions.assertNotNull(controller);
	}
}
