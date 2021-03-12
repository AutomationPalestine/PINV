Feature: Inward Payment flow feature

  @TC_14_06_DuplicateToQualifyReceiveCheque #working fine
  Scenario Outline: Inward Payment flow for sending Duplicate Cheque to Qualify Receive queue
    Then check whether Inward Payment is Duplicate using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then to send payment to QualifyReceive queue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<Reason>"
    Then validate whether payment moves to QualifyReceive queue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"

    Examples: 
      | ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber | Reason |
      |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  |30000800  |               | Return |
      
  @TC_14_07_DuplicateCheque #Working Fine
  Scenario Outline: Inward Payment flow for Duplicate Cheque
    Then check whether Inward Payment is Duplicate using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate list displayed for Duplicate cheques "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Given User is into the System
    Then validate whether payment moves to QueuedToAccountVerification status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then validate whether payment moves to QueuedToIntitalPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to SignatureCheck status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to PendingSettlement using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
	
    Examples: 
      | ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber |
      |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30022245 |               |
 
  
  @TC_14_08_InwardPaymentflowwithExceptionfromQueuedToInitialPosting #workingfine
  Scenario Outline: Inward Payment flow
   Then validate whether payment moves to QueuedToAccountVerification status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
   Then validate whether payment moves to QueuedToIntitalPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   Then validate whether payment moves to Exception status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   Then validate whether payment moves to Exception to Approve status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   Then validate whether payment gets Approved from ApproveQueue after ManualTrayApprove using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   Then check whether payment move to SignatureCheck status from ApproveQueue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   Then validate whether payment moves to PendingSettlement using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
		
    Examples: 
      | ValueDateperiod | PaymentType         | Reference | SubRef | ChequeNo | AccountNumber |
      |                 | ACH CHEQUE RECEIVE  | Cheque No | EQUAL  | 30000802 |               |
         
 
  @TC_14_09_InwardPaymentflowwithExceptionfromQueuedToFinalPosting #workingfine
  Scenario Outline: Inward Payment flow
   Then validate whether payment moves to QueuedToAccountVerification status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
   Then validate whether payment moves to QueuedToIntitalPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   Then validate whether payment move to SignatureCheck using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
	 Then validate whether payment gets Returned from SignatureCheckQueue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<ReasonCode1>","<ReasonCode2>","<ReasonCode3>","<ReasonCode4>","<ReasonCode5>","<ReasonCode6>","<ReasonCode7>","<ReasonCode8>","<ReasonCode9>","<ReasonCode10>","<ReasonCode11>","<ReasonCode12>","<ReasonCode13>","<ReasonCode14>","<ReasonCode15>"
   Then validate whether payment moves to SignatureCheckApprove after gets Returned from SignatureCheck Queue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   Then validate whether payment moves to QueuedToFinalPosting after SignatureCheckApprove using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   Then validate whether payment moves to Exception status after QueuedToFinalPosting using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   Then validate whether payment moves to Exception to Approve status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   Then validate whether payment gets Approved from ApproveQueue after ManualTrayApprove using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   Then validate whether payment moves to QueuedToReturnCreation using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   Then validate whether payment moves to Rejected using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
   Then validate whether payment moves to QueuedToOutfile status after Rejected status using "<ValueDateperiod>","<UpdatedPaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
   Then user checks the scheduler status and enables the scheduler
   Then validate whether payment moves to PendingAck status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
   
   Examples: 
      | ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber | ReasonCode1           | ReasonCode2          | ReasonCode3              | ReasonCode4             | ReasonCode5            | ReasonCode6     | ReasonCode7              | ReasonCode8                 | ReasonCode9   | ReasonCode10              | ReasonCode11  | ReasonCode12        | ReasonCode13                 | ReasonCode14                         | ReasonCode15                   |UpdatedPaymentType    | 
      |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30000803 |               | 01-Stop Payment Check | 02-Insufficient Fund | 04-The Account is closed | 05-Un-matched signature | 07-Un-endorsable check | 08-Missing date | 09-Presented before date | 10-Un-Authorized alteration | 11-Giro error | 14-Missing Clearing Stamp | 16-Wrong Date | 17-Collateral Check | 18-Witness Signature Missing | 15-Amount Numbers and Words mismatch | 23-Crossed check un-compliance |ACH CHEQUE RETURN SEND|
      
  @TC_14_10_StopChequefunctionality #working fine
  Scenario Outline: Check Stop cheque functionality for Inward flow #Working fine
    Then To check whether cheque details get added in Stop cheque list using "<Issuer>","<BranchCode>","<Currency>","<MinimumChequeNumber>","<MaximumChequeNumber>","<AccountNumber>" fields
    Then To check whether stop cheque functionality is working properly or not using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"

    Examples: 
      | Issuer   | BranchCode | Currency | MinimumChequeNumber | MaximumChequeNumber | AccountNumber | ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo |
      | PINVPS20 |        900 | ILS      | 30000007            | 30000007            |               |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30000007 |
 
      