package pom.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pom.qa.base.Test_Base;

public class RS_Test_Util extends Test_Base{

	public static int page_Load_Timeout =20;
	public static int implicit_wait =20;
	
	public static void scroll_Vertical() {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,1000)");
	}
			
	public static void clickByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);		
	}
	
	public static void check_popup_CheckoutPage() {	
		if(driver.findElements(By.xpath("//div[@id='acsMainInvite']//descendant::a[@title='No, thanks']")).size()!= 0)
		{			
			driver.findElement(By.xpath("//div[@id='acsMainInvite']//descendant::a[@title='No, thanks']")).click();
		}
	}
}
