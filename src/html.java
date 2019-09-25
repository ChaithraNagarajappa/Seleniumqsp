import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class html {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/DELL/Desktop/code.html");
	WebElement ele = driver.findElement(By.id("b"));
	Select s = new Select(ele);
	List<WebElement> blist = s.getOptions();
	for(WebElement i :blist) {
		System.out.println(i.getText());
	}
	if(s.isMultiple()) {
		for (int i = 0; i < blist.size(); i++) {
			//s.selectByIndex(i);
			s.selectByValue(blist.get(i).getText());
			
		}
	}
	System.out.println(s.getFirstSelectedOption().getText());
	s.deselectAll();
}

}
