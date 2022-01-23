package com.dev.patient.Patientmanagement.controller;

import com.dev.patient.Patientmanagement.domain.Patient;
import com.dev.patient.Patientmanagement.dto.AppResponse;
import com.dev.patient.Patientmanagement.repository.PatientRepository;
import com.dev.patient.Patientmanagement.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RequestMapping ("/patient")
@RestController //=Component
public class PatientController {
    @Autowired
    private PatientService service;

    @Autowired
    private PatientRepository repository;
    @PostMapping // POST -> http://localhost:8080/patient/
    public ResponseEntity<AppResponse<Integer>> createPatientRegistration(@Valid @RequestBody Patient Pd){
        service.createPatientRegistration(Pd);
        var response = new AppResponse<Integer>();
        response.setMsg("Registration Successfully");
        response.setSts("success");
        response.setBody(0);
        return ResponseEntity.ok(response);
    }
  @PutMapping("/update")
public ResponseEntity<AppResponse> updatePatientDetails(@Valid @RequestBody Patient Pd){
      service.createPatientRegistration(Pd);
      var response = new AppResponse<Integer>();
      response.setMsg("Registration Successfully");
      response.setSts("success");
      response.setBody(0);
      return ResponseEntity.ok(response);
}
    @GetMapping  // Get ->  http://localhost:8080/patient/
    public ResponseEntity<AppResponse<List<Patient>>> allPatient() {
        var response = new AppResponse<List<Patient>>();
        response.setSts("success");
        response.setMsg("list of all Patient");
        response.setBody(service.findAllPatient());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{startAge}/{endAge}")
    public ResponseEntity<AppResponse<List<Patient>>> findByAgeBetween(@PathVariable Integer startAge,@PathVariable Integer endAge){
        service.findByAgeBetween(startAge,endAge);
        var response = new AppResponse<List<Patient>>();
        response.setSts("success");
        response.setMsg("Patient Age Between Successfully");
        response.setBody(service.findByAgeBetween(startAge,endAge));
        return ResponseEntity.ok(response);
    }
    @GetMapping("/{prefix}")  // Get -> http://localhost:8080/patient/a
    public ResponseEntity<AppResponse<List<Patient>>> patientStartWith(@PathVariable String prefix){
        var response =new AppResponse<List<Patient>>();
        response.setMsg("Patient List");
        response.getSts("success");
        response.setBody(service.nameStartingWith(prefix));
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("delete/{id}")  //Delete -> http://localhost:8080/patient/delete/id
   public ResponseEntity<AppResponse<Integer>> deletePatient(@PathVariable long id){
        service.deletePatient(id);
        var response = new AppResponse<Integer>();
        response.setSts("success");
        response.setMsg("Patient Delete Successfully");
        response.setBody(1);
        return ResponseEntity.ok(response);
    }
}
