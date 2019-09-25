import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder {

	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

	}

	public static void main(String[] args)
			throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		int row = 0;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@data-gaaction=\"popup.auth.close\"]")).click();
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		for (WebElement item : menu) {
			System.err.println(item.getText());
			String name = item.getText();
			a.moveToElement(item).perform();
			poi.storeValue("Sheet2", row, 0, name);
			row++;
			Thread.sleep(2000);
			List<WebElement> submenu = driver.findElements(
					By.xpath("//span[contains(.,'" + name + "')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			Thread.sleep(2000);
			for (WebElement subitem : submenu) {
				System.out.println(subitem.getText());
				Screenshot.getscreenshot(name, driver);
				poi.storeValue("Sheet2", row, 0, subitem.getText());
				row++;
			}
		}

	}
}
