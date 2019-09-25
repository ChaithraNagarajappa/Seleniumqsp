import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Facebook {

	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		/*
		 * WebElement email = driver.findElement(By.id("email"));
		 * email.sendKeys("Chaitra"); WebElement pass
		 * =driver.findElement(By.id("pass")); pass.sendKeys("1234"); WebElement login
		 * =driver.findElement(By.id("loginbutton")); login.click();//input[@type="email"]
		 */
		
		/* driver.findElement(By.linkText("Forgotten account?")).click(); */
		
		//driver.findElement(By.xpath( "//input[@type='email']")).sendKeys("chaithra");
		//driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("1234");
		//driver.findElement(By.xpath(" //label[@for='u_0_a']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//label[@for='u_0_a']"));
		Actions a =  new Actions(driver);
		a.contextClick(ele);
		
		
		Screenshot.getscreenshot("fb",driver);
		
	}
	
}
