package seleniumassignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SELECTDOB {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.id("day")).sendKeys("01");
		driver.findElement(By.id("month")).sendKeys("September");
		driver.findElement(By.id("year")).sendKeys("1999");
		Thread.sleep(3000);
		
	}

}
