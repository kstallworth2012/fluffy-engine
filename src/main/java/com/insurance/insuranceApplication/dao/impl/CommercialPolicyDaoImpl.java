package com.insurance.insuranceApplication.dao.impl;


import com.insurance.insuranceApplication.dao.CommercialPolicyDao;

import org.springframework.jdbc.core.JdbcTemplate;


public class CommercialPolicyDaoImpl implements CommercialPolicyDao{



private Final JdbcTemplate jdbcTemplate;



public CommercialPolicyDaoImpl(Final JdbcTemplate _jdbcTemplate){

			this.jdbcTemplate = _jdbcTemplate;
		}

}