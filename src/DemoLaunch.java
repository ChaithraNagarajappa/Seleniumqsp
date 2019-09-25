import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		//driver.navigate().to("https://www.facebook.com");
		/*
		 * driver.close(); 
		 * driver.quit();
		 */
	
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
