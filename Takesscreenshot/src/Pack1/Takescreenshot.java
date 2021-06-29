package Pack1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot{
	
	
	
	public static void main(String[] args) throws IOException  {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
          String tt=new SimpleDateFormat("YYYY_MM_dd-hh_mm_ss").format(new Date());
		
      File source=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dest=new File("E://deva2_"+tt+".jpeg");
		
		FileHandler.copy(source, dest);
		
	WebElement fhd=	driver.findElement(By.xpath("//span[contains(@class,'coreSpriteFacebookIcon AeB99')]"));
	
		
}}