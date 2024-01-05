package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NykaAutomateUsingActions {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder=new Actions(driver);
		Thread.sleep(4000);
		builder.moveToElement(brand).perform();
		Thread.sleep(4000);
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris",Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='scroller-container']//a")).click();
		//Not able to proceed nyka website blocked while doing automation
	}

}
