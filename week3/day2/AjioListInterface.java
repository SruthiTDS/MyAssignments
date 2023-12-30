package week3.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioListInterface extends CommonXpathForList {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String itemsFound=driver.findElement(By.xpath("//div[@class='length']")).getText();

		System.out.println(itemsFound);

		driver.findElement(By.xpath("//span[@aria-label='brands']")).click();

		driver.findElement(By.id("verticalsizegroupformat-brand")).click();

		CommonXpathForList c=new CommonXpathForList();
		c.commonMethod("//span[@class='facet-list-title-name']",driver);

		driver.findElement(By.id("closeBtn")).click();

		Thread.sleep(3000);
		c.commonMethod("//div[@class='nameCls']", driver);


	}

}
