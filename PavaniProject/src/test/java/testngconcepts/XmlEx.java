package testngconcepts;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XmlEx {

	WebDriver driver = null;

	@BeforeMethod
	public void precondition() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void login() {

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

		List<WebElement> menulinks = driver.findElements(By.xpath("//ul[@class='midSec menu']/li/a/div"));

		System.out.println(menulinks.size());

		for (WebElement ele : menulinks) {

			String name = ele.getText();

			System.out.println(name);

			if (name.equals("Services")) {

				ele.click();

				break;
			}
		}

		for (int i = 1; i <= menulinks.size(); i++) {

			WebElement ele1 = driver.findElement(By.xpath("//ul[@class='midSec menu']/li[" + i + "]/a/div"));

			System.out.println(ele1.getText());

			if (ele1.getText().equals("Services")) {

				ele1.click();

				break;
			}
		}

	}

}
