import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		System.out.println("=======================");
		Set<String> win = driver.getWindowHandles();
		/*
		 * win.remove(parent); 
		 * for(String name : win) { 
		 * vSystem.out.println(name);
		 * driver.switchTo().window(name); driver.close();
		 */
		ArrayList<String> a = new ArrayList<String>(win);
		//a.addAll(win);
		for (int i = a.size() - 1; i >= 0; i--) {
			System.out.println(a.get(i));
			driver.switchTo().window(a.get(i)).close();
		}

	}
}
