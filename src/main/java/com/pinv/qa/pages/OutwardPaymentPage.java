package com.pinv.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pinv.qa.base.TestBase;
import com.pinv.qa.constants.IntfConstants;
import com.pinv.qa.util.Windowhandle;

public class OutwardPaymentPage extends TestBase {

	DatabaseIntegrity DI = new DatabaseIntegrity();
	String gpkey = null;

	// -------------- Cheque Data EntryList menu xpath----------//

	@FindBy(name = "payerAccount")
	WebElement payerAccountTextfield;

	@FindBy(name = "chequeNumber")
	WebElement chqNumberTextField;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement btnOk;

	// --------------Payment List menu xpath-------------------//
	@FindBy(name = "content(periodValueDate)")
	WebElement periodValueDate;

	@FindBy(name = "content(referenceOption)")
	WebElement referenceOption;

	@FindBy(name = "content(referenceTest)")
	WebElement referenceTest;

	@FindBy(name = "content(reference)")
	WebElement chequenoTextfield;

	@FindBy(xpath = "//input[@id='btnAll']")
	WebElement btnGetAll;

	@FindBy(xpath = "//tr[@class='rowcoloreven']")
	WebElement record;

	@FindBy(name = "payTranPrim")
	WebElement gpKey;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[10]")
	WebElement statusText;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[19]")
	WebElement status;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[22]")
	WebElement dbidstatus;

	@FindBy(xpath = "//button[contains(text(),'ack to List')]")
	WebElement backtoListBtn;

	@FindBy(xpath = "//a[contains(text(),'Restart Workflow')]")
	WebElement restartWorkflow;

	// Approve menu xpath
	@FindBy(id = "0")
	WebElement approveCheckBox;

	@FindBy(name = "approve")
	WebElement btnApprove;

	// Duplicate page menu xpath
	@FindBy(xpath = "//input[@value='Allow Duplicate']")
	WebElement btnAllowDuplicate;
	
	
	@FindBy(xpath = "//input[@value='To Repair']")
	WebElement btnToRepair;

	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement btnCancel;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement btnOK;

	@FindBy(name = "btnOk")
	WebElement btnConfirm;

	// Repair page menu xpath
	@FindBy(name="payTranValueDate")
	WebElement calendarTextField;
	
	@FindBy(name="btnOk")
	WebElement repairBtnOk;
	
	// logout btn
	@FindBy(id = "logoutButtonId")
	WebElement btnLogout;

	// External logout btn
	@FindBy(name = "logoutBtn1")
	WebElement extBtnLogout;

	// Constructor to invoke above elements
	public OutwardPaymentPage() {
		PageFactory.initElements(driver, this);
	}

	// --Filter method for Cheque data entry list
	public void chqDataEntryFilter(String chequeno, String payeraccount) throws InterruptedException {

		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		payerAccountTextfield.sendKeys(payeraccount);
		chqNumberTextField.sendKeys(chequeno);
		btnOk.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		// record.click();
		String actualStatus = statusText.getText();
		String expectedStatus = "QueuedToPayment";

		if (actualStatus.contains(expectedStatus)) {
			DI.getOracleDatabaseConnection(DI.updatePaymentstatus());//why is this quer executed if it is not a cbs server the status will
			//automatically change on starting ach-outward-server
			System.out.println("Query Executed");
		} else {
			System.out.println("-----Payment status is not in QueuedToPayment----");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
	}//end of chqDataEntryFilter function

	// --Filter method for Payment list
	public void filterScreen(String ValueDateperiod, String Reference, String SubRef, String ChequeNo)
			throws InterruptedException {

		Select sl = new Select(periodValueDate);
		sl.selectByVisibleText(ValueDateperiod);
		Select sl1 = new Select(referenceOption);
		sl1.selectByVisibleText(Reference);
		Select sl2 = new Select(referenceTest);
		sl2.selectByVisibleText(SubRef);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		chequenoTextfield.clear();
		chequenoTextfield.sendKeys(ChequeNo);
		btnGetAll.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		gpkey = gpKey.getAttribute("Value");
		System.out.println(gpkey);

	}//end of filterScreen

	// For Normal filter without gpkey
	public void filterScreen1(String ValueDateperiod, String Reference, String SubRef, String ChequeNo)
			throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Select sl = new Select(periodValueDate);
		sl.selectByVisibleText(ValueDateperiod);
		Select sl2 = new Select(referenceOption);
		sl2.selectByVisibleText(Reference);
		Select sl3 = new Select(referenceTest);
		sl3.selectByVisibleText(SubRef);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		chequenoTextfield.clear();
		chequenoTextfield.sendKeys(ChequeNo);
		btnGetAll.click();
		Thread.sleep(IntfConstants.TIMEOUT);
	
	}//end of filterScreen1 function

	public void filterwithGpkey(String ValueDateperiod, String Reference, String SubRef, String ChequeNo)
			throws InterruptedException {
		if (null == gpkey) {
			filterScreen(ValueDateperiod, Reference, SubRef, ChequeNo);
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		backtoListBtn.click();
	
	}//end of filterwithGpkey function

	// ---Methods to move from one status to other
	public OutwardPaymentPage checkInitialPaymentstatus(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = status.getText();
		System.out.println(paymentActualstatus);
		String expectedStatus = "QueuedToAccountVerification";
		if (expectedStatus.equals(paymentActualstatus)) {
			System.out.println("Payment moved to QueuedToAccountVerification status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + "");
		}

		return new OutwardPaymentPage();
	
	}//end of checkInitialPaymentstatus function

	public OutwardPaymentPage QueuedToAccountVerificationToApprove(Windowhandle win, String ValueDateperiod,
			String Reference, String SubRef, String ChequeNo) throws InterruptedException {
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToAccountVerification";
		String dbid = dbidstatus.getText();
		System.out.println(dbid);
		if (expectedStatus.equals(paymentActualstatus)) {
			int updatedPrevStatus = DI.getOracleDatabaseConnection(
					DI.getOracleUpdateQuery1(gpkey, "PREVIOUSSTATUS", "QueuedToAccountVerification"));
			if (0 == updatedPrevStatus) {
				long msgid = DI.getOracleDatabaseConnectionForSelectParseMsgId(DI.getparsedmsg());
				msgid++;
				System.out.println(msgid);
				DI.getOracleDatabaseConnection(
						DI.insertParsedMessage(gpkey, "PREVIOUSSTATUS", "QueuedToAccountVerification", msgid, dbid));
			}
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery1(gpkey, "PRE_POSTING_STATUS", ""));
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "Approve", "AccountVerificationApprove"));
			System.out.println("Payment moved to Approve status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new OutwardPaymentPage();
	
	}//end of QueuedToAccountVerificationToApprove function

	// --Method to approve the record
	public OutwardPaymentPage approvePayment(String ValueDateperiod, String Reference, String SubRef, String ChequeNo)
			throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		approveCheckBox.click();
		btnApprove.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new OutwardPaymentPage();
	
	}//end of approvePayment function

	public OutwardPaymentPage movetoQueuedToOutFile(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = status.getText();
		String expectedStatus = "QueuedToOutPresentCheque";
		if (expectedStatus.equals(paymentActualstatus)) {
			DI.getOracleDatabaseConnection(DI.getOracleUpdateQuery(gpkey, "QueuedTo OutFile", null));
			System.out.println("Payment moved to QueuedTo OutFile status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + " ");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		restartWorkflow.click();
		return new OutwardPaymentPage();
	
	}//end of movetoQueuedToOutFile function

	public OutwardPaymentPage checkPaymentstatus(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentActualstatus = status.getText();
		System.out.println("Payment moved to " + paymentActualstatus + " status");
		return new OutwardPaymentPage();
	
	}//end of  checkPaymentstatus function

	// ------------------Duplicate Flow Method------------------------//

	public OutwardPaymentPage checkInitialDuplicateStatus(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentDuplicateStatus = status.getText();
		System.out.println("Payment is in " + paymentDuplicateStatus + " status");
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new OutwardPaymentPage();
	
	}//end of checkInitialDuplicateStatus function

	public OutwardPaymentPage allowDuplicate(String ValueDateperiod, String Reference, String SubRef, String ChequeNo)
			throws InterruptedException {

		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen(ValueDateperiod, Reference, SubRef, ChequeNo);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnAllowDuplicate.click();
		btnConfirm.click();
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();

		return new OutwardPaymentPage();
	
	}//end of allowDuplicate function

	//------------Repair Flow Methods--------------//
	
	public OutwardPaymentPage checkInitialRepairStatus(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo) throws InterruptedException {
		
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen1(ValueDateperiod, Reference, SubRef, ChequeNo);
		String paymentRepairStatus=status.getText();
		System.out.println("Payment is in " + paymentRepairStatus + " status");
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new OutwardPaymentPage();
	
	}//end of checkInitialRepairStatus function
	
	public OutwardPaymentPage repairPayment(String ValueDateperiod, String Reference, String SubRef,
			String ChequeNo, String date) throws InterruptedException {
		
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterScreen(ValueDateperiod, Reference, SubRef, ChequeNo);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		calendarTextField.clear();
		calendarTextField.sendKeys(date);
		repairBtnOk.click();
		btnConfirm.click();
		btnLogout.click();
		extBtnLogout.click();
		driver.quit();
		return new OutwardPaymentPage();
	
	}//end of repairPayment function
	
	public void outwardPageLogOut() {
		btnLogout.click();
		extBtnLogout.click();

	}//end of outwardPageLogOut function
}
