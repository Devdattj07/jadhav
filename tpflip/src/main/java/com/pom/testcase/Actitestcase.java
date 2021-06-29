package com.pom.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitestcase {
	
	
	@FindBy (xpath="//input[@placeholder='Username']")
	public WebElement username;
	
	@FindBy (xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy (xpath="//*[text()='Login ']")
    public WebElement login;
	
	
	
	///////////////////////////////////////////////////////
	
	
	public Actitestcase (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	///////////////////////////////////////////////////////
	
	public void enterusername()
	{
		username.sendKeys("admin1");
	}
	
	public void enterpassword()
	{
		password.sendKeys("manage");
	}
	
	public void clicklogin()
	{
		login.click();
	}
	
	
	

}
