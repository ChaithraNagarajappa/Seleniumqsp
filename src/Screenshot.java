import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshot {
	
	

	public static void getscreenshot(WebDriver driver, String name) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File ff = new File("./Screenshot/"+name+".png");
		Files.copy(ss, ff);
		
	}

	
}
