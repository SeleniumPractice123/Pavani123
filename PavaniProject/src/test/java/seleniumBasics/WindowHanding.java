package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHanding {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");
			
		String main = driver.getWindowHandle();

		driver.manage().window().maximize();

		Set<String> childs = driver.getWindowHandles();

		System.out.println(childs.size());

		for (String s : childs) {

			driver.switchTo().window(s);

			if (!driver.getTitle().contains("Jobs - Recruitment")) {

				driver.close();

				break;
			}
		}
		
		driver.switchTo().window(main);
		
		String parent = driver.getWindowHandle();

		System.out.println(parent);
		
		
		driver.findElement(By.xpath("//div[text()='Tools']")).click();
		
		
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println(windows.size());
		
		
		Iterator<String> ite = windows.iterator();
		
		
		while(ite.hasNext()) {
			
			String c = ite.next();
			
			if(!c.equals(parent)) {
				
				driver.switchTo().window(c);
				
				System.out.println(driver.getTitle());
				
				driver.findElement(By.xpath("//div[text()='Login']")).click();
				
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
