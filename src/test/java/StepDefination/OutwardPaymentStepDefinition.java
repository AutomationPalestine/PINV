package StepDefination;

import com.pinv.qa.base.TestBase;
import com.pinv.qa.constants.IntfConstants;
import com.pinv.qa.pages.EnvironmentPage;
import com.pinv.qa.pages.HomePage;
import com.pinv.qa.pages.LoginPage;
import com.pinv.qa.pages.OutwardPaymentPage;
import com.pinv.qa.pages.SchedulePage;
import com.pinv.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OutwardPaymentStepDefinition extends TestBase {

	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	EnvironmentPage envPage;
	OutwardPaymentPage outwardPage;
	EnvironmentPage environmentPage;
	Windowhandle win;
	SchedulePage schedulePage;
	
	@Given("user checks whether payment moved to QueuedToPayment status using {string} and {string} in cheque data entry list menu")
	public void user_checks_whether_payment_moved_to_QueuedToPayment_status_using_and_in_cheque_data_entry_list_menu(
			String ChequeNo, String PayerAccount) throws InterruptedException {
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
		outwardPage = homePage.clickonChequeDataEntryLink();
		outwardPage.chqDataEntryFilter(ChequeNo, PayerAccount);
	}//end

	@Then("user enables Cheque_Outward_Payment_Creation_Server and checks whether Cheque data entry gets completed using {string} and {string}")
	public void user_enables_Cheque_Outward_Payment_Creation_Server_and_checks_whether_Cheque_data_entry_gets_completed_using_and(
			String string, String string2) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		driver.switchTo().frame("toc");
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.checkCheque_Outward_Payment_Creation_Server();
		environmentPage.LogOut();
		driver.quit();
	}//end

	@Then("user validates whether payment moved to QueuedToAccountVerification status using filter {string},{string},{string},{string} in payment list menu")
	public void user_validates_whether_payment_moved_to_QueuedToAccountVerification_status_using_filter_in_payment_list_menu(
			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		outwardPage = homePage.checkPayment1();
		outwardPage = outwardPage.checkInitialPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);
	}

	@Then("user validates whether payment moved to QueuedToOutPresentCheque status using filter {string},{string},{string},{string} in payment list menu")
	public void user_validates_whether_payment_moved_to_QueuedToOutPresentCheque_status_using_filter_in_payment_list_menu(
			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		outwardPage = outwardPage.QueuedToAccountVerificationToApprove(win, ValueDateperiod, Reference, SubRef,
				ChequeNo);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		outwardPage = homePage.paymentapproveLink();
		outwardPage = outwardPage.approvePayment(ValueDateperiod, Reference, SubRef, ChequeNo);
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		outwardPage = homePage.checkPayment1();
		outwardPage = outwardPage.checkPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);

	}

	@Then("user validates whether payment moved to QueuedToOutFile status filter {string},{string},{string},{string} in payment list menu")
	public void user_validates_whether_payment_moved_to_QueuedToOutFile_status_filter_in_payment_list_menu(
			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		outwardPage = outwardPage.movetoQueuedToOutFile(ValueDateperiod, Reference, SubRef, ChequeNo);
		outwardPage.outwardPageLogOut();
		driver.quit();
	}//end
	
	@Then("user checks the scheduler status")
	public void user_checks_the_scheduler_status() throws InterruptedException
	{
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		schedulePage=homePage.clickonScheduleControlLink();
		schedulePage=schedulePage.checkSchedulerstatus();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		schedulePage=homePage.clickonScheduleModifyLink();
		schedulePage=schedulePage.modifyEGPS_CHEQUE_OUTFILESchedulerForOutwardPaymentFlow();
	}//end
	
	@Then("user checks the scheduler status for VIPOutwardPaymentFlow")
	public void user_checks_the_scheduler_status_for_VIPOutwardPaymentFlow() throws InterruptedException
	{
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		schedulePage=homePage.clickonScheduleControlLink();
		schedulePage=schedulePage.checkSchedulerstatus();
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		schedulePage=homePage.clickonScheduleModifyLink();
		schedulePage=schedulePage.modifyEGPS_VIP_CHEQUE_OUTFILESchedulerForVIPOutwardPaymentFlow();	
	}//end


	@Then("user To validates whether payment moved to PendingAck status filter {string},{string},{string},{string} in payment list menu")
	public void user_To_validates_whether_payment_moved_to_PendingAck_status_filter_in_payment_list_menu(
			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		outwardPage=homePage.checkPayment1();
		outwardPage = outwardPage.checkPaymentstatus(ValueDateperiod, Reference, SubRef, ChequeNo);
		outwardPage.outwardPageLogOut();

	}//end

	// -------------Duplicate Flow Method---------------//

	@Given("user disable Cheque_Outward_Payment_Creation_Server in environment server")
	public void user_disable_Cheque_Outward_Payment_Creation_Server_in_environment_server()throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		environmentPage = homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton();
		environmentPage.switchInactiveCheque_Outward_Payment();
		environmentPage.LogOut();
		driver.quit();

	}

	@Given("user validates whether payment moved to Duplicate status using filter {string},{string},{string},{string} in payment list menu")
	public void user_validates_whether_payment_moved_to_Duplicate_status_using_filter_in_payment_list_menu(String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		outwardPage = homePage.checkPayment1();
		outwardPage = outwardPage.checkInitialDuplicateStatus(ValueDateperiod, Reference, SubRef, ChequeNo);
	}//end

	@Then("user goes to Duplicate menu use the filter {string},{string},{string},{string} and click on Allow duplicate button and then clicks on confirm button")
	public void user_goes_to_Duplicate_menu_use_the_filter_and_click_on_Allow_duplicate_button_and_then_clicks_on_confirm_button(
			String ValueDateperiod, String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		outwardPage = homePage.duplicateMenu();
		outwardPage = outwardPage.allowDuplicate(ValueDateperiod, Reference, SubRef, ChequeNo);

	}

	//---Common step Approve the record----//
	@Then("user goes to approve menu uses the filter {string},{string},{string},{string} and approves the payment")
	public void user_goes_to_approve_menu_uses_the_filter_and_approves_the_payment(String ValueDateperiod,
			String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		outwardPage = homePage.paymentapproveLink();
		outwardPage = outwardPage.approvePayment(ValueDateperiod, Reference, SubRef, ChequeNo);
	}

	// -----------------------Repair Flow Methods------------------------------------//

	@Then("user validates whether payment moved to Repair status using filter {string},{string},{string},{string} in payment list menu")
	public void user_validates_whether_payment_moved_to_Repair_status_using_filter_in_payment_list_menu(String ValueDateperiod,
			String Reference, String SubRef, String ChequeNo) throws InterruptedException {

		Initialization();
		win=new Windowhandle(driver);
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		outwardPage= homePage.checkPayment1();
		outwardPage=outwardPage.checkInitialRepairStatus(ValueDateperiod, Reference, SubRef, ChequeNo);
	}

	@Then("user goes to Repair menu uses the filter {string},{string},{string},{string} repair the payment {string} click on Ok button and click on confirm button")
	public void user_goes_to_Repair_menu_uses_the_filter_repair_the_payment_click_on_Ok_button_and_click_on_confirm_button(String ValueDateperiod,
			String Reference, String SubRef, String ChequeNo, String date) throws InterruptedException {
	    Initialization();
	    win=new Windowhandle(driver);
	    loginPage=new LoginPage();
	    homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    driver.switchTo().frame("toc");
	    outwardPage=homePage.repairMenu();
	    outwardPage=outwardPage.repairPayment(ValueDateperiod, Reference, SubRef, ChequeNo, date);    
	}


}
