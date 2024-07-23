package seleniumPracticePackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Screenshot2 {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	}
	
	@Test
	public void screenShot() throws IOException {
	WebElement element =driver.findElement(By.xpath("//img[@src='img/ios-button.png']"));
	File ss=element.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ss, new File(System.getProperty("user.dir")+"//.png"));
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
}
