package StepDefination;

import org.junit.Assert;

import com.pinv.qa.base.TestBase;
import com.pinv.qa.constants.IntfConstants;
import com.pinv.qa.pages.ChequeStopPage;
import com.pinv.qa.pages.EnvironmentPage;
import com.pinv.qa.pages.HomePage;
import com.pinv.qa.pages.PaymentFlow;
import com.pinv.qa.pages.SchedulePage;
import com.pinv.qa.pages.LoginPage;
import com.pinv.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//Step Defination for Inward Payment Flow

public class InwardPaymentFlowStepDefinition extends TestBase{
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	PaymentFlow paymentFlow;
	EnvironmentPage environmentPage;
	ChequeStopPage chequeStopPage;
	Windowhandle win;
	SchedulePage schedulepage;
	
	@Then("validate whether payment moves to QueuedToAccountVerification status using {string},{string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_QueuedToAccountVerification_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber,String gpkey) throws InterruptedException {
		driver.switchTo().frame("toc");
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkACH_Clearing_File_Input_Server();
		environmentPage.checkACH_Clearing_Inward_Payment_Creation_Server();
		environmentPage.CheckFile_Routing_Server();
		environmentPage.LogOut();
		driver.quit();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkInitialPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Given("User is into the System")
	public void user_is_into_the_System() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
	
	}//end
	
	@Then("validate whether payment moves to SignatureCheck status using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_SignatureCheck_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.movetoSignatureCheck(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonSignatureCheckLink();
		paymentFlow=paymentFlow.signatureCheckQueue_Confirm(ValueDateperiod,PaymentType,Reference,SubRef,ChequeNo,AccountNumber);
	
	
	}//end

	@Then("validate whether payment moves to SignatureCheckApprove using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_SignatureCheckApprove_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonSignatureCheckLink();
		paymentFlow=paymentFlow.signatureCheckQueue_Confirm(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Then("validate whether payment moves to QueuedToIntitalPosting status using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_QueuedToIntitalPosting_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		paymentFlow=paymentFlow.movetoQueuedToInitialPosting(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);

	}//end
	

	@Then("validate whether payment moves to PendingSettlement using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_PendingSettlement_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		
	}//end

	
	
	@Then("validate whether payment move to Completed using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_Completed_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		paymentFlow=paymentFlow.movetoCompleted(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Then("check whether Inward Payment is Duplicate using {string},{string},{string},{string},{string},{string}")
	public void check_whether_Inward_Payment_is_Duplicate_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkInitialPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end

	@Then("to send payment to QualifyReceive queue using {string},{string},{string},{string},{string},{string},{string}")
	public void send_payment_to_QualifyReceive_queue_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber,String Reason) throws InterruptedException {
		paymentFlow=paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonDuplicateLink();
		paymentFlow=paymentFlow.movetoQualifyreceive(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber, Reason);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonApproveLink();
		paymentFlow=paymentFlow.approvePayment(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Then("validate whether payment moves to QualifyReceive queue using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_Qualify_Receive_queue_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Then("validate list displayed for Duplicate cheques {string},{string},{string},{string},{string},{string}")
	public void validate_list_displayed_for_Duplicate_cheques(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		paymentFlow=paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");			
		paymentFlow=homePage.clickonDuplicateLink();
		paymentFlow=paymentFlow.moveDuplicatetoApprove(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonApproveLink();
		paymentFlow=paymentFlow.approvePayment(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Then("check whether Inward Payment is in Qualify receive using {string},{string},{string},{string},{string},{string}")
	public void check_whether_Inward_Payment_is_in_Qualify_receive_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkInitialPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Then("validate list displayed for Qualify Receive cheques {string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void validate_list_displayed_for_Qualify_Receive_cheques(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber, String CheckkAccNo, String ValueDate, String PayerBICCode) throws InterruptedException {
		paymentFlow=paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");			
		paymentFlow=homePage.clickonQualifyReceive();
		paymentFlow=paymentFlow.acceptfromQualifyReceive(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber,CheckkAccNo ,ValueDate, PayerBICCode);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonApproveLink();
		paymentFlow=paymentFlow.approvePayment(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end

	/*@Then("validate whether payment moves to InsufficientFund status using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_InsufficientFund_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		//paymentFlow=paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.movetoInsufficientFund(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		
	}//end*/
	
	@Then("validate whether payment moves to InsufficientFund status using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_InsufficientFund_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		//paymentFlow=paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		
	}//end

	@Then("validate whether payment move to InsufficientFundApprove using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_InsufficientFundApprove_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonInsufficientFundLink();
		paymentFlow=paymentFlow.movetoInsufficientFundApprove(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Then("validate whether payment move to Completed state using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_Completed_state_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		paymentFlow=paymentFlow.movetoCompleted(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Then("to return cheque from Qualify Receive queue using {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void return_cheque_from_Qualify_Receive_queue(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String ReasonCode1, String ReasonCode2,
			String ReasonCode3, String ReasonCode4, String ReasonCode5, String ReasonCode6, String ReasonCode7,
			String ReasonCode8, String ReasonCode9, String ReasonCode10, String ReasonCode11, String ReasonCode12,
			String ReasonCode13, String ReasonCode14, String ReasonCode15) throws InterruptedException {
		paymentFlow=paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");			
		paymentFlow=homePage.clickonQualifyReceive();
		paymentFlow=paymentFlow.returnfromQualifyReceive(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber, ReasonCode1, ReasonCode2, ReasonCode3, ReasonCode4, ReasonCode5, ReasonCode6, ReasonCode7, ReasonCode8, ReasonCode9, ReasonCode10, ReasonCode11, ReasonCode12, ReasonCode13, ReasonCode14, ReasonCode15);
	
	}//end
	
	
	@Then("validate whether payment move to Rejected status from Qualify Receive using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_Rejected_status_from_Qualify_Receive_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");	
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkReturn_Creation_Server();
		environmentPage.LogOut();
		driver.quit();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");	
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end 

	@Then("validate whether payment move to QueuedToReturnCreation status using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_QueuedToReturnCreation_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.movetoQueuedToReturnCreation(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		
	}//end
	
	
	
	@Then("validate whether payment moves to QueuedToVipChequeAcceptance using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_QueuedToVipChequeAcceptance_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.movetoQueuedToVipChequeAcceptance(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.logout();
	
	}//end
	
	@Then("validate whether payment move to QueuedToOutfile status after Rejected status using {string},{string},{string},{string},{string},{string} after Rejected status")
	public void validate_whether_payment_move_to_QueuedToOutfile_status_after_Rejected_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow.logout();
	}//end
	
	@Then("validate whether payment moves to QueuedToOutFile status using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_QueuedToOutFile_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkVip_Cheque_Acceptance_Server();
		environmentPage.LogOut();
		driver.quit();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow.logout();
	}//end

	@Then("validate whether payment move to PendingAck using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_PendingAck_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		schedulepage=homePage.clickonScheduleControlLink();
		schedulepage=schedulepage.checkSchedulerstatus();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		schedulepage=homePage.clickonScheduleModifyLink();
		schedulepage=schedulepage.modifyEGPS_VIP_CHEQUE_ACCEPTANCE_OUTFILESchedulerForPaymentFlow();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow.logout();
	}
		

	
	@Then("validate whether payment gets Returned from SignatureCheckQueue using {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_gets_Returned_from_SignatureCheckQueue_using(String ValueDateperiod,String PaymentType,String Reference,String SubRef,String ChequeNo,String AccountNumber, String ReasonCode1, String ReasonCode2, String ReasonCode3, String ReasonCode4, String ReasonCode5, String ReasonCode6, String ReasonCode7, String ReasonCode8, String ReasonCode9, String ReasonCode10, String ReasonCode11, String ReasonCode12, String ReasonCode13, String ReasonCode14, String ReasonCode15) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonSignatureCheckLink();
		paymentFlow=paymentFlow.signatureCheckQueue_Return(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber, ReasonCode1, ReasonCode2, ReasonCode3, ReasonCode4, ReasonCode5, ReasonCode6, ReasonCode7, ReasonCode8, ReasonCode9, ReasonCode10, ReasonCode11, ReasonCode12, ReasonCode13, ReasonCode14, ReasonCode15);
	
	}//end
	
	@Then("validate whether payment gets returned from InsufficientFund {string},{string},{string},{string},{string},{string} {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_gets_returned_from_InsufficientFund(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber, String ReasonCode1, String ReasonCode2, String ReasonCode3, String ReasonCode4, String ReasonCode5, String ReasonCode6, String ReasonCode7, String ReasonCode8, String ReasonCode9, String ReasonCode10, String ReasonCode11, String ReasonCode12, String ReasonCode13, String ReasonCode14, String ReasonCode15) throws InterruptedException {
		paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonInsufficientFundLink();
		paymentFlow=paymentFlow.InsufficientFundReturn(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber, ReasonCode1, ReasonCode2, ReasonCode3, ReasonCode4, ReasonCode5, ReasonCode6, ReasonCode7, ReasonCode8, ReasonCode9, ReasonCode10, ReasonCode11, ReasonCode12, ReasonCode13, ReasonCode14, ReasonCode15);
	}//end 
	
	@Then("validate whether payment gets approved from InsufficientFundQueue {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_gets_approved_from_InsufficientFundQueue(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException 
	{
		paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonInsufficientFundLink();
		paymentFlow=paymentFlow.InsufficientFundConfirm(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
			
	}//end
	
	@Then("validate whether payment moves to QueuedToFinalPosting after return from InsufficientFund using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_QueuedToFinalPosting_after_return_from_InsufficientFund_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow.logout();
	   
	}//end
	
	@Then("validate whether payment moves to HeadOfficeApprove using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_HeadOfficeApprove_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		
	   
	}
	
	
	@Then("validate whether payment moves to QueuedToReturnCreation using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_QueuedToReturnCreation_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.movetoQueuedToReturnCreation(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.logout();
	
	}//end

	@Then("validate whether payment moves to Rejected using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_Rejected_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkReturn_Creation_Server();
		environmentPage.LogOut();
		driver.quit();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.logout();
	
	}//end
	
	@Then("validate whether payment moves to Exception status using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_Exception_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.movetoException(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Then("validate whether payment moves to Exception status after QueuedToFinalPosting using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_Exception_status_after_QueuedToFinalPosting_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		//paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.movetoException1(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Then("validate whether payment moves to Exception to Approve status using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_Exception_to_Approve_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonManualTrayLink();
		paymentFlow=paymentFlow.moveexceptiontoApprove(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	
	}//end
	
	@Then("validate whether payment move to Exception to Approve status by rejecting payment from Exception using {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_Exception_to_Approve_status_by_rejecting_payment_from_Exception_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String ReasonCode1, String ReasonCode2,
			String ReasonCode3, String ReasonCode4, String ReasonCode5, String ReasonCode6, String ReasonCode7,
			String ReasonCode8, String ReasonCode9, String ReasonCode10, String ReasonCode11, String ReasonCode12,
			String ReasonCode13, String ReasonCode14, String ReasonCode15) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonManualTrayLink();
		paymentFlow=paymentFlow.moveexceptiontoApproveByReject(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber, ReasonCode1, ReasonCode2, ReasonCode3, ReasonCode4, ReasonCode5, ReasonCode6, ReasonCode7, ReasonCode8, ReasonCode9, ReasonCode10, ReasonCode11, ReasonCode12, ReasonCode13, ReasonCode14, ReasonCode15);
	}
	
	@Then("validate whether payment move to Completed status using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_Completed_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
	    Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonApproveLink();
		paymentFlow=paymentFlow.approvePayment(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}
	
	
	@Then("validate whether payment move to next status using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_next_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonApproveLink();
		paymentFlow=paymentFlow.approvePayment(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}

	@Then("validate whether payment move to InsufficientFundApprove status after gets rejected from InsufficientFund queue using {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_InsufficientFundApprove_status_after_gets_rejected_from_InsufficientFund_queue_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber,String ReasonCode1, String ReasonCode2,
			String ReasonCode3, String ReasonCode4, String ReasonCode5, String ReasonCode6, String ReasonCode7,
			String ReasonCode8, String ReasonCode9, String ReasonCode10, String ReasonCode11, String ReasonCode12,
			String ReasonCode13, String ReasonCode14, String ReasonCode15) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonInsufficientFundLink();
		paymentFlow=paymentFlow.insufficientFundQueue_Return(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber, ReasonCode1, ReasonCode2, ReasonCode3, ReasonCode4, ReasonCode5, ReasonCode6, ReasonCode7, ReasonCode8, ReasonCode9, ReasonCode10, ReasonCode11, ReasonCode12, ReasonCode13, ReasonCode14, ReasonCode15);
	}

	
	
	@Then("validate whether payment move to QueuedToFinalPosting from InsufficientFundApprove using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_QueuedToFinalPosting_from_InsufficientFundApprove_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	//	paymentFlow=paymentFlow.movetoQueuedToFinalPosting(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}
	
	@Then("To check whether cheque details get added in Stop cheque list using {string},{string},{string},{string},{string},{string} fields")
	public void to_check_whether_cheque_details_get_added_in_Stop_cheque_list_using_fields(String Issuer, String BranchCode, String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber) throws InterruptedException {
		driver.switchTo().frame("toc");
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkACH_Clearing_File_Input_Server();
		environmentPage.checkACH_Clearing_Inward_Payment_Creation_Server();
		environmentPage.CheckFile_Routing_Server();
		environmentPage.LogOut();
		driver.quit();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		chequeStopPage=homePage.clickonChequeStopListLink();
		chequeStopPage=chequeStopPage.listChequeStopEntrywithValiddata(Issuer, BranchCode, Currency, MinimumChequeNumber, MaximumChequeNumber, AccountNumber);
	}

	@Then("To check whether stop cheque functionality is working properly or not using {string},{string},{string},{string},{string},{string}")
	public void to_check_whether_stop_cheque_functionality_is_working_properly_or_not_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef,
			String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkInitialPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}
	
	@Then("validate whether payment moves to SignatureCheck status for InsufficientFund using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_SignatureCheck_status_for_InsufficientFund_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
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
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.movetoSignatureCheck_InsufficientFund(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonSignatureCheckLink();
		paymentFlow=paymentFlow.SignatureCheckQueueConfirmforInsufficientFlow(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber)	;
		
	}//end
	
 
	@Then("validate whether payment gets approved from HeadOfficeApprove using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_gets_approved_from_HeadOfficeApprove_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String  AccountNumber) throws InterruptedException {
		paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonHeadOfficeApprove();
		paymentFlow=paymentFlow.HeadOfficeApproveConfirm(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}//end
	
	@Then("validate whether payment moves to QueuedToFinalPosting after SignatureCheckApprove using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_QueuedToFinalPosting_after_SignatureCheckApprove_using(String ValueDateperiod,String PaymentType,String Reference, String SubRef,String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow.logout();
	}//end
	
	@Then("validate whether payment moves to QueuedToOutfile status after Rejected status using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_QueuedToOutfile_status_after_Rejected_status_using(String ValueDateperiod,String PaymentType,String Reference, String SubRef,String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow.logout();
	}//end
	
	@Then("validate whether payment gets Approved from ApproveQueue after ManualTrayApprove using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_gets_Approved_from_ApproveQueue_after_ManualTrayApprove_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
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
		paymentFlow=homePage.clickonApproveLink();
		paymentFlow=paymentFlow.approvePaymentAfterManualTrayApprove(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}//end
	
	@Then("check whether payment move to SignatureCheck status from ApproveQueue using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_move_to_SignatureCheck_status_from_ApproveQueue_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonSignatureCheckLink();
		paymentFlow=paymentFlow.signatureCheckQueue_Confirm(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		
		
	}//end
	
	@Then("validate whether payment move to QueuedToFinalPosting after SignatureCheck status using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_QueuedToFinalPosting_after_SignatureCheck_status_using(String ValueDateperiod,String PaymentType,String Reference, String SubRef,String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow.logout();
		paymentFlow=paymentFlow.movetoCompleted(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow.logout();
	}//end
	
	@Then("validate whether payment moves to PendingAck status using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_PendingAck_status(String ValueDateperiod,String PaymentType,String Reference, String SubRef,String ChequeNo, String AccountNumber ) throws InterruptedException
	{
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow.logout();
	}//end
	
	@Then("user checks the scheduler status and enables the scheduler")
	public void user_checks_the_scheduler_status_and_enables_the_scheduler() throws InterruptedException
	{
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		schedulepage=homePage.clickonScheduleControlLink();
		schedulepage=schedulepage.checkSchedulerstatus();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		schedulepage=homePage.clickonScheduleModifyLink();
		schedulepage=schedulepage.modifyEGPS_CHEQUE_RETURN_OUTFILEScheduler();
	}//end
	
		
	@Then("validate whether payment move to SignatureCheck using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_SignatureCheck_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.movetoSignatureCheck(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}

	@Then("validate whether payment moves to SignatureCheckApprove after gets Returned from SignatureCheck Queue using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_moves_to_SignatureCheckApprove_after_gets_Returned_from_SignatureCheck_Queue_using(String ValueDateperiod,String PaymentType,String Reference, String SubRef,String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonSignatureCheckApproveLink();
		paymentFlow=paymentFlow.acceptfromSignatureCheckApproveQueue(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}//end


	
	
}
