import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =  new ChromeDriver();
	//driver.manage().window().maximize();
driver.get("https://www.seleniumhq.org");
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,700)");//move y axis --window.scrollBy is javascript code copied from console
//Thread.sleep(10000);
//js.executeScript("window.scrollBy(1000,0)");//move x axis
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//move y-axis to the end of it 
//Thread.sleep(10000);
//js.executeScript("window.scrollTo(document.body.scrollWidth,0)");//move x axis to the end
WebElement ele = driver.findElement(By.xpath("//h2[contains(.,\"Selenium News\")]"));
js.executeScript("arguments[0].scrollIntoView()", ele);//scrolling down till a web element position

}
}
