package com.insurance.insuranceApplication.mappers.impl;



 import com.insurance.insuranceApplication.domain.dto.PolicyDto;
 import com.insurance.insuranceApplication.domain.Policy;
 import com.insurance.insuranceApplication.mappers.Mapper;
 import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

 @Component
public class PolicyMapperImpl implements Mapper<Policy, PolicyDto>{
	
     private ModelMapper model_Mapper;

     public PolicyMapperImpl(ModelMapper _modelMapper){
         this.model_Mapper = _modelMapper; 
     }
 	@Override
 	public PolicyDto mapTo(Policy object){
 	    return model_Mapper.map(object, PolicyDto.class);
 	}


 	@Override 
 	public Policy mapFrom(PolicyDto dto){
 	   return model_Mapper.map(dto, Policy.class);
 	   
 	}
 }