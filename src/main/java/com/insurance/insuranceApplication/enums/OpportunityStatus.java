
package com.insurance.insuranceApplication.enums;



//public class OpportunityStatus{}

//    private final String name;
//    private final String category;  
//    private final int _hashcode;


//    public OpportunityStatusObj(String _name, String _category){


//          this.name = _name;
//          this.category = _category;
//          this._hashcode = Objects.hash(x, y);
//    }


// @Override
// public boolean equals(Object o){
//   if(this == o){
//     return true;
//   }
//   if (o == null || getClass() != o.getClass()){ return false; }

//   OpportunityStatusObj other = (OpportunityStatusObj) o;

//   return name == other.name && category == other.category;
// }

// @Override
// public int hashCode() {
//         return this.hashCode;
//     }


// }

 public enum OpportunityStatus{
     New,

     ContactedMeeting,

     ContactedEmail,

     ContactedPURL,

     Incomplete,

     ContactedCalled,

     InterviewComplete,

     PreparingApplication,

     Submitted,

     SubmittedInfoRequested,

      SubmittedwithUW,

      SubmittedWaiting,

      Change_Coverage,

      Pricing,

    Assigned,

     Quoted,

     Preparing_proposal,

     Meeting_Scheduled,

     Presentation,

    PresentedPhoneCall,

     PresentedEmail,

     PresentedMeeting,

     WaitingClient,

     ProvideProof,

     Decision,

     Accepted,

     CreateeSignature,

     WaitingPayment,

     WaitingSignature,

     WaitingSupplemental,

     Issued,

     Onboarding,

     Fulfillment,

     OnHold,

     CloseBound,

     CloseRetained,

     DisqualifiedNoMarket,

     DisqualifiedAgencyGuidelines,

     RejectedXDate,

     RejectedCoverage,

     RejectedNoResponse,

     RejectedNotInterested,

     RejectedNot_Needed,

     RejectedPrice,
     CloseDeadLead,

     Restore,

   }
