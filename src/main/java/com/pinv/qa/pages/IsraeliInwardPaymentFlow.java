package com.pinv.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pinv.qa.base.TestBase;
import com.pinv.qa.constants.IntfConstants;
import com.pinv.qa.util.Windowhandle;

public class IsraeliInwardPaymentFlow extends TestBase{
	
	DatabaseIntegrity DI = new DatabaseIntegrity();
	Windowhandle win = new Windowhandle(driver);
	String gpkey = null;

	@FindBy(id = "btnAll")
	WebElement getAllBtn;
	
	@FindBy(xpath="//*[@id='btnOk' and @type='submit']")
    WebElement buttonVisibility;
	
	@FindBy(xpath = "//tr[@class='rowcoloreven']")
	WebElement record;

	@FindBy(xpath="//*[@id=\"myTable\"]/tbody/tr[1]/td/input[4]")
	WebElement toQualifyReceiveBtn;
	
	@FindBy(xpath="//*[@id=\"mainForm\"]/table[2]/tbody/tr[2]/td/input[3]")
	WebElement DuplicateScreenToRepairBtn;
	
	@FindBy(id="newMemo")
	WebElement entermemo;
	
	
	@FindBy(name="payTranValueDate")
	WebElement valuedateBtn;
	
	@FindBy(name="content(chkAccNo)")
	WebElement chkAccNo;
	
	@FindBy(name="content(payTranBeneficiaryAcctExt)")
	WebElement payTranBeneficiaryAcctExt;
	
	@FindBy(id="btnOkErr")
	WebElement recheckBtn;
	
	@FindBy(xpath="//*[@id=\"btnOk\"]")
	WebElement qualifyreceiveconfirmBtn;
	
	@FindBy(id="btnOk")
	WebElement qualifyreceiveokBtn;
	
	@FindBy(name="payTranOGBLkpValue")
	WebElement benebankbiccode;
	
	@FindBy(name="payTranBeneBankLkpValue")
	WebElement payerbankbiccode;
	
	@FindBy(id="btnOk")
	WebElement pdcmodifyokBtn;
	
	@FindBy(id="btnOk")
	WebElement pdcmodifyConfirmBtn;
	
	@FindBy(name = "approve")
	WebElement approveBtn;
	
	@FindBy(name="btnOk")
	WebElement InsuffiOKBtn;
	
	@FindBy(name="btnOk")
	WebElement InsuffiConfirmBtn;

	@FindBy(name="delete")
	WebElement deleteBtn;
	
	@FindBy(name="reject")
	WebElement rejectBtn;
	
	@FindBy(name="btnOk")
	WebElement duplicateOkBtn;
	
	@FindBy(xpath="//*[@id=\"myTable\"]/tbody/tr[1]/td/input[7]")
	WebElement allowDuplicateBtn;
	
	@FindBy(name="btnOk")
	WebElement confirmDuplicateBtn;
	
	@FindBy(id="0")
	WebElement lineIdCheckbox;
	
	@FindBy(name = "content(periodValueDate)")
	WebElement periodValueDate;

	@FindBy(name="content(paymentType)")
	WebElement paymentType;
	
	@FindBy(name = "content(referenceOption)")
	WebElement referenceOption;

	@FindBy(name = "content(referenceTest)")
	WebElement referenceTest;

	@FindBy(name = "content(reference)")
	WebElement chequeno;

	@FindBy(name = "content(startaccountNumber)")
	WebElement accountNumber;

	@FindBy(name = "payTranPrim")
	WebElement gpKey;

	@FindBy(name = "content(messageKey)")
	WebElement entergpkey;

	@FindBy(xpath = "//button[contains(text(),'ack to List')]")
	WebElement backtoListBtn;

	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement errormessages;

	@FindBy(xpath = "//a[contains(text(),'Restart Workflow')]")
	WebElement restartWorkflow;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[19]")
	WebElement status;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[22]")
	WebElement dbidstatus;
	
	@FindBy(name = "org.apache.struts.taglib.html.CANCEL")
	WebElement cancelBtn;

	@FindBy(name = "skip")
	WebElement skipBtn;

	@FindBy(name = "confirmBtn")
	WebElement confirmBtn;

	@FindBy(name = "Return")
	WebElement returnBtn;

	
	@FindBy(xpath = "//p[@class='label']")
	WebElement message;

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	WebElement alertmsg;

	@FindBy(id = "memoReasonCode")
	WebElement reasonCode;
	
	@FindBy(id="newMemo")
	WebElement reason;

	@FindBy(xpath="//*[@id=\"myTable\"]/tbody/tr[11]/td/input[4]")
	WebElement toCancelBtn;
	
	@FindBy(xpath="//*[@id=\"myTable\"]/tbody/tr[1]/td/input[4]")
	WebElement ToCancelBtn;
	
	@FindBy(id = "logoutButtonId")
	WebElement logOutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;
	
	@FindBy(id = "0")
	WebElement approveCheckBoxPDCDeletePage;
	

	@FindBy(name = "delete")
	WebElement DeleteBtnPDCDeletePg;
	
	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[20]")
	WebElement listScreenStatus;
	
	@FindBy(name="chequeNumber")
	WebElement chequeNumber;
	
	@FindBy(name="payerAccount")
	WebElement payerAccount;

	
	@FindBy(xpath = "//*[@id=\"myTable\"]/tbody/tr[1]/td")
	WebElement ModifyScreenFrame;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/div/table/tbody/tr[2]/td/input[2]")
	WebElement okBtn;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[9]")
	WebElement chequeType;

	@FindBy(name="fileType")
	WebElement fileType;
	
	@FindBy(name="file")
	WebElement file;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr[2]/td[2]/table/tbody/tr/td/input")
	WebElement uploadBtn;
	
	@FindBy(xpath="//tr[2]//td[10]")
	WebElement chequedataentrystatus;
	
	@FindBy(name="fileName")
	WebElement fileName;
	
	@FindBy(name = "periodDate")
	WebElement PeriodDate;
	
	@FindBy(xpath = "//*[@id=\"mainForm\"]/table/tbody/tr/td/table/tbody/tr[8]/td/input[2]")
	WebElement okBtnFileViewScreen;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[7]")
	WebElement fileStatus;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement fileNameFileViewScreen;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/p")
	WebElement SignatureCheckScreenText;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr[2]/td/table[1]/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[3]/form/input[1]")
	WebElement headOfficeapproveBtn;
	
	@FindBy(name="approve")
	WebElement headOfficeApproveBtn;
	
	@FindBy(name="btnOk")
	WebElement InsufficientFundBtn;
	
	@FindBy(xpath = "//*[@id=\"alertDiv\"]/div")
	WebElement insufficientfundpagalertmsg;

	@FindBy(xpath="/html/body/div[4]/center/div/table[1]/tbody/tr[2]/td/form/table/tbody/tr[1]/td/input[4]")
	WebElement InsufficientFundConfirmBtn1;
	
	@FindBy(xpath="//*[@id=\"btnOk\"]")
	WebElement InsufficientFundConfirmBtn2;

	@FindBy(name="return")
	WebElement insuffifundreturnBtn;
	
	@FindBy(xpath="//*[@id=\"myTable\"]/tbody/tr[12]/td/form/input[1]")
	WebElement InsuffifundreturnBtn;
	
	@FindBy(name="requestType")
	WebElement RequestType;
	
	@FindBy(name="Create")
	WebElement createBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")
	WebElement outFileRequestViewScreenStatusDropDown;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	WebElement outFileRequestViewScreenSubmitBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[2]/tbody/tr[2]")
	WebElement outFileRequestCreateScreenRecord;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement outFileRequestViewScreenRecordId;
	
	@FindBy(xpath="//tr[2]//[@class='rowcoloreven ln_highlight']")
	WebElement outFileRequestViewScreenRecord;
	

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[4]")
	WebElement outFileRequestViewScreenRecordStatus;
	
	
	// Constructor to invoke above elements
		public IsraeliInwardPaymentFlow() {
			PageFactory.initElements(driver, this);
	}
	
	
	//Method to upload inward .txt file through file manager screen
	public void uploadInwardFile(String FileType,String FilePath) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		fileType.click();
		Select sl=new Select(fileType);
		sl.selectByVisibleText(FileType);
		file.sendKeys(FilePath);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		uploadBtn.click();
	}//end of uploadInwardFile function
	
	//Method to check status of Cheque on FileViewScreen
	public IsraeliInwardPaymentFlow checkPaymentStatusFromFileViewScreen(String FileName,String Period,String FileType) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		fileName.sendKeys(FileName);
		Select sl = new Select(PeriodDate);
		sl.selectByVisibleText(Period);
		fileType.click();
		Select s2=new Select(fileType);
		s2.selectByVisibleText(FileType);
		okBtnFileViewScreen.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String File_Name=fileNameFileViewScreen.getText();
		System.out.println("File Name : " +File_Name);	
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String FileStatus=fileStatus.getText();
		System.out.println("File status " + FileStatus + "");
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}//end of checkPaymentStatusFromFileViewScreen function 
	
	public void filterScreen(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo,
			String AccountNumber) throws InterruptedException {
		Select sl = new Select(periodValueDate);
		sl.selectByVisibleText(ValueDateperiod);
		Select sl1=new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		Select sl2 = new Select(referenceOption);
		sl2.selectByVisibleText(Reference);
		Select sl3 = new Select(referenceTest);
		sl3.selectByVisibleText(SubRef);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		chequeno.clear();
		chequeno.sendKeys(ChequeNo);
		accountNumber.clear();
		accountNumber.sendKeys(AccountNumber);
		getAllBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		gpkey = gpKey.getAttribute("Value");
		System.out.println(gpkey);
	}

	public void filterScreen1(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo,
			String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Select sl = new Select(periodValueDate);
		sl.selectByVisibleText(ValueDateperiod);
		//Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Select sl1=new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		//Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Select sl2 = new Select(referenceOption);
		sl2.selectByVisibleText(Reference);
		//Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Select sl3 = new Select(referenceTest);
		sl3.selectByVisibleText(SubRef);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		chequeno.clear();
		chequeno.sendKeys(ChequeNo);
		accountNumber.clear();
		accountNumber.sendKeys(AccountNumber);
		getAllBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
	}

	public void filterwithGpkey(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo,
			String AccountNumber) throws InterruptedException {
		if (null == gpkey) {
			filterScreen(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		backtoListBtn.click();
	}

	public IsraeliInwardPaymentFlow checkInitialPaymentstatus(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		System.out.println(paymentActualstatus);
		String expectedStatus = "QueuedToAccountVerification";
		if (expectedStatus.equals(paymentActualstatus)) {
			System.out.println("Payment moved to QueuedToAccountVerification status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + "");
		}
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow checkApprovePaymentstatus(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		System.out.println(paymentActualstatus);
		String expectedStatus = "Approve";
		if (expectedStatus.equals(paymentActualstatus)) {
			System.out.println("Payment moved to Approve status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + "");
		}
		return new IsraeliInwardPaymentFlow();
	}
	
	

	public IsraeliInwardPaymentFlow movetoRepair(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String Reason) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		DuplicateScreenToRepairBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualalertmsg=alertmsg.getText();
		String expectedalertmsg="Enter Reason for sending to To Repair";
		if(actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Memo Reason field");
			entermemo.sendKeys(Reason);
			DuplicateScreenToRepairBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		}else {
			System.out.println("Validation failed for Memo reason field");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}

	public IsraeliInwardPaymentFlow movetoQualifyreceive(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String Reason) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		toQualifyReceiveBtn.click();
		String actualalertmsg=alertmsg.getText();
		String expectedalertmsg="Enter Reason for sending to To Qualify";
		if(actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Memo Reason field");
			entermemo.sendKeys(Reason);
			toQualifyReceiveBtn.click();
		}else {
			System.out.println("Validation failed for Memo reason field");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	
	}//end of movetoQualifyreceive function
	
	public IsraeliInwardPaymentFlow movetoQueuedToInitialPosting(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToAccountVerification";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "QueuedToInitialPosting", null));
			System.out.println("Payment moved to QueuedToInititalPosting status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	
	}//end of QueuedToInitialposting function
	
	
	public IsraeliInwardPaymentFlow movetoQueuedToFinalPostingAfterSignatureCheckApprove(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "SignatureCheckApprove";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "QueuedToFinalPosting", null));
			System.out.println("Payment moved to QueuedToFinalPosting status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	
	}//end of movetoQueuedToFinalPosting function
	
	public IsraeliInwardPaymentFlow movetoSignatureCheck(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToInitialPosting";
		System.out.println("payment status"+paymentActualstatus);
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "SignatureCheck", null));
			System.out.println("Payment moved to SignatureCheck status");
		} 
		else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}//end of moveToSignatureCheck function

	public IsraeliInwardPaymentFlow signatureCheckQueue_Confirm(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from SignatureCheck screen is working fine");
		} else {
			System.out.println("Cancel Button from SignatureCheck screen is not working");
		}
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		confirmBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}//end of signatureCheckQueue_Confirm function
	
	public IsraeliInwardPaymentFlow SignatureCheckQueueConfirmforInsufficientFlow(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from SignatureCheck screen is working fine");
		} else {
			System.out.println("Cancel Button from SignatureCheck screen is not working");
		}
		Thread.sleep(IntfConstants.TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		confirmBtn.click();
		String signatureCheckScreenText="Signature Check";
		if(SignatureCheckScreenText.getText().equals(signatureCheckScreenText))
		{
			System.out.println("in if");
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			record.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			confirmBtn.click();
			
		}//end of if
		else
		{
			System.out.println("in else");
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
			return new IsraeliInwardPaymentFlow();

		}//end of else
		
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}//end of signatureCheckQueue_Confirm function
	
	public IsraeliInwardPaymentFlow OnusSignatureCheckQueue_Confirm(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from SignatureCheck screen is working fine");
		} else {
			System.out.println("Cancel Button from SignatureCheck screen is not working");
		}
		Thread.sleep(IntfConstants.TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		confirmBtn.click();
		String signatureCheckScreenText="Signature Check";
		if(SignatureCheckScreenText.getText().equals(signatureCheckScreenText))
		{
			System.out.println("in if");
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			record.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			confirmBtn.click();
			
		}//end of if
		else
		{
			System.out.println("in else");
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
			return new IsraeliInwardPaymentFlow();

		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}//end of signatureCheckQueue_Confirm function
	
	

	public IsraeliInwardPaymentFlow rejectfromSignatureCheckApproveQueue(String ValueDateperiod,String PaymentType,
			String Reference, String SubRef, String ChequeNo, String AccountNumber,String Reason) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from SignatureCheckApprove screen is working fine");
		} else {
			System.out.println("Cancel Button from SignatureCheckApprove screen is not working");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		skipBtn.click();
		String actualtitlemsg = message.getText();
		String expectedtitlemsg = "Signature Check Approve";
		if (actualtitlemsg.equals(expectedtitlemsg)) {
			System.out.println("Payment gets skipped and came back to list");
		} else {
			System.out.println("Skip button from SignatureCheckApprove screen is not working");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		lineIdCheckbox.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		entermemo.sendKeys(Reason);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		rejectBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow acceptfromSignatureCheckApproveQueue(String ValueDateperiod,String PaymentType,
			String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from SignatureCheckApprove screen is working fine");
		} else {
			System.out.println("Cancel Button from SignatureCheckApprove screen is not working");
		}
		Thread.sleep(IntfConstants.TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		skipBtn.click();
		String actualtitlemsg = message.getText();
		String expectedtitlemsg = "Signature Check Approve";
		if (actualtitlemsg.equals(expectedtitlemsg)) {
			System.out.println("Payment gets skipped and came back to list");
		} else {
			System.out.println("Skip button from SignatureCheckApprove screen is not working");
		}
		Thread.sleep(IntfConstants.TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		approveBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}//end of acceptfromSignatureCheckApproveQueue
	
	public IsraeliInwardPaymentFlow acceptfromInsufficientFundApproveQueue(String ValueDateperiod,String PaymentType,
			String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from InsufficientFundApprove screen is working fine");
		} else {
			System.out.println("Cancel Button from InsufficientFundApprove screen is not working");
		}
		record.click();
		skipBtn.click();
		String actualtitlemsg = message.getText();
		String expectedtitlemsg = "Insufficient Fund Approve";
		if (actualtitlemsg.equals(expectedtitlemsg)) {
			System.out.println("Payment gets skipped and came back to list");
		} else {
			System.out.println("Skip button from InsufficientFundApprove screen is not working");
		}
		record.click();
		approveBtn.click();
		driver.switchTo().alert().accept();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}

	public IsraeliInwardPaymentFlow checkPaymentstatus(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		System.out.println("Payment moved to " + paymentActualstatus + " status");
		return new IsraeliInwardPaymentFlow();
	
	}//end of checkPaymentstatus function
	
	
	
	public IsraeliInwardPaymentFlow movetoPendingAck(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		return new IsraeliInwardPaymentFlow();
	}
	
	
	public IsraeliInwardPaymentFlow movetoCompleted(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToFinalPosting";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "Completed", null));
			System.out.println("Payment moved to Completed status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}

	public IsraeliInwardPaymentFlow signatureCheckQueue_Return(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber, String ReasonCode1, String ReasonCode2,
			String ReasonCode3, String ReasonCode4, String ReasonCode5, String ReasonCode6, String ReasonCode7,
			String ReasonCode8, String ReasonCode9, String ReasonCode10, String ReasonCode11, String ReasonCode12,
			String ReasonCode13, String ReasonCode14, String ReasonCode15)
			throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from SignatureCheck screen is working fine");
		} else {
			System.out.println("Cancel Button from SignatureCheck screen is not working");
		}
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		returnBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		String actualalertmsg = alertmsg.getText();
		String expectedalertmsg = "Enter Reason for sending to Return";
		if (actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Reason field");
			reasonCode.click();
			Select sl = new Select(reasonCode);
			sl.selectByVisibleText(ReasonCode1);
			sl.selectByVisibleText(ReasonCode2);
			sl.selectByVisibleText(ReasonCode3);
			sl.selectByVisibleText(ReasonCode4);
			sl.selectByVisibleText(ReasonCode5);
			sl.selectByVisibleText(ReasonCode6);
			sl.selectByVisibleText(ReasonCode7);
			sl.selectByVisibleText(ReasonCode8);
			sl.selectByVisibleText(ReasonCode9);
			sl.selectByVisibleText(ReasonCode10);
			sl.selectByVisibleText(ReasonCode11);
			sl.selectByVisibleText(ReasonCode12);
			sl.selectByVisibleText(ReasonCode13);
			sl.selectByVisibleText(ReasonCode14);
			sl.selectByVisibleText(ReasonCode15);
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			returnBtn.click();
			String signatureCheckScreenText="Signature Check";
			if(SignatureCheckScreenText.getText().equals(signatureCheckScreenText))
			{
				System.out.println("in if");
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				record.click();
				Thread.sleep(IntfConstants.TIMEOUT);
				returnBtn.click();
				Thread.sleep(IntfConstants.TIMEOUT);
				String actualalertmsg1 = alertmsg.getText();
				String expectedalertmsg1 = "Enter Reason for sending to Return";
				if (actualalertmsg.equals(expectedalertmsg)) {
					System.out.println("Alert message is displayed for Reason field");
					reasonCode.click();
					Select selectReasoncode = new Select(reasonCode);
					selectReasoncode.selectByVisibleText(ReasonCode1);
					selectReasoncode.selectByVisibleText(ReasonCode2);
					selectReasoncode.selectByVisibleText(ReasonCode3);
					selectReasoncode.selectByVisibleText(ReasonCode4);
					selectReasoncode.selectByVisibleText(ReasonCode5);
					selectReasoncode.selectByVisibleText(ReasonCode6);
					selectReasoncode.selectByVisibleText(ReasonCode7);
					selectReasoncode.selectByVisibleText(ReasonCode8);
					selectReasoncode.selectByVisibleText(ReasonCode9);
					selectReasoncode.selectByVisibleText(ReasonCode10);
					selectReasoncode.selectByVisibleText(ReasonCode11);
					selectReasoncode.selectByVisibleText(ReasonCode12);
					selectReasoncode.selectByVisibleText(ReasonCode13);
					selectReasoncode.selectByVisibleText(ReasonCode14);
					selectReasoncode.selectByVisibleText(ReasonCode15);
					Thread.sleep(IntfConstants.TIMEOUT);
					returnBtn.click();
				}
				
			}//end of if
			else
			{
				System.out.println("in else");
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				logOutBtn.click();
				logoutBtn.click();
				driver.quit();
				return new IsraeliInwardPaymentFlow();

			}
		
			
		} else {
			System.out.println("Validation failed for Return reason field");
		
		}
	
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
		
	}
	
	public IsraeliInwardPaymentFlow signatureCheckQueue_ReturnForIsraeliInwardFlow(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber, String ReasonCode1, String ReasonCode2,
			String ReasonCode3, String ReasonCode4)
			throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from SignatureCheck screen is working fine");
		} else {
			System.out.println("Cancel Button from SignatureCheck screen is not working");
		}
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		returnBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		String actualalertmsg = alertmsg.getText();
		String expectedalertmsg = "Enter Reason for sending to Return";
		if (actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Reason field");
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			entermemo.click();
			entermemo.sendKeys(ReasonCode1,Keys.chord(Keys.SHIFT, Keys.ENTER));
			entermemo.sendKeys(ReasonCode2,Keys.chord(Keys.SHIFT, Keys.ENTER));
			entermemo.sendKeys(ReasonCode3,Keys.chord(Keys.SHIFT, Keys.ENTER));
			entermemo.sendKeys(ReasonCode4);
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			returnBtn.click();
			String signatureCheckScreenText="Signature Check";
			if(SignatureCheckScreenText.getText().equals(signatureCheckScreenText))
			{
				System.out.println("in if");
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				record.click();
				Thread.sleep(IntfConstants.TIMEOUT);
				returnBtn.click();
				Thread.sleep(IntfConstants.TIMEOUT);
				String actualalertmsg1 = alertmsg.getText();
				String expectedalertmsg1 = "Enter Reason for sending to Return";
				if (actualalertmsg1.equals(expectedalertmsg1)) {
					System.out.println("Alert message is displayed for Reason field");
					Thread.sleep(IntfConstants.SHORT_TIMEOUT);
					entermemo.click();
					entermemo.sendKeys(ReasonCode1,Keys.chord(Keys.SHIFT, Keys.ENTER));
					entermemo.sendKeys(ReasonCode2,Keys.chord(Keys.SHIFT, Keys.ENTER));
					entermemo.sendKeys(ReasonCode3,Keys.chord(Keys.SHIFT, Keys.ENTER));
					entermemo.sendKeys(ReasonCode4);
					Thread.sleep(IntfConstants.SHORT_TIMEOUT);
					returnBtn.click();
				}
				
			}//end of if
			else
			{
				System.out.println("in else");
				Thread.sleep(IntfConstants.SHORT_TIMEOUT);
				logOutBtn.click();
				logoutBtn.click();
				driver.quit();
				return new IsraeliInwardPaymentFlow();

			}
		
			
		} else {
			System.out.println("Validation failed for Return reason field");
		
		}
	
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
		
	}

	
	public IsraeliInwardPaymentFlow insufficientFundQueue_Return(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber, String ReasonCode1, String ReasonCode2,
			String ReasonCode3, String ReasonCode4, String ReasonCode5, String ReasonCode6, String ReasonCode7,
			String ReasonCode8, String ReasonCode9, String ReasonCode10, String ReasonCode11, String ReasonCode12,
			String ReasonCode13, String ReasonCode14, String ReasonCode15)
			throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Insufficient Fund screen is working fine");
		} else {
			System.out.println("Cancel Button from Insufficient Fund screen is not working");
		}
		record.click();
		skipBtn.click();
		String actualtitlemsg = message.getText();
		String expectedtitlemsg = "Insufficient Fund";
		if (actualtitlemsg.equals(expectedtitlemsg)) {
			System.out.println("Payment gets skipped and came back to list");
		} else {
			System.out.println("Skip button from Insufficient Fund screen is not working");
		}
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		insuffifundreturnBtn.click();
		String actualalertmsg = alertmsg.getText();
		String expectedalertmsg = "Enter Reason for sending to Return";
		if (actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Reason field");
			reasonCode.click();
			Select sl = new Select(reasonCode);
			sl.selectByVisibleText(ReasonCode1);
			sl.selectByVisibleText(ReasonCode2);
			sl.selectByVisibleText(ReasonCode3);
			sl.selectByVisibleText(ReasonCode4);
			sl.selectByVisibleText(ReasonCode5);
			sl.selectByVisibleText(ReasonCode6);
			sl.selectByVisibleText(ReasonCode7);
			sl.selectByVisibleText(ReasonCode8);
			sl.selectByVisibleText(ReasonCode9);
			sl.selectByVisibleText(ReasonCode10);
			sl.selectByVisibleText(ReasonCode11);
			sl.selectByVisibleText(ReasonCode12);
			sl.selectByVisibleText(ReasonCode13);
			sl.selectByVisibleText(ReasonCode14);
			sl.selectByVisibleText(ReasonCode15);
			insuffifundreturnBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		} else {
			System.out.println("Validation failed for Return reason field");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow QueuedToIsraeliReturnCreation(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToFinalPosting";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "QueuedToIsraeliReturnCreation", null));
			System.out.println("Payment moved to QueuedToReturnCreation status");
		} else {
			System.out.println("Payment status is in "+paymentActualstatus+"");
		}
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow movetoReturned(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToFinalPosting";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "Returned", null));
			System.out.println("Payment moved to Returned status");
		} else {
			System.out.println("Payment status is in "+paymentActualstatus+"");
		}
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow moveDuplicatetoApprove(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Duplicate screen is working fine");
		} else {
			System.out.println("Cancel Button from Duplicate screen is not working");
		}
		record.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		allowDuplicateBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		cancelBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg1 = errormessages.getText();
		String expectedCancelmsg1 = "Operation was cancelled.";
		if (actualCancelmsg1.equals(expectedCancelmsg1)) {
			System.out.println("Cancel Button from Duplicate Confirm screen is working fine");
		} else {
			System.out.println("Cancel Button from Duplicate Confirm screen is not working");
		}
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		allowDuplicateBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		confirmDuplicateBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow moveDuplicatetoApproveforOnus(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Duplicate screen is working fine");
		} else {
			System.out.println("Cancel Button from Duplicate screen is not working");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		duplicateOkBtn.click();
		//allowDuplicateBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg1 = errormessages.getText();
		String expectedCancelmsg1 = "Operation was cancelled.";
		if (actualCancelmsg1.equals(expectedCancelmsg1)) {
			System.out.println("Cancel Button from Duplicate Confirm screen is working fine");
		} else {
			System.out.println("Cancel Button from Duplicate Confirm screen is not working");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		duplicateOkBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		allowDuplicateBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		confirmDuplicateBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
		
	}
	
	public IsraeliInwardPaymentFlow moveDuplicatetoApproveforOnusPaymentFlow(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Duplicate screen is working fine");
		} else {
			System.out.println("Cancel Button from Duplicate screen is not working");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		allowDuplicateBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg1 = errormessages.getText();
		String expectedCancelmsg1 = "Operation was cancelled.";
		if (actualCancelmsg1.equals(expectedCancelmsg1)) {
			System.out.println("Cancel Button from Duplicate Confirm screen is working fine");
		} else {
			System.out.println("Cancel Button from Duplicate Confirm screen is not working");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		allowDuplicateBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		confirmDuplicateBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
		
	}
	
	public IsraeliInwardPaymentFlow acceptfromQualifyReceive(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String CheckkAccNo,String ValueDate,String PayerBICCode) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Qualify Receive screen is working fine");
		} else {
			System.out.println("Cancel Button from Qualify Receive  screen is not working");
		}
		record.click();
		String actualerrormsg=errormessages.getText();
		String expectederrormsg="Error occurred while MICR validation, Cheque Account Number does not match with MICR Account Number.";
		if(actualerrormsg.contains(expectederrormsg)) {
//					valuedateBtn.clear();
//					valuedateBtn.sendKeys(ValueDate);
			chkAccNo.clear();
			chkAccNo.sendKeys(CheckkAccNo);
			payTranBeneficiaryAcctExt.clear();
			payTranBeneficiaryAcctExt.sendKeys("1001005616");
			qualifyreceiveokBtn.click();
//			payerbankbiccode.clear();
//			payerbankbiccode.sendKeys(PayerBICCode);
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
//			qualifyreceiveokBtn.click();
//			qualifyreceiveokBtn.click();
		qualifyreceiveconfirmBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
	}
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow returnfromQualifyReceive(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String ReasonCode1, String ReasonCode2,
			String ReasonCode3, String ReasonCode4, String ReasonCode5, String ReasonCode6, String ReasonCode7,
			String ReasonCode8, String ReasonCode9, String ReasonCode10, String ReasonCode11, String ReasonCode12,
			String ReasonCode13, String ReasonCode14, String ReasonCode15) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Qualify Receive screen is working fine");
		} else {
			System.out.println("Cancel Button from Qualify Receive  screen is not working");
		}
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		returnBtn.click();
		String actualalertmsg = alertmsg.getText();
		String expectedalertmsg = "Enter Reason for sending to Return";
		if (actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Reason field");
			reasonCode.click();
			Select sl = new Select(reasonCode);
			sl.selectByVisibleText(ReasonCode1);
			sl.selectByVisibleText(ReasonCode2);
			sl.selectByVisibleText(ReasonCode3);
			sl.selectByVisibleText(ReasonCode4);
			sl.selectByVisibleText(ReasonCode5);
			sl.selectByVisibleText(ReasonCode6);
			sl.selectByVisibleText(ReasonCode7);
			sl.selectByVisibleText(ReasonCode8);
			sl.selectByVisibleText(ReasonCode9);
			sl.selectByVisibleText(ReasonCode10);
			sl.selectByVisibleText(ReasonCode11);
			sl.selectByVisibleText(ReasonCode12);
			sl.selectByVisibleText(ReasonCode13);
			sl.selectByVisibleText(ReasonCode14);
			sl.selectByVisibleText(ReasonCode15);
			returnBtn.click();
			driver.switchTo().alert().accept();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		} else {
			System.out.println("Validation failed for Return reason field");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}//end of returnfromQualifyReceive function
	
	public IsraeliInwardPaymentFlow cancelfromRepair(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String Reason) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Repair screen is working fine");
		} else {
			System.out.println("Cancel Button from Repair screen is not working");
		}
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		toCancelBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualalertmsg = alertmsg.getText();
		String expectedalertmsg = "Enter Reason for sending to To Cancel";
		if (actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Reason field");
			entermemo.sendKeys(Reason);
			toCancelBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		} else {
			System.out.println("Validation failed for Return reason field");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	
	}//end of  cancelfromRepair
	
	public IsraeliInwardPaymentFlow approvePayment(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		lineIdCheckbox.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}//end of approvePayment
	
	public IsraeliInwardPaymentFlow approvePaymentAfterManualTrayApprove(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		//lineIdCheckbox.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}//end of approvePayment
	
	
	public IsraeliInwardPaymentFlow HeadOfficeApproveConfirm(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from HeadOfficeapprove screen is working fine");
		} else {
			System.out.println("Cancel Button from HeadOfficeapprove screen is not working");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		headOfficeApproveBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}//end 
	
	public IsraeliInwardPaymentFlow InsufficientFundConfirm(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		cancelBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().alert().accept();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Insufficient Fund screen is working fine");
		} else {
			System.out.println("Cancel Button from from Insufficient Fund screen is not working");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		InsufficientFundBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		String actualCancelmsg1 = errormessages.getText();
		String expectedCancelmsg1 = "Operation was cancelled.";
		if (actualCancelmsg1.equals(expectedCancelmsg1)) {
			System.out.println("Cancel Button from Insufficient Fund Confirm screen is working fine");
		} else {
			System.out.println("Cancel Button from from Insufficient Fund Confirm screen is not working");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		InsufficientFundBtn.click();
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		InsufficientFundConfirmBtn2.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}//end 
	
	public IsraeliInwardPaymentFlow movetoQueuedToVipChequeAcceptance(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "SignatureCheck";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "QueuedToVipChequeAcceptance", null));
			System.out.println("Payment moved to QueuedToVipChequeAcceptance status");
		} else {
			System.out.println("Payment status is in "+paymentActualstatus+"");
		}
		return new IsraeliInwardPaymentFlow();
	}
	
    public IsraeliInwardPaymentFlow movetoException(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
    	restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToInitialPosting";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "Exception", "QueuedToInitialPosting_Exception"));
			System.out.println("Payment moved to Exception status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
    	return new IsraeliInwardPaymentFlow();
    }
	
    public IsraeliInwardPaymentFlow movetoException1(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
    	restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToFinalPosting";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "Exception", "QueuedToFinalPosting_Exception"));
			System.out.println("Payment moved to Exception status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
    	return new IsraeliInwardPaymentFlow();
    }
    
	public IsraeliInwardPaymentFlow moveexceptiontoApprove(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Manual Tray screen is working fine");
		} else {
			System.out.println("Cancel Button from Manual Tray screen is not working");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow moveexceptiontoApproveByReject(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String ReasonCode1, String ReasonCode2,
			String ReasonCode3, String ReasonCode4, String ReasonCode5, String ReasonCode6, String ReasonCode7,
			String ReasonCode8, String ReasonCode9, String ReasonCode10, String ReasonCode11, String ReasonCode12,
			String ReasonCode13, String ReasonCode14, String ReasonCode15) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		cancelBtn.click();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Manual Tray screen is working fine");
		} else {
			System.out.println("Cancel Button from Manual Tray screen is not working");
		}
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		rejectBtn.click();
		driver.switchTo().alert().accept();
		String actualalertmsg = alertmsg.getText();
		String expectedalertmsg = "Enter Reason for sending to Reject";
		if (actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Reason field");
			reasonCode.click();
			Select sl = new Select(reasonCode);
			sl.selectByVisibleText(ReasonCode1);
			sl.selectByVisibleText(ReasonCode2);
			sl.selectByVisibleText(ReasonCode3);
			sl.selectByVisibleText(ReasonCode4);
			sl.selectByVisibleText(ReasonCode5);
			sl.selectByVisibleText(ReasonCode6);
			sl.selectByVisibleText(ReasonCode7);
			sl.selectByVisibleText(ReasonCode8);
			sl.selectByVisibleText(ReasonCode9);
			sl.selectByVisibleText(ReasonCode10);
			sl.selectByVisibleText(ReasonCode11);
			sl.selectByVisibleText(ReasonCode12);
			sl.selectByVisibleText(ReasonCode13);
			sl.selectByVisibleText(ReasonCode14);
			sl.selectByVisibleText(ReasonCode15);
			reasonCode.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		} else {
			System.out.println("Validation failed for Return reason field");
		}
		rejectBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow movetoInsufficientFund(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToPosting";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "InsufficientFund", null));
			System.out.println("Payment moved to InsufficientFund status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow movetoInsufficientFundApprove(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		approveBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow approvefromInsufficientFundApprove(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		approveBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow moveAccountverificationtoApprove(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToAccountVerification";
		String dbid=dbidstatus.getText();
		if (expectedStatus.equals(paymentActualstatus)) {
			int updatedPrevStatus = DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery1(gpkey, "PREVIOUSSTATUS", "QueuedToAccountVerification"));
			if(0 == updatedPrevStatus) {
				long msgid=DI.getOracleDatabaseConnectionForSelectParseMsgId(DI.getparsedmsg());
				msgid++;
				System.out.println(msgid);
				DI.getOracleDatabaseConnection(DI.insertParsedMessage(gpkey, "PREVIOUSSTATUS", "QueuedToAccountVerification", msgid,dbid));
			}
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery1(gpkey, "PRE_POSTING_STATUS", ""));
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "Approve", "AccountVerificationApprove"));
			System.out.println("Payment moved to Approve status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow movetoAccountVerification(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber,String ValueDate) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from Repair screen is working fine");
		} else {
			System.out.println("Cancel Button from Repair screen is not working");
		}
		record.click();
		String actualerrormsg=errormessages.getText();
		String expectederrormsg="";
		if(actualerrormsg.contains(expectederrormsg)) {
		valuedateBtn.clear();
		valuedateBtn.sendKeys(ValueDate);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		qualifyreceiveokBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		qualifyreceiveconfirmBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
	}
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow deleteRecord(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from PDC Delete screen is working fine");
		} else {
			System.out.println("Cancel Button from PDC Delete screen is not working");
		}
		lineIdCheckbox.click();
		deleteBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow movetoDelete(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToDeletePDC";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "PDCDelete", null));
			System.out.println("Payment moved to PDCDelete status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}
	
	public IsraeliInwardPaymentFlow modifyRecord(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber,String PayerBIC) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from PDC Modify screen is working fine");
		} else {
			System.out.println("Cancel Button from PDC Modify screen is not working");
		}
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		payerbankbiccode.clear();
		payerbankbiccode.sendKeys(PayerBIC);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String a=pdcmodifyokBtn.getAttribute("Value");
		System.out.println(a);
		pdcmodifyokBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		String b=pdcmodifyConfirmBtn.getAttribute("Value");
		System.out.println(b);
		pdcmodifyConfirmBtn.click();
		return new IsraeliInwardPaymentFlow();
	}
	
	
	public IsraeliInwardPaymentFlow movetoSignatureCheck_InsufficientFund(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToInitialPosting";
		String dbID=dbidstatus.getText();
		if (expectedStatus.equals(paymentActualstatus)) {
			int statusUpdate = DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "SignatureCheck", null));
			System.out.println("status update variable value"+statusUpdate);
			if(1 == statusUpdate) 
			{
			 long msgid=DI.getOracleDatabaseConnectionForSelectParseMsgId(DI.getparsedmsg());
			 msgid++;
			 System.out.println("message id printed:"+msgid);
			 DI.getOracleDatabaseConnection(DI.insertParsedMessage1(gpkey, "INITPOSTING_FAILURE_ERROR_MSG", "INSUFFICIENT AVAILABLE BALA FOR TRANSACT", msgid,dbID));
			}
		
		   System.out.println("payment status"+paymentActualstatus);
		}
		
		else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
		}//end of moveToSignatureCheck_InsufficientFund function
	
	public IsraeliInwardPaymentFlow InsufficientFundReturn(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String ReasonCode1, String ReasonCode2,
			String ReasonCode3, String ReasonCode4, String ReasonCode5, String ReasonCode6, String ReasonCode7,
			String ReasonCode8, String ReasonCode9, String ReasonCode10, String ReasonCode11, String ReasonCode12,
			String ReasonCode13, String ReasonCode14, String ReasonCode15) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		driver.switchTo().alert().accept();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from InsufficientFund screen is working fine");
		} else {
			System.out.println("Cancel Button from InsufficientFund screen is not working");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		InsuffifundreturnBtn.click();
		String actualalertmsg = insufficientfundpagalertmsg.getText();
		System.out.println(alertmsg);
		String expectedalertmsg = "Enter Reason for sending to Return";
		if (actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Reason field");
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			reasonCode.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			Select sl = new Select(reasonCode);
			sl.selectByVisibleText(ReasonCode1);
			sl.selectByVisibleText(ReasonCode2);
			sl.selectByVisibleText(ReasonCode3);
			sl.selectByVisibleText(ReasonCode4);
			sl.selectByVisibleText(ReasonCode5);
			sl.selectByVisibleText(ReasonCode6);
			sl.selectByVisibleText(ReasonCode7);
			sl.selectByVisibleText(ReasonCode8);
			sl.selectByVisibleText(ReasonCode9);
			sl.selectByVisibleText(ReasonCode10);
			sl.selectByVisibleText(ReasonCode11);
			sl.selectByVisibleText(ReasonCode12);
			sl.selectByVisibleText(ReasonCode13);
			sl.selectByVisibleText(ReasonCode14);
			sl.selectByVisibleText(ReasonCode15);
			reasonCode.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		} else {
			System.out.println("Validation failed for Return reason field");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		returnBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
		
	}//end 
	

	public IsraeliInwardPaymentFlow InsufficientFundReturn_IsraeliInwardFlow(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String ReasonCode1, String ReasonCode2,
			String ReasonCode3, String ReasonCode4) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		driver.switchTo().alert().accept();
		String actualCancelmsg = errormessages.getText();
		String expectedCancelmsg = "Operation was cancelled.";
		if (actualCancelmsg.equals(expectedCancelmsg)) {
			System.out.println("Cancel Button from InsufficientFund screen is working fine");
		} else {
			System.out.println("Cancel Button from InsufficientFund screen is not working");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		InsuffifundreturnBtn.click();
		String actualalertmsg = insufficientfundpagalertmsg.getText();
		System.out.println(alertmsg);
		String expectedalertmsg = "Enter Reason for sending to Return";
		if (actualalertmsg.equals(expectedalertmsg)) {
			System.out.println("Alert message is displayed for Reason field");
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			entermemo.click();
			entermemo.sendKeys(ReasonCode1,Keys.chord(Keys.SHIFT, Keys.ENTER));
			entermemo.sendKeys(ReasonCode2,Keys.chord(Keys.SHIFT, Keys.ENTER));
			entermemo.sendKeys(ReasonCode3,Keys.chord(Keys.SHIFT, Keys.ENTER));
			entermemo.sendKeys(ReasonCode4);
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			InsuffifundreturnBtn.click();
		} 
		else {
			System.out.println("Validation failed for Return reason field");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
		
	}//end 
	
	
	//Method to create OutFile Request from Outfile Request screen
	public IsraeliInwardPaymentFlow OutfileRequestCreation(String Request_Type) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		RequestType.click();
		Select s1=new Select(RequestType);
		s1.selectByVisibleText(Request_Type);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		if(outFileRequestCreateScreenRecord.isDisplayed())
		{
			//System.out.println("in if loop ");
			createBtn.click();
			
		}
		else
		{
			System.out.println("Record not found");
		}
		return new IsraeliInwardPaymentFlow();
	}//end of OutfileRequestCreation function
	
	//Method to view payment from OutfileRequestView screen
	public IsraeliInwardPaymentFlow OutfileRequestView(String Request_Type,String Status) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		RequestType.click();
		Select s1=new Select(RequestType);
		s1.selectByVisibleText(Request_Type);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outFileRequestViewScreenStatusDropDown.click();
		Select s2=new Select(outFileRequestViewScreenStatusDropDown);
		s2.selectByVisibleText(Status);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		outFileRequestViewScreenSubmitBtn.click();
		return new IsraeliInwardPaymentFlow();
	}//end of OutfileRequestView function
	
	//Method to check Status of Payment from OutFileRequestViewScreen
	public IsraeliInwardPaymentFlow OutfileRequestViewScreenStatusCheck() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String OutfileViewScreenRecordID=outFileRequestViewScreenRecordId.getText();
		System.out.println("Request ID : " + OutfileViewScreenRecordID);
		//outFileRequestViewScreenRecord.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		String OutFile_RequestViewScreen_Status=outFileRequestViewScreenRecordStatus.getText();
		System.out.println("Status of " + OutfileViewScreenRecordID + "is" + OutFile_RequestViewScreen_Status);
		return new IsraeliInwardPaymentFlow();
	}//end of OutfileRequestViewScreenStatusCheck function


	public IsraeliInwardPaymentFlow logout() {
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IsraeliInwardPaymentFlow();
	}



}
