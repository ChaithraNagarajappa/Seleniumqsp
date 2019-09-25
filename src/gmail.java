import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		driver.findElement(By.name("identifier")).sendKeys("Chaithra.ramachandran9@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.id("passwordNext")).click();

	}

}
