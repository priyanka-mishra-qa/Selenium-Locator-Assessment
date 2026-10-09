package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoreLocators {
	public static void main(String[] args)

			throws InterruptedException

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.automationwithpiyush.com/locators.html");

		WebElement username = driver.findElement(By.id("user_login_field"));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.name("security_passphrase"));
		password.sendKeys("Abc@123");

		WebElement submit = driver.findElement(By.className("submit_btn"));
		submit.click();

		WebElement reset = driver.findElement(By.linkText("Reset Password"));
		reset.click();

		WebElement logout = driver.findElement(By.partialLinkText("Logout"));
		logout.click();

		Thread.sleep(3000);

		driver.quit();

	}
}
