package proselede;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hiddendivisionpop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech//practice//hidden-division-popup");
		
		WebElement cli= driver.findElement(By.xpath("//a[@href='#0']"));
		cli.click();
		
		WebElement value=driver.findElement(By.xpath("//input[@type='text']"));
		value.sendKeys("ok");
		
		
		WebElement close=driver.findElement(By.xpath("//button[@class='close']"));
		
		Thread.sleep(3000);
		Actions ss=new Actions(driver);
		ss.moveToElement(close).click().build().perform();
		
		
	}

}
