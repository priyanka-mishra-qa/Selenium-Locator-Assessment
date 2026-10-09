package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.automationwithpiyush.com/locators.html");

		driver.findElement(By.xpath("//p[text() = 'Navigation Point']"));

		WebElement query = driver.findElement(By.xpath("//input[@aria-label = 'search-query']"));
		query.sendKeys("Abcd");

		WebElement button = driver.findElement(By.xpath("//button[text() = 'Generate Report']"));
		button.click();

		WebElement contact = driver.findElement(By.xpath("//input [contains(@name,'contact_email')]"));
		contact.sendKeys("abcd@gmail.com");

		WebElement submit = driver.findElement(By.xpath("//button[contains(@class,'btn-submit-987654')]"));
		submit.click();

		WebElement select = driver.findElement(By.xpath("//input[@type = 'checkbox']/../../../tr[2]/td/input"));
		select.click();

		WebElement administrator = driver.findElement(By.xpath("//td[text() = 'Administrator']"));

		WebElement edit = driver.findElement(By.xpath("//button[@class = 'edit-btn']/../../../tr[2]/td/button"));
		edit.click();

		Thread.sleep(3000);

		driver.quit();

	}
}
