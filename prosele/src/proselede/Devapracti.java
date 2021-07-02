package proselede;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Devapracti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		driver.get("https://register.rediff.com//register//register.php?FormName=user_details");

        List<WebElement> multi=driver.findElements(By.xpath("//input[@type='text']"));
       
        
        multi.get(0).sendKeys("deva");
        multi.get(1).sendKeys("jadhav");
        multi.get(3).sendKeys("gsgs");
      
    	ArrayList<String>all=new ArrayList<String>(driver.getWindowHandles());	
    	System.out.println(all.get(0));
   	  
	}

}
