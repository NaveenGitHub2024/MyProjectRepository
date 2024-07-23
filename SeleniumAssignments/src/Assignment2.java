import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		/*
		 * WebElement day=driver.findElement(By.id("day")); Select s=new Select(day);
		 * s.selectByIndex(0); WebElement month=driver.findElement(By.id("month"));
		 * Thread.sleep(3000); s.selectByIndex(8); WebElement
		 * Year=driver.findElement(By.id("year")); Thread.sleep(3000);
		 * s.selectByIndex(25); Thread.sleep(5000);
		 */
		/*
		 * new Select(driver.findElement(By.id("day"))).selectByIndex(0); new
		 * Select(driver.findElement(By.id("month"))).selectByIndex(8); new
		 * Select(driver.findElement(By.id("year"))).selectByIndex(25);
		 * Thread.sleep(3000); driver.quit();
		 */
		/*
		 * new Select(driver.findElement(By.id("day"))).selectByValue("8"); new
		 * Select(driver.findElement(By.id("month"))).selectByValue("9"); new
		 * Select(driver.findElement(By.id("year"))).selectByValue("1999");
		 * Thread.sleep(3000); driver.quit();
		 */
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("1");
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Sep");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1999");
		Thread.sleep(3000);
		driver.quit();
	}

}
