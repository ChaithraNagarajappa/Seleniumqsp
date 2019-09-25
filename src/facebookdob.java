import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookdob {

	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement day = driver.findElement(By.id("day"));
		Select s= new Select(day);
		s.selectByValue("20");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByValue("7");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByValue("1989");
		List<WebElement> days = s.getOptions();
		for(WebElement d: days) {
			System.out.println(d.getText());
		}
		List<WebElement> monthv = s1.getOptions();
		for(WebElement m: monthv) {
			System.out.println(m.getText());
		}
		List<WebElement> yearv = s2.getOptions();
		for(WebElement y: yearv) {
			System.out.println(y.getText());
		}
	}
}
