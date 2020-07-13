package seleniumBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAndSet {
	
	static WebDriver driver = null;
	
	
	public static void setlistex() {
		
		System.out.println("---------List--------------");
		
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		
		
		
		for(int i=1; i<=ele.size();i++) {
			
			WebElement ele1 = driver.findElement(By.xpath("//ul[@role='listbox']/li["+i+"]"));
			
			if(ele1.getText().equals("Selenium rich food")) {
				ele1.click();
				break;
			}
		}
		
		for(WebElement text : ele) {
			if(text.getText().equals("Selenium rich food")) {
				text.click();
				break;
			}
		}
		
	}
	
	
	public static void listFun() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Selenium"); // 0
		list.add("Name"); // 1
		list.add("Address"); // 2
		list.add("Selenium"); // 3
		
		System.out.println(list);
		
		
		
		
	}
	
	
	public static void setFun() {
		
		Set<String> list = new HashSet<String>();
		
		list.add("Selenium");
		list.add("Name");
		list.add("Address");
		list.add("Selenium");
		
		System.out.println(list);
		
		
		
	}
	
	public static void setimp() {
				
		driver.get("https://www.naukri.com/");
		
		String parentWindow = driver.getWindowHandle();	
		
		//welcome to suresh training
		
		boolean status = parentWindow.contains("suresh");
		
	
		
		driver.findElement(By.xpath("")).click();
		
		// 2 windows
		
		 Set<String>  childs = driver.getWindowHandles();
		 
		 for(String currentWindow :childs) {
			 
			 if(!currentWindow.equals(parentWindow)) {
				 
				 String title =  driver.getTitle();
				 
				 if(title.equals("FastForward")) {
					 driver.switchTo().window(currentWindow);
					 
					 System.out.println("your code in child window");
					 	 
					 driver.close();
					 
				 }
				 
				
			 }
		 }
		 
		 driver.switchTo().window(parentWindow);
		 
		 
		
		
	}
	
	

	public static void main(String[] args) {
		System.out.println("-----------List------------");
		listFun();
		System.out.println("-----------Set------------");
		setFun();

	}

}
