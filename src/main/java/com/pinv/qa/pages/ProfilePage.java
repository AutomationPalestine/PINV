package com.pinv.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pinv.qa.base.TestBase;
import com.pinv.qa.constants.IntfConstants;
import com.pinv.qa.util.TestUtil;





public class ProfilePage extends TestBase {

	//--------- Profile Page Xpath----------
	
	//Administration
	
	// user menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[15]/td[7]/input")
	WebElement chkboxUserList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[16]/td[7]/input")
	WebElement chkboxUserAdd;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[17]/td[7]/input")
	WebElement chkboxUserModify;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[18]/td[7]/input")
	WebElement chkboxUserApprove;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[19]/td[7]/input")
	WebElement chkboxUserBlock;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[20]/td[7]/input")
	WebElement chkboxUserRemove;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[22]/td[7]/input")
	WebElement chkboxUserReportBuild;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[23]/td[7]/input")
	WebElement chkboxUserReportView;


	//group menu checkbox 
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[25]/td[7]/input")
	WebElement chkboxGroupList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[26]/td[7]/input")
	WebElement chkboxGroupAdd;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[27]/td[7]/input")
	WebElement chkboxGroupModify;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[28]/td[7]/input")
	WebElement chkboxGroupApprove;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[29]/td[7]/input")
	WebElement chkboxGroupBlock;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[30]/td[7]/input")
	WebElement chkboxGroupUnBlock;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[31]/td[7]/input")
	WebElement chkboxGroupRemove;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[33]/td[7]/input")
	WebElement chkboxGroupReportBuild;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[34]/td[7]/input")
	WebElement chkboxGroupReportView;


	// Profile menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[36]/td[7]/input")
	WebElement chkboxProfileList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[37]/td[7]/input")
	WebElement chkboxProfileAdd;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[38]/td[7]/input")
	WebElement chkboxProfileModify;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[39]/td[7]/input")
	WebElement chkboxProfileApprove;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[40]/td[7]/input")
	WebElement chkboxProfileRemove;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[42]/td[7]/input")
	WebElement chkboxProfileReportBuild;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[43]/td[7]/input")
	WebElement chkboxProfileReportView;

	//Scanner Profile menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[45]/td[7]/input")
	WebElement checkboxScanView;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[46]/td[7]/input")
	WebElement checkboxScanAdd;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[47]/td[7]/input")
	WebElement checkboxScanModify;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[48]/td[7]/input")
	WebElement checkboxScanRemove;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[49]/td[7]/input")
	WebElement checkboxScanApprove;

	//Scanner Profile Mapping menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[51]/td[7]/input")
	WebElement checkboxScanProfileMap;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[52]/td[7]/input")
	WebElement checkboxScanProfileMapList;

	//Environment menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[54]/td[7]/input")
	WebElement checkboxRun;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[55]/td[7]/input")
	WebElement checkboxShow;

	// Application Maintenance menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[58]/td[7]/input")
	WebElement checkboxParameterMaintenance;

	//User Authorization Matrix menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[60]/td[7]/input")
	WebElement checkboxMatrixList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[61]/td[7]/input")
	WebElement checkboxMatrixAdd;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[62]/td[7]/input")
	WebElement checkboxMatrixModify;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[63]/td[7]/input")
	WebElement checkboxMatrixApprove;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[64]/td[7]/input")
	WebElement checkboxMatrixDelete;

	// Generic Param Constant menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[66]/td[7]/input")
	WebElement checkboxGenericView;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[67]/td[7]/input")
	WebElement checkboxGenericModify;

	//Currency menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[69]/td[7]/input")
	WebElement checkboxCurrencyList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[70]/td[7]/input")
	WebElement checkboxCurrencyAdd;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[71]/td[7]/input")
	WebElement checkboxCurrencyModify;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[72]/td[7]/input")
	WebElement checkboxCurrencyDelete;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[73]/td[7]/input")
	WebElement checkboxCurrencyApprove;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[74]/td[7]/input")
	WebElement checkboxSampleFile;

	//Email Distribution List menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[77]/td[7]/input")
	WebElement checkboxDistList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[78]/td[7]/input")
	WebElement checkboxDistAdd;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[79]/td[7]/input")
	WebElement checkboxDistApprove;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[80]/td[7]/input")
	WebElement checkboxDistModify;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[81]/td[7]/input")
	WebElement checkboxDistDelete;

	// Message menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[83]/td[7]/input")
	WebElement checkboxMessageView;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[84]/td[7]/input")
	WebElement checkboxMessageNew;

	//Schedule menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[86]/td[7]/input")
	WebElement checkboxScheduleList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[87]/td[7]/input")
	WebElement checkboxScheduleNew;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[88]/td[7]/input")
	WebElement checkboxScheduleModify;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[89]/td[7]/input")
	WebElement checkboxScheduleControl;

	//Calendar meny xpath
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[91]/td[7]/input")
	WebElement checkboxCalendarView;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[92]/td[7]/input")
	WebElement checkboxCalendarCreate;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[93]/td[7]/input")
	WebElement checkboxCalendarCreateBulk;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[94]/td[7]/input")
	WebElement checkboxCalendarModify;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[95]/td[7]/input")
	WebElement checkboxCalendarApprove;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[96]/td[7]/input")
	WebElement checkboxCalendarDelete;

	//DB menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[101]/td[7]/input")
	WebElement checkboxReturnCodeMaintenance;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[102]/td[7]/input")
	WebElement checkboxReturnCodeList;

//	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[104]/td[7]/input")
//	WebElement checkboxATMMaintenance;
//
//	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[105]/td[7]/input")
//	WebElement checkboxATMList;

	//Participant menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[107]/td[7]/input")
	WebElement checkboxPBList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[108]/td[7]/input")
	WebElement checkboxPBAdd;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[109]/td[7]/input")
	WebElement checkboxPBModify;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[110]/td[7]/input")
	WebElement checkboxPBApprove;

	//cheque stop
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[117]/td[7]/input") 
	WebElement checkboxChqList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[118]/td[7]/input")
	WebElement checkboxChqEnter;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[119]/td[7]/input")
	WebElement checkboxChqModify;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[120]/td[7]/input")
	WebElement checkboxChqApprove;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[121]/td[7]/input")
	WebElement checkboxChqDelete;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[122]/td[7]/input") 
	WebElement checkboxChqBulkUpload;

	//International Currency menu chkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[124]/td[7]/input") 
	WebElement checkboxIntCurrList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[125]/td[7]/input")
	WebElement checkboxIntCurrAdd;

	//PMA Files View checkbox menu
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[129]/td[7]/input")
	WebElement checkboxPMAFileList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[131]/td[7]/input")
	WebElement checkboxPMAGroupList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[133]/td[7]/input")
	WebElement checkboxPMAItemList;

	//ACH Clearing menu  checkbox

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[136]/td[7]/input")
	WebElement checkboxACHClearingList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[137]/td[7]/input")
	WebElement checkboxACHClearingReprocess;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[138]/td[7]/input")
	WebElement checkboxACHGroupList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[139]/td[7]/input")
	WebElement checkboxACHItemList;

	//Payment Menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[141]/td[7]/input")
	WebElement checkboxPaymentList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[147]/td[7]/input")
	WebElement checkboxPaymentApprove;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[142]/td[7]/input")
	WebElement checkboxPaymentDuplicate;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[143]/td[7]/input")
	WebElement checkboxPaymentRepair;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[144]/td[7]/input")
	WebElement checkboxPaymentQualify;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[145]/td[7]/input")
	WebElement checkboxPaymentSignCheck;

//	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[143]/td[7]/input")
//	WebElement checkboxPaymentList2;

	//PDC menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[153]/td[7]/input")
	WebElement checkboxPDCModify;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[152]/td[7]/input")
	WebElement checkboxPDCDelete;

//	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[147]/td[7]/input")
//	WebElement checkboxPDCReplace;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[154]/td[7]/input")
	WebElement checkboxPDCBatchModify;

//	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[149]/td[7]/input")
//	WebElement checkboxManualTray;
//
//	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[150]/td[7]/input")
//	WebElement checkboxInsufficentfund;
//
//	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[151]/td[7]/input")
//	WebElement checkboxInsufficentfundApprove;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[155]/td[7]/input")
	WebElement checkboxGetAcctDetail;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[165]/td[7]/input")
	WebElement checkboxFileView;

	//Cheque Inventory
//	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[156]/td[7]/input")
//	WebElement checkboxChqInvBulkUpload;
//
//	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[157]/td[7]/input")
//	WebElement checkboxChqReqFileList;
//
//	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[158]/td[7]/input")
//	WebElement checkboxChqReqFileDwnld;
//
//	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[159]/td[7]/input")
//	WebElement checkboxChqInvReport;
//
//	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[161]/td[7]/input")
//	WebElement checkboxChqBookList;
//
//	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[163]/td[7]/input")
//	WebElement checkboxChqLeafList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[182]/td[7]/input")
	WebElement checkboxTransactionReport;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[183]/td[7]/input")
	WebElement checkboxTransactionDetailReport;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[184]/td[7]/input")
	WebElement checkboxChqReconReport;

	//Client Scanner Tool menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[186]/td[7]/input")
	WebElement checkboxChqClientScannerTool;

	//Monitors menu checkbox 
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[188]/td[7]/input")
	WebElement checkboxMoneyTransferMonitor;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[189]/td[7]/input")
	WebElement checkboxPaymentTypeMonitor;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[191]/td[7]/input")
	WebElement checkboxStatusDisplaySet;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[192]/td[7]/input")
	WebElement checkboxPaymentTypeDisplaySet;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[193]/td[7]/input")
	WebElement checkboxPredefinedConfig;

	//Cheque Data Entry menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[195]/td[7]/input")
	WebElement checkboxChqDataList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[196]/td[7]/input")
	WebElement checkboxChqDataModify;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[197]/td[7]/input")
	WebElement checkboxChqDataDelete;

	//Advices menu checkbox
	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[200]/td[7]/input")
	WebElement checkboxAdviceList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[201]/td[7]/input")
	WebElement checkboxAdviceBatchList;

	@FindBy(xpath="//*[@id=\"jordan_ahli_bank-menu\"]/table/tbody/tr[202]/td[7]/input")
	WebElement checkboxReturnAdvicePMA;

	@FindBy(xpath="//button[@id='checkAllBtn']")
	WebElement btnChkAll;
	
	@FindBy(xpath="//button[@id='unCheckAllBtn']")
	WebElement btnUnChkAll;
	
	@FindBy(xpath="//input[@value=\"OK\"]")
	WebElement btnOk;
	
	@FindBy(xpath="//input[@value=\"Reset\"]")
	WebElement btnReset;
	
	@FindBy(xpath="//input[@value=\"Cancel\"]")
	WebElement btnCancel;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/p")
	WebElement cancelMsg;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/p[1]")
	WebElement duplicaterecordMsg;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/p[1]")
	WebElement btnOkErrorMsg;
	
	@FindBy(xpath="//*[@id=\"header_nav\"]/li[5]/a")
	WebElement btnRestartWorkFlow;
	
	@FindBy(xpath="//input[@value=\"OK\"]")
	WebElement confirmOK;
	
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement profilenameTextfield;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement btnSubmit;
	
	@FindBy(xpath="//input[@value=\"Cancel\"]")
	WebElement btnCancel2;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[1]")
	WebElement modifyRecord;
	
	//Approve profile menus xpath
	
	@FindBy(xpath="//td[@class='cellcolorbg'][contains(text(),'1')]")
	WebElement approveRecord;
	
	@FindBy(xpath="//input[@name='reject']")
	WebElement rejectRecord;
	
	@FindBy(xpath="//input[@name='repair']")
	WebElement repairRecord;
	
	@FindBy(xpath="//input[@name='approve']")
	WebElement btnApprove;
	
	//Remove button
	@FindBy(xpath="//input[@value='Remove']")
	WebElement btnRemove;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[1]")
	WebElement removeRecord;
	
	//Remove Message
	@FindBy(xpath="//*[@id=\"pageBody\"]/p")
	WebElement removeMsg;
	
	// logout btn
	@FindBy(xpath = "//*[@id=\"logoutButtonId\"]")
	WebElement btnLogout;

	// External logout btn
	@FindBy(name = "logoutBtn1")
	WebElement extBtnLogout;
	
	
	// Constructor
	 public ProfilePage() {
		 PageFactory.initElements(driver, this);
	 }

	//Methods
	 public void createMaker(String profilename) {
		 
		 profilenameTextfield.sendKeys(profilename);
		 //user menu checkbox
		 chkboxUserList.click();
		 chkboxUserAdd.click();
		 chkboxUserModify.click();
		 chkboxUserBlock.click();
		 chkboxUserRemove.click();
		 chkboxUserReportBuild.click();
		 chkboxUserReportView.click();
		 
		 //group menu checkbox
		 chkboxGroupList.click();
		 chkboxGroupAdd.click();
		 chkboxGroupModify.click();
		 chkboxGroupBlock.click();
		 chkboxGroupUnBlock.click();
		 chkboxGroupRemove.click();
		 chkboxGroupReportBuild.click();
		 chkboxGroupReportView.click();
		 
		 //profile menu checkbox
		 chkboxProfileList.click();
		 chkboxProfileAdd.click();
		 chkboxProfileModify.click();
		 chkboxProfileRemove.click();
		 chkboxProfileReportBuild.click();
		 chkboxProfileReportView.click();
		 
		 //scanner profile menu checkbox
		 checkboxScanView.click();
		 checkboxScanAdd.click();
		 checkboxScanModify.click();
		 checkboxScanRemove.click();
		 checkboxScanProfileMap.click();
		 
		 //scanner profile menu mapping checkbox
		 checkboxScanProfileMap.click();
		 checkboxScanProfileMapList.click();
		 
		 //Enviornment menu checkbox
		 checkboxRun.click();
		 checkboxShow.click();
		 
		 //Maintenance menu checkbox
		 checkboxParameterMaintenance.click();
		 
		 //user authorization matrix menu
		 checkboxMatrixList.click();
		 checkboxMatrixAdd.click();
		 checkboxMatrixModify.click();
		 checkboxMatrixDelete.click();
		 
		 //Generic Param constant checkbox
		 checkboxGenericView.click();
		 checkboxGenericModify.click();
		 
		//Currency menu checkbox
		 checkboxCurrencyList.click();
		 checkboxCurrencyAdd.click();
		 checkboxCurrencyModify.click();
		 checkboxCurrencyDelete.click();
		 checkboxSampleFile.click();
		 
		//Email Distribution List menu checkbox
		 checkboxDistList.click();
		 checkboxDistAdd.click();
		 checkboxDistModify.click();
		 checkboxDistDelete.click();
		 
		// Message menu checkbox
		 checkboxMessageView.click();
		 checkboxMessageNew.click();
		 
		//Schedule menu checkbox
		 checkboxScheduleList.click();
		 checkboxScheduleNew.click();
		 checkboxScheduleModify.click();
		 checkboxScheduleControl.click();
		 
		//Calendar menu xpath
		 checkboxCalendarView.click();
		 checkboxCalendarCreate.click();
		 checkboxCalendarCreateBulk.click();
		 checkboxCalendarModify.click();
		 checkboxCalendarDelete.click();
		 
		//DB menu checkbox
		 checkboxReturnCodeMaintenance.click();
		 checkboxReturnCodeList.click();
//		 checkboxATMMaintenance.click();
//		 checkboxATMList.click();
		 
		//Participant menu checkbox
		 checkboxPBList.click();
		 checkboxPBAdd.click();
		 checkboxPBModify.click();
		 
		 //cheque stop menu checkbox
		 checkboxChqList.click();
		 checkboxChqEnter.click();
		 checkboxChqModify.click();
		 checkboxChqDelete.click();
		 checkboxChqBulkUpload.click();
		 
		//International Currency menu checkbox
		 checkboxIntCurrList.click();
		 checkboxIntCurrAdd.click();
		 
		//PMA Files View checkbox menu
		 checkboxPMAFileList.click();
		 checkboxPMAGroupList.click();
		 checkboxPMAItemList.click();
		 
		//ACH Clearing menu checkbox
		 checkboxACHClearingList.click();
		 checkboxACHClearingReprocess.click();
		 checkboxACHGroupList.click();
		 checkboxACHItemList.click();
		 
		//Payment Menu checkbox
		 checkboxPaymentList.click();
		 checkboxPaymentDuplicate.click();
		 checkboxPaymentRepair.click();
		 checkboxPaymentQualify.click();
		 checkboxPaymentSignCheck.click();
//		 checkboxPaymentList2.click();
		 
		//PDC menu checkbox
		 checkboxPDCModify.click();
		 checkboxPDCDelete.click();
//		 checkboxPDCReplace.click();
		 checkboxPDCBatchModify.click();
//		 checkboxManualTray.click();
//		 checkboxInsufficentfund.click();
		 checkboxGetAcctDetail.click();
		 checkboxFileView.click();
		 
		//Cheque Inventory menu checkbox
//		 checkboxChqInvBulkUpload.click();
//		 checkboxChqReqFileList.click();
//		 checkboxChqReqFileDwnld.click();
//		 checkboxChqInvReport.click();
//		 checkboxChqBookList.click();
//		 checkboxChqLeafList.click();
		 checkboxTransactionReport.click();
		 checkboxTransactionDetailReport.click();
		 checkboxChqReconReport.click();
		 
		//Client Scanner Tool menu checkbox
		 checkboxChqClientScannerTool.click();
		 
		//Monitors menu checkbox 
		 checkboxMoneyTransferMonitor.click();
		 checkboxPaymentTypeMonitor.click();
		 checkboxStatusDisplaySet.click();
		 checkboxPaymentTypeDisplaySet.click();
		 checkboxPredefinedConfig.click();
		 
		//Cheque Data Entry menu checkbox
		 checkboxChqDataList.click();
		 checkboxChqDataModify.click();
		 checkboxChqDataDelete.click();
		 
		//Advices menu checkbox
		 checkboxAdviceList.click();
		 checkboxAdviceBatchList.click();
		 checkboxReturnAdvicePMA.click();
		 
		 btnOk.click();
		 confirmOK.click();
		 btnLogout.click();
		 extBtnLogout.click();
		 driver.quit();
	 }

	 public void createChecker(String ProfileName) throws InterruptedException, IOException {
		 
		 
		 // validation of cancel button
		 btnCancel.click();
		 Thread.sleep(3000);
		 String actualCancelMsg=cancelMsg.getText();
		 String expctCancelMsg="Operation Add new profile was cancelled.";
		 if(actualCancelMsg.equals(expctCancelMsg)) {
			 System.out.println("-----Profile Cancel Button Validated------");
		 }else {
			 System.out.println("-----Profile Cancel Button is not Validated------");
			 TestUtil.takeScreenshot(actualCancelMsg, expctCancelMsg);
		 }
		 btnRestartWorkFlow.click();
		 
		 
		 // validation of uncheckall button
		 profilenameTextfield.sendKeys(ProfileName);
		 btnChkAll.click();
		 Thread.sleep(3000);
		 btnUnChkAll.click();
		 btnRestartWorkFlow.click();
		 
		 
		 // Validation of Reset button
		 profilenameTextfield.sendKeys(ProfileName);
		 btnChkAll.click();
		 btnReset.click();
		 Thread.sleep(4000);
		 btnRestartWorkFlow.click();
		 
		 // Validation of OK button
		 profilenameTextfield.sendKeys(ProfileName);
		 btnOk.click();
		 
		 String actualOkErrorMsg=btnOkErrorMsg.getText();
		 String expctOkErrorMsg="You must select some menu checkboxes";
		 if(actualOkErrorMsg.equals(expctOkErrorMsg)) {
			 System.out.println("-----Profile Ok button Validated-----");
		 }else {
			 System.out.println("-----Profile Ok button not Validated-----");
			 TestUtil.takeScreenshot(actualOkErrorMsg, expctOkErrorMsg);
		 }
		 Thread.sleep(3000);
		 btnRestartWorkFlow.click();
		 Thread.sleep(3000);
		 
		// Validation of Duplicate record
		 
		/* profilenameTextfield.sendKeys(ProfileName);
		 btnChkAll.click();
		 btnOk.click();
		 
		 String actualDuplicateMsg= duplicaterecordMsg.getText();
		 String expctDuplicateMsg="Profile already exists";
		 
		 if(actualDuplicateMsg.equals(expctDuplicateMsg)) {
			 System.out.println("------Duplicate Record Validation is working-------");
		 }else {
			 System.out.println("------Duplicate Record Validation is not working------- ");
		 }
		 
		 Thread.sleep(3000);
		 btnRestartWorkFlow.click();
		 btnLogout.click();
		 extBtnLogout.click();*/
		 
		 // Positive Add profile
		 profilenameTextfield.sendKeys(ProfileName);
		 btnChkAll.click();
		 Thread.sleep(3000);
		 btnOk.click();
		 confirmOK.click();
		 btnLogout.click();
		 extBtnLogout.click();
		 driver.quit();
	 }
	 
	 
	 public ProfilePage modifyRecord(String profileName) throws InterruptedException {
		 
		 Thread.sleep(3000);
		// btnOk.click();
		 modifyRecord.click();
		 profilenameTextfield.clear();
		 profilenameTextfield.sendKeys(profileName);
		 btnOk.click();
		 Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		 confirmOK.click();
		 Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		 btnLogout.click();
		 extBtnLogout.click();
		 driver.quit();
		 return new ProfilePage();
	 }
	 
	 public ProfilePage removeRecord() throws IOException {
		 
		 removeRecord.click();
		 btnRemove.click();
		 
		 String actualRemoveMsg=removeMsg.getText();
		 String expctRemoveMsg="Operation Remove profile executed successfully.  placed in APPROVE queue.";
		 
		 if(actualRemoveMsg.contains(expctRemoveMsg)) {
			 System.out.println("------Remove Message is validated------");
		 }else {
			 System.out.println("------Remove Message is not validated--------");
			 TestUtil.takeScreenshot(actualRemoveMsg, expctRemoveMsg);
		 }
		 btnLogout.click();
		 extBtnLogout.click();
		 driver.quit();
		 return new ProfilePage();
	 }
	 
	 public ProfilePage approveRecord() throws InterruptedException {
		 Thread.sleep(3000);
		 approveRecord.click();
		 btnApprove.click();
		 btnLogout.click();
		 extBtnLogout.click();
		 driver.quit();
		 return new ProfilePage();
		 
	 }
}
