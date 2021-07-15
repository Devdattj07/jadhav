package proselede12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	

	
public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement element=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;

		// To enter username

		JS.executeScript("arguments[0].value='sendkeys'",element);

		// To enter password
		
	}
	
	
	
		
		
		
		
		
		
	}
	
	
	
