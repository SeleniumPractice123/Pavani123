package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BodyAndCare {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.burtsbees.com/");
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Body & Hair Care')])[1]"))).build().perform();
				
		List<WebElement> bodycarelinks = driver.findElements(By.xpath("//a[contains(text(),'Body & Hair Care')]/following::a"));
		
		System.out.println(bodycarelinks.size());
		
		for(WebElement ele: bodycarelinks) {
			
			String hrefValue = ele.getAttribute("href");
			
			if(hrefValue.contains("body-and-hair-care")) {
				
				if(ele.getText().equals("Sun Care")) {
					
					ele.click();
					System.out.println("Testing");
					System.out.println("Test");
					System.out.println("Conflicts");
					break;
				}
			}
			
		}
		
		driver.close();

	}

}
