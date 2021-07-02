package proselede;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childhandlepopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
				
    	List<WebElement> all=driver.findElements(By.xpath("//a[@rel='nofollow']"));
    	
		all.get(0).click();
		System.out.println(driver.getCurrentUrl());
	
		
		all.get(1).click();	
		System.out.println(driver.getCurrentUrl());
	
		all.get(2).click();
		System.out.println(driver.getCurrentUrl());
		
		String mainaddress=driver.getWindowHandle();
		
		ArrayList<String> address= new ArrayList<String>(driver.getWindowHandles());
	
		System.out.println(mainaddress);
		
		System.out.println(address.get(0));
		
		System.out.println(address.get(1));
		System.out.println(address.get(2));
		System.out.println(address.get(3));
		
        driver.switchTo().window(address.get(1));
        System.out.println(driver.getCurrentUrl());
		
        driver.switchTo().window(address.get(2));
        System.out.println(driver.getCurrentUrl());
		
        driver.switchTo().window(address.get(3));
        System.out.println(driver.getCurrentUrl());
		
		
	
	    
	    
		
	}

}