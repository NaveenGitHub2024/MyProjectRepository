package seleniumPracticePackage;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablePractice01 {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void webTablePractice01() {
		WebElement table = driver.findElement(By.xpath("//table[@class='zebra fw tb-theme']/tbody"));
		List<WebElement> allrows = table.findElements(By.tagName("tr"));

		for (WebElement rows : allrows) {
			List<WebElement> allColumns = rows.findElements(By.tagName("td"));
			for (WebElement columns : allColumns) {
				System.out.print(columns.getText()+ "  ");
			}
			System.out.println();
		}

	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
