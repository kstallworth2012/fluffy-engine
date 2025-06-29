package com.insurance.insuranceApplication.dao.impl;

import com.insurance.insuranceApplication.dao.OpportunityDao;

import org.springframework.jdbc.core.JdbcTemplate;


public class OpportunityDaoImpl implements OpportunityDao{



private Final JdbcTemplate jdbcTemplate;



public OpportunityDaoImpl(Final JdbcTemplate _jdbcTemplate){

			this.jdbcTemplate = _jdbcTemplate;
		}

}