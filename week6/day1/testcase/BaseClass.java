package week6.day1.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	public ChromeDriver driver;
	
	@BeforeSuite
	public void startReport() {
		System.out.println("Report Started");
	}
	
	@BeforeTest
	public void setValues() {
		System.out.println("Values are set");
	}
	
	@BeforeClass
	public void assignDetails() {
		System.out.println("assign details");
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

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@AfterSuite
	public void stopReport() {
		System.out.println("Stop Report");
	}

}
