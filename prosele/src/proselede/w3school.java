package proselede;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3school {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		List<WebElement> all= driver.findElements(By.xpath("//a[@target='_blank']"));
		
		
		
		all.get(19).click();
		all.get(20).click();
		all.get(21).click();
		
		driver.getCurrentUrl();
		
	}

}
