package week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sruthi");
		driver.findElement(By.name("lastname")).sendKeys("thota");
		driver.findElement(By.name("reg_email__")).sendKeys("sruthi1@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Testing@124");

		WebElement dayDD = driver.findElement(By.id("day"));
		Select s=new Select(dayDD);
		s.selectByIndex(5);

		WebElement monthDD = driver.findElement(By.id("month"));
		Select s1=new Select(monthDD);
		s1.selectByVisibleText("Feb");

		WebElement yearDD = driver.findElement(By.id("year"));
		Select s2=new Select(yearDD);
		s2.selectByValue("1994");

		driver.findElement(By.xpath("//input[@value='1']")).click();



	}

}
