package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elect {

	
		
		

			
			@FindBy (xpath="(//div[@class='xtXmba'])[5]")
			private WebElement electronnic;
			
			@FindBy (xpath="(//div[@class='xtXmba'])[5]")
			private WebElement lap;

			@FindBy (xpath="(//div[@class='_3XS_gI']//a)[2]")
			private WebElement laptop;
			public WebElement electronic1;

			
			
			
			///////////////////////////////////////////////////
			
			public void Electonics (WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			///////////////////////////////////////////////////////

//			public void actions1()
		//	
//			{
		//
//				 aaa=new Actions (driver);
		//
//			    aaa.moveToElement(electronnic).perform();
		//
//				aaa.moveToElement(lap).perform();
//				
		//	
//				aaa.moveToElement(laptop).click().build().perform();
//				
//				
//				
//			}
			
			public void electronic1()
			{
				electronnic.sendKeys("(//div[@class='xtXmba'])[5]");
			}
			
			public void lap1()
			{
				lap.sendKeys("(//div[@class='xtXmba'])[5]");
			}
			
			public void laptop1()
			{
				laptop.sendKeys("(//div[@class='_3XS_gI']//a)[2]");
			}
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


