package seleniumPracticePackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Screenshot {
	
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/\r\n" + "");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Screenshot() throws IOException {
		Date d=new Date();
		String pattern= "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat SimpleDateFormat=new SimpleDateFormat(pattern); 
		String date=SimpleDateFormat.format(d);
		date=date.replace(":", "-");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("C:\\Users\\durga\\Pictures\\SeleniumPractice\\Screenshot1"+date+".png")); //for storing screeenshot in Laptop
		FileUtils.copyFile(src,new File(System.getProperty("user.dir")+"\\"+date+".png")); //for storing screenshot in eclipse
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
