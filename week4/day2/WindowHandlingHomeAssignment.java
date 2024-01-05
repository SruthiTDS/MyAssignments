package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingHomeAssignment {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdFrom']/following::a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles=new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(handles.get(0));
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']/following::a")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> handles1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(handles1.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		
		driver.switchTo().window(handles1.get(0));
		
		driver.findElement(By.linkText("Merge")).click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.getTitle());
		
	}

}
