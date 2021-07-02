package proselede;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframeframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		//s=switch selenium focus to iframe
		
		driver.switchTo().frame("frame1");   //  ( ID (id=  "frame1" )///////////////////

		WebElement tt=driver.findElement(By.xpath("//input[@type='text']"));
		
		tt.sendKeys("deva");
		
		//first iframe after switch selenium focus to main page the again focus to second frame
		
		driver.switchTo().defaultContent();     // switch focus from frame to main page
		
		driver.switchTo().frame(1);          //switch by ( index=== index )/////////////////
  	    //driver.switchTo().frame("frame2");   // switch by id  ==iD        /////////////////

		// id="frame2"    //swich the selenium focus to second frame
		//checkbox
		
		WebElement checkbox=driver.findElement(By.xpath("//select[@class='col-lg-3']"));
		
		Select listbox=new Select(checkbox);
		
		listbox.selectByValue("avatar");
		//listbox.selectByIndex(2);
		//listbox.selectByVisibleText("Avatar");
	    }}
		
	