package marathon01_04;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TatacliqAssignment {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tatacliq.com");
		
		WebElement brands = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
		Actions builder =new Actions(driver);
		builder.moveToElement(brands).perform();
		
		WebElement watches = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		builder.moveToElement(watches).perform();
		
		WebElement firstOption = driver.findElement(By.xpath("(//div[@class='DesktopHeader__featureBrands']/div)[2]"));
		firstOption.click();
		
		WebElement selectDropdown = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		Select s=new Select(selectDropdown);
		s.selectByVisibleText("New Arrivals");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilCheckbox']")).click();
		
		Thread.sleep(4000);
		List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		
		List<Integer> price = new ArrayList<Integer>();
		for(WebElement each:allPrices) {
			String text = each.getText();
			String replaceString=text.replaceAll("[^a-zA-Z0-9]", "");
			int watchPrice=Integer.parseInt(replaceString);
			price.add(watchPrice);
		}
		
		System.out.println(price);
		
		
		driver.findElement(By.xpath("//div[@class='ProductModule__dummyDiv']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles=new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));
		String priceOfSelected = driver.findElement(By.xpath("//meta[@itemprop='priceValidUntil']/following-sibling::h3")).getText();
		String replacePriceString=priceOfSelected.replaceAll("[^0-9]", "");
		int priceOfSelectedWatch=Integer.parseInt(replacePriceString);
		System.out.println(priceOfSelectedWatch);
		if(price.get(0).equals(priceOfSelectedWatch)) {
			System.out.println("Same product selected");
		}
		driver.findElement(By.xpath("(//div[@class='Button__base'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("DesktopHeader__myBagShow")).click();
		Thread.sleep(4000);
		File source=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/cart.png");
		FileUtils.copyFile(source, dest);
		driver.close();
		//driver.switchTo().window(handles.get(0));
		//driver.close();
		
		
		
		
	}

}
