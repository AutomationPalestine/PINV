
@OutwardFlow
Feature: To test the outward payment functionality

  @TC_16_01_OutwardPaymentFlow #Working Fine
  Scenario Outline: To test the outward payment flow
    Given user checks whether payment moved to QueuedToPayment status using "<ChequeNo>" and "<Payer_Account>" in cheque data entry list menu
    And  user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed using "<ChequeNo>" and "<Payer Account>"
    Then user validates whether payment moved to QueuedToAccountVerification status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    Then user validates whether payment moved to QueuedToOutPresentCheque status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    And  user validates whether payment moved to QueuedToOutFile status filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
   	Then user checks the scheduler status
   	Then user disable Cheque_Outward_Payment_Creation_Server in environment server
	  Then user To validates whether payment moved to PendingAck status filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
  	
    Examples: 
      | valuedateperiod | Reference | SubRef | ChequeNo | Payer_Account |
      |                 | Cheque No | EQUAL  | 30004008 |  1376832300   |
      
   
  @TC_16_02_VIPOutwardPaymentFlow #working fine
  Scenario Outline: To test the VIP outward payment flow
    Given user checks whether payment moved to QueuedToPayment status using "<ChequeNo>" and "<Payer_Account>" in cheque data entry list menu
    And  user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed using "<ChequeNo>" and "<Payer Account>"
    Then user validates whether payment moved to QueuedToAccountVerification status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    Then user validates whether payment moved to QueuedToOutPresentCheque status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    And  user validates whether payment moved to QueuedToOutFile status filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    Then user checks the scheduler status for VIPOutwardPaymentFlow
   	Then user disable Cheque_Outward_Payment_Creation_Server in environment server
	  Then user To validates whether payment moved to PendingAck status filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
  	
    Examples: 
      | valuedateperiod | Reference | SubRef | ChequeNo | Payer_Account |
      |                 | Cheque No | EQUAL  | 30004009 |   1376832300 |
      
      
  @TC_16_03_DuplicateOutward #working Fine
  Scenario Outline: To test duplicate outward payment flow
    Given user checks whether payment moved to QueuedToPayment status using "<ChequeNo>" and "<Payer_Account>" in cheque data entry list menu
    And  user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed using "<ChequeNo>" and "<Payer Account>"
    Given user validates whether payment moved to Duplicate status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    Then user goes to Duplicate menu use the filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" and click on Allow duplicate button and then clicks on confirm button
    And user goes to approve menu uses the filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" and approves the payment
    Then user validates whether payment moved to QueuedToAccountVerification status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    Then user validates whether payment moved to QueuedToOutPresentCheque status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    And  user validates whether payment moved to QueuedToOutFile status filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
 	  Then user checks the scheduler status
    Then user disable Cheque_Outward_Payment_Creation_Server in environment server
	  Then user To validates whether payment moved to PendingAck status filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
  
    Examples: 
      | valuedateperiod | Reference | SubRef | ChequeNo | Payer_Account |
      |                 | Cheque No | EQUAL  | 30004010 | 1376832300    |

  @TC_16_04_RepairOutward #working fine
  Scenario Outline: To test repair outward payment flow
    Given user checks whether payment moved to QueuedToPayment status using "<ChequeNo>" and "<Payer_Account>" in cheque data entry list menu
    And  user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed using "<ChequeNo>" and "<Payer Account>"
    Then user validates whether payment moved to Repair status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    Then user goes to Repair menu uses the filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" repair the payment "<Date>" click on Ok button and click on confirm button
    And user goes to approve menu uses the filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" and approves the payment
    Then user validates whether payment moved to QueuedToAccountVerification status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    Then user validates whether payment moved to QueuedToOutPresentCheque status using filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
    And  user validates whether payment moved to QueuedToOutFile status filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
 	  Then user checks the scheduler status
    Then user disable Cheque_Outward_Payment_Creation_Server in environment server
	  Then user To validates whether payment moved to PendingAck status filter "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" in payment list menu
  
    Examples: 
      | valuedateperiod | Reference | SubRef | ChequeNo | Payer_Account | Date     |
      |                 | Cheque No | EQUAL  |30004011  |  1376832300   | 08/02/21 |
