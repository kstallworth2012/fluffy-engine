package com.insurance.insuranceApplication.domain;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="policy")
public class Policy{

 	// @Id
	// @GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "policy_id_seq)
	private Long id;





	// "ApplicantId": {{EZLynxApplicantID}},
	// ENUM LOB TYPE->LOB: "AUTOP",
	private String TransactionType;
	private Integer PolicyNumber;
	private LocalDateTime;
	private LocalDateTime; // "ExpirationDate": "1955-01-15T13:05:31.596Z",
	// enum "MasterCompany": {{SalesCenterAPI.Enumerables.MasterCompany.ID}},
	// enum "BillingType": "Direct",
	// enum "RatingState": "TX",
	private Integer WrittenPremium; //": 5,
	private Integer FullTermPremium; //": 3,
	private Integer AnnualPremium; //": 678263,
	private String PolicyXrefId; //": "consequat sint minim ut",
	// enum BillingCompany":{{SalesCenterAPI.Enumerables.BillingCompany.ID}},
	// enum "WritingCompany":{{SalesCenterAPI.Enumerables.WritingCompany.ID}},
	private LocalDateTime LOBOrigDate;  //"1983-03-22T14:28:16.176Z",
	private String ProducerCode;//": "mag",
	private String ProducerCodeOverride;//": "commodo ea ut offic",
	private double  TotalCommision;//": 62913,
	private double  EstimatedFees;//": 30,
	private double  EstimatedTaxes;//": "34",
	private String Department;//": -53552377,
	private String Description;//": "nostrud aliquip ex"
}