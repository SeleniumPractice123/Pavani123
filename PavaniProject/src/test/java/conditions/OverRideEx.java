package conditions;

import org.openqa.selenium.WebElement;

public class OverRideEx extends MethodOverLoadingEx{

	
	@Override
	public void click(WebElement ele) {
		
		System.out.println("");
	}
}
