package StepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.pinv.qa.base.TestBase;
import com.pinv.qa.pages.HomePage;
import com.pinv.qa.pages.LoginPage;
import com.pinv.qa.util.Windowhandle;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Hooks extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	Windowhandle win;

	
	  @Before public void startBrowser(Scenario scenario) { Initialization();
	  win=new Windowhandle(driver); loginPage = new LoginPage();
	  homePage=loginPage.login(prop.getProperty("username"),
	  prop.getProperty("password")); }
	 

	@After
	public void quitBrowser() {

		driver.quit();
	}

	@AfterStep() 	
	public void afterSite(Scenario scenario) { 
		System.out.println("AFTER SITE"); 		 		
		try { 			 			
			if(scenario.isFailed()) {
				//scenario.write("this is my failure message"); 			
				TakesScreenshot ts = (TakesScreenshot)driver;			
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES); 				 		
				scenario.embed(screenshot, "image/png"); 			} 	
		} 		catch(Exception e) { 
			e.printStackTrace(); 		}	
	}


}
