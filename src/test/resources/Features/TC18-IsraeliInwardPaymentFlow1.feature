Feature: Israeli Inward Payment flow feature

	@TC_18_05_IsraeliInwardDuplicateCheque 
  Scenario Outline: Israeli Inward Payment flow for Duplicate Cheque
   	Then To check whether Inward file gets uploaded using "<FileType>","<FilePath>"
   	Then To check whether Cheque data entry move to QueuedToPayment status for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then To check whether Cheque data entry gets Completed for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then disable Israeli_Inward_Cheque_Server
  	Then check whether InwardIsreali Payment is duplicate using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate list displayed for duplicate cheques for IsraeliFlow "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to QueuedToAccountVerification status for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then validate whether payment moves to QueuedToIntitalPosting status for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to SignatureCheck status for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to PendingSettlement for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
		#Then to perform EOD and then SOD
		#Then check whether payment moves to Completed Status for IsraeliInward Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
	
   Examples: 
      | ValueDateperiod | PaymentType            | Reference | SubRef | ChequeNo | AccountNumber |FileType                   |FilePath																				                         |Period |FileName                       |
      |                 | ISRAELI CHEQUE RECEIVE | Cheque No | EQUAL  | 30001744 |               |ISRAELI_CHEQUE_INWARD_FILE |E:\PIBC_PRJ\ISRAELI_CHEQUE_UPLOAD_DIR\CV12_TO_RASHUT55_20210308.TXT      |       |CV12_TO_RASHUT55_20210308.TXT  | 
  
   @TC_18_06_IsraeliInwardDuplicateToQualifyReceiveCheque 
   Scenario Outline: Israeli Inward Payment flow for sending Duplicate Cheque to Qualify Receive queue
    Then To check whether Inward file gets uploaded using "<FileType>","<FilePath>"
   	Then To check whether Cheque data entry move to QueuedToPayment status for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then To check whether Cheque data entry gets Completed for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then disable Israeli_Inward_Cheque_Server
  	Then check whether InwardIsreali Payment is duplicate using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
 		Then to send Israelipayment to Qualify Receive queue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<Reason>"
    Then validate whether IsraeliInward payment move to Qualify Receive queue using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"

    Examples: 
      | ValueDateperiod | PaymentType            | Reference | SubRef | ChequeNo | AccountNumber |FileType                   |FilePath																				                         |Period |FileName                       |Reason |
      |                 | ISRAELI CHEQUE RECEIVE | Cheque No | EQUAL  | 30001729 |               |ISRAELI_CHEQUE_INWARD_FILE |E:\PIBC_PRJ\ISRAELI_CHEQUE_UPLOAD_DIR\CV12_TO_RASHUT49_20210308.TXT      |       |CV12_TO_RASHUT49_20210308.TXT  |Return |
      
   @TC_18_07_IsraeliInwardPaymentFlowExceptionFromInitialPosting
   Scenario Outline: Israeli Inward Payment flow Exception From Initial Posting
    Then To check whether Inward file gets uploaded using "<FileType>","<FilePath>"
   	Then To check whether Cheque data entry move to QueuedToPayment status for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then To check whether Cheque data entry gets Completed for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then disable Israeli_Inward_Cheque_Server
    Then validate whether payment moves to QueuedToAccountVerification status for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then validate whether payment moves to QueuedToIntitalPosting status for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to Exception status for IsraeliInward Payment flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to Exception to Approve status for IsraeliInward Payment flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment gets Approved from ApproveQueue after ManualTrayApprove for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
 	 	Then check whether payment move to SignatureCheck status from ApproveQueue for IsraeliInward Payment using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to PendingSettlement for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
	  Then to perform EOD and then SOD
		Then check whether payment moves to Completed status using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
		#Then to perform EOD and then SOD
		#Then check whether payment moves to Completed Status for IsraeliInward Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
	
    Examples: 
      | ValueDateperiod | PaymentType            | Reference | SubRef | ChequeNo | AccountNumber |FileType                   |FilePath																				                         |Period |FileName                       |
      |                 | ISRAELI CHEQUE RECEIVE | Cheque No | EQUAL  | 30001744 |               |ISRAELI_CHEQUE_INWARD_FILE |E:\PIBC_PRJ\ISRAELI_CHEQUE_UPLOAD_DIR\CV12_TO_RASHUT53_20210308.TXT      |       |CV12_TO_RASHUT53_20210308.TXT  | 
      
    @TC_08_IsraeliInwardPaymentFlowExceptionFromFinalPosting
   	Scenario Outline: Israeli Inward Payment flow Exception from Final Posting
    Then To check whether Inward file gets uploaded using "<FileType>","<FilePath>"
   	Then To check whether Cheque data entry move to QueuedToPayment status for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then To check whether Cheque data entry gets Completed for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then disable Israeli_Inward_Cheque_Server
   	Then validate whether payment moves to QueuedToAccountVerification status for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then validate whether payment moves to QueuedToIntitalPosting status for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment move to SignatureCheck status for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   	Then validate whether payment gets Returned from SignatureCheckQueue for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<ReasonCode1>","<ReasonCode2>","<ReasonCode3>","<ReasonCode4>"
    Then validate whether payment moves to SignatureCheckApprove after gets Returned from SignatureCheck Queue for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to QueuedToFinalPosting after SignatureCheckApprove for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to Exception status after QueuedToFinalPosting for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to Exception to Approve status for IsraeliInward Payment flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment gets Approved from ApproveQueue after ManualTrayApprove for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
 	 	Then validate whether payment moves to QueuedToIsraeliReturnCreation for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to Rejected for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
   	Then validate whether Out file request is getting created using "<Request_Type>"
   	Then to view Created Outfile Request using "<Request_Type>","<Status1>"
   	Then to enable Israeli_Cheque_Outfile_Creation_Server
   	Then validate whether payment moves to Completed for IsraeliInward Payment Flow using "<ValueDateperiod>","<UpdatedPaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
   	Then disable Israeli_Cheque_Outfile_Creation_Server
   
    Examples: 
      | ValueDateperiod | PaymentType            | Reference | SubRef | ChequeNo | AccountNumber |FileType                   |FilePath																				                         |Period |FileName                       |ReasonCode1|ReasonCode2      | ReasonCode3| ReasonCode4  | UpdatedPaymentType                |Request_Type               |Status1                    |
      |                 | ISRAELI CHEQUE RECEIVE | Cheque No | EQUAL  | 30001745 |               |ISRAELI_CHEQUE_INWARD_FILE |E:\PIBC_PRJ\ISRAELI_CHEQUE_UPLOAD_DIR\CV12_TO_RASHUT54_20210308.TXT      |       |CV12_TO_RASHUT54_20210308.TXT  |02-Balance |03-Closed Drawer | 04-Tug die | 05-Suspended | ISRAELI CHEQUE RETURN SEND        |Israeli return send cheque |QueuedToFileCreation       |      
      
  