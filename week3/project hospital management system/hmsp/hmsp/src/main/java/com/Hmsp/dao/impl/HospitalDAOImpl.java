package com.Hmsp.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Hmsp.constants.Hospital_Constant;
import com.Hmsp.dao.HospitalDao;
import com.Hmsp.model.Hospital;
import com.Hmsp.rowmapper.HospitalRowMapper;

@Repository
public class HospitalDAOImpl implements HospitalDao {

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    HospitalRowMapper hospitalRowMapper;
    @Override
    public List<Hospital> getHospital() {
        return namedParameterJdbcTemplate.query(Hospital_Constant.FETCH_SQL, hospitalRowMapper);
    }
}