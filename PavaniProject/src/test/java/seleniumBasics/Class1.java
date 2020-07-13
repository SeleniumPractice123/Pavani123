package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Class1 {

	static WebDriver driver;

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver",
		// "./DriverFiles/chromedriver.exe");
		// driver = new ChromeDriver();

		System.setProperty("webdriver.ie.driver", "./DriverFiles/IEDriverServer.exe");

		DesiredCapabilities cap =DesiredCapabilities.internetExplorer();
		
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);

		driver = new InternetExplorerDriver(cap);

		driver.get("https://www.google.com");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		
		List<WebElement> eles = driver.findElements(By.xpath("//form[@id='frmLogin']/input/following-sibling::div"));
		
		
		String usernameType = driver.findElement(By.id("txtUsername")).getAttribute("type");
		
		
		
		
		for(int i=0; i<eles.size();i++) {
			
		}
		
		//Xpath:
			
			//     1. //tagname[@attributename = 'value']
			
			//     2. //tagname[@attributename = 'value1'][@attributename = 'value2']
			
			// 	   3. //tagname[@attributename = 'value' or @attributename = 'value']
			
			//	   4. //tagname[@attributename = 'value' and @attributename = 'value']
			
			//     5. //tagname[contains(text(),'value')]
			//     6. //tagname[text()='value']
			
			/**
			 * starts-with
			 * following::
			 * preceding::
			 * 
			 * //a[text()='TERMS OF USE']/following::button[1]
			 * 
			 * (//a[text()='TERMS OF USE']/preceding::input[@placeholder='PASSWORD'])[last()]
			 * 
			 * suresh123 / suresh567 
			 * //tagname[starts-with(@attributename,'value')]
			 * 
			 * 123suresh // 987suresh
			 * //tagname[ends-with(@attributename,'value')]
			 * 
			 *  to retrieve all tagnames
			 *  //*
			 */
			
			/**
			 * 1. tagname
			 * 2. attributename
			 * 3. value
			 * 
			 * // - parent
			 * / - child
			 * 
			 * 
			 * 
			 * 
			 */
			
			

	}

}
