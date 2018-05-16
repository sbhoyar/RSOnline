package pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.qa.base.Test_Base;

public class CoaxialCablePage extends Test_Base{

	@FindBy(linkText="Coaxial Cable")
	WebElement category;
	
	@FindBy(xpath="//span[contains(text(),'See the range here')]")
	WebElement range;
	
	
	public CoaxialCablePage() {
		PageFactory.initElements(driver, this);
	}
	
	public CoaxialCableProductsPage category_Selection() {
		category.click();
		range.click();
		return new CoaxialCableProductsPage();
	}
}
