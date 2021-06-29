package pom.testclass;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class FirstTest extends BaseClass {
	  @Test
	    public void search() {
	        driver.findElement(By.name("q")).sendKeys("Applied Selenium");
	        driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).click();
	        
	        
	        
	    }
	    
	    
	    //Deliberately fail the test case
	    @Test
	    public void feelingLucky() {
	    	 Assert.fail();
	        Assert.fail();
	    }

}

