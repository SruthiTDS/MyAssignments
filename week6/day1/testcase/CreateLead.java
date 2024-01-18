package week6.day1.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	@DataProvider
	public String[][] sendData(){
		String[][] data=new String[2][4];

		data[0][0]="QA";
		data[0][1]="Sruthi";
		data[0][2]="T";
		data[0][3]="91";

		data[1][0]="QE";
		data[1][1]="TDS Sruthi";
		data[1][2]="P";
		data[1][3]="92";
		return data;
	}

	@Test(dataProvider="sendData")
	public void CreateLeadTestCase(String cName,String fName,String lName,String phNo) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		//driver.close();


	}

}
