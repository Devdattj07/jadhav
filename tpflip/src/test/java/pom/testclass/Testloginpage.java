package pom.testclass;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.verifier.exc.VerificationException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pom.testcase.Loginpage;

import jdk.internal.org.jline.utils.Log;

public class Testloginpage {
	WebDriver driver;
	Loginpage singin;
	WebElement deva;
	WebElement singout;
	Actions aa;
	
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
//	
//	@BeforeMethod
//	public void beforemethod()
//	{
//		
//		
//	}
	
	

	@Test(dataProvider="driverTest") 
	public void testloginj(String user,String pass) throws InterruptedException 
	{
	
//	    singin=new Loginpage(driver);
//		//singin.clicklogbutton();
		//singin.enterusername();
	//	singin.enterpass();
	
	    Thread.sleep(1000);
//		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys(user);
//		try {
//		    assertEquals(driver.findElement( By.xpath("(//input[@autocomplete='off'])[2]")).getText(), "Invalid UserID or Password Entered");
//
//		    //If the message is displayed
//
//		    System.out.println("PASS");
//
//		} catch (Exception e) {
//
//		    //If the message is not displayed
//
//		    System.out.println("FAIL");
//
//		 
//		}
//		driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys(pass);
	
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
//         
//		/	
        SoftAssert softassert = new SoftAssert();
        Reporter.log("Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com", true);
        String expectedTitle = "Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com";
        String originalTitle = driver.getTitle();
       
        softassert.assertEquals(originalTitle, expectedTitle);
		
	
		
	   // singin.clickloginbutton();
		//System.out.println(user+pass);
		
		
	
		}
	

	@DataProvider(name="driverTest")
	public Object [][] getData()
	{
			//
		Object[][] data= {{"devajadhav07@gmail.com","Devajadhav@123"},{"devajadhav07@gmail.com","Devajadhav@123"},{"deva","jadhav"},{"devajadhav07@gmail.com","Devajadhav@123"}};
		return data;		
	}
	
	
	
   	
   @AfterMethod 
   public void aftermethod() throws InterruptedException
   {   
   	Thread.sleep(3000);
   	
   	 deva=driver.findElement(By.xpath("(//*[@class='exehdJ'])[1]"));
      
   	
   
       aa=new Actions (driver);
       
       aa.moveToElement(deva).perform();
       Thread.sleep(3000);
       singout=driver.findElement(By.xpath("(//div[@class='_3vhnxf'])[10]"));
        singout.click();
   	
//   	
//       Thread.sleep(3000);
//   	WebElement userd=driver.findElement(By.xpath("(//*[@class='_1psGvi _3BvnxG'])[1]"));
//   	aa=new Actions (driver);	
//   	aa.moveToElement(userd).perform();
//   	
// 
	
   	
   }
   
	@AfterClass
	public void afterclass()
	
	{
		driver.close();
		
	}
	
}
