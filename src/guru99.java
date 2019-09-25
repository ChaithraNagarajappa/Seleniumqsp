import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class guru99 {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

	}

public static void main(String[] args) {
	//ChromeOptions options =  new ChromeOptions();
	//options.addArguments("--disable-notifications");
	WebDriver driver =  new ChromeDriver();
	driver.get("http://demo.guru99.com/v1/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.name("btnLogin")).click();
	
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	System.out.println(a.getClass());//a is an object returning from remotealert class 
	
}
}
