package com.insurance.insuranceApplication.domain.dto; 


 import lombok.AllArgsConstructor;
 import lombok.Builder;
 import lombok.Data;
 import lombok.NoArgsConstructor;
 import java.time.LocalDateTime;




@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApplicantDto{
	
	
	
	private Long id;

//   	private String Validated;//.":"Valid",
    private String ApplicantType;//":"ActiveClient",
    private boolean CommercialApplicantID;//":null,
    private boolean CoApplicant;//":null,
//  // "CurrentAddress":{
//     // private enum AddressType;//":"Mailing",
    private String AddressLine1;//":"123 main st",
    private String AddressLine2;//":"",
    private String UnitNumber;//":"",
    private String City;//":"Dallas",
    private String State;//":"TX",
    private Integer Zip;//":"75208",
    private Integer Plus4;//":"",
    private String County;//":"Dallas",
    private Integer YearsAtAddress;//":0,
    private Integer MonthsAtAddress;//":0,
    private String Validated;//":"Valid"
	 
	
	
}