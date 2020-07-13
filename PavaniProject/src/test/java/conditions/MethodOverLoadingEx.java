package conditions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodOverLoadingEx {

	WebDriver driver;

	/**
	 * Overloading: Same method with diff parameters
	 * 
	 * overriding : same method and parameters but diff body
	 */

	public void click(WebElement ele) {

		if (ele.isDisplayed()) {
			System.out.println("Element is visible");
			ele.click();
		}
	}
	
	

	public void click(WebElement ele, String fieldName) {

		if (ele.isDisplayed()) {
			System.out.println("Element is visible");
			ele.click();
			System.out.println("Clicked on "+fieldName);
		}
	}

}
