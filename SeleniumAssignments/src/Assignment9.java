import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment9 {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/\r\n" + "");
		driver.manage().window().maximize();
	}

	@Test
	public void assignmentMethod() throws InterruptedException {
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		Iterator<String> it = allWindowIds.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			// validation

			if (driver.getTitle().equalsIgnoreCase("Selenium Live Project: FREE Real Time Project for Practice")) {
				break;
			}

		}
		Thread.sleep(3000);
		List<WebElement> courses = driver.findElements(By.xpath("//div[@style='margin: 18px 0 8px 0 !important;']"));
		System.out.println(courses.size());
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i).getText());
		}
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
