package com.insurance.insuranceApplication.domain;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="policy")
public class Policy{

 	@Id
 	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "policy_id_seq")
	private Long policy_id;





	// @OneToOne
	// @JoinColumn(name="applicant_id")
// 	// Applicant ApplicantId": {{EZLynxApplicantID}},
// 	
// ENUM LOB TYPE->LOB: "AUTOP",
	private String TransactionType;
	private Integer PolicyNumber;
	private LocalDateTime EffectiveDate;
	private LocalDateTime ExpirationDate; // "ExpirationDate": "1955-01-15T13:05:31.596Z",
// 	// enum "MasterCompany": {{SalesCenterAPI.Enumerables.MasterCompany.ID}},
// 	// enum "BillingType": "Direct",
// 	// enum "RatingState": "TX",
	private Integer WrittenPremium; //": 5,
	private Integer FullTermPremium; //": 3,
	private Integer AnnualPremium; //": 678263,
	private String PolicyXrefId; //": "consequat sint minim ut",
// 	// enum BillingCompany":{{SalesCenterAPI.Enumerables.BillingCompany.ID}},
// 	// enum "WritingCompany":{{SalesCenterAPI.Enumerables.WritingCompany.ID}},
	private LocalDateTime LOBOrigDate;  //"1983-03-22T14:28:16.176Z",
	private String ProducerCode;//": "mag",
	private String ProducerCodeOverride;//": "commodo ea ut offic",
	private double  TotalCommision;//": 62913,
	private double  EstimatedFees;//": 30,
	private double  EstimatedTaxes;//": "34",
	private String Department;//": -53552377,
	private String Description;//": "nostrud aliquip ex"




// {
// 	"ApplicantId": {{EZLynxApplicantID}},
// 	"LOB": "AUTOP",
// 	"TransactionType": "NBS",
// 	"PolicyNumber": "test policy 18525983",
// 	"EffectiveDate": "2009-08-09T09:11:29.044Z",
// 	"ExpirationDate": "1955-01-15T13:05:31.596Z",
// 	"MasterCompany": {{SalesCenterAPI.Enumerables.MasterCompany.ID}},
// 	"BillingType": "Direct",
// 	"RatingState": "TX",
// 	"WrittenPremium": 5,
// 	"FullTermPremium": 3,
// 	"AnnualPremium": 678263,
// 	"PolicyXrefId": "consequat sint minim ut",
// 	"BillingCompany":{{SalesCenterAPI.Enumerables.BillingCompany.ID}},
// 	"WritingCompany":{{SalesCenterAPI.Enumerables.WritingCompany.ID}},
// 	"LOBOrigDate": "1983-03-22T14:28:16.176Z",
// 	"ProducerCode": "mag",
// 	"ProducerCodeOverride": "commodo ea ut offic",
// 	"TotalCommision": 62913,
// 	"EstimatedFees": 30,
// 	"EstimatedTaxes": "34",
// 	"Department": -53552377,
// 	"Description": "nostrud aliquip ex"
// }









	
}