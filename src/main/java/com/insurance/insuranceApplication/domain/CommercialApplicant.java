package com.insurance.insuranceApplication.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommercialApplication{



	{
   private String "EntityType":"Association",
   private String "BusinessName":"BusinessInformation",
   private String "EIN":"",
   private String "BusinessPhone":"2145551212",
   private String "BusinessPhoneExt":"",
   private String "BusinessEmail":"",
   private String "WebsiteUrl":"",
   private String "BusinessFax":"",
    private String"SICCode":"",
    private String"Validated":"Valid",
    private String"ApplicantType":"ProspectLead",
    private String"CoApplicant":null,
  "  private StringCurrentAddress":{
    private String  "AddressType":"MAILING",
   private String    "AddressLine1":"350 E Somewhere Drive",
     private String "AddressLine2":"",
      private String"UnitNumber":"",
      private String"City":"Eh",
      private String"State":"TX",
      private String"Zip":"12345",
      private String"Plus4":"",
      private String"County":"Unknown",
      private String"YearsAtAddress":0,
      private String"MonthsAtAddress":0,
      private String"Validated":"Valid"
  },
   private boolean "PreviousAddress":null,
  "ApplicantXrefs":[],
   private LocalDateTime "OriginationDate":"2017-07-28T14:33:52.584Z",
  "IsVIP":true,
  "Prefix":0,
    private String"FirstName":"",
    private String"MiddleName":"",
    private String"LastName":"",
    private String"Suffix":"Unknown",
    private String"Nickname":"",
    private String"MaidenName":"",
    private String"Gender":"Male",
    private String"MaritalStatus":"Single",
    private String"Education":"Unknown",
  private DOB":null,
  private SSN":null,
  private OccupationID":0,
  private YearsAtOccupation":0,
  private YearsAtPriorEmployer":0,
  private DLNumber":"",
  private DLState":"",
  private DLStatus":0,
  private Channel": {{SalesCenterAPI.Enumerables.Channel.ID}},
  private HomePhone":"",
  private CellPhone":"0123456789",
  private WorkPhone":"",
  private Extension":"",
  private Fax":"",
    private String"Email":"",
    private String"AlternateEmail":"",
  "PreferredContactMethod":0,
  "PreferredContactTime":0,
//  "Id":"0"



}