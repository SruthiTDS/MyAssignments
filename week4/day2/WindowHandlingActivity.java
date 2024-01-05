package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingActivity {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("FLIGHTS")).click();
		//driver.findElement(By.xpath("//a[contains(text(),' FLIGHTS')]")).click();
		Set<String> handles=driver.getWindowHandles();
		List<String> handlesList=new ArrayList<String>(handles);
		driver.switchTo().window(handlesList.get(1));
		String title=driver.getTitle();
		System.out.println(title);
		driver.switchTo().window(handlesList.get(0));
		driver.close();
	}

}
