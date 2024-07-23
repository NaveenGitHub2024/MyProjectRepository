package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HighlightingElement {

	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	}
	
	@Test
	public void  highlightingElement() {
		driver.get("https://adactinhotelapp.com/index.php");
		WebElement ele=driver.findElement(By.id("username"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", ele);
		   
	}
	
	
	@AfterTest	
	public void afterTest() throws InterruptedException {	
		Thread.sleep(3000);
		driver.quit();
	}
}
