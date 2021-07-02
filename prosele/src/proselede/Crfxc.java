package proselede;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crfxc {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com");
	
		WebElement create=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		
		Thread.sleep(5000);
		WebElement term= driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
		term.click();
		
		WebElement policy= driver.findElement(By.xpath("(//a[@rel='nofollow'])[2]"));
		policy.click();
		
		WebElement cookie= driver.findElement(By.xpath("(//a[@rel='nofollow'])[3]"));
		cookie.click();
		
		String mainpage =driver.getWindowHandle();
		System.out.println(mainpage);
		
		ArrayList<String>all=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(all.get(1));
		System.out.println(all.get(2));
		System.out.println(all.get(3));
		
		driver.switchTo().window(all.get(1));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(all.get(2));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(all.get(3));
		System.out.println(driver.getCurrentUrl());	
	}}


