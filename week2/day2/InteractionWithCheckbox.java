package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InteractionWithCheckbox {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box')])[1]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box')])[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
		String text = driver.findElement(By.className("ui-growl-message")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//div[contains(@id,':ajaxTriState')]")).click();
		String triStatetext=driver.findElement(By.className("ui-growl-message")).getText();
		System.out.println(triStatetext);

		Thread.sleep(4000);
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		String toggleText=driver.findElement(By.className("ui-growl-message")).getText();
		System.out.println(toggleText);
		Thread.sleep(4000);

		WebElement radioButton=driver.findElement(By.xpath("//span[contains(@class,'ui-state-disabled')]"));
		System.out.println(radioButton.isSelected());

		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'Paris')])[2]/preceding-sibling::div")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'Miami')])[2]/preceding-sibling::div")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'Rome')])[2]/preceding-sibling::div")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'Amsterdam')])[2]/preceding-sibling::div")).click();
		//driver.close();
	}

}
