package proselede;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	    Actions a=new Actions(driver);
	    
	    driver.manage().window().maximize();
		
		driver.get("https://www.guru99.com/selenium-tutorial.html");
		WebElement ff=driver.findElement(By.xpath("(//span[@class='g-menu-item-title'])[1]"));
		
		a.moveToElement(ff).perform();
		
           
		
		
				
				

//	a.moveToElement("https://www.guru99.com/selenium-tutorial.html");
		
	}

}
