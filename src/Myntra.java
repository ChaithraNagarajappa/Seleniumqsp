import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class Myntra {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

	}
public static void main(String[] args) {
	ChromeOptions options =  new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver =  new ChromeDriver(options);
	driver.get("https://www.Myntra.com");
	driver.manage().window().maximize();
	
	
}

}
