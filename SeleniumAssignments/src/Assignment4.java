import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter Browser Name");
		Scanner input = new Scanner(System.in);
		String Browser = input.nextLine();
		WebDriver driver = null;
		switch (Browser) {
		case "chrome":
			driver = new ChromeDriver();
			Thread.sleep(2000);
	    	 driver.quit();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			Thread.sleep(2000);
	    	 driver.quit();
			break;
		case "edge":
			driver = new EdgeDriver();
			Thread.sleep(2000);
	    	 driver.quit();
			break;
		default : System.out.println("Invalid entry");	

		}

	}

}
