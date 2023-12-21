package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("democsr");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infy");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sruthi");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("TDS");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Durga");
	driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Dept");
	driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Enter some description");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sruthi@gmail.com");
	
	WebElement stateDD=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select s=new Select(stateDD);
	s.selectByVisibleText("Texas");
	
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Edit")).click();
	
	driver.findElement(By.id("updateLeadForm_description")).clear();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Description Cleared");
	
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	System.out.println(driver.getTitle());
	
	
}
}
