Feature: Inward Payment flow feature

  @TC_14_01_PositiveInwardFlow #Working fine
  Scenario Outline: Inward Payment flow
    Then validate whether payment moves to QueuedToAccountVerification status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then validate whether payment moves to QueuedToIntitalPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to SignatureCheck status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to PendingSettlement using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
		
    
    Examples: 
      | ValueDateperiod | PaymentType      | Reference | SubRef | ChequeNo | AccountNumber |
      |                 |ACH CHEQUE RECEIVE|Cheque No  | EQUAL  | 30000050 |               |
  
  @TC_14_02_InwardPaymentReturnfromSignatureCheck #Working fine
  Scenario Outline: Inward Payment Return from SignatureCheck flow
    Then validate whether payment moves to QueuedToAccountVerification status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then validate whether payment moves to QueuedToIntitalPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to SignatureCheck using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
		Then validate whether payment gets Returned from SignatureCheckQueue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<ReasonCode1>","<ReasonCode2>","<ReasonCode3>","<ReasonCode4>","<ReasonCode5>","<ReasonCode6>","<ReasonCode7>","<ReasonCode8>","<ReasonCode9>","<ReasonCode10>","<ReasonCode11>","<ReasonCode12>","<ReasonCode13>","<ReasonCode14>","<ReasonCode15>"
    Then validate whether payment moves to SignatureCheckApprove after gets Returned from SignatureCheck Queue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to QueuedToFinalPosting after SignatureCheckApprove using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to QueuedToReturnCreation using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to Rejected using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
    Then validate whether payment moves to QueuedToOutfile status after Rejected status using "<ValueDateperiod>","<UpdatedPaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
   	Then user checks the scheduler status and enables the scheduler
   	Then validate whether payment moves to PendingAck status using "<ValueDateperiod>","<UpdatedPaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
   
    Examples: 
      | ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber | ReasonCode1           | ReasonCode2          | ReasonCode3              | ReasonCode4             | ReasonCode5            | ReasonCode6     | ReasonCode7              | ReasonCode8                 | ReasonCode9   | ReasonCode10              | ReasonCode11  | ReasonCode12        | ReasonCode13                 | ReasonCode14                         | ReasonCode15                   |UpdatedPaymentType     |
      |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  |30000051  |               | 01-Stop Payment Check | 02-Insufficient Fund | 04-The Account is closed | 05-Un-matched signature | 07-Un-endorsable check | 08-Missing date | 09-Presented before date | 10-Un-Authorized alteration | 11-Giro error | 14-Missing Clearing Stamp | 16-Wrong Date | 17-Collateral Check | 18-Witness Signature Missing | 15-Amount Numbers and Words mismatch |23-Crossed check un-compliance  |ACH CHEQUE RETURN SEND |                   
  
  @TC_14_03_InwardPaymentInsufficientFundFlow #not working 
   Scenario Outline: Inward Payment InsufficientFund flow
    Then validate whether payment moves to QueuedToAccountVerification status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then validate whether payment moves to QueuedToIntitalPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   	Then validate whether payment moves to SignatureCheck status for InsufficientFund using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
    Then validate whether payment moves to InsufficientFund status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment gets approved from InsufficientFundQueue "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
 		Then validate whether payment moves to HeadOfficeApprove using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
  	Then validate whether payment gets approved from HeadOfficeApprove using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
  	Then validate whether payment moves to PendingSettlement using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
  	
 		Examples: 
 		| ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber |
    |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30001245 |               |
    
   @TC_14_04_InwardPaymentReturnflowReturnfromInsufficientFund 
  Scenario Outline: Inward Payment Return from InsufficientFund flow
    Then validate whether payment moves to QueuedToAccountVerification status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then validate whether payment moves to QueuedToIntitalPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
  	Then validate whether payment moves to SignatureCheck status for InsufficientFund using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
    Then validate whether payment moves to InsufficientFund status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment gets returned from InsufficientFund "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" "<ReasonCode1>","<ReasonCode2>","<ReasonCode3>","<ReasonCode4>","<ReasonCode5>","<ReasonCode6>","<ReasonCode7>","<ReasonCode8>","<ReasonCode9>","<ReasonCode10>","<ReasonCode11>","<ReasonCode12>","<ReasonCode13>","<ReasonCode14>","<ReasonCode15>"
    Then validate whether payment moves to QueuedToFinalPosting after return from InsufficientFund using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
    Then validate whether payment moves to QueuedToReturnCreation using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to Rejected using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to QueuedToOutfile status after Rejected status using "<ValueDateperiod>","<UpdatedPaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
    Then user checks the scheduler status and enables the scheduler
   	Then validate whether payment moves to PendingAck status using "<ValueDateperiod>","<UpdatedPaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
     
     Examples: 
      | ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber | ReasonCode1           | ReasonCode2          | ReasonCode3              | ReasonCode4             | ReasonCode5            | ReasonCode6     | ReasonCode7              | ReasonCode8                 | ReasonCode9   | ReasonCode10              | ReasonCode11  | ReasonCode12        | ReasonCode13                 | ReasonCode14                         | ReasonCode15                   |UpdatedPaymentType    |
      |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30000053 |               | 01-Stop Payment Check | 02-Insufficient Fund | 04-The Account is closed | 05-Un-matched signature | 07-Un-endorsable check | 08-Missing date | 09-Presented before date | 10-Un-Authorized alteration | 11-Giro error | 14-Missing Clearing Stamp | 16-Wrong Date | 17-Collateral Check | 18-Witness Signature Missing | 15-Amount Numbers and Words mismatch | 23-Crossed check un-compliance |ACH CHEQUE RETURN SEND|
 
  
  @TC_14_05_VIPInwardpaymentFlow #working fine
  Scenario Outline: VIP Inward payment Flow
    Then validate whether payment moves to QueuedToAccountVerification status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then validate whether payment moves to QueuedToIntitalPosting status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to SignatureCheck status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
	  Then validate whether payment moves to QueuedToVipChequeAcceptance using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to QueuedToOutFile status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to PendingAck using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
	 
   Examples: 
      | ValueDateperiod | PaymentType        | Reference | SubRef | ChequeNo | AccountNumber |
      |                 | ACH CHEQUE RECEIVE | Cheque No | EQUAL  | 30012620 |               |
     

 