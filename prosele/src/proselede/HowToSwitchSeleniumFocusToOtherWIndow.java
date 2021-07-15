package proselede;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HowToSwitchSeleniumFocusToOtherWIndow {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		WebElement link4=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		link4.click();
		Thread.sleep(2000);
		WebElement link1=driver.findElement(By.xpath("//a[@href='/legal/terms/update']"));
		WebElement link2=driver.findElement(By.xpath("//a[@href='/about/privacy/update']"));
     	WebElement link3=driver.findElement(By.xpath("(//a[@rel='nofollow'])[3]"));
		link1.click();
		link2.click();                       
		link3.click();
		
		Set<String> handle=driver.getWindowHandles();	
	
		Iterator<String> it=handle.iterator();   
		
		String main=it.next();
		
		String policies=it.next();
		String privacy=it.next();
		String term=it.next();
		
	    String ab=driver.getCurrentUrl();
	  
//	   // driver.switchTo().window(main);
//		driver.switchTo().window(policies);
//		driver.switchTo().window(privacy);
         driver.switchTo().window(term);
		
         String ac=  driver.getCurrentUrl();
	    System.out.println(ac);

		
	}
	
	}


