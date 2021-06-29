package Pack1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Class2 {
	
	public static void Class2() throws IOException

	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();

        String time=new SimpleDateFormat("yyyy_MM_dd_hh_mm").format(new Date());
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	    File dest= new File("E://deva1"+time+".jpeg");
	    
	    FileHandler.copy(source, dest);
	}
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
	 WebElement cl=   driver.findElement(By.xpath("//button[@id='confirmButton']"));
	    
	            cl.click();
	            
	            Thread.sleep(3000);
	
	  Alert al= driver.switchTo().alert(); 
	             al.dismiss();
	         
	             
	             Class2();
	}

}
