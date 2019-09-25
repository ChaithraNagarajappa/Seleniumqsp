import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =  new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("C# book",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"_3ywJNQ\"]/div[contains(.,\"Low to High\")]")).click();
		List<WebElement> ratings = driver.findElements(By.xpath("//div[@class=\"hGSR34\"]"));
		double maxrate=0;
		for (WebElement i : ratings) {
			String no = i.getText();
			double dno = Double.parseDouble(no);
			if(maxrate<dno) {
				maxrate=dno;
			}
		}
		System.out.println(maxrate);
		driver.findElement(By.xpath("//div[@class=\"hGSR34\"][contains(.,\""+ maxrate +"\")]"));
			
		}
	}
	



