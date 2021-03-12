Feature: Israeli Inward Payment flow feature

 @TC_18_01_IsraeliInwardPaymentFlow
  Scenario Outline: Israeli Inward Payment flow
    Then To check whether Inward file gets uploaded using "<FileType>","<FilePath>"
   	Then To check whether Cheque data entry move to QueuedToPayment status for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then To check whether Cheque data entry gets Completed for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then disable Israeli_Inward_Cheque_Server
    Then validate whether payment moves to QueuedToAccountVerification status for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then validate whether payment moves to QueuedToIntitalPosting status for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to SignatureCheck status for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to PendingSettlement for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
		#Then to perform EOD and then SOD
		#Then check whether payment moves to Completed Status for IsraeliInward Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
		
    Examples: 
      | ValueDateperiod | PaymentType            | Reference | SubRef | ChequeNo | AccountNumber |FileType                   |FilePath																				                         |Period |FileName                       |
      |                 | ISRAELI CHEQUE RECEIVE | Cheque No | EQUAL  | 30001111 |               |ISRAELI_CHEQUE_INWARD_FILE |E:\PIBC_PRJ\ISRAELI_CHEQUE_UPLOAD_DIR\CV12_TO_RASHUT61_20210209.TXT      |       |CV12_TO_RASHUT61_20210209.TXT  | 
    
  
   @TC_18_02_IsraeliInwardReturnPaymentFlow
   Scenario Outline: Israeli Inward Return Payment flow
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
    Then validate whether payment moves to QueuedToIsraeliReturnCreation using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to Rejected for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
   	Then validate whether Out file request is getting created using "<Request_Type>"
   	Then to view Created Outfile Request using "<Request_Type>","<Status1>"
   	Then to enable Israeli_Cheque_Outfile_Creation_Server
   	Then validate whether payment moves to Completed for IsraeliInward Payment Flow using "<ValueDateperiod>","<UpdatedPaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
   	Then disable Israeli_Cheque_Outfile_Creation_Server
   
    Examples: 
      | ValueDateperiod | PaymentType            | Reference | SubRef | ChequeNo | AccountNumber |FileType                   |FilePath																				                         |Period |FileName                       |ReasonCode1|ReasonCode2      | ReasonCode3| ReasonCode4  | UpdatedPaymentType                |Request_Type               |Status1                    |
      |                 | ISRAELI CHEQUE RECEIVE | Cheque No | EQUAL  | 30001234 |               |ISRAELI_CHEQUE_INWARD_FILE |E:\PIBC_PRJ\ISRAELI_CHEQUE_UPLOAD_DIR\CV12_TO_RASHUT66_20210209.TXT      |       |CV12_TO_RASHUT66_20210209.TXT  |02-Balance |03-Closed Drawer | 04-Tug die | 05-Suspended | ISRAELI CHEQUE RETURN SEND        |Israeli return send cheque |QueuedToFileCreation       |      
 
  
 	@TC_18_03_IsraeliInwardInsufficientFundPaymentFlow
   Scenario Outline: Israeli Inward InsufficientFund Payment flow
    Then To check whether Inward file gets uploaded using "<FileType>","<FilePath>"
   	Then To check whether Cheque data entry move to QueuedToPayment status for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then To check whether Cheque data entry gets Completed for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then disable Israeli_Inward_Cheque_Server
    Then validate whether payment moves to QueuedToAccountVerification status for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then validate whether payment moves to QueuedToIntitalPosting status for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   	Then validate whether payment moves to SignatureCheck status for InsufficientFund for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
   	Then validate whether payment moves to InsufficientFund status for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment gets approved from InsufficientFundQueue for IsraeliInwardFlow "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
 		Then validate whether payment moves to HeadOfficeApprove for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
  	Then validate whether payment gets approved from HeadOfficeApprove for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
    Then validate whether payment moves to PendingSettlement for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
		#Then to perform EOD and then SOD
		#Then check whether payment moves to Completed Status for IsraeliInward Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
	
    Examples: 
      | ValueDateperiod | PaymentType            | Reference | SubRef | ChequeNo | AccountNumber |FileType                   |FilePath																				                         |Period |FileName                       |
      |                 | ISRAELI CHEQUE RECEIVE | Cheque No | EQUAL  | 30001235 |               |ISRAELI_CHEQUE_INWARD_FILE |E:\PIBC_PRJ\ISRAELI_CHEQUE_UPLOAD_DIR\CV12_TO_RASHUT67_20210209.TXT      |       |CV12_TO_RASHUT67_20210209.TXT  |     
     
   @TC_18_04_IsraeliInwardInsufficientFundReturnPaymentFlow
   Scenario Outline: Israeli Inward InsufficientFund Return Payment flow
    Then To check whether Inward file gets uploaded using "<FileType>","<FilePath>"
   	Then To check whether Cheque data entry move to QueuedToPayment status for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then To check whether Cheque data entry gets Completed for Israeli Payment Flow using "<FileName>","<Period>","<FileType>"
    Then disable Israeli_Inward_Cheque_Server
   	Then validate whether payment moves to QueuedToAccountVerification status for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>","<gpkey>"
    Then validate whether payment moves to QueuedToIntitalPosting status for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
   	Then validate whether payment moves to SignatureCheck status for InsufficientFund for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
  	Then validate whether payment moves to InsufficientFund status for IsraeliInwardFlow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment gets returned from InsufficientFund for IsraeliInward Payment Flow "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" "<ReasonCode1>","<ReasonCode2>","<ReasonCode3>","<ReasonCode4>"
  	Then validate whether payment moves to QueuedToFinalPosting after return from InsufficientFund for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to QueuedToIsraeliReturnCreation using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>"
    Then validate whether payment moves to Rejected for IsraeliInward Payment Flow using "<ValueDateperiod>","<PaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
   	Then validate whether Out file request is getting created using "<Request_Type>"
   	Then to view Created Outfile Request using "<Request_Type>","<Status1>"
   	Then to enable Israeli_Cheque_Outfile_Creation_Server
   	Then validate whether payment moves to Completed for IsraeliInward Payment Flow using "<ValueDateperiod>","<UpdatedPaymentType>","<Reference>","<SubRef>","<ChequeNo>","<AccountNumber>" 
   	Then disable Israeli_Cheque_Outfile_Creation_Server
  
    Examples: 
      | ValueDateperiod | PaymentType            | Reference | SubRef | ChequeNo | AccountNumber |FileType                   |FilePath																				                         |Period |FileName                       |ReasonCode1|ReasonCode2      | ReasonCode3| ReasonCode4  | UpdatedPaymentType                |Request_Type               |Status1                    |
      |                 | ISRAELI CHEQUE RECEIVE | Cheque No | EQUAL  | 30001236 |               |ISRAELI_CHEQUE_INWARD_FILE |E:\PIBC_PRJ\ISRAELI_CHEQUE_UPLOAD_DIR\CV12_TO_RASHUT68_20210209.TXT      |       |CV12_TO_RASHUT68_20210209.TXT  |02-Balance |03-Closed Drawer | 04-Tug die | 05-Suspended | ISRAELI CHEQUE RETURN SEND        |Israeli return send cheque |QueuedToFileCreation       |   
 