package com.dev.patient.Patientmanagement.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppResponse <T>{

    private String sts;
    private String msg;
    private T body;

    public String getSts(String success) {
        return sts;
    }


}
