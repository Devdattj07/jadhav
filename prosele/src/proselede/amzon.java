package proselede;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amzon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		Actions cli=new Actions(driver);
		
		WebElement dd=driver.findElement(By.xpath("//span[text()='Prime']"));
		
		cli.moveToElement(dd).perform();
		
		WebElement ss=driver.findElement(By.xpath("//img[@alt='Join prime now']"));
		ss.click();
		


		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//		
//		Actions action = new Actions(driver);
//		WebElement Prime = driver.findElement(By.xpath("// a[@id ='nav-link-prime']"));
//		action.moveToElement(Prime).perform();
//		
		
		
		
		
		
	}

}
