package com.insurance.insuranceApplication.mappers.impl;



 import com.insurance.insuranceApplication.domain.dto.ProspectDto;
 import com.insurance.insuranceApplication.domain.Prospect;
 import com.insurance.insuranceApplication.mappers.Mapper;
 import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;




 @Component
public class ProspectMapperImpl implements Mapper<Prospect, ProspectDto>{
	
     private ModelMapper model_Mapper;

     public ProspectMapperImpl(ModelMapper _modelMapper){
         this.model_Mapper = _modelMapper; 
     }
 	@Override
 	public ProspectDto mapTo(Prospect object){
 	    return model_Mapper.map(object, ProspectDto.class);
 	}


 	@Override 
 	public Prospect mapFrom(ProspectDto dto){
 	   return model_Mapper.map(dto, Prospect.class);
 	}
 }