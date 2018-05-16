package pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.qa.base.Test_Base;

public class BatteryPage extends Test_Base{
	@FindBy(linkText="Battery Hydrometers")
	WebElement battery_category;
	
	public BatteryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public BatteryProductPage category_Selection() {
		battery_category.click();
		return new BatteryProductPage();
	}
	
}
