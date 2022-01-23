package com.dev.patient.Patientmanagement.repository;

import com.dev.patient.Patientmanagement.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient , Long> {

    @Modifying // allows firing Insert , Update and delete queries
    @Query(value = "Update patient value(id,name,mobile,status,lastvisited where id = :id" , nativeQuery = true)
            void createPatientRegistration();

    @Transactional
    @Modifying
    @Query(value = "Update patient set id,name,mobile,status,lastvisited where id = :id" , nativeQuery = true)
    Integer updatePatientDetails(@Param("id")long id);

    @Modifying // for delete query
    @Query(value = "delete  from patient where id = :id" , nativeQuery = true)

    void deletePatient(@Param("id")long id);

    List<Patient> findByNameStartingWith(String prefix);

   List<Patient> findByAgeBetween(Integer startAge , Integer endAge);


}
