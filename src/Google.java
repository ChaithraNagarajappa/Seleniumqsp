import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);
		WebElement java = driver.findElement(By.xpath("//div[@class=\"kno-ecr-pt kno-fb-ctx PZPZlf gsmt\"]/span"));
		Actions a = new Actions(driver);
		a.doubleClick(java).perform();
		
	}

}
