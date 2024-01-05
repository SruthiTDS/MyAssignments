package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeAssignmentUsingActionClassAmazon {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String firstPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(firstPrice);
		String ratings = driver.findElement(By.xpath("//span[@class='a-declarative']/following::span")).getText();
		System.out.println(ratings);
		
		WebElement findElement = driver.findElement(By.xpath("//img[@class='s-image']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(findElement).perform();
		findElement.click();
		
		Set<String> handles=driver.getWindowHandles();
		List<String> handlesList=new ArrayList<String>(handles);
		driver.switchTo().window(handlesList.get(1));
		File source=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/amz.png");
		FileUtils.copyFile(source, dest);
		driver.findElement(By.id("add-to-cart-button")).click();
		String cartTotal = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		if(firstPrice.contains(cartTotal)) {
			System.out.println("Correct product added to the cart");
		}
		
		
		
	}

}
