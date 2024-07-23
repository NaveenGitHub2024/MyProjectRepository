import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yupptv.com/");
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for(int i=0;i<alllinks.size();i++) {
			System.out.println(alllinks.get(i).getText());
		}
		driver.quit();
	}

}
