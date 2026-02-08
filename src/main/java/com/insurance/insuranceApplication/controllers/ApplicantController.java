package com.insurance.insuranceApplication.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.insuranceApplication.domain.Applicant;
import com.insurance.insuranceApplication.domain.dto.ApplicantDto;
import com.insurance.insuranceApplication.mappers.Mapper;
import com.insurance.insuranceApplication.services.ApplicantService;




// @RestController
// @RequestMapping("/api/___") 
// public class ____Controller{




@RestController
@RequestMapping("/api/applicants")
public class ApplicantController{
	
	private ApplicantService appService;
	
	private Mapper<Applicant, ApplicantDto> applicantMapper;

	public ApplicantController(ApplicantService _appService, Mapper<Applicant, ApplicantDto> _applicantMapper) {
		super();
		this.appService = _appService;
		this.applicantMapper = _applicantMapper;
	} 
	
	@PostMapping(path="/new-applicant")
	public ResponseEntity<ApplicantDto> createApplicant(@RequestBody ApplicantDto _app) {
			Applicant appEntity = applicantMapper.mapFrom(_app);
			Applicant savedApplicantEntity = appService.createApplicant(null, appEntity);
			
			return new ResponseEntity<>(applicantMapper.mapTo(savedApplicantEntity), HttpStatus.CREATED);
	}
	
//	@GetMapping(path="/")
//	public List<ApplicantDto> listApplicants(){
//		List<Applicant> applicants = appService.findAll();
//		return applicants.stream()
//				.map(applicantMapper::mapTo)
//				.collect(Collectors.toList());
//	}
	
	
	//PAGEABLE
	@GetMapping(path="/")
	public Page<ApplicantDto> listApplicants(Pageable page){
		Page<Applicant> applicants = appService.findAll(page);
		return applicants.map(applicantMapper::mapTo);
	}
	
	
	
	 
	@GetMapping(path = "/{id}")
	public ResponseEntity<ApplicantDto> getApplicant(@PathVariable("id") String id){
		  Optional<Applicant> foundApplicant = appService.findOne(id);
		  
		  
		  return foundApplicant.map(appEntity -> {
			  		ApplicantDto appDto = applicantMapper.mapTo(appEntity);
			  		return new ResponseEntity<>(appDto, HttpStatus.OK);
					  
		  }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	
	@PutMapping(path="/{id}")
	public ResponseEntity<ApplicantDto> fullUpdateApplicant(@PathVariable("id") String id, @RequestBody ApplicantDto appDto){
		
		if(!appService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		appDto.setId(id);
		Applicant applicantEntity = applicantMapper.mapFrom(appDto);
		Applicant savedApplicantEntity = appService.save(applicantEntity);
		
		return new ResponseEntity<>(applicantMapper.mapTo(savedApplicantEntity), HttpStatus.OK); 
		
	}	
	
	
	
	@PatchMapping(path ="{/id}")
	public ResponseEntity<ApplicantDto> partialUpdate(@PathVariable("id") String id, @RequestBody ApplicantDto appDto){
		
		if(!appService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		Applicant applicantEntity = applicantMapper.mapFrom(appDto);
		Applicant updatedApplicant = appService.partialUpdate(id, applicantEntity);
		
		return new ResponseEntity<>(applicantMapper.mapTo(updatedApplicant), HttpStatus.OK);
		
		
		
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<ApplicantDto> deleteApplicant(@PathVariable("id") String id) {
		
		appService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}

/*(
//find all members in all projects
//@GetMapping("api/tasks")
@GetMapping("")
List<Tasks> findAll(){
   return .findAll(); 
}


@GetMapping("/{id}")
Tasks findById(@PathVariable Integer id){
    
@Optional<> _ = TasksRepository.findById(id);
if(_.isEmpty()){

	throw new RespponseStatusException(HttpStatus.NOT_FOUND,"Task not found.");
}
  return _member.get();

  //  return membersRepository.findById(id).get();

}

*/


// //post
// @ResponseStatus(HttpStatus.CREATED)  //201 status
// @PostMapping("")
// public ______Dto create_____(@RequestBody ____Dto _-----DTO){

//     return ______Service.create(_-----DTO);


// }


/*
//put
@ResponseStatus(HttpStatus.NO_CONTENT)  //
@PutMapping("/{id}")
void updateTask(@RequestBody Object _object,Integer _id){

    Repository.update__(_object,_id);


}

//delete
@ResponseStatus(HttpStatus.NO_CONTENT)  //
@PutMapping("/{id}")
void delete__(@RequestBody Object _object ,Integer _id){

    //.delete(_,_id);


}
*/
// }










//Testing  our REST Controllers 
/*

import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiestContext(classMode = DirtiestContext.ClassMode.AFTER_EACH_TEST_METHOD)
@AutoConfigureMockMvc
public class ApplicantControllerIntegrationTests{
  
    private MockMvc mockMvc; 
    
    private ObjectMapper objectMapper;
    
    
    @AutoWired
    public ApplicantControllerIntegrationTests(MockMvc mockMvc){
    		this.mockMvc = mockMvc;
    		this.objectMapper = new ObjectMapper();
    		
    		
    	
  }
  
  
      @Test 
      public void testCreateApplicantHttp201Created(){
      
      			Applicant testApplicant = TestDataUtil.createTestApplicantA();
      			testApplicant.setId(null);
      			
      			
      			String applicantJson = objectMapper.writeValueAsString(testApplicant);
      			
      			mockMvc.perform(
      					MockMvcRequestBuilder.post("/applicants")
      							.contentType(MediaType.APPLICATION_JSON)
      							.content(applicantJson)
      			).andExpect(
      						MockMvcResultMatchers.status().isCreated()
      				);
      }
  
  
  
      @Test 
      public void testCreateApplicantSaved() throws Exception{
      
      			Applicant testApplicant = TestDataUtil.createTestApplicantA();
      			testApplicant.setId(null);
      			
      			
      			String applicantJson = objectMapper.writeValueAsString(testApplicant);
      			
      			mockMvc.perform(
      					MockMvcRequestBuilder.post("/applicants")
      							.contentType(MediaType.APPLICATION_JSON)
      							.content(applicantJson)
      			).andExpect(
      						MockMvcResultMatchers.jsonPath.("$.id").isNumber()
      			).andExpect(
      						MockMvcResultMatchers.jsonPath.("$.name").value("???")
      				);
      }
  
  

 */
