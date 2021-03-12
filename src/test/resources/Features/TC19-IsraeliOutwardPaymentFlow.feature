@OutwardFlow
Feature: To test the outward payment functionality for Israeli Payment Flow

  #@TC_19_01_OutwardIsraeliPaymentFlow 
  #Scenario Outline: To test the Israeli outward payment flow
   # Given user checks whether payment moved to QueuedToPayment status for IsraeliOutward Payment Flow using "<ChequeNo>" and "<Payer_Account>" in cheque data entry list menu
   # And  user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed for IsraeliOutward Payment Flow using "<ChequeNo>" and "<Payer_Account>"
   # Then user validates whether payment moved to QueuedToAccountVerification status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
   # Then user validates whether payment moved to QueuedToOutPresentCheque status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
   # And  user validates whether payment moved to QueuedToOutFile status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
   # Then user disable Cheque_Outward_Payment_Creation_Server in environment server for IsraeliOutward Payment Flow 
	 #	Then to check whether Outfile request is getting created using "<Request_Type>"
   #	Then To View Created Outfile Request using "<Request_Type>","<Status1>"
   #	Then To Enable Israeli_Cheque_Outfile_Creation_Server
   #	Then to check whether payment moves to QueuedToIsraeliImageIdMapping status using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
   #	Then to upload ISRAELI_CHEQUE_INWARD_IMAGE_FILE using "<FileType>","<FilePath>"
   # Then to enable Israeli_Outward_ImageIdMapping_Server
   # Then to check whether payment moves to PendingSettlement for IsraeliOutward Payment Flow using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
		#Then to perform EOD and then SOD for IsraeliOutward Payment Flow
		#Then to check whether payment moves to QueuedToOutReplyCheque status using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
   	#Then check whether payment moves to Completed Status for IsraeliOutward Payment Flow using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
		#Then disable Israeli_Cheque_Outfile_Creation_Server for IsraeliOutward Payment Flow
		#Then disable Israeli_Outward_ImageIdMapping_Server
   	
   	#Examples: 
     # | valuedateperiod | Reference | SubRef | ChequeNo | Payer_Account |ChequeNumber |Request_Type       |Status1                    |Period |FileType                        |FilePath		                                                  |                   
     # |                 | Cheque No | EQUAL  | 30099099 |  1376832300   | 0030099099  |Israeli send cheque|QueuedToFileCreation       |       |ISRAELI_CHEQUE_INWARD_IMAGE_FILE|E:\PIBC_PRJ\ISRAELI_CHEQUE_UPLOAD_DIR\GY_ 01_ 1_ 20210209.TXT |
   
   @TC_19_02_OutwardIsraeliPaymentRepairFlow 
  Scenario Outline: To test the Israeli Repair outward payment flow
    Given user checks whether payment moved to QueuedToPayment status for IsraeliOutward Payment Flow using "<ChequeNo>" and "<Payer_Account>" in cheque data entry list menu
    And  user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed for IsraeliOutward Payment Flow using "<ChequeNo>" and "<Payer_Account>"
    Then user validates whether payment moved to Repair status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    Then user goes to Repair menu for IsraeliOutward Payment Flow uses the filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" repair the payment "<Date>" click on Ok button and click on confirm button
    Then user goes to approve menu for IsraeliOutward Payment Flow uses the filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" and approves the payment
 		Then user validates whether payment moved to QueuedToAccountVerification status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
    Then user validates whether payment moved to QueuedToOutPresentCheque status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
    And  user validates whether payment moved to QueuedToOutFile status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
    Then user disable Cheque_Outward_Payment_Creation_Server in environment server for IsraeliOutward Payment Flow 
	 	Then to check whether Outfile request is getting created using "<Request_Type>"
   	Then To View Created Outfile Request using "<Request_Type>","<Status1>"
   	Then To Enable Israeli_Cheque_Outfile_Creation_Server
   	Then to check whether payment moves to QueuedToIsraeliImageIdMapping status using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
   	Then to upload ISRAELI_CHEQUE_INWARD_IMAGE_FILE using "<FileType>","<FilePath>"
    Then to enable Israeli_Outward_ImageIdMapping_Server
    Then to check whether payment moves to PendingSettlement for IsraeliOutward Payment Flow using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
		#Then to perform EOD and then SOD for IsraeliOutward Payment Flow
		#Then to check whether payment moves to QueuedToOutReplyCheque status using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
   	#Then check whether payment moves to Completed Status for IsraeliOutward Payment Flow using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
		Then disable Israeli_Cheque_Outfile_Creation_Server for IsraeliOutward Payment Flow
		Then disable Israeli_Outward_ImageIdMapping_Server
   	
   	Examples: 
      | valuedateperiod | Reference | SubRef | ChequeNo | Payer_Account |ChequeNumber |Request_Type       |Status1                    |Period |FileType                        |FilePath		                                                  |Date     |                     
      |                 | Cheque No | EQUAL  | 30099097 |  1376832300   | 0030099097  |Israeli send cheque|QueuedToFileCreation       |       |ISRAELI_CHEQUE_INWARD_IMAGE_FILE|E:\PIBC_PRJ\ISRAELI_CHEQUE_UPLOAD_DIR\GY_ 02_ 1_ 20210209.TXT |09/02/21 |
   
    
   @TC_19_03_OutwardIsraeliPaymentDuplicateFlow 
   Scenario Outline: To test the Israeli duplicate outward payment flow
    Given user checks whether payment moved to QueuedToPayment status for IsraeliOutward Payment Flow using "<ChequeNo>" and "<Payer_Account>" in cheque data entry list menu
    And  user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed for IsraeliOutward Payment Flow using "<ChequeNo>" and "<Payer_Account>"
    Given user validates whether payment moved to Duplicate status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
    Then user goes to Duplicate menu for IsraeliOutward Payment Flow use the filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" and click on Allow duplicate button and then clicks on confirm button
    Then user goes to approve menu for IsraeliOutward Payment Flow uses the filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" and approves the payment
 		Then user validates whether payment moved to QueuedToAccountVerification status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
    Then user validates whether payment moved to QueuedToOutPresentCheque status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
    And  user validates whether payment moved to QueuedToOutFile status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
    Then user disable Cheque_Outward_Payment_Creation_Server in environment server for IsraeliOutward Payment Flow 
	 	Then to check whether Outfile request is getting created using "<Request_Type>"
   	Then To View Created Outfile Request using "<Request_Type>","<Status1>"
   	Then To Enable Israeli_Cheque_Outfile_Creation_Server
   	Then to check whether payment moves to QueuedToIsraeliImageIdMapping status using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
   	Then to upload ISRAELI_CHEQUE_INWARD_IMAGE_FILE using "<FileType>","<FilePath>"
    Then to enable Israeli_Outward_ImageIdMapping_Server
    Then to check whether payment moves to PendingSettlement for IsraeliOutward Payment Flow using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
		#Then to perform EOD and then SOD for IsraeliOutward Payment Flow
		#Then to check whether payment moves to QueuedToOutReplyCheque status using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
   	#Then check whether payment moves to Completed Status for IsraeliOutward Payment Flow using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
		Then disable Israeli_Cheque_Outfile_Creation_Server for IsraeliOutward Payment Flow
		Then disable Israeli_Outward_ImageIdMapping_Server
   	Examples: 
      | valuedateperiod | Reference | SubRef | ChequeNo | Payer_Account |ChequeNumber |Request_Type       |Status1                    |Period |FileType                        |FilePath		                                                   |                     
      |                 | Cheque No | EQUAL  | 30000098 |  1376832300   | 0030000098  |Israeli send cheque|QueuedToFileCreation        |       |ISRAELI_CHEQUE_INWARD_IMAGE_FILE|E:\PIBC_PRJ\ISRAELI_CHEQUE_UPLOAD_DIR\GY_ 05_ 1_ 20210209.TXT |
   
    @TC_19_04_OutwardIsraeliReturnPaymentFlow 
    Scenario Outline: To test the Israeli outward return payment flow
    Given user checks whether payment moved to QueuedToPayment status for IsraeliOutward Payment Flow using "<ChequeNo>" and "<Payer_Account>" in cheque data entry list menu
    And  user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed for IsraeliOutward Payment Flow using "<ChequeNo>" and "<Payer_Account>"
    Then user validates whether payment moved to QueuedToAccountVerification status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
    Then user validates whether payment moved to QueuedToOutPresentCheque status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
    And  user validates whether payment moved to QueuedToOutFile status for IsraeliOutward Payment Flow using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
    Then user disable Cheque_Outward_Payment_Creation_Server in environment server for IsraeliOutward Payment Flow 
	 	Then to check whether Outfile request is getting created using "<Request_Type>"
   	Then To View Created Outfile Request using "<Request_Type>","<Status1>"
   	Then To Enable Israeli_Cheque_Outfile_Creation_Server
   	Then to check whether payment moves to QueuedToIsraeliImageIdMapping status using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
   	Then to upload ISRAELI_CHEQUE_INWARD_IMAGE_FILE using "<FileType>","<FilePath>"
    Then to enable Israeli_Outward_ImageIdMapping_Server
    Then to check whether payment moves to PendingSettlement for IsraeliOutward Payment Flow using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
		Then to check whether file gets uploaded using "<FileType1>","<FilePath1>"
		Then To check whether File Status move to QueuedToOutwardReturned status using "<FileName>","<Period>","<FileType1>"
  	Then disable Israeli_Cheque_Outfile_Creation_Server for IsraeliOutward Payment Flow
		Then disable Israeli_Outward_ImageIdMapping_Server
    Then to enable Israeli_Outward_Return_Server
    Then to check whether payment moves to QueuedToOutReplyCheque status using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
  	Then check whether payment moves to Returned status using "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNumber>" in payment list menu
    
		
			Examples:  
      | valuedateperiod | Reference | SubRef | ChequeNo | Payer_Account |ChequeNumber |Request_Type       |Status1                    |Period |FileType                        |FilePath		                                                  |FileType1                           |FilePath1                                                              |FileName                      | 
      |                 | Cheque No | EQUAL  | 30099096 |  1376832300   | 0030099096  |Israeli send cheque|QueuedToFileCreation       |       |ISRAELI_CHEQUE_INWARD_IMAGE_FILE|E:\PIBC_PRJ\ISRAELI_CHEQUE_UPLOAD_DIR\GY_ 03_ 1_ 20210209.TXT |ISRAELI_CHEQUE_INWARD_RETURNED_FILE |E:\PIBC_PRJ\ISRAELI_CHEQUE_UPLOAD_DIR\HZR12_TO_RASHUT03_20210209.TXT   |HZR12_TO_RASHUT03_20210209.TXT|
   