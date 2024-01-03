package week2.day2;

import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
public class RadioButton {
	public static void main(String[] args) throws SocketException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[text()='Firefox']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div")).click();
		boolean button=driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div")).isSelected();
		System.out.println(button);
		driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div")).click();
		boolean button1=driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div")).isSelected();
		System.out.println(button1);
		//System.out.println(driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div")).isDisplayed());
		//System.out.println(driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div")).isEnabled());
		String b=driver.findElement(By.xpath("(//div[contains(@class,'ui-state-active')])[5]/following::label")).getText();
		System.out.println(b);
		boolean age=driver.findElement(By.xpath("(//div[contains(@class,'ui-state-active')])[5]")).isSelected();
		//Always displaying false for isSelected need to check
		System.out.println(age);
		driver.close();
		
		
		
	}

}
