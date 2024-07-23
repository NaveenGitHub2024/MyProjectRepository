package seleniumPracticePackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitsConceptPractice {

	WebDriver driver;

	@BeforeMethod

	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void javaScriptTest() throws IOException {

		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(60));
		 mywait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//img[@alt='Cookware & dining']"))));
		WebElement element = mywait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Cookware & dining']")));
		element.click();

	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		//Thread.sleep(3000);
		driver.quit();
	}

}
