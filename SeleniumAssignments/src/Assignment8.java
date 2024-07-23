import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment8 {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		driver=new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
	}
	@Test
	public void method() throws InterruptedException {
	Actions action = new Actions(driver);
	Thread.sleep(3000);
	action.dragAndDropBy(driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]")), 80, 0).perform();
	Thread.sleep(3000);
	action.dragAndDropBy(driver.findElement(By.xpath("//span[@style='left: 26.6667%;']")), 150, 0).perform();
	Thread.sleep(3000);
	//action.scrollToElement(driver.findElement(By.xpath("(//span[@style='left: 66.6667%;']")));
	Thread.sleep(3000);
	action.dragAndDropBy(driver.findElement(By.xpath("(//span[@style='left: 66.6667%;']")), -108, 0).perform();
	Thread.sleep(3000);
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	
}
