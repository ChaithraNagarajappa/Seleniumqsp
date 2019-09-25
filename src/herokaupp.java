import javax.swing.Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class herokaupp {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

	}
public static void main(String[] args) {
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");//username and password(admin:admin) passing for authentication pop-up
	
	
	
}

}
