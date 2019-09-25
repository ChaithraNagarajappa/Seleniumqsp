package Testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.selenium.pom.FlipkartHome;

public class TestFlipkartHome {

	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}
	public static void main(String[] args) {
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		FlipkartHome fh = new FlipkartHome(driver);
		Actions a = new Actions(driver);
	fh.clickclose();
	 fh.Electronicsmouse(a);
	
	
	}
}
