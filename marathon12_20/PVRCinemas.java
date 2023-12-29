package marathon12_20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("search-cities")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Chennai")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("nav-icon")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		Thread.sleep(3000);
		WebElement city=driver.findElement(By.name("city"));
		Select s=new Select(city);
		s.selectByValue("Hyderabad");
		Thread.sleep(2000);
		WebElement genre=driver.findElement(By.name("genre"));
		Select s2=new Select(genre);
		s2.selectByVisibleText("ANIMATION");
		
		WebElement lang=driver.findElement(By.name("lang"));
		Select s3=new Select(lang);
		s3.selectByIndex(1);
		
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted']/img")).click();
		
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Thread.sleep(2000);
		WebElement cinema=driver.findElement(By.id("cinemaName"));
		Select s4=new Select(cinema);
		s4.selectByIndex(1);
		
		driver.findElement(By.xpath("//span[@class='day-unit is-selected ng-star-inserted']")).click();
		
		
		

	}
}
