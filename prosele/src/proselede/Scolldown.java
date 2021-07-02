package proselede;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scolldown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		JavascriptExecutor scroll=((JavascriptExecutor)driver);
		
		scroll.executeScript("window.scrollBy(0,900)");
		
		WebElement help=driver.findElement(By.xpath("(//a[contains(@href,'/gp/help/customer')])[6]"));
		
		scroll.executeScript("arguments[0].scrollIntoView(true);",help);
		
		
		
		
		
		
	}

}
