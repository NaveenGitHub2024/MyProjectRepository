import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		String Browser;
		System.out.println("Enter Name of the Broswer");
		Scanner input=new Scanner(System.in);
	    Browser=input.nextLine();
	    WebDriver driver=null;
	    if(Browser.equalsIgnoreCase("Chrome")){
	    	 driver=new ChromeDriver();
	    	 Thread.sleep(2000);
	    	 driver.quit();
	    }
	    else if(Browser.equalsIgnoreCase("FireFox")){
	    		 driver=new FirefoxDriver();
	    		 Thread.sleep(2000);
		    	 driver.quit();
	    	 }
	    else if(Browser.equalsIgnoreCase("Edge")) {
	    	driver=new EdgeDriver();
	    	 Thread.sleep(2000);
	    	 driver.quit();
	    	
	    }
	    else {
	    	System.out.println("Not Exists");
	    }
		

	}

}
