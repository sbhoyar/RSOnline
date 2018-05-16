package pom.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.qa.base.Test_Base;

public class HomePage extends Test_Base {

	@FindBy(xpath = "//*[@title='All Products']")
	WebElement allProducts;

	@FindBy(linkText = "Cables & Wires")
	WebElement menu_Item;

	@FindBy(linkText = "Coaxial Cable")
	WebElement sub_Menu_Item;

	@FindBy(xpath = "//*[@title='All Products']")
	WebElement productsMenu;

	@FindBy(linkText = "Batteries")
	WebElement battery_menu_Item;

	@FindBy(linkText = "Automotive Battery Maintenance")
	WebElement battery_sub_Menu_Item;

	@FindBy(xpath = "//input[@id='searchTerm']")
	WebElement searchTextBox;

	@FindBy(xpath = "//ul[@id='txtHint']//li")
	List<WebElement> searchList;

	@FindBy(xpath = "//ul[@id='topProdsList']//li")
	List<WebElement> searchTopProductList;

	@FindBy(id = "btnSearch")
	WebElement btnSearch;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public CoaxialCablePage product_Selection() {
		allProducts.click();
		Actions action = new Actions(driver);
		action.moveToElement(menu_Item).build().perform();
		sub_Menu_Item.click();
		return new CoaxialCablePage();
	}

	public BatteryPage batteryProduct_Selection() {
		productsMenu.click();
		Actions action = new Actions(driver);
		action.moveToElement(battery_menu_Item).build().perform();
		battery_sub_Menu_Item.click();
		return new BatteryPage();
	}

	public SearchProductPage searchProductOne() {
		searchTextBox.sendKeys("Wire");
		List<WebElement> listSearchBox = searchList;
		for (int i = 0; i < listSearchBox.size(); i++) {
			if (listSearchBox.get(i).getText().contains("Alpha")) {
				listSearchBox.get(i).click();
				break;
			}
		}
		return new SearchProductPage();
	}

	public SearchProductPage searchProductTwo() {
		searchTextBox.sendKeys("Connectors");
		btnSearch.click();

		return new SearchProductPage();
	}

	public SearchProductPage searchProductThree() {
		searchTextBox.sendKeys("Wire");
		List<WebElement> listSearchBox = searchTopProductList;
		for (int i = 0; i < listSearchBox.size(); i++) {
			if (listSearchBox.get(i).getText()
					.contains("RS Pro Black, 100m PVC BS4808 Equipment Wire, 0.5 mm² CSA , 1 kV 20 AWG")) {
				listSearchBox.get(i).click();
				break;
			}
		}
		return new SearchProductPage();
	}
}
