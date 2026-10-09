package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.automationwithpiyush.com/locators.html");

		WebElement id = driver.findElement(By.cssSelector("#employee-id-input"));
		id.sendKeys("12345");

		WebElement status = driver.findElement(By.cssSelector(".verify-status-btn"));
		status.click();

		WebElement targetA = driver.findElement(By.cssSelector(".parent-wrapper > .target-child"));

		WebElement access = driver.findElement(By.cssSelector("input[data-role = 'admin-access']"));
		access.sendKeys("12345");

		Thread.sleep(3000);

		driver.quit();

	}

}
