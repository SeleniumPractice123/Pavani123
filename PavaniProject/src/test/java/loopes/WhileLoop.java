package loopes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhileLoop {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		int i = 1;
		
		
		do {
			System.out.println(i);
			i++;
		} while (true);

	}

}
