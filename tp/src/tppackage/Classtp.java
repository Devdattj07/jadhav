package tppackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classtp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
//		WebElement log=driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		
		WebElement username=driver.findElement(By.xpath("//input[@autocomplete='off'][2]"));
		
		WebElement password=driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
		
	    WebElement login =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	    
//		log.click();
		username.sendKeys("devajadhav07@gmail.com");
		
		password.sendKeys("Devajadhav@123");
		
		login.click();
		
		
		
	}

}
