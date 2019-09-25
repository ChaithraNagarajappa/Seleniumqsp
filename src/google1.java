import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google1 {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Java");
	List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/descendant::li"));
		
		  for(WebElement i : suggestions) 
		  { 
			  System.out.println(i.getText()); 
		  }
		 suggestions.get(3).click();
		 driver.close();
		 
}
}
