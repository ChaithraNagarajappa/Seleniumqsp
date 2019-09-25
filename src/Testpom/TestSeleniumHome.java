package Testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.pom.SeleniumHome;

public class TestSeleniumHome {

	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org");
		SeleniumHome sh = new SeleniumHome(driver);
		sh.sendText("java");
		sh.goClick();
		driver.navigate().back();
		sh.clearText();
		sh.sendText("selenium");
		sh.goClick();
		
		
	}
}
