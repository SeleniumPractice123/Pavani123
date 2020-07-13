package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import conditions.MethodOverLoadingEx;

public class PayTMLogin {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://paytm.com/");

		driver.manage().window().maximize();
		
		new MethodOverLoadingEx().click(driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")));
		
		//driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		
		Thread.sleep(5000);
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@scrolling='no']")));
		
		driver.findElement(By.xpath("//div[@class='cta-description']/following::a[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='close']")).click();
		
		driver.switchTo().defaultContent();
		
		
		
		
		
	}

}
