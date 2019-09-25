
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class facebookdemo {

	WebDriver driver;

	
	  @BeforeClass
	  public void loadUrl() {
	  System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	
	  
	  }
	 
	@Test
	public void login1() {
		driver.findElement(By.id("email")).sendKeys("abc.xyz@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("sds");
		driver.findElement(By.id("u_0_b")).click();
	}

	/*
	 * @BeforeMethod public void launch() throws InterruptedException {
	 * System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	 * 
	 * }
	 */
	@Test
	public void login2() {
		driver.findElement(By.id("email")).sendKeys("abc.xyz@yahoo.com");
		driver.findElement(By.id("u_0_b")).click();
	}

	@Test
	public void login3() {
		driver.findElement(By.id("pass")).sendKeys("sds");
		driver.findElement(By.id("u_0_b")).click();
	}

	@Test
	public void login4() {
		driver.findElement(By.id("u_0_b")).click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
