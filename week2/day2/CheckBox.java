package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {
    public static void main(String[] args) {
    	
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/checkbox.xhtml");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        String checkboxXpath = "//h5[text()='Tri State Checkbox']/following::div[contains(@class,'ui-chkbox-box')]";
        String messageXpath = "//div[@class='ui-growl-message']//p";
        for (int i = 1; i <= 3; i++) {
            driver.findElement(By.xpath(checkboxXpath)).click();
            try {
                WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(messageXpath)));
                System.out.println("Message after click " + i + ": " + messageElement.getText());
            } catch (StaleElementReferenceException e) {
                WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(messageXpath)));
                System.out.println("Message after click " + i + ": " + messageElement.getText());
            }
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(messageXpath)));
        }
        driver.quit();
    }
}