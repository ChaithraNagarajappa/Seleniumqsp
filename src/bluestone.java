import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestone {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com");
	WebElement aj = driver.findElement(By.xpath("//a[contains(.,'All Jewellery ')]"));
	Actions a = new Actions(driver);
	a.moveToElement(aj).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(.,'Kadas')]")).click();
	driver.findElement(By.id("pid_5675")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("buy-now")).click();
	WebElement err = driver.findElement(By.xpath("//div[@class=\"formErrorContent\"]"));
	System.out.println(err.getText());
}
}
