package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonListUsingSelenium {

	public static void main(String[] args) throws InterruptedException {
		//find the total number of links associated in this page
		
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://www.amazon.in/");

		//to maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus Mobiles",Keys.ENTER);
		
		List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<Integer> str = new ArrayList<Integer>();
		for (WebElement each : allPrices) {
			String text = each.getText();
			String replaceString=text.replaceAll(",", "");
			int mobilePrice=Integer.parseInt(replaceString);
			str.add(mobilePrice);
		}
		
		//to sort the list
		
		Collections.sort(str);
		System.out.println(str);
		//System.out.println(Collections.min(str));
		System.out.println("Lowest price"+ " " +str.get(0));
		
		
        
		
		
		
		

	}

}