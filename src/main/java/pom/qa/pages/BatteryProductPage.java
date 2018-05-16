package pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.qa.base.Test_Base;
import pom.qa.util.RS_Test_Util;

public class BatteryProductPage extends Test_Base{

	@FindBy(linkText="Glass Battery Hydrometer")
	WebElement product;
	
	@FindBy(xpath="//button[@class='btn btn-primary-red btn-large btn-add-to-basket']")
	WebElement btnAddToBasket;
	
	@FindBy(xpath="//button[@class='btn btn-secondary-blue btn-large nav-view-cart ']")
	WebElement btnViewCart;
	
	public BatteryProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	public ViewBasketPage product_Select() {
		RS_Test_Util.clickByJS(product, driver);
		RS_Test_Util.clickByJS(btnAddToBasket, driver);
		RS_Test_Util.scroll_Vertical();
		RS_Test_Util.clickByJS(btnViewCart, driver);
		return new ViewBasketPage();
		
	}
}
