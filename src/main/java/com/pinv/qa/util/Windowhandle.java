package com.pinv.qa.util;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;

import com.pinv.qa.base.TestBase;

public class Windowhandle extends TestBase{
	
	private WebDriver driver;
	
	public Windowhandle(WebDriver driver) {
		this.driver=driver;
		  
	}
	
	public void handlewin() throws InterruptedException {
	Set<String> s1 = driver.getWindowHandles();
	String menuWindow=driver.getWindowHandle();
	s1.remove(menuWindow);
	
	Iterator<String> i1 = s1.iterator();
	String child=null;

	while (i1.hasNext()) {
		child=(String)i1.next();
		driver.switchTo().window(child);
		//perform action that you want to perform on child window
		}	
//	driver.switchTo().window(menuWindow); // switch back to parent window
	
	}
	
	
	public void handlewin1() {
		String parent = driver.getWindowHandle();
        Set<String> pops=driver.getWindowHandles();
        {
        Iterator<String> it =pops.iterator();
        while (it.hasNext()) {

            String popupHandle=it.next().toString();
            if(!popupHandle.contains(parent))
            {
            driver.switchTo().window(popupHandle);
            System.out.println("Popu Up Title: "+ driver.switchTo().window(popupHandle).getTitle());
            driver.close();
            }
        }
        }
        driver.switchTo().window(parent);
	}
	
	public void handlewin2() {
		String menuWindow=driver.getWindowHandle();	
		driver.switchTo().window(menuWindow);
		}


}



