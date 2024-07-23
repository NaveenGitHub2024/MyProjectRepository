package seleniumPracticePackage;

import org.bouncycastle.est.jcajce.JsseDefaultHostnameAuthorizer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScriptExecutorPractice {
	
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.get("https://www.pepperfry.com/?gad_source=1&gclid=EAIaIQobChMI-oWup4X9hAMVZ6hmAh3HZgNEEAAYASAAEgLoxfD_BwE");
		driver.manage().window().maximize();
	}
		@Test
		public void JS() {
			WebElement e=driver.findElement(By.xpath("//a[contains(text(),'Become a Franchisee')]"));
			JavascriptExecutor JS =	((JavascriptExecutor)driver);
			//JS.executeScript("arguments[0].click;", e);
			JS.executeScript("arguments[0].click();", e);
			System.out.println("test is" + e);
		}
		
	@AfterTest	
	public void afterTest() throws InterruptedException {	
		Thread.sleep(3000);
		driver.quit();
	}
	
	
}
