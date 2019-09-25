import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jquery {
	
		static {
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		}
		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.jqueryui.com/slider");
			WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
			driver.switchTo().frame(frame);
			WebElement source = driver.findElement(By.id("slider"));
			Actions a = new Actions(driver);
			a.dragAndDropBy(source, 0, 200).perform();
			a.doubleClick(source).perform();
			
			
		}
	}
	


