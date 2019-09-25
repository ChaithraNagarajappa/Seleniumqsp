import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pom {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	///driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.seleniumhq.org");
	WebElement search = driver.findElement(By.id("q"));
	search.sendKeys("java",Keys.ENTER);
	Thread.sleep(2000);
	driver.navigate().back();
	search.clear();
	search.sendKeys("Selenium", Keys.ENTER);
	
	
}	
}

