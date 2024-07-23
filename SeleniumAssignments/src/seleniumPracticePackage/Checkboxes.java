package seleniumPracticePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Checkboxes {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
	}

	@Test
	public void test() {
		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//td[@class='table5']/descendant::input[@type='checkbox'] "));
		WebElement element = driver.findElement(By.xpath("//input[@value='Butter']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		for (int i = 0; i < checkboxes.size(); i++) {
			if (checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
		}
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
	}

	@Test(priority = 2)
	public void test2() {
		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//td[@class='table5']/descendant::input[@type='checkbox'] "));
		WebElement element = driver.findElement(By.xpath("//input[@value='Butter']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		for (int i = 0; i < checkboxes.size(); i++) {
			if (!checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
		}
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
