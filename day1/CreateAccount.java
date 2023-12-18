package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Sruthi");
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select s=new Select(industryDD);
		s.selectByIndex(4);
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select s1=new Select(ownershipDD);
		s1.selectByVisibleText("S-Corporation");
		
		WebElement sourceDD=driver.findElement(By.id("dataSourceId"));
		Select s2=new Select(sourceDD);
		s2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaignDD = driver.findElement(By.id("marketingCampaignId"));
		Select s3=new Select(marketingCampaignDD);
		s3.selectByIndex(6);
		
		WebElement stateDD=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select s4=new Select(stateDD);
		s4.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String text=driver.findElement(By.xpath("(//table[@class='fourColumnForm']/tbody/tr/td)[2]/span")).getText();
		System.out.println(text);
		
		
	}

}
