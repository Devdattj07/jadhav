package proselede;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Globaliztiongettext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			
	WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com");
		
		WebElement name=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		
	    String namesame=	name.getText();
		System.out.println(namesame);
		
		if (namesame.equals("Facebook helps you connect and share with the people in your life."))
		
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
		
		
		
		
		
	}

}
