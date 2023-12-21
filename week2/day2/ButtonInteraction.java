package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
public class ButtonInteraction {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='card']/button/span")).click();
		String title=driver.getTitle();
		System.out.println(title.equals("Dashboard"));
		driver.navigate().back();
		boolean disabled=driver.findElement(By.xpath("//div[@class='card']/following::span")).isEnabled();
		System.out.println(disabled);
		//position of the button
		System.out.println(driver.findElement(By.xpath("(//div[@class='card'])[3]/button")).getLocation());
		//background color of the button
		System.out.println(driver.findElement(By.xpath("(//div[@class='card'])[3]/following::button")).getCssValue("background"));
		
		System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[2]/parent::button")).getSize());
		
		//driver.close();
		//socket errors
		
		
	}

}
