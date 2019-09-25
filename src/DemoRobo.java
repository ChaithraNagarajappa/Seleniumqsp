import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRobo {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

	}
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T);
	r.keyPress(KeyEvent.VK_T);
	r.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_N);
	r.keyPress(KeyEvent.VK_N);
	r.keyPress(KeyEvent.VK_CONTROL);
	
	
	
}
}
