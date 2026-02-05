package com.insurance.insuranceApplication.mappers.impl;



 import com.insurance.insuranceApplication.domain.dto.ApplicantDto;
 import com.insurance.insuranceApplication.domain.Applicant;
 import com.insurance.insuranceApplication.mappers.Mapper;
 import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


 @Component
public class ApplicantMapperImpl implements Mapper<Applicant, ApplicantDto>{
	
     private ModelMapper model_Mapper;

     public ApplicantMapperImpl(ModelMapper _modelMapper){
         this.model_Mapper = _modelMapper; 
     }
     
 	@Override
 	public ApplicantDto mapTo(Applicant object){
 	    return model_Mapper.map(object, ApplicantDto.class);
 	}


 	@Override 
 	public Applicant mapFrom(ApplicantDto dto){
 	   return model_Mapper.map(dto, Applicant.class);
 	}
 }