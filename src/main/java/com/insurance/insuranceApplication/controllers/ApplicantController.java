package com.insurance.insuranceApplication.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.insuranceApplication.domain.Applicant;
import com.insurance.insuranceApplication.domain.dto.ApplicantDto;
import com.insurance.insuranceApplication.mappers.Mapper;
import com.insurance.insuranceApplication.services.ApplicantService;




// @RestController
// @RequestMapping("/api/___") 
// public class ____Controller{




@RestController
public class ApplicantController{
	
	private ApplicantService appService;
	
	private Mapper<Applicant, ApplicantDto> applicantMapper;

	public ApplicantController(ApplicantService _appService, Mapper<Applicant, ApplicantDto> _applicantMapper) {
		super();
		this.appService = _appService;
		this.applicantMapper = _applicantMapper;
	} 
	
	@PostMapping(path="/applicants")
	public ResponseEntity<ApplicantDto> createApplicant(@RequestBody ApplicantDto _app) {
			Applicant appEntity = applicantMapper.mapFrom(_app);
			Applicant savedApplicantEntity = appService.createApplicant(null, appEntity);
			
			return new ResponseEntity<>(applicantMapper.mapTo(savedApplicantEntity), HttpStatus.CREATED);
	}
}
/*
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
