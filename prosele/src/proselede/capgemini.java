package proselede;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class capgemini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		boolean status=js.executeScript("return document.readyState", args).equals("complete");
		if(status)
		{
			System.out.println("page is loaded completed");
		}
		else
		{
			System.out.println("page is not cpmpleted");
		}
	}

}
