package com.insurance.insuranceApplication.dao.impl;



import com.insurance.insuranceApplication.dao.CommercialProspectDao;

import org.springframework.jdbc.core.JdbcTemplate;


public class CommercialProspectDaoImpl implements CommercialProspectDao{



private Final JdbcTemplate jdbcTemplate;



public CommercialProspectDaoImpl(Final JdbcTemplate _jdbcTemplate){

			this.jdbcTemplate = _jdbcTemplate;
		}

}