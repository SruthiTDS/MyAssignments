package marathon12_20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
public class Abhibus {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String fromStation="Chennai";
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys(fromStation);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='collection-item auto-complete-list-item ']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='collection-item auto-complete-list-item ']")).click();
		driver.findElement(By.xpath("//a[text()='Tomorrow']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(2000);
		String result=driver.findElement(By.xpath("(//h5[@class='title'])[1]")).getText();
		System.out.println(result);
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		String seatsAvaiable=driver.findElement(By.xpath("(//div[@class='text-grey'])[1]")).getText();
		System.out.println(seatsAvaiable);
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='seat sleeper']")).click();
		driver.findElement(By.xpath("//div[@id='place-container']/div/div/following::input")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'primary')])[2]")).click();
		String seatSelected=driver.findElement(By.xpath("//div[@id='seating-selected-seat-details']/span")).getText();
		
		System.out.println(seatSelected);
		String fare=driver.findElement(By.xpath("(//span[@class='text-primary'])[2]")).getText();
		System.out.println("Fare:"+" "+fare);
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
	
	
	}

}
