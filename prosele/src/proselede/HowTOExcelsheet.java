package proselede;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowTOExcelsheet {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		
			    XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream("C:\\Users\\user\\Desktop\\data.xlsx"));
	    
	    XSSFSheet shit=wb.getSheet("Sheet1");
//	  
//	  int rowNum=shit.getLastRowNum();
//	  System.out.println("index of last row"+ rowNum);
//	  
//	  int colNum=shit.getRow(0).getLastCellNum();
//	  System.out.println("index of last "+colNum);
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.navigate().to("http://localhost/login.do");
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	
			 for (int i=1;i<=5;i++)
	               {
				 
				  String user=shit.getRow(i).getCell(0).toString();
				  String pass=shit.getRow(i).getCell(1).toString();
//				  System.out.println(user+" ");
//				  System.out.println(pass+" ");
  			  System.out.println(user);
  			  System.out.println(pass);
  			  
				  WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
				  WebElement password=driver.findElement(By.xpath("//*[@type='password']"));
				  username.sendKeys(user);
				  password.sendKeys(pass);
			
				driver.findElement(By.xpath("//*[text()='Login ']")).click();
			Thread.sleep(2000);
			
			if(driver.getCurrentUrl().contains("http://localhost/user/submit_tt.do"))
				{
					driver.findElement(By.xpath("//a[@class='logout']")).click();
					System.out.println("log in test pass");
				}
				else
				{
					System.out.println("fail test case");
					
				}
	  }
	
			  }}
			 
	  
	  
	  
	
	
//	  WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
//	  WebElement password=driver.findElement(By.xpath("//*[@type='password']"));
//	  WebElement button=driver.findElemen(By.xpath("//*[text()='Login ']"));
//	  
//	  username.sendKeys(user);
//	  password.sendKeys(pass);
//	  
//	  
	


