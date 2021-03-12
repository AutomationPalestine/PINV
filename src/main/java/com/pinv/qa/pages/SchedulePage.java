package com.pinv.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pinv.qa.base.TestBase;
import com.pinv.qa.constants.IntfConstants;
import com.pinv.qa.util.Windowhandle;

import io.cucumber.datatable.DataTable;

public class SchedulePage extends TestBase{

	@FindBy(name="name")
	WebElement schedulerdropdown;
	
	@FindBy(name="content(starts1)")
	WebElement starttime;
	
	@FindBy(name="content(ends1)")
	WebElement endtime;
	
	@FindBy(name="content(frequencyHours1)")
	WebElement frequencyHH;
	
	@FindBy(name="content(frequencyMinutes1)")
	WebElement frequencyMM;
	
	@FindBy(name="content(frequencySeconds1)")
	WebElement frequencySS;
	
	@FindBy(name="content(settlementCycle1)")
	WebElement settlementCycle;
	
	@FindBy(id="remove1")
	WebElement removeBtn;
	
	@FindBy(id="add1")
	WebElement addBtn;
	
	@FindBy(name="submit")
	WebElement submitBtn;
	
	@FindBy(name="org.apache.struts.taglib.html.CANCEL")
	WebElement cancelBtn;
	
	@FindBy(xpath="//center//input[2]")
	WebElement okBtn;
	
	@FindBy(xpath="//tr[2]//td[3]")
	WebElement checkstatus;
	
	@FindBy(xpath="//tr[3]//td[3]")
	WebElement checkstatus1;
	
	@FindBy(xpath="//tr[4]//td[3]")
	WebElement checkstatus2;
	
	@FindBy(xpath="//tr[5]//td[3]")
	WebElement checkstatus3;
	
	@FindBy(xpath="//tr[6]//td[3]")
	WebElement checkstatus4;
	
	@FindBy(xpath="//tr[7]//td[3]")
	WebElement checkstatus5;
	
	@FindBy(xpath="//tr[8]//td[3]")
	WebElement checkstatus6;
	
	
	@FindBy(name="enabled")
	WebElement enabledcheckbox;
	
	@FindBy(xpath="//p[@class='errormessages']")
	WebElement errormessages;
	
	@FindBy(xpath="//a[contains(text(),'Restart Workflow')]")
	WebElement restartWorkflow;
	
	@FindBy(name="status")
	WebElement status;
	
	@FindBy(xpath="//table[@id='LNTablelistable']//tbody")
	WebElement schedulertable;
	
	@FindBy(xpath="//td[contains(text(),'EGPS_CHEQUE_OUTFILE')]")
	WebElement server;
	
	@FindBy(xpath="//td[contains(text(),'EGPS_CHEQUE_RETURN_OUTFILE')]")
	WebElement server1;
	
	@FindBy(xpath="//td[contains(text(),'FINAL_ISF_SCHEDULER')]")
	WebElement server2;
	
	@FindBy(xpath="//td[contains(text(),'ISRAELI_CHEQUE_STOP_SCHEDULER')]")
	WebElement server3;
	
	@FindBy(xpath="//td[contains(text(),'PRE_ISF_SCHEDULER')]")
	WebElement server4;
	
	@FindBy(xpath="//td[contains(text(),'EGPS_VIP_CHEQUE_ACCEPTANCE_OUTFILE')]")
	WebElement server5;
	
	@FindBy(xpath="//td[contains(text(),'EGPS_VIP_CHEQUE_OUTFILE')]")
	WebElement server6;
	
	@FindBy(xpath="//*[@id=\"headerTable\"]/tbody/tr[2]/td[2]")
	WebElement schedulercontrolStatus;
	
	@FindBy(xpath="//center//td[1]//input[1]")
	WebElement startBtn;
	
	@FindBy(xpath="//td[2]//input[1]")
	WebElement stopBtn;
	
	@FindBy(id="logoutButtonId")
	WebElement logOutBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button/img")
	WebElement logoutBtn;
	
	@FindBy(xpath="//*[@id=\"headerTable\"]/tbody/tr[3]/td[1]")
	WebElement serverStatus;
	
	@FindBy(xpath="//*[@id=\"headerTable\"]/tbody/tr[3]/td[2]/input")
	WebElement serverStatusCheckbox;
	
	

	public SchedulePage() {
		PageFactory.initElements(driver, this);
	}
	
	public SchedulePage addSchedulerwithvaliddata(String Scheduler,String StartTime,String EndTime,String FrequencyHH, String FrequencyMM,String FrequencySS,String SettlementCycle) throws InterruptedException {
		schedulerdropdown.click();
		Select sl=new Select(schedulerdropdown);
		sl.selectByVisibleText(Scheduler);
		okBtn.click();
		starttime.sendKeys(StartTime);
		endtime.sendKeys(EndTime);
		frequencyHH.click();
		Select sl1=new Select(frequencyHH);
		sl1.selectByVisibleText(FrequencyHH);
		frequencyMM.click();
		Select sl2=new Select(frequencyMM);
		sl2.selectByVisibleText(FrequencyMM);
		frequencySS.click();
		Select sl3=new Select(frequencySS);
		sl3.selectByVisibleText(FrequencySS);
		settlementCycle.click();
		Select sl4=new Select(settlementCycle);
		sl4.selectByVisibleText(SettlementCycle);
		submitBtn.click();
		cancelBtn.click();
		String a=errormessages.getText();
		String b="Operation was cancelled.";
		if(a.equals(b)) {
			System.out.println("Cancel Button functionality is working fine");
		}
		else {
			System.out.println("Cancel Button is working fine");
		}
		schedulerdropdown.click();
		Select sl5=new Select(schedulerdropdown);
		sl5.selectByVisibleText(Scheduler);
		okBtn.click();
		starttime.sendKeys(StartTime);
		endtime.sendKeys(EndTime);
		frequencyHH.click();
		Select sl6=new Select(frequencyHH);
		sl6.selectByVisibleText(FrequencyHH);
		frequencyMM.click();
		Select sl7=new Select(frequencyMM);
		sl7.selectByVisibleText(FrequencyMM);
		frequencySS.click();
		Select sl8=new Select(frequencySS);
		sl8.selectByVisibleText(FrequencySS);
		settlementCycle.click();
		Select sl9=new Select(settlementCycle);
		sl9.selectByVisibleText(SettlementCycle);
		submitBtn.click();
		okBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new SchedulePage();
	}
	
	public SchedulePage addSchedulerwithInvalidStartTime(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		schedulerdropdown.click();
		Select sl=new Select(schedulerdropdown);
		sl.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		starttime.sendKeys(data.get(0).get(1));
		endtime.sendKeys(data.get(0).get(2));
		submitBtn.click();
		String a=errormessages.getText();
		String b="Invalid Start Time for interval 1";
		if(a.equals(b)) {
			System.out.println("Start Time validation message is properly displayed for Invalid Start time field");
		}else {
			System.out.println("Validation is not proper for Start time field");
		}
		return new SchedulePage();
	}
	
	public SchedulePage addSchedulerwithInvalidEndTime(DataTable credentials) {
		List<List<String>> data=credentials.asLists();
		restartWorkflow.click();
		schedulerdropdown.click();
		Select sl1=new Select(schedulerdropdown);
		sl1.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		starttime.sendKeys(data.get(0).get(1));
		endtime.sendKeys(data.get(0).get(2));
		submitBtn.click();
		String a=errormessages.getText();
		String b="Invalid End Time for interval 1";
		if(a.equals(b)) {
			System.out.println("End Time validation message is properly displayed for Invalid End time field");
		}else {
			System.out.println("Validation is not proper for End time field");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new SchedulePage();
	}
	
	public SchedulePage addSchedulerwithBlankStartTime(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		schedulerdropdown.click();
		Select sl=new Select(schedulerdropdown);
		sl.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		starttime.sendKeys(data.get(0).get(1));
		endtime.sendKeys(data.get(0).get(2));
		submitBtn.click();
		String a=errormessages.getText();
		String b="Invalid Start Time for interval 1";
		if(a.equals(b)) {
			System.out.println("Start Time validation message is properly displayed for Blank Start time field");
		}else {
			System.out.println("Validation is not proper for Start time field");
		}
		return new SchedulePage();
	}
	
	public SchedulePage addSchedulerwithBlankEndTime(DataTable credentials) {
		List<List<String>> data=credentials.asLists();
		restartWorkflow.click();
		schedulerdropdown.click();
		Select sl1=new Select(schedulerdropdown);
		sl1.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		starttime.sendKeys(data.get(0).get(1));
		endtime.sendKeys(data.get(0).get(2));
		submitBtn.click();
		String a=errormessages.getText();
		String b="Invalid End Time for interval 1";
		if(a.equals(b)) {
			System.out.println("End Time validation message is properly displayed for Blank End time field");
		}else {
			System.out.println("Validation is not proper for End time field");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new SchedulePage();
	}
	
	public SchedulePage addExistingScheduler(String Scheduler) throws InterruptedException {
		schedulerdropdown.click();
		Select sl=new Select(schedulerdropdown);
		sl.selectByVisibleText(Scheduler);
		okBtn.click();
		String c=errormessages.getText();
		String d="The Scheduler was already added.";
		if(c.equals(d)) {
			System.out.println(" "+Scheduler+" was already added ");
		}else {
			System.out.println("Existing Scheduler validation failed");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new SchedulePage();
	}
	
	public SchedulePage modifyEGPS_VIP_CHEQUE_ACCEPTANCE_OUTFILEScheduler(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		System.out.println("testing what data variable displayes");
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		server5.click();
		enabledcheckbox.click();
		starttime.clear();
		starttime.sendKeys(data.get(0).get(1));
		endtime.clear();
		endtime.sendKeys(data.get(0).get(2));
		frequencyHH.click();
		Select sl6=new Select(frequencyHH);
		sl6.selectByVisibleText(data.get(0).get(3));
		frequencyMM.click();
		Select sl7=new Select(frequencyMM);
		sl7.selectByVisibleText(data.get(0).get(4));
		frequencySS.click();
		Select sl8=new Select(frequencySS);
		sl8.selectByVisibleText(data.get(0).get(5));
		settlementCycle.click();
		Select sl9=new Select(settlementCycle);
		sl9.selectByVisibleText(data.get(0).get(6));
		submitBtn.click();
		okBtn.click();
		System.out.println("Operation executed successfully for EGPS_VIP_CHEQUE_ACCEPTANCE_OUTFILE Scheduler");
		return new SchedulePage();
	}
	
	public SchedulePage modifyEGPS_VIP_CHEQUE_OUTFILEScheduler(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		server6.click();
		enabledcheckbox.click();
		starttime.clear();
		starttime.sendKeys(data.get(0).get(1));
		endtime.clear();
		endtime.sendKeys(data.get(0).get(2));
		frequencyHH.click();
		Select sl6=new Select(frequencyHH);
		sl6.selectByVisibleText(data.get(0).get(3));
		frequencyMM.click();
		Select sl7=new Select(frequencyMM);
		sl7.selectByVisibleText(data.get(0).get(4));
		frequencySS.click();
		Select sl8=new Select(frequencySS);
		sl8.selectByVisibleText(data.get(0).get(5));
		settlementCycle.click();
		Select sl9=new Select(settlementCycle);
		sl9.selectByVisibleText(data.get(0).get(6));
		submitBtn.click();
		okBtn.click();
		System.out.println("Operation executed successfully for EGPS_VIP_CHEQUE_OUTFILE Scheduler");
		return new SchedulePage();
	}
	
	public SchedulePage modifyFINAL_ISF_SCHEDULERScheduler(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		server2.click();
		enabledcheckbox.click();
		starttime.clear();
		starttime.sendKeys(data.get(0).get(1));
		endtime.clear();
		endtime.sendKeys(data.get(0).get(2));
		frequencyHH.click();
		Select sl6=new Select(frequencyHH);
		sl6.selectByVisibleText(data.get(0).get(3));
		frequencyMM.click();
		Select sl7=new Select(frequencyMM);
		sl7.selectByVisibleText(data.get(0).get(4));
		frequencySS.click();
		Select sl8=new Select(frequencySS);
		sl8.selectByVisibleText(data.get(0).get(5));
		settlementCycle.click();
		Select sl9=new Select(settlementCycle);
		sl9.selectByVisibleText(data.get(0).get(6));
		submitBtn.click();
		okBtn.click();
		System.out.println("Operation executed successfully for ISF_SCHEDULER Scheduler");
		return new SchedulePage();
	}
	
	public SchedulePage modifyISRAELI_CHEQUE_STOP_SCHEDULERScheduler(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		server3.click();
		enabledcheckbox.click();
		starttime.clear();
		starttime.sendKeys(data.get(0).get(1));
		endtime.clear();
		endtime.sendKeys(data.get(0).get(2));
		frequencyHH.click();
		Select sl6=new Select(frequencyHH);
		sl6.selectByVisibleText(data.get(0).get(3));
		frequencyMM.click();
		Select sl7=new Select(frequencyMM);
		sl7.selectByVisibleText(data.get(0).get(4));
		frequencySS.click();
		Select sl8=new Select(frequencySS);
		sl8.selectByVisibleText(data.get(0).get(5));
		settlementCycle.click();
		Select sl9=new Select(settlementCycle);
		sl9.selectByVisibleText(data.get(0).get(6));
		submitBtn.click();
		okBtn.click();
		System.out.println("Operation executed successfully for ISRAELI_CHEQUE_STOP_SCHEDULER");
		return new SchedulePage();
	}
	
	
	
	public SchedulePage modifyEGPS_CHEQUE_OUTFILEScheduler(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		server.click();
		enabledcheckbox.click();
		starttime.clear();
		starttime.sendKeys(data.get(0).get(1));
		endtime.clear();
		endtime.sendKeys(data.get(0).get(2));
		frequencyHH.click();
		Select sl6=new Select(frequencyHH);
		sl6.selectByVisibleText(data.get(0).get(3));
		frequencyMM.click();
		Select sl7=new Select(frequencyMM);
		sl7.selectByVisibleText(data.get(0).get(4));
		frequencySS.click();
		Select sl8=new Select(frequencySS);
		sl8.selectByVisibleText(data.get(0).get(5));
		settlementCycle.click();
		Select sl9=new Select(settlementCycle);
		sl9.selectByVisibleText(data.get(0).get(6));
		submitBtn.click();
		okBtn.click();
		System.out.println("Operation executed successfully for EGPS_CHEQUE_OUTFILE Scheduler");
		return new SchedulePage();
	}
	
	public SchedulePage modifyEGPS_CHEQUE_RETURN_OUTFILEScheduler(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		server1.click();
		enabledcheckbox.click();
		starttime.clear();
		starttime.sendKeys(data.get(0).get(1));
		endtime.clear();
		endtime.sendKeys(data.get(0).get(2));
		frequencyHH.click();
		Select sl6=new Select(frequencyHH);
		sl6.selectByVisibleText(data.get(0).get(3));
		frequencyMM.click();
		Select sl7=new Select(frequencyMM);
		sl7.selectByVisibleText(data.get(0).get(4));
		frequencySS.click();
		Select sl8=new Select(frequencySS);
		sl8.selectByVisibleText(data.get(0).get(5));
		settlementCycle.click();
		Select sl9=new Select(settlementCycle);
		sl9.selectByVisibleText(data.get(0).get(6));
		submitBtn.click();
		okBtn.click();
		System.out.println("Operation executed successfully for EGPS_CHEQUE_RETURN_OUTFILE Scheduler");
		return new SchedulePage();
	}
	
	public SchedulePage modifyPRE_ISF_SCHEDULERScheduler(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		server4.click();
		enabledcheckbox.click();
		starttime.clear();
		starttime.sendKeys(data.get(0).get(1));
		endtime.clear();
		endtime.sendKeys(data.get(0).get(2));
		frequencyHH.click();
		Select sl6=new Select(frequencyHH);
		sl6.selectByVisibleText(data.get(0).get(3));
		frequencyMM.click();
		Select sl7=new Select(frequencyMM);
		sl7.selectByVisibleText(data.get(0).get(4));
		frequencySS.click();
		Select sl8=new Select(frequencySS);
		sl8.selectByVisibleText(data.get(0).get(5));
		settlementCycle.click();
		Select sl9=new Select(settlementCycle);
		sl9.selectByVisibleText(data.get(0).get(6));
		submitBtn.click();
		okBtn.click();
		System.out.println("Operation executed successfully for EGPS_CHEQUE_RETURN_OUTFILE Scheduler");
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new SchedulePage();
	}
	
	public SchedulePage modifyONUS_CHEQUE_AUTO_RETURNScheduler(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		server3.click();
		enabledcheckbox.click();
		starttime.clear();
		starttime.sendKeys(data.get(0).get(1));
		endtime.clear();
		endtime.sendKeys(data.get(0).get(2));
		frequencyHH.click();
		Select sl6=new Select(frequencyHH);
		sl6.selectByVisibleText(data.get(0).get(3));
		frequencyMM.click();
		Select sl7=new Select(frequencyMM);
		sl7.selectByVisibleText(data.get(0).get(4));
		frequencySS.click();
		Select sl8=new Select(frequencySS);
		sl8.selectByVisibleText(data.get(0).get(5));
		settlementCycle.click();
		Select sl9=new Select(settlementCycle);
		sl9.selectByVisibleText(data.get(0).get(6));
		submitBtn.click();
		okBtn.click();
		System.out.println("Operation executed successfully for ONUS_CHEQUE_AUTO_RETURN Scheduler");
		return new SchedulePage();
	}
	
	public SchedulePage modifyCHEQUE_AUTO_RETURNScheduler(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		server3.click();
		enabledcheckbox.click();
		starttime.clear();
		starttime.sendKeys(data.get(0).get(1));
		endtime.clear();
		endtime.sendKeys(data.get(0).get(2));
		frequencyHH.click();
		Select sl6=new Select(frequencyHH);
		sl6.selectByVisibleText(data.get(0).get(3));
		frequencyMM.click();
		Select sl7=new Select(frequencyMM);
		sl7.selectByVisibleText(data.get(0).get(4));
		frequencySS.click();
		Select sl8=new Select(frequencySS);
		sl8.selectByVisibleText(data.get(0).get(5));
		settlementCycle.click();
		Select sl9=new Select(settlementCycle);
		sl9.selectByVisibleText(data.get(0).get(6));
		submitBtn.click();
		okBtn.click();
		System.out.println("Operation executed successfully for CHEQUE_AUTO_RETURN Scheduler");
		return new SchedulePage();
	}
	
	public SchedulePage modifyFINAL_ISF_SCHEDULER(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		server3.click();
		enabledcheckbox.click();
		starttime.clear();
		starttime.sendKeys(data.get(0).get(1));
		endtime.clear();
		endtime.sendKeys(data.get(0).get(2));
		frequencyHH.click();
		Select sl6=new Select(frequencyHH);
		sl6.selectByVisibleText(data.get(0).get(3));
		frequencyMM.click();
		Select sl7=new Select(frequencyMM);
		sl7.selectByVisibleText(data.get(0).get(4));
		frequencySS.click();
		Select sl8=new Select(frequencySS);
		sl8.selectByVisibleText(data.get(0).get(5));
		settlementCycle.click();
		Select sl9=new Select(settlementCycle);
		sl9.selectByVisibleText(data.get(0).get(6));
		submitBtn.click();
		okBtn.click();
		System.out.println("Operation executed successfully for FINAL_ISF_SCHEDULER Scheduler");
		return new SchedulePage();
	}
	
	public SchedulePage modifyHEAD_OFFICE_APPROVE_SCHEDULER(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		server3.click();
		enabledcheckbox.click();
		starttime.clear();
		starttime.sendKeys(data.get(0).get(1));
		endtime.clear();
		endtime.sendKeys(data.get(0).get(2));
		frequencyHH.click();
		Select sl6=new Select(frequencyHH);
		sl6.selectByVisibleText(data.get(0).get(3));
		frequencyMM.click();
		Select sl7=new Select(frequencyMM);
		sl7.selectByVisibleText(data.get(0).get(4));
		frequencySS.click();
		Select sl8=new Select(frequencySS);
		sl8.selectByVisibleText(data.get(0).get(5));
		settlementCycle.click();
		Select sl9=new Select(settlementCycle);
		sl9.selectByVisibleText(data.get(0).get(6));
		submitBtn.click();
		okBtn.click();
		System.out.println("Operation executed successfully for HEAD_OFFICE_APPROVE_SCHEDULER Scheduler");
		return new SchedulePage();
	}
	
	public SchedulePage modifyINSUFFICIENT_FUND_PAY_SCHEDULER(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		server3.click();
		enabledcheckbox.click();
		starttime.clear();
		starttime.sendKeys(data.get(0).get(1));
		endtime.clear();
		endtime.sendKeys(data.get(0).get(2));
		frequencyHH.click();
		Select sl6=new Select(frequencyHH);
		sl6.selectByVisibleText(data.get(0).get(3));
		frequencyMM.click();
		Select sl7=new Select(frequencyMM);
		sl7.selectByVisibleText(data.get(0).get(4));
		frequencySS.click();
		Select sl8=new Select(frequencySS);
		sl8.selectByVisibleText(data.get(0).get(5));
		settlementCycle.click();
		Select sl9=new Select(settlementCycle);
		sl9.selectByVisibleText(data.get(0).get(6));
		submitBtn.click();
		okBtn.click();
		System.out.println("Operation executed successfully for INSUFFICIENT_FUND_PAY_SCHEDULER Scheduler");
		return new SchedulePage();
	}
	
	public SchedulePage modifyISRAELI_CHEQUE_AUTO_RETURN(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		server3.click();
		enabledcheckbox.click();
		starttime.clear();
		starttime.sendKeys(data.get(0).get(1));
		endtime.clear();
		endtime.sendKeys(data.get(0).get(2));
		frequencyHH.click();
		Select sl6=new Select(frequencyHH);
		sl6.selectByVisibleText(data.get(0).get(3));
		frequencyMM.click();
		Select sl7=new Select(frequencyMM);
		sl7.selectByVisibleText(data.get(0).get(4));
		frequencySS.click();
		Select sl8=new Select(frequencySS);
		sl8.selectByVisibleText(data.get(0).get(5));
		settlementCycle.click();
		Select sl9=new Select(settlementCycle);
		sl9.selectByVisibleText(data.get(0).get(6));
		submitBtn.click();
		okBtn.click();
		System.out.println("Operation executed successfully for ISRAELI_CHEQUE_AUTO_RETURN Scheduler");
		return new SchedulePage();
	}
	
	public SchedulePage modifyISRAELI_CHEQUE_STOP_SCHEDULER(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(data.get(0).get(0));
		okBtn.click();
		server3.click();
		enabledcheckbox.click();
		starttime.clear();
		starttime.sendKeys(data.get(0).get(1));
		endtime.clear();
		endtime.sendKeys(data.get(0).get(2));
		frequencyHH.click();
		Select sl6=new Select(frequencyHH);
		sl6.selectByVisibleText(data.get(0).get(3));
		frequencyMM.click();
		Select sl7=new Select(frequencyMM);
		sl7.selectByVisibleText(data.get(0).get(4));
		frequencySS.click();
		Select sl8=new Select(frequencySS);
		sl8.selectByVisibleText(data.get(0).get(5));
		settlementCycle.click();
		Select sl9=new Select(settlementCycle);
		sl9.selectByVisibleText(data.get(0).get(6));
		submitBtn.click();
		okBtn.click();
		System.out.println("Operation executed successfully for ISRAELI_CHEQUE_STOP_SCHEDULER Scheduler");
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new SchedulePage();
	}





	
	public SchedulePage listSchedulers() throws InterruptedException {
		okBtn.click();
		String a=errormessages.getText();
		String b="No items available for List operation given the search criteria";
		if(a.equals(b)) {
			System.out.println("No items available for List operation given the search criteria validation message is displayed properly");
		}else {
			System.out.println("Validation failed for Scheduler list");
		}
		
		
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new SchedulePage();
	}

	public SchedulePage listAllSchedulers(String SchedulerStatus) throws InterruptedException {
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(SchedulerStatus);
		okBtn.click();
		if(server.isDisplayed()) {
			System.out.println("EGPS_CHEQUE_OUTFILE server is displayed in list");
		}else {
			System.out.println("EGPS_CHEQUE_OUTFILE server is not displayed in list");
		}
		if(server1.isDisplayed()) {
			System.out.println("EGPS_CHEQUE_RETURN_OUTFILE server is displayed in list");
		}
		else {
			System.out.println("EGPS_CHEQUE_RETURN_OUTFILE is not displayed in list");
		}
		if(server2.isDisplayed()) {
			System.out.println("FINAL_ISF_SERVER server is displayed in list");
		}else {
			System.out.println("FINAL_ISF_SERVER server is not displayed in list");
		}
		if(server3.isDisplayed()) {
			System.out.println("ISRAELI_CHEQUE_STOP_SCHEDULER server is displayed in list");
		}else {
			System.out.println("ISRAELI_CHEQUE_STOP_SCHEDULER is not displayed in list");
		}
		if(server4.isDisplayed()){
			System.out.println("PRE_ISF_SCHEDULER server is displayed in list");
		}else {
			System.out.println("PRE_ISF_SCHEDULER is not displayed in list");
		}
		if(server5.isDisplayed()) {
			System.out.println("EGPS_VIP_CHEQUE_ACCEPTANCE_OUTFILE server is displayed in list");
		}else {
			System.out.println("EGPS_VIP_CHEQUE_ACCEPTANCE_OUTFILE is not displayed in list");
		}
		if(server6.isDisplayed()) {
			System.out.println("EGPS_VIP_CHEQUE_OUTFILE server is displayed in list");
		}else {
			System.out.println("EGPS_VIP_CHEQUE_OUTFILE is not displayed in list");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new SchedulePage();
	}
	

	public SchedulePage listEnabledSchedulers(String SchedulerStatus) throws InterruptedException {
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(SchedulerStatus);
		okBtn.click();
		
		String a=checkstatus.getText();
		String b=checkstatus1.getText();
		String c=checkstatus2.getText();
		String d=checkstatus3.getText();
		String e=checkstatus4.getText();
		String f=checkstatus5.getText();
		String g=checkstatus6.getText();
		String h=SchedulerStatus;
		if(a.equals(h) && b.equals(h) && c.equals(h) && d.equals(h) && e.equals(h) && f.equals(h) && g.equals(h)) {
			System.out.println("Selected criteria for "+SchedulerStatus+" status is displayed properly");
		}else {
			System.out.println("Selected criteria for "+SchedulerStatus+" status is not displayed");
		}
		 //trial and error code
		/*String a,b,c,d,e,f,g; 
		
		String h=SchedulerStatus;
		int flag1=0,flag2=0,flag3=0,flag4=0,flag5=0,flag6=0,flag7=0;
		
		
		try {
			 a=checkstatus.getText();
			 
			 b=checkstatus1.getText();
			 
		     c=checkstatus2.getText();
		    
		     d=checkstatus3.getText();
		     
			 e=checkstatus4.getText();
			 
			 f=checkstatus5.getText();
			 
		     g=checkstatus6.getText();
		     
		    
		}
		catch(Exception exception){
			System.out.println("Exception Occured.., Required Webelement Not Found and is Disabled ");
			
		
		}
		finally {
			
			 System.out.println("Selected criteria for " + SchedulerStatus + " status is displayed properly");
		}*/
		
		
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new SchedulePage();
	}
	
	public SchedulePage listDisabledSchedulers(String SchedulerStatus) throws InterruptedException {
		status.click();
		Select sl=new Select(status);
		sl.selectByVisibleText(SchedulerStatus);
		okBtn.click();
		String a=checkstatus.getText();
		String b=SchedulerStatus;
		if(a.equals(b)) {
			System.out.println("Selected criteria for "+SchedulerStatus+" status is displayed properly");
		}else {
			System.out.println("Selected criteria for "+SchedulerStatus+" status is not displayed");
		}	
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new SchedulePage();
	}
	
	public SchedulePage checkSchedulerstatus() throws InterruptedException {
		String statusScheduler = schedulercontrolStatus.getText();
		if (statusScheduler.equals("Shutdown")) {
			startBtn.click();
			checkSchedulerstatus1();
		} else {
			System.out.println("Scheduler Service is already in Active state");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new SchedulePage();
	}

	public void checkSchedulerstatus1() {
		String statusScheduler = schedulercontrolStatus.getText();
		if (statusScheduler.equals("Active")) {
			System.out.println("Scheduler Service started");
		} else {
			System.out.println("Scheduler Service is failed to start");
		}
	}
	
	public SchedulePage modifyEGPS_VIP_CHEQUE_ACCEPTANCE_OUTFILESchedulerForPaymentFlow() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		server5.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		boolean serverStatusCheckboxValue=enabledcheckbox.isSelected();
		if(serverStatusCheckboxValue==true)
		{
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			submitBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			okBtn.click();
			System.out.println("EGPS_VIP_CHEQUE_ACCEPTANCE_OUTFILE Scheduler is Running(Enabled)");
		}
		else
		{	
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			serverStatusCheckbox.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			submitBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			okBtn.click();
			System.out.println("EGPS_VIP_CHEQUE_ACCEPTANCE_OUTFILE Scheduler Started");
			
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new SchedulePage();
	}//end of modifyEGPS_VIP_CHEQUE_ACCEPTANCE_OUTFILESchedulerForPaymentFlow method
	
	public SchedulePage modifyEGPS_CHEQUE_RETURN_OUTFILEScheduler() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		server1.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		boolean serverStatusCheckboxValue=serverStatusCheckbox.isSelected();
		if(serverStatusCheckboxValue==true)
		{
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			submitBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			okBtn.click();
			System.out.println("EGPS_CHEQUE_RETURN_OUTFILE Scheduler is already in Running(Enabled) state ");
		}
		else
		{	
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			serverStatusCheckbox.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			submitBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			okBtn.click();
			System.out.println("EGPS_CHEQUE_RETURN_OUTFILE Scheduler Started");
			
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new SchedulePage();
	}//end of modifyEGPS_CHEQUE_RETURN_OUTFILESchedulerForOutwardPaymentFlow method
	
	public SchedulePage modifyEGPS_CHEQUE_OUTFILESchedulerForOutwardPaymentFlow() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		server.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		boolean serverStatusCheckboxValue=serverStatusCheckbox.isSelected();
		if(serverStatusCheckboxValue==true)
		{
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			submitBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			okBtn.click();
			System.out.println("EGPS_CHEQUE_OUTFILE Scheduler is already in Running(Enabled) state ");
		}
		else
		{	
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			serverStatusCheckbox.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			submitBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			okBtn.click();
			System.out.println("EGPS_CHEQUE_OUTFILE Scheduler Started");
			
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new SchedulePage();
	}//end of modifyEGPS_CHEQUE_OUTFILESchedulerForOutwardPaymentFlow method
	
	public SchedulePage modifyEGPS_VIP_CHEQUE_OUTFILESchedulerForVIPOutwardPaymentFlow() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		server6.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		boolean serverStatusCheckboxValue=serverStatusCheckbox.isSelected();
		if(serverStatusCheckboxValue==true)
		{
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			submitBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			okBtn.click();
			System.out.println("EGPS_VIP_CHEQUE_OUTFILE Scheduler is already in Running(Enabled) state ");
		}
		else
		{	
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			serverStatusCheckbox.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			submitBtn.click();
			Thread.sleep(IntfConstants.SHORT_TIMEOUT);
			okBtn.click();
			System.out.println("EGPS_VIP_CHEQUE_OUTFILE Scheduler Started");
			
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new SchedulePage();
	}//end of modifyEGPS_VIP_CHEQUE_OUTFILESchedulerForVIPOutwardPaymentFlow method
	
}
