import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yupptv.com/");
		WebElement links = driver.findElement(By.xpath("//*[@id=\"accordion\"]/div/div[3]"));
		List<WebElement> alllinks=links.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for (int i = 0; i < alllinks.size(); i++) {
			System.out.println(alllinks.get(i).getText());
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
