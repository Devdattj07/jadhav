package proselede;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	
	public boolean  chechlist(String linkURL) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.google.com");
	//s=switch selenium focus to iframe
	return false;
	
	}}