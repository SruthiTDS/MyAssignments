package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClassroomActivity {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert promptAlert=driver.switchTo().alert();
		//Get text for alert
		String alertMessage=promptAlert.getText();
		System.out.println(alertMessage);
		promptAlert.sendKeys("Sruthi");
		promptAlert.accept();
		String message=driver.findElement(By.id("confirm_result")).getText();
		System.out.println(message);
		if(message.contains("Sruthi")) {
			System.out.println("alert handled");
		}
		
	}

}
