package com.dev.patient.Patientmanagement.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
@AllArgsConstructor
@Setter
@Getter
public class PatientDto {
    private Long id;
    @NotNull
    private String name;
    private String num;
    @NotNull
    private int age;
    @NotNull
    private Boolean status;
    private LocalDate lastVisited;
}