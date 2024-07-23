import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment10 {
	
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr266311nbv");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678@");
		Thread.sleep(3000);
		driver.findElement(By.name("btnLogin")).click();
//		try{
//			driver.findElement(By.xpath("//*[contains(@viewBox,'0 0 48 48')]")).click();
//		}
//		catch(Exception e){
//			System.out.println(e.getMessage());
//		}
		try{
			driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(text(),'Delete Customer')])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("cusid")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.name("AccSubmit")).click();
		Alert al=driver.switchTo().alert();
		Assert.assertEquals(al.getText(),"Do you really want to delete this Customer?" );
		al.accept();
		Alert ab=driver.switchTo().alert();
		Assert.assertEquals(ab.getText(),"Customer does not exist!!");
		al.accept();
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
	//	driver.quit();
	}

}
