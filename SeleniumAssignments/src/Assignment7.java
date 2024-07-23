import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment7 {

	WebDriver driver;
	@Test(priority=1)
	public void beforeMethod() {
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/ ");
	}
	
	@Test(priority=2)
	public void Method() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']")).click();
		driver.findElement(By.xpath("//div[@id='product-list']"));
		List<WebElement> list=	driver.findElements(By.xpath("//div[@class='product-thumb']"));
		System.out.println(list.size());
	}
	
	@Test(priority=3)
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}	

