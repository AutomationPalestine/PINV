package StepDefination;

import org.junit.Assert;

import com.pinv.qa.base.TestBase;
import com.pinv.qa.constants.IntfConstants;
import com.pinv.qa.pages.EnvironmentPage;
import com.pinv.qa.pages.HomePage;
import com.pinv.qa.pages.PaymentFlow;
import com.pinv.qa.pages.LoginPage;
import com.pinv.qa.pages.OnusPaymentFlow;
import com.pinv.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OnusPaymentFlowStepDefinition extends TestBase{
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	OnusPaymentFlow onusPaymentFlow;
	PaymentFlow paymentFlow;
	EnvironmentPage environmentPage;
	Windowhandle win;
	
	@Given("user checks whether payment goes to QueuedToPayment status using {string} and {string} in cheque data entry list menu")
	public void user_checks_whether_payment_move_to_QueuedToPayment_status_using_and_in_cheque_data_entry_list_menu(
			String ChequeNo, String AccountNumber) throws InterruptedException {
		driver.switchTo().frame("toc");
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkPDC_Data_Migration_Server();
		environmentPage.checkPDC_FileBean_ChequeData_Server();
		environmentPage.checkCheque_Migration_Image_Tagging_Server();
		environmentPage.LogOut();
		driver.quit();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage( );
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		onusPaymentFlow=homePage.clickonChequeDataEntryListLink();
		onusPaymentFlow=onusPaymentFlow.checkChequeDataEntryStatus(ChequeNo,AccountNumber);
		onusPaymentFlow=onusPaymentFlow.updatetoNormalOnus();
	}
	@Then("To check whether Cheque data entry move to QueuedToPayment status using {string},{string}")
	public void to_check_whether_cheque_data_entry_move_to_QueuedToPayment_status_using(String ChequeNo, String AccountNumber) throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkPDC_Data_Migration_Server();
		environmentPage.checkPDC_FileBean_ChequeData_Server();
		environmentPage.checkCheque_Migration_Image_Tagging_Server();
		environmentPage.LogOut();
		driver.quit();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage( );
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		onusPaymentFlow=homePage.clickonChequeDataEntryListLink();
		onusPaymentFlow=onusPaymentFlow.checkChequeDataEntryStatus(ChequeNo,AccountNumber);
		onusPaymentFlow=onusPaymentFlow.updatetoNormalOnus();
	}
	
	@Then("To check whether Cheque data entry gets Completed using {string},{string}")
	public void to_check_whether_Cheque_data_entry_gets_Completed_using(String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage( );
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkCheque_Outward_Payment_Creation_Server();
		environmentPage.LogOut();
		driver.quit();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage( );
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		onusPaymentFlow=homePage.clickonChequeDataEntryListLink();
		onusPaymentFlow=onusPaymentFlow.checkChequeDataEntryStatus(ChequeNo,AccountNumber);
	}
	
	@Then("check whether payment move to QueuedToAccountVerification and then to Approve status using {string},{string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_move_to_QueuedToAccountVerification_and_then_to_Approve_status_using(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber, String gpkey) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkInitialPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.moveAccountverificationtoApprove(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.logout();
	}
	
	@Then("validate whether payment goes to QueuedToInitialPosting status using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_QueuedToInitialPosting_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.movetoQueuedToInitialPosting(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		
	}//end

	@Then("check whether payment move to SignatureCheck status using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_move_to_SignatureCheck_status_using(String ValueDateperiod,String PaymentType, String Reference,String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.movetoSignatureCheck(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		//paymentFlow=paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonSignatureCheckLink();
		paymentFlow=paymentFlow.OnusSignatureCheckQueue_Confirm(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}
	
	@Then("check whether payment moves to SignatureCheck status For onus return flow using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_moves_to_SignatureCheck_status_For_onus_return_flow_using(String ValueDateperiod,String PaymentType, String Reference,String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.movetoSignatureCheck(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		//paymentFlow=paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.logout();
	}//end	

	
	
	@Then("validate whether payment move to QueuedToFinalPosting after SignatureCheck using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_QueuedToFinalPosting_after_SignatureCheck_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
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
	}
	
	@Then("validate whether payment gets approved from Signaturecheck using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_gets_approved_from_Signaturecheck_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonSignatureCheckLink();
		paymentFlow=paymentFlow.signatureCheckQueue_Confirm(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}
	
	@Then("check whether payment gets approved from ApproveQueue using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_gets_approved_from_ApproveQueue_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
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
		paymentFlow=paymentFlow.approvePayment(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}

	
	@Then("check whether payment move to SignatureCheckApprove using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_move_to_SignatureCheckApprove_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonSignatureCheckLink();
		paymentFlow=paymentFlow.signatureCheckQueue_Confirm(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}

	

	@Then("check whether payment move to Completed using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_move_to_Completed_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.movetoCompleted(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}
	
	@Then("disable Cheque_Outward_Payment_Creation_Server")
	public void disable_Cheque_Outward_Payment_Creation_Server() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.disableCheque_Outward_Payment_Creation_Server();
		environmentPage.LogOut();
		driver.quit();
	}
	
	@Then("To check whether Onus Payment is duplicate using {string},{string},{string},{string},{string},{string}")
	public void to_check_whether_Onus_Payment_is_duplicate_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkInitialPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}

	@Then("To validate list displayed for duplicate cheques using {string},{string},{string},{string},{string},{string}")
	public void to_validate_list_displayed_for_duplicate_cheques_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		paymentFlow=paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");			
		paymentFlow=homePage.clickonDuplicateLink();
		paymentFlow=paymentFlow.moveDuplicatetoApproveforOnus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonApproveLink();
		paymentFlow=paymentFlow.approvePayment(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}
	
	@Then("to send payment to Repair queue using {string},{string},{string},{string},{string},{string},{string}")
	public void to_send_payment_to_Repair_queue_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber,String Reason) throws InterruptedException {
		paymentFlow=paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonDuplicateLink();
		paymentFlow=paymentFlow.movetoRepair(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber, Reason);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonApproveLink();
		paymentFlow=paymentFlow.approvePayment(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}

	@Then("validate whether payment move to Repair queue using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_Repair_queue_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}
	
	@Then("to send payment to Canceled status using {string},{string},{string},{string},{string},{string},{string}")
	public void to_send_payment_to_Canceled_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber,String Reason) throws InterruptedException {
		paymentFlow=paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonRepairLink();
		paymentFlow=paymentFlow.cancelfromRepair(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber, Reason);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonApproveLink();
		paymentFlow=paymentFlow.approvePayment(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}

	@Then("to check whether payment gets Canceled using {string},{string},{string},{string},{string},{string}")
	public void to_check_whether_payment_gets_Canceled_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}
	
	@Then("check whether payment moves to SignatureCheckApprove after gets returned from SignatureCheck queue using {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_moves_to_SignatureCheckApprove_after_gets_returned_from_SignatureCheck_queue_using(String ValueDateperiod,String PaymentType,String Reference,String SubRef,String ChequeNo,String AccountNumber, String ReasonCode1, String ReasonCode2, String ReasonCode3, String ReasonCode4, String ReasonCode5, String ReasonCode6, String ReasonCode7, String ReasonCode8, String ReasonCode9, String ReasonCode10, String ReasonCode11, String ReasonCode12, String ReasonCode13, String ReasonCode14, String ReasonCode15) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonSignatureCheckLink();
		paymentFlow=paymentFlow.signatureCheckQueue_Return(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber, ReasonCode1, ReasonCode2, ReasonCode3, ReasonCode4, ReasonCode5, ReasonCode6, ReasonCode7, ReasonCode8, ReasonCode9, ReasonCode10, ReasonCode11, ReasonCode12, ReasonCode13, ReasonCode14, ReasonCode15);
	}

	@Then("check whether payment moves to SignatureCheck status after gets rejected from SignatureCheckApprove queue using {string},{string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_moves_to_SignatureCheck_status_after_gets_rejected_from_SignatureCheckApprove_queue_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber,String Reason) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonSignatureCheckApproveLink();
		paymentFlow=paymentFlow.rejectfromSignatureCheckApproveQueue(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber, Reason);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.logout();
	}
	@Then("check whether payment moves to QueuedToFinalPosting after approve from SignatureCheckApproveQueue using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_moves_to_QueuedToFinalPosting_after_approve_from_SignatureCheckApproveQueue_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonSignatureCheckApproveLink();
		paymentFlow=paymentFlow.acceptfromSignatureCheckApproveQueue(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}

	@Then("check whether payment move to Returned using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_move_to_Rejected_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		paymentFlow=paymentFlow.movetoReturned(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.logout();
	}
	
	@Then("check whether payment move to Exception status using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_move_to_Exception_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.movetoException(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}

	@Then("check whether payment move to Exception to Approve status using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_move_to_Exception_to_Approve_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonManualTrayLink();
		paymentFlow=paymentFlow.moveexceptiontoApprove(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}

	@Then("check whether payment move to Completed status using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_move_to_Completed_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
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
			paymentFlow=paymentFlow.logout();
	}
	
	@Then("To check whether Onus Payment is in Repair queue using {string},{string},{string},{string},{string},{string}")
	public void to_check_whether_Onus_Payment_is_in_Repair_queue_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkInitialPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.logout();
	}

	@Then("To validate payments which are in repair queue using {string},{string},{string},{string},{string},{string},{string}")
	public void to_validate_payments_which_are_in_repair_queue_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber,String ValueDate) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonRepairLink();
		paymentFlow=paymentFlow.movetoAccountVerification(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber, ValueDate);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonApproveLink();
		paymentFlow=paymentFlow.approvePayment(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}
	
	@Then("To check whether Cheque data entry move to QueuedToPayment using {string},{string}")
	public void to_check_whether_Cheque_data_entry_move_to_QueuedToPayment_using(String ChequeNo, String AccountNumber) throws InterruptedException {
		driver.switchTo().frame("toc");
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkPDC_Data_Migration_Server();
		environmentPage.checkPDC_FileBean_ChequeData_Server();
		environmentPage.checkCheque_Migration_Image_Tagging_Server();
		environmentPage.LogOut();
		driver.quit();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage( );
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		onusPaymentFlow=homePage.clickonChequeDataEntryListLink();
		onusPaymentFlow=onusPaymentFlow.checkChequeDataEntryStatus(ChequeNo,AccountNumber);
	}
	
	@Then("check whether payment move to Future status using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_move_to_Future_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.logout();
	}
	
	@Then("check whether payment move to Approve status from PDC>>Delete using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_move_to_Approve_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonPDCDeleteLink();
		paymentFlow=paymentFlow.deleteRecord(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.logout();
	}

	@Then("check whether payment move to QueuedToDeletePDC status using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_move_to_QueuedToDeletePDC_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
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

	@Then("check whether payment move to Delete status using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_move_to_Delete_status_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		paymentFlow=paymentFlow.movetoDelete(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage( );
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.logout();
	}

	@Then("check whether payment move to Approve status from PDC>>Modify using {string},{string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_move_to_Approve_status_from_PDC_Modify_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber,String PayerBIC) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.clickonPDCModifyLink();
		paymentFlow=paymentFlow.modifyRecord(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber,PayerBIC);
		paymentFlow=paymentFlow.logout();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage( );
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.logout();
	}

	
	@Then("check whether payment gets approved from ApproveQueue after ManualTrayApprove using {string},{string},{string},{string},{string},{string}")
	public void check_whether_payment_gets_approved_from_ApproveQueue_after_ManualTrayApprove_using(String ValueDateperiod, String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
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
	}
	
	@Then("validate whether payment move to QueuedToFinalPosting after SignatureCheckStatus using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_QueuedToFinalPosting_after_SignatureCheckStatus_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		paymentFlow=homePage.checkPayment();
		paymentFlow=paymentFlow.checkPaymentstatus(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		paymentFlow=paymentFlow.movetoException1(ValueDateperiod, PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
	}
	
	@Then("validate whether payment move to Exception status after FinalPosting using {string},{string},{string},{string},{string},{string}")
	public void validate_whether_payment_move_to_Exception_status_after_FinalPosting_using(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
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

}
