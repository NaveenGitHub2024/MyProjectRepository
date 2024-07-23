package seleniumPracticePackage;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavascriptExecutorAssignment {

	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() {
		List<WebElement> a=driver.findElements(By.xpath("//p[text()='Partner With Us']/parent::div"));
		a.size();
		//Set<String>a1=driver.getWindowHandles();
		for(int i=0;i<a.size();i++) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[i].click();", a.get(i));
		}
	}
	
	
	@AfterTest
	public void afterTest() {
		//Thread.sleep(3000);
		driver.quit();
	}
}
