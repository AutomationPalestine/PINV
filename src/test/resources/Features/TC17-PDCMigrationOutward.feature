#Author: Pranjal
@OutwardPDCMigrationFeature
Feature: To test the PDC migration functionality

  #@TC_17_11_PDCMigrationCheck
  #Scenario Outline: To check PDC flow
  #Given user goes to cheque data entry list menu select PDC migration and clicks on Ok button
  #Then user validates the status of cheque is completed 
  #And user goes to payment list menu and validates the status of cheque is in future using filters "<Reference>","<SubRef>","<ChequeNo>"

  #Examples: 
  #| Reference  | SubRef | ChequeNo  |
  #| Cheque No	|  EQUAL | 37020215  |
  #| Cheque No  |  EQUAL | 37020214  |

  
  #@TC_17_01__PDCModify
  #Scenario Outline: To modify PDC cheque
  #Given user goes to PDC menu and clicks on modify submenu and use filters "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>"
  #Then user modifies the "<BIC-code>" and clicks on Ok button and confirm button
  #Then user approves the modification from approve menu using filters "<valuedateperiod>","<Reference>","<SubRef>","<ChequeNo>" 
  #
  #Examples: 
 #|valuedateperiod| Reference  | SubRef | ChequeNo  | BIC-code     |
 #|  						 | Cheque No	|  EQUAL | 37020214  | ALDNPS20472  |