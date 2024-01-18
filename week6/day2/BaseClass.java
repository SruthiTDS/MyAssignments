package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass extends ReadExcelIntegration {
	public ChromeDriver driver;
	String filename;
	
	@DataProvider
	public String[][] sendData() throws IOException{
		return ReadExcelIntegration.ReadExcel(filename);
	}
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url,String username,String pwd) {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	
	

}
