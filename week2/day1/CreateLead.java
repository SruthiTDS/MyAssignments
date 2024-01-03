package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
	
		ChromeDriver driver = new ChromeDriver();
		
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to get the current window title
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//enter username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//click Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//click leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//click createlead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//enter firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		
		//enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
				
		//click source dropdown
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select sec = new Select(sourceDD);
	    //select cold call option from source dd
	    sec.selectByIndex(1);
	    
	    //click Industry dd
	    WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
	    Select sec1 = new Select(industryDD);
	    sec1.selectByVisibleText("Finance");
	    driver.close();
	    
	}
}
	   
