import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ULSS {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		WebElement bt = driver.findElement(By.xpath("//span[@class=\"no-rvi-message\"]"));
		js.executeScript("arguments[0].scrollIntoView()", bt);
		Screenshot.getscreenshot("backtotop", driver);
		driver.findElement(By.xpath("//span[contains(.,'Back to top')]")).click();
		Screenshot.getscreenshot("main", driver);
	}
}
