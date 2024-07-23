package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JSpractice {
	
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	}
	
	@Test
	public void  JS() throws InterruptedException{
		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,10);");
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		WebElement element=driver.findElement(By.xpath("//img[@src='img/google-play.png']"));
		//js.executeScript("arguments[0].scrollToView();", element);
		js.executeScript("arguments[0].scrollIntoView();", element);
		//"arguments[0].scrollIntoView();", element
	}
	
	
	@AfterTest	
	public void afterTest() throws InterruptedException {	
		Thread.sleep(3000);
		driver.quit();
	}

}
