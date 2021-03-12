package StepDefination;

import org.junit.Assert;

import com.pinv.qa.base.TestBase;
import com.pinv.qa.constants.IntfConstants;
import com.pinv.qa.pages.EnvironmentPage;
import com.pinv.qa.pages.HomePage;
import com.pinv.qa.pages.IsraeliInwardPaymentFlow;
import com.pinv.qa.pages.LoginPage;
import com.pinv.qa.pages.OutwardPaymentPage;
import com.pinv.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class IsareliInwardStepDefination extends TestBase {
	
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	IsraeliInwardPaymentFlow israeliInwardPaymentFlow;
	OutwardPaymentPage outwardPg;
	EnvironmentPage environmentPage;
	Windowhandle win;
	
	@Then("To check whether Inward file gets uploaded using {string},{string}")
	public void to_check_whether_Inward_file_gets_uploaded_using(String FileType, String FilePath) throws InterruptedException {
	    driver.switchTo().frame("toc");
	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    israeliInwardPaymentFlow=homePage.clickonFileManagerFileUploadLink();
	    israeliInwardPaymentFlow.uploadInwardFile(FileType, FilePath);
	    israeliInwardPaymentFlow.logout();
	}//end

	
	@Then("To check whether Cheque data entry move to QueuedToPayment status for Israeli Payment Flow using {string},{string},{string}")
	public void to_check_whether_cheque_data_entry_move_to_QueuedToPayment_status_using(String FileName, String Period,String FileType) throws InterruptedException 
	{
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage( );
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		israeliInwardPaymentFlow=homePage.clickonFileManagerFileViewLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentStatusFromFileViewScreen(FileName,Period,FileType);
		
	}//end 
	

	@Then("To check whether Cheque data entry gets Completed for Israeli Payment Flow using {string},{string},{string}")
	public void to_check_whether_Cheque_data_entry_gets_Completed_using(String FileName, String Period,String FileType) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage( );
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkIsraeli_Inward_Cheque_Server();
		environmentPage.LogOut();
		driver.quit();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage( );
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		israeliInwardPaymentFlow=homePage.clickonFileManagerFileViewLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentStatusFromFileViewScreen(FileName,Period,FileType);
	}//end
	
	@Then("disable Israeli_Inward_Cheque_Server")
	public void disable_Cheque_Outward_Payment_Creation_Server() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.disableIsraeli_Inward_Cheque_Server();
		environmentPage.LogOut();
		driver.quit();
	}//end
	
	@Then("validate whether payment moves to QueuedToAccountVerification status for IsraeliInwardFlow using {string},{string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_QueuedToAccountVerification_status_for_IsraeliInwardFlow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber,String gpkey) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkInitialPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Then("validate whether payment moves to QueuedToIntitalPosting status for IsraeliInwardFlow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_QueuedToIntitalPosting_status_for_IsraeliInwardFlow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.movetoQueuedToInitialPosting(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);

	}//end
	
	
	@Then("validate whether payment moves to SignatureCheck status for IsraeliInwardFlow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_SignatureCheck_status_for_IsraeliInwardFlow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.movetoSignatureCheck(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.clickSignatureCheckLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.signatureCheckQueue_Confirm(ValueDateperiod,PaymentType,Reference,SubRef,ChequeNo,AccountNumber);
	
	
	}//end
	

	@Then("validate whether payment moves to PendingSettlement for IsraeliInwardFlow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_PendingSettlement_for_IsraeliInwardFlow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		israeliInwardPaymentFlow.logout();
	}//end
	

	@Then("validate whether payment moves to SignatureCheck status for InsufficientFund for IsraeliInwardFlow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_SignatureCheck_status_for_InsufficientFund_for_IsraeliInwardFlow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		//paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.movetoSignatureCheck_InsufficientFund(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.clickSignatureCheckLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.SignatureCheckQueueConfirmforInsufficientFlow(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber)	;
		
	}//end
	
	@Then("validate whether payment gets approved from InsufficientFundQueue for IsraeliInwardFlow {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_gets_approved_from_InsufficientFundQueue_for_IsraeliInwardFlow(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException 
	{
		israeliInwardPaymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		israeliInwardPaymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.clickInsufficientFundLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.InsufficientFundConfirm(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
			
	}//end
	
	@Then("validate whether payment moves to HeadOfficeApprove for IsraeliInwardFlow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_HeadOfficeApprove_for_IsraeliInwardFlow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		
	   
	}//end
	

	@Then("validate whether payment gets approved from HeadOfficeApprove for IsraeliInwardFlow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_gets_approved_from_HeadOfficeApprove_for_IsraeliInwardFlow_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String  AccountNumber) throws InterruptedException {
		israeliInwardPaymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		israeliInwardPaymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.clickHeadOfficeApprove();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.HeadOfficeApproveConfirm(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}//end


	@Then("validate whether payment moves to InsufficientFund status for IsraeliInwardFlow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_InsufficientFund_status_for_IsraeliInwardFlow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		//paymentFlow=paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		
	}//end
	
	@Then("check whether InwardIsreali Payment is duplicate using {string},{string},{string},{string},{string},{string}")
	public void check_whether_InwardIsreali_Payment_is_duplicate_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkInitialPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end

	
	@Then("validate list displayed for duplicate cheques for IsraeliFlow {string},{string},{string},{string},{string},{string}")
	public void validate_list_displayed_for_duplicate_cheques_for_IsraeliFlow(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");			
		israeliInwardPaymentFlow=homePage.clickDuplicateLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.moveDuplicatetoApprove(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.clickApproveLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.approvePayment(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Then("to send Israelipayment to Qualify Receive queue using {string},{string},{string},{string},{string},{string},{string}")
	public void to_send_IsraeliPayment_to_Qualify_Receive_queue_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber,String Reason) throws InterruptedException {
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.clickDuplicateLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.movetoQualifyreceive(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber, Reason);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.clickApproveLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.approvePayment(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Then("validate whether IsraeliInward payment move to Qualify Receive queue using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_IsraeliInward_payment_move_to_Qualify_Receive_queue_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end

	
  @Then("validate whether payment move to SignatureCheck status for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
    public void validate_whether_payment_move_to_SignatureCheck_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Enhanced Global Payment System", title);
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
	israeliInwardPaymentFlow=israeliInwardPaymentFlow.movetoSignatureCheck(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
  }//end
  

	@Then("validate whether payment gets Returned from SignatureCheckQueue for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_gets_Returned_from_SignatureCheckQueue_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod,String PaymentType,String Reference,String SubRef,String ChequeNo,String AccountNumber, String ReasonCode1, String ReasonCode2, String ReasonCode3, String ReasonCode4) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.clickSignatureCheckLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.signatureCheckQueue_ReturnForIsraeliInwardFlow(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber, ReasonCode1, ReasonCode2, ReasonCode3, ReasonCode4);
	
	}//end
	

	@Then("validate whether payment moves to SignatureCheckApprove after gets Returned from SignatureCheck Queue for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_SignatureCheckApprove_after_gets_Returned_from_SignatureCheck_Queue_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod,String PaymentType,String Reference, String SubRef,String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		israeliInwardPaymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.clickSignatureCheckApproveLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.acceptfromSignatureCheckApproveQueue(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}//end
	
	@Then("validate whether payment moves to QueuedToFinalPosting after SignatureCheckApprove for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_QueuedToFinalPosting_after_SignatureCheckApprove_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod,String PaymentType,String Reference, String SubRef,String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		israeliInwardPaymentFlow.logout();
	}//end
	
	
	@Then("validate whether payment moves to QueuedToIsraeliReturnCreation using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_QueuedToIsraeliReturnCreation_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.QueuedToIsraeliReturnCreation(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.logout();
	
	}//end
	

	@Then("validate whether payment moves to Rejected for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_Rejected_for_IsraeliInward_Payment_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkIsraeli_Inward_Return_Server();
		environmentPage.LogOut();
		driver.quit();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.logout();
	
	}//end
	
	@Then("validate whether Out file request is getting created using {string}")
	public void validate_whether_Out_file_request_is_getting_created_using(String Request_Type) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.clickonOutfileRequestCreatelink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.OutfileRequestCreation(Request_Type);
		israeliInwardPaymentFlow.logout();
		
	}//end
	
	@Then("validate whether payment moves to Completed for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_Completed_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}//end
	

	@Then("to view Created Outfile Request using {string},{string}")
	public void to_view_Created_Outfile_Request_using(String Request_Type,String Status) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.clickonOutfileRequestViewlink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.OutfileRequestView(Request_Type, Status);
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.OutfileRequestViewScreenStatusCheck();
		israeliInwardPaymentFlow.logout();
	}//end
	

	@Then("to enable Israeli_Cheque_Outfile_Creation_Server")
	public void to_enable_Israeli_Cheque_Outfile_Creation_Server() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkIsraeli_Cheque_Outfile_Creation_Server();
		environmentPage.LogOut();
		driver.quit();
	}//end
	
	@Then("disable Israeli_Cheque_Outfile_Creation_Server")
	public void disable_Israeli_Cheque_Outfile_Creation_Server() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.disableIsraeli_Cheque_Outfile_Creation_Server();
		environmentPage.LogOut();
		driver.quit();
	}//end
	
	@Then("validate whether payment gets returned from InsufficientFund for IsraeliInward Payment Flow {string},{string},{string},{string},{string},{string} {string},{string},{string},{string}")
	public void validate_whether_payment_gets_returned_from_InsufficientFund_for_IsraeliInward_Payment_Flow(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber, String ReasonCode1, String ReasonCode2, String ReasonCode3, String ReasonCode4) throws InterruptedException {
		israeliInwardPaymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.clickInsufficientFundLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.InsufficientFundReturn_IsraeliInwardFlow(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber, ReasonCode1, ReasonCode2, ReasonCode3, ReasonCode4);	
	}
				
	@Then("validate whether payment moves to QueuedToFinalPosting after return from InsufficientFund for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_QueuedToFinalPosting_after_return_from_InsufficientFund_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		israeliInwardPaymentFlow.logout();
	   
	}//end
	

	@Then("validate whether payment moves to Exception status after QueuedToFinalPosting for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_Exception_status_after_QueuedToFinalPosting_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		//paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.movetoException1(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end

	@Then("validate whether payment moves to Exception status for IsraeliInward Payment flow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_Exception_status_for_IsraeliInward_Payment_flow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.movetoException(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Then("validate whether payment gets Approved from ApproveQueue after ManualTrayApprove for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_gets_Approved_from_ApproveQueue_after_ManualTrayApprove_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		//paymentFlow=paymentFlow.checkApprovePaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		israeliInwardPaymentFlow=homePage.clickApproveLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.approvePaymentAfterManualTrayApprove(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}//end
	
	@Then("validate whether payment moves to Exception to Approve status for IsraeliInward Payment flow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_Exception_to_Approve_status_for_IsraeliInward_Payment_flow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.clickManualTrayLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.moveexceptiontoApprove(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Then("check whether payment move to SignatureCheck status from ApproveQueue for IsraeliInward Payment using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_move_to_SignatureCheck_status_from_ApproveQueue_for_IsraeliInward_Payment_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		israeliInwardPaymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.clickSignatureCheckLink();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.signatureCheckQueue_Confirm(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}//end

	
	@Then("validate whether payment moves to QueuedToIsraeliReturnCreation for IsraeliInward Payment Flow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_QueuedToIsraeliReturnCreation_for_IsraeliInward_Payment_Flow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.logout();
	
	}//end
	

	@Then("to perform EOD and then SOD")
	public void to_perform_EOD_and_then_SOD() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		environmentPage = homePage.clickonEnvironmentRunLink();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.clickEODandManage();
		environmentPage.businessDate();
		environmentPage.LogOut();
		driver.quit();
	}//end


	
	@Then("check whether payment moves to Completed Status for IsraeliInward Flow using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_Completed_Status_for_IsraeliInward_Flow_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		israeliInwardPaymentFlow=homePage.checkPaymentIsraeliInwardFlow();
		israeliInwardPaymentFlow=israeliInwardPaymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		israeliInwardPaymentFlow.logout();
	
	}//end

}//end
