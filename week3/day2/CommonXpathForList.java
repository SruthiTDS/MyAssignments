package week3.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonXpathForList {
	public void commonMethod(String xpath,ChromeDriver driver) {
		List<WebElement>list=driver.findElements(By.xpath(xpath));
		List<String> str = new ArrayList<String>();
		for (WebElement each : list) {
			String text = each.getText();
			str.add(text);
		}
		System.out.println(str);


	}





}
