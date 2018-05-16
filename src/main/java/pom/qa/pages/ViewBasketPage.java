package pom.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.qa.base.Test_Base;
import pom.qa.util.RS_Test_Util;

public class ViewBasketPage extends Test_Base {

	@FindBy(xpath="//div[@id='shoppingBasketForm:BottomCheckoutPunchoutNavigationWidgetActionNAVTOPDIVId']//descendant::span[@id='checkoutSecurelyAndPuchBtn']")
	WebElement btnCheckout;
	
	@FindBy(id="guestCheckoutForm:GuestWidgetAction_emailAddress_decorate:GuestWidgetAction_emailAddress")
	WebElement emailAddress;
	
	@FindBy(id="guestCheckoutForm:guestCheckout")
	WebElement btnGuestCheckout;
	
	public ViewBasketPage() {
		PageFactory.initElements(driver, this);
	}
	
	public CheckOutPage checkoutProduct() {
		RS_Test_Util.clickByJS(btnCheckout, driver);
		RS_Test_Util.check_popup_CheckoutPage();
		emailAddress.sendKeys(prop.getProperty("email"));
		RS_Test_Util.check_popup_CheckoutPage();
		btnGuestCheckout.click();		
		return new CheckOutPage();		
	}
}
