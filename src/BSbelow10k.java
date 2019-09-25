import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BSbelow10k {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		WebElement rings = driver.findElement(By.xpath("//a[contains(.,\"Rings \")]"));
		Actions a = new Actions(driver);
		a.moveToElement(rings).perform();
		driver.findElement(By.xpath("//span[contains(.,\"Starting at Rs. 7,400/-\")]/parent::a[contains(.,\"Diamond Rings\")]")).click();
		WebElement price = driver.findElement(By.xpath("//span/span[contains(.,\"Price\")]"));
		a.moveToElement(price).perform();
		driver.findElement(By.xpath("//span[@data-displayname=\"below rs 10000\"]")).click();
		driver.findElement(By.xpath("//img[@alt=\"The Roslyn Ring\"]")).click();
		driver.findElement(By.id("buy-now")).click();
		Thread.sleep(2000);
		WebElement err = driver.findElement(By.xpath("//div[@class=\"formErrorContent\"]"));
		System.out.println(err.getText());
		driver.close();
	}
}
