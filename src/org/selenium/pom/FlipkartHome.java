package org.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHome {

	@FindBy(xpath = "//button[@class=\"_2AkmmA _29YdH8\"]")
	private WebElement closebutton;

	@FindBy(xpath = "//span[contains(.,'Electronic')]")
	private WebElement menu;
	@FindBy(xpath = "//a[@title=\"Mobiles\"]/parent::li/parent::ul/li/a[contains(.,'Mi')]")
	private WebElement mi;

	public FlipkartHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickclose() {

		closebutton.click();
	}

	public void Electronicsmouse(Actions a) {
		//Actions a = new Actions(driver);
		a.moveToElement(menu).perform();
	}
	
	public void miclick() {
		mi.click();
	}
	
	
}

