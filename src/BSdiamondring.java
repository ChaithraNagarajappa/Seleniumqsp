import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BSdiamondring {

	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		WebElement rings = driver.findElement(By.xpath("//a[contains(.,\"Rings \")]"));
		Actions a = new Actions(driver);
		a.moveToElement(rings).perform();
		driver.findElement(By.xpath("//span[contains(.,\"Starting at Rs. 7,400/-\")]/parent::a[contains(.,\"Diamond Rings\")]")).click();
		WebElement price = driver.findElement(By.xpath("//span/span[contains(.,\"Price\")]"));
		a.moveToElement(price).perform();
		System.out.println(price.getText());
		List<WebElement> prices = driver.findElements(By.xpath("//section[@id=\"Price-form\"]/descendant::span[@class=\"prcs-dlh\"]"));
		for(WebElement item:prices) {
			System.out.println(item.getText());
		}
		
	}
}
