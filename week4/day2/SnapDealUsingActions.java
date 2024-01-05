package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealUsingActions { 
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement findElement = driver.findElement(By.xpath("//span[@class='labelIcon']/following-sibling::span"));
		Actions builder=new Actions(driver);
		builder.moveToElement(findElement).perform();
		WebElement findElement2 = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		builder.moveToElement(findElement2).perform();
		findElement2.click();
		String countOfShoes = driver.findElement(By.xpath("//div[text()='Sports Shoes for Men']/following-sibling::div")).getText();
		System.out.println(countOfShoes);

		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();



		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click();

		Thread.sleep(4000);
		List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class=\"lfloat marR10\"]/span/following-sibling::span"));
		List<Integer> price=new ArrayList<Integer>();
		for(WebElement each:allPrices) {
			String p=each.getText();
			String replaceString=p.replaceAll("[^0-9]", "");
			int trainingShoePrice=Integer.parseInt(replaceString);
			price.add(trainingShoePrice);
		}
		System.out.println(price);


		List<Integer> price1=new ArrayList<Integer>();

		Collections.sort(price);
		price1.addAll(price);

		if(price1.equals(price)) {
			System.out.println("Sorted");
		}
		else {
			System.out.println("Not Sorted");
		}

		driver.findElement(By.xpath("//input[@class='input-filter']")).sendKeys("500");
		driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).sendKeys("700");
		driver.findElement(By.xpath("//div[@class='filter-inner filter-inner-height']/div/label")).click();

		Thread.sleep(2000);
		WebElement findElement3 = driver.findElement(By.xpath("//img[contains(@class,'product-image')]"));

		builder.moveToElement(findElement3).perform();

		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();

		String originalPrice = driver.findElement(By.className("strikee")).getText();

		System.out.println("originalPrice:"+" "+originalPrice);

		String discountPrice = driver.findElement(By.className("payBlkBig")).getText();

		System.out.println("discountPrice:"+" "+discountPrice);
		
		File source=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/nyka.png");
		FileUtils.copyFile(source, dest);

	}
}
