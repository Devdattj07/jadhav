package pom.testclass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pom.testcase.Actitestcase;

public class Actitestclass {
	WebDriver driver;
	Actitestcase log;
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
	
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
    }
	
	@Test
	public void test()
	{
	    log=new Actitestcase(driver);
		log.enterusername();
		log.enterpassword();
		log.clicklogin();
		
		
		//////Assertion url
		String url=driver.getCurrentUrl();
//		System.out.println(url);
		String expectedurl="http://localhost/logindeva.do";
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	//	assertEquals(url, expectedurl);
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//		WebElement text=driver.findElement(By.xpath("//*[text()='Username or Password is invalid. Please try again.123']"));
//		String r=text.getText();
//		Assert.assertTrue(r.contains("Username or Password is invalid. Please try again."));
		//String exspectedtxt="Username or Password is invalid. Please try again.";
		
     System.out.println("test ");
       /// txt
//       String actualString = driver.findElement(By.xpath("xpath")).getText();
//       Assert.assertTrue(actualString.contains("specific text"));
	
		/////////////////////////////////////////////////
		// softassert
		///////////////////////////////////////////////
		
     
	SoftAssert softassert=new SoftAssert();
	//softassert.equals(url.contains(expectedurl));
	
	
//	softassert.assertEquals(url, expectedurl);
	
	
	//Assert.assertEquals(url, expectedurl);
		if(url==expectedurl)
		{
			
			System.out.println();
		}
		else
		{

			driver.close();
			System.out.println("test fail");
		}
		
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("hello");
	}
	
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	

}
