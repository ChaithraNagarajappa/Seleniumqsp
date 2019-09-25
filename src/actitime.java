import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actitime {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//div[@class=\"popup_menu_button popup_menu_button_support\"]/div")).click();
		driver.findElement(By.xpath("//li[contains(.,\"About your actiTIME\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("aboutPopupCloseButtonId")).click();
		/*
		 * WebDriverWait ww= new WebDriverWait(driver, 10);
		 * ww.until(ExpectedConditions.titleContains("Enter Time"));
		 * driver.findElement(By.id("logoutLink")).click();
		 */
	}
}
