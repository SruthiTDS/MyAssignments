package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHomeAssignmentPractice {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert alert=driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		String text2 = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text2);
		if(text2.contains("successfully")) {
			System.out.println("alert handled");
		}
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		String text3 = alert.getText();
		System.out.println(text3);
		alert.dismiss();
		String text4 = driver.findElement(By.id("result")).getText();
		if((text4.toLowerCase().contains("cancel"))) {
			System.out.println("confirm alert handled");
			
		}
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		driver.findElement(By.xpath("(//a[@aria-label='Close'])[2]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		String text5 = alert.getText();
		System.out.println(text5);
		alert.sendKeys("Enter sruthi");
		alert.accept();
		String message=driver.findElement(By.id("confirm_result")).getText();
		System.out.println(message);
		if(message.contains("sruthi")) {
			System.out.println("prompt alert handled");
		}
		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='No']")).click();
		
		
	}

}
