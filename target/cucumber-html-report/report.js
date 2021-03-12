$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/TC19-IsraeliOutwardPaymentFlow.feature");
formatter.feature({
  "name": "To test the outward payment functionality for Israeli Payment Flow",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@OutwardFlow"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To test the Israeli outward return payment flow",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_19_04_OutwardIsraeliReturnPaymentFlow"
    }
  ]
});
formatter.step({
  "name": "user checks whether payment moved to QueuedToPayment status for IsraeliOutward Payment Flow using \"\u003cChequeNo\u003e\" and \"\u003cPayer_Account\u003e\" in cheque data entry list menu",
  "keyword": "Given "
});
formatter.step({
  "name": "user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed for IsraeliOutward Payment Flow using \"\u003cChequeNo\u003e\" and \"\u003cPayer_Account\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user validates whether payment moved to QueuedToAccountVerification status for IsraeliOutward Payment Flow using filter \"\u003cvaluedateperiod\u003e\",\"\u003cReference\u003e\",\"\u003cSubRef\u003e\",\"\u003cChequeNumber\u003e\" in payment list menu",
  "keyword": "Then "
});
formatter.step({
  "name": "user validates whether payment moved to QueuedToOutPresentCheque status for IsraeliOutward Payment Flow using filter \"\u003cvaluedateperiod\u003e\",\"\u003cReference\u003e\",\"\u003cSubRef\u003e\",\"\u003cChequeNumber\u003e\" in payment list menu",
  "keyword": "Then "
});
formatter.step({
  "name": "user validates whether payment moved to QueuedToOutFile status for IsraeliOutward Payment Flow using filter \"\u003cvaluedateperiod\u003e\",\"\u003cReference\u003e\",\"\u003cSubRef\u003e\",\"\u003cChequeNumber\u003e\" in payment list menu",
  "keyword": "And "
});
formatter.step({
  "name": "user disable Cheque_Outward_Payment_Creation_Server in environment server for IsraeliOutward Payment Flow",
  "keyword": "Then "
});
formatter.step({
  "name": "to check whether Outfile request is getting created using \"\u003cRequest_Type\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "To View Created Outfile Request using \"\u003cRequest_Type\u003e\",\"\u003cStatus1\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "To Enable Israeli_Cheque_Outfile_Creation_Server",
  "keyword": "Then "
});
formatter.step({
  "name": "to check whether payment moves to QueuedToIsraeliImageIdMapping status using \"\u003cvaluedateperiod\u003e\",\"\u003cReference\u003e\",\"\u003cSubRef\u003e\",\"\u003cChequeNumber\u003e\" in payment list menu",
  "keyword": "Then "
});
formatter.step({
  "name": "to upload ISRAELI_CHEQUE_INWARD_IMAGE_FILE using \"\u003cFileType\u003e\",\"\u003cFilePath\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "to enable Israeli_Outward_ImageIdMapping_Server",
  "keyword": "Then "
});
formatter.step({
  "name": "to check whether payment moves to PendingSettlement for IsraeliOutward Payment Flow using \"\u003cvaluedateperiod\u003e\",\"\u003cReference\u003e\",\"\u003cSubRef\u003e\",\"\u003cChequeNumber\u003e\" in payment list menu",
  "keyword": "Then "
});
formatter.step({
  "name": "to check whether file gets uploaded using \"\u003cFileType1\u003e\",\"\u003cFilePath1\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "To check whether File Status move to QueuedToOutwardReturned status using \"\u003cFileName\u003e\",\"\u003cPeriod\u003e\",\"\u003cFileType1\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "disable Israeli_Cheque_Outfile_Creation_Server for IsraeliOutward Payment Flow",
  "keyword": "Then "
});
formatter.step({
  "name": "disable Israeli_Outward_ImageIdMapping_Server",
  "keyword": "Then "
});
formatter.step({
  "name": "to enable Israeli_Outward_Return_Server",
  "keyword": "Then "
});
formatter.step({
  "name": "to check whether payment moves to QueuedToOutReplyCheque status using \"\u003cvaluedateperiod\u003e\",\"\u003cReference\u003e\",\"\u003cSubRef\u003e\",\"\u003cChequeNumber\u003e\" in payment list menu",
  "keyword": "Then "
});
formatter.step({
  "name": "check whether payment moves to Returned status using \"\u003cvaluedateperiod\u003e\",\"\u003cReference\u003e\",\"\u003cSubRef\u003e\",\"\u003cChequeNumber\u003e\" in payment list menu",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "valuedateperiod",
        "Reference",
        "SubRef",
        "ChequeNo",
        "Payer_Account",
        "ChequeNumber",
        "Request_Type",
        "Status1",
        "Period",
        "FileType",
        "FilePath",
        "FileType1",
        "FilePath1",
        "FileName"
      ]
    },
    {
      "cells": [
        "",
        "Cheque No",
        "EQUAL",
        "30099096",
        "1376832300",
        "0030099096",
        "Israeli send cheque",
        "QueuedToFileCreation",
        "",
        "ISRAELI_CHEQUE_INWARD_IMAGE_FILE",
        "E:\\PIBC_PRJ\\ISRAELI_CHEQUE_UPLOAD_DIR\\GY_ 03_ 1_ 20210209.TXT",
        "ISRAELI_CHEQUE_INWARD_RETURNED_FILE",
        "E:\\PIBC_PRJ\\ISRAELI_CHEQUE_UPLOAD_DIR\\HZR12_TO_RASHUT03_20210209.TXT",
        "HZR12_TO_RASHUT03_20210209.TXT"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To test the Israeli outward return payment flow",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@OutwardFlow"
    },
    {
      "name": "@TC_19_04_OutwardIsraeliReturnPaymentFlow"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user checks whether payment moved to QueuedToPayment status for IsraeliOutward Payment Flow using \"30099096\" and \"1376832300\" in cheque data entry list menu",
  "keyword": "Given "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.user_checks_whether_payment_moved_to_QueuedToPayment_status_for_IsraeliOutward_Payment_using_and_in_cheque_data_entry_list_menu(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed for IsraeliOutward Payment Flow using \"30099096\" and \"1376832300\"",
  "keyword": "And "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.user_enables_Cheque_Outward_Payment_Creation_Server_and_checks_whether_Cheque_data_entry_gets_completed_for_IsraeliOutward_Payment_Flow_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user validates whether payment moved to QueuedToAccountVerification status for IsraeliOutward Payment Flow using filter \"\",\"Cheque No\",\"EQUAL\",\"0030099096\" in payment list menu",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.user_validates_whether_payment_moved_to_QueuedToAccountVerification_status_for_IsraeliOutward_Payment_Flow_using_filter_in_payment_list_menu(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user validates whether payment moved to QueuedToOutPresentCheque status for IsraeliOutward Payment Flow using filter \"\",\"Cheque No\",\"EQUAL\",\"0030099096\" in payment list menu",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.user_validates_whether_payment_moved_to_QueuedToOutPresentCheque_status_for_IsraeliOutward_Payment_Flow_using_filter_in_payment_list_menu(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user validates whether payment moved to QueuedToOutFile status for IsraeliOutward Payment Flow using filter \"\",\"Cheque No\",\"EQUAL\",\"0030099096\" in payment list menu",
  "keyword": "And "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.user_validates_whether_payment_moved_to_QueuedToOutFile_status_for_IsraeliOutward_Payment_Flow_using_filter_in_payment_list_menu(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user disable Cheque_Outward_Payment_Creation_Server in environment server for IsraeliOutward Payment Flow",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.user_disable_Cheque_Outward_Payment_Creation_Server_in_environment_server_for_IsraeliOutward_Payment_Flow()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "to check whether Outfile request is getting created using \"Israeli send cheque\"",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.to_check_whether_Out_file_request_is_getting_created_using(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "To View Created Outfile Request using \"Israeli send cheque\",\"QueuedToFileCreation\"",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.to_view_Created_Outfile_Request_using(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "To Enable Israeli_Cheque_Outfile_Creation_Server",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.To_Enable_Israeli_Cheque_Outfile_Creation_Server()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "to check whether payment moves to QueuedToIsraeliImageIdMapping status using \"\",\"Cheque No\",\"EQUAL\",\"0030099096\" in payment list menu",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.to_check_whether_payment_moves_to_QueuedToIsraeliImageIdMapping_status_using_in_payment_list_menu(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "to upload ISRAELI_CHEQUE_INWARD_IMAGE_FILE using \"ISRAELI_CHEQUE_INWARD_IMAGE_FILE\",\"E:\\PIBC_PRJ\\ISRAELI_CHEQUE_UPLOAD_DIR\\GY_ 03_ 1_ 20210209.TXT\"",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.to_upload_ISRAELI_CHEQUE_INWARD_IMAGE_FILE_using(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "to enable Israeli_Outward_ImageIdMapping_Server",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.to_enable_Israeli_Outward_ImageIdMapping_Server()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "to check whether payment moves to PendingSettlement for IsraeliOutward Payment Flow using \"\",\"Cheque No\",\"EQUAL\",\"0030099096\" in payment list menu",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.to_check_whether_payment_moves_to_PendingSettlement_for_IsraeliOutward_Payment_Flow_using_in_payment_list_menu(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "to check whether file gets uploaded using \"ISRAELI_CHEQUE_INWARD_RETURNED_FILE\",\"E:\\PIBC_PRJ\\ISRAELI_CHEQUE_UPLOAD_DIR\\HZR12_TO_RASHUT03_20210209.TXT\"",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.to_check_whether_file_gets_uploaded_using(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "To check whether File Status move to QueuedToOutwardReturned status using \"HZR12_TO_RASHUT03_20210209.TXT\",\"\",\"ISRAELI_CHEQUE_INWARD_RETURNED_FILE\"",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.To_check_whether_File_Status_move_to_QueuedToOutwardReturned_status_using(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "disable Israeli_Cheque_Outfile_Creation_Server for IsraeliOutward Payment Flow",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.disable_Israeli_Cheque_Outfile_Creation_Server_for_IsraeliOutward_Payment_Flow()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "disable Israeli_Outward_ImageIdMapping_Server",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.disable_Israeli_Outward_ImageIdMapping_Server()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "to enable Israeli_Outward_Return_Server",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.to_enable_Israeli_Outward_Return_Server()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "to check whether payment moves to QueuedToOutReplyCheque status using \"\",\"Cheque No\",\"EQUAL\",\"0030099096\" in payment list menu",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.to_check_whether_payment_moves_to_QueuedToOutReplyCheque_status_using_in_payment_list_menu(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "check whether payment moves to Returned status using \"\",\"Cheque No\",\"EQUAL\",\"0030099096\" in payment list menu",
  "keyword": "Then "
});
formatter.match({
  "location": "OutwardIsraeliPaymentFlowStepDefination.check_whether_payment_moves_to_Returned_status_using_in_payment_list_menu(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});