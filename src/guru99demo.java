import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99demo {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

	}
public static void main(String[] args) throws IOException {
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
driver.get("http://demo.guru99.com/test/upload");
driver.findElement(By.name("uploadfile_0")).click();
		/*
		 * Runtime rt=Runtime.getRuntime();
		 * rt.exec("C:\\Users\\DELL\\Desktop\\autoit.exe");
		 */
Runtime.getRuntime().exec("C:\\\\Users\\\\DELL\\\\Desktop\\\\autoit.exe");
driver.findElement(By.id("terms")).click();
driver.findElement(By.id("submitbutton")).click();


	

}
}
