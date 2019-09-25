import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleNext {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);

		List<WebElement> nav = driver.findElements(By.xpath("//table[@id=\"nav\"]/descendant::td"));// 1/2

		for (int i = 0; i <= nav.size(); i++) {//can be done using iterator also

			driver.findElement(By.xpath("//a[@class=\"pn\"]/span[contains(.,'Next')]")).click();

		}

	}

}
