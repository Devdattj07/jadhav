package com.pom.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	
	@FindBy (xpath="//*[@class='_1_3w1N']")
	private WebElement loginbutton;
	
	@FindBy (xpath="(//input[@autocomplete='off'])[2]")
	private WebElement enteruser;
	
	@FindBy (xpath="(//input[@autocomplete='off'])[3]")
	private WebElement password;
	
	@FindBy (xpath="(//*[text()='Login'])[3]")
	private WebElement clicklogin;
	
	
	
	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clicklogbutton()
	{
		loginbutton.click();
	}
	
	
	public void enterusername()
	{
		enteruser.sendKeys("devajadhav07@gmail.com");
	}
	
	
	public void enterpass()
	{
		password.sendKeys("Devajadhav@123");
	}
	
	public void clickloginbutton()
	{
		clicklogin.click();
	}
	
	

}
