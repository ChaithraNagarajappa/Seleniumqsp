import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BSkada {
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
		driver.findElement(By.xpath("//span/span[contains(.,\" Select Size \")]")).click();
		driver.findElement(By.xpath("//li[@data-key=\"02\"]")).click();
		//Select s = new Select(size);
		//s.selectByValue("02");
		driver.findElement(By.id("buy-now")).click();
		driver.close();
		
	}

}
