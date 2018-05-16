package com.qa.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pom.qa.base.Test_Base;
import pom.qa.pages.*;

public class ProductOneCheckoutSteps extends Test_Base {

	public HomePage homePage;
	public CoaxialCablePage coaxialCablePage;
	public CoaxialCableProductsPage coaxialCableProductsPage;
	public ViewBasketPage viewBasketPage;
	public CheckOutPage checkOutPage;
	public BatteryPage batteryPage;
	public BatteryProductPage batteryProductPage;
	public SearchProductPage searchProductPage;
	public AlphaResultPage alphaResultPage;

	@Given("^user is on HomePage$")
	public void user_is_on_HomePage() throws Throwable {
		Test_Base.initialization();
		homePage = new HomePage();
	}

	@Then("^user selects Product$")
	public void user_selects_Product() throws Throwable {
		coaxialCablePage = homePage.product_Selection();
	}

	@Then("^user clicks on Category$")
	public void user_clicks_on_Category() throws Throwable {
		coaxialCableProductsPage = coaxialCablePage.category_Selection();
	}

	@Then("^user clicks on Product and AddToBasket and ViewBasket$")
	public void user_clicks_on_Product_and_AddToBasket_and_ViewBasket() throws Throwable {
		viewBasketPage = coaxialCableProductsPage.product_Select();
	}

	@Then("^user ChecksoutSecurely with Guest Login$")
	public void user_ChecksoutSecurely_with_Guest_Login() throws Throwable {
		checkOutPage = viewBasketPage.checkoutProduct();
	}

	@Then("^user lands on CheckoutPage$")
	public void user_lands_on_CheckoutPage() throws Throwable {
	}

	@Then("^user selects Product Batteries$")
	public void user_selects_Product_Batteries() throws Throwable {
		batteryPage = homePage.batteryProduct_Selection();
	}

	@Then("^user clicks on BatteryHydroMeters$")
	public void user_clicks_on_BatteryHydroMeters() throws Throwable {
		batteryProductPage = batteryPage.category_Selection();
	}

	@Then("^user clicks on GlassBatteryHydrometer and AddToBasket and ViewBasket$")
	public void user_clicks_on_GlassBatteryHydrometer_and_AddToBasket_and_ViewBasket() throws Throwable {
		viewBasketPage = batteryProductPage.product_Select();
	}

	@Given("^user is on RS HomePage$")
	public void user_is_on_RS_HomePage() throws Throwable {
		Test_Base.initialization();
		homePage = new HomePage();
	}

	@Then("^user enters value Wire and selects Alpha Wire$")
	public void user_enters_value_Wire_and_selects_Alpha_Wire() throws Throwable {
		searchProductPage = homePage.searchProductOne();
	}

	@Then("^user is Alpha Wire Result Page$")
	public void user_is_Alpha_Wire_Result_Page() throws Throwable {

	}

	@Then("^user enters value Connectors and clicks on search button$")
	public void user_enters_value_Connectors_and_clicks_on_search_button() throws Throwable {
		searchProductPage = homePage.searchProductTwo();
	}

	@Then("^user lands on Connectors Result Page$")
	public void user_lands_on_Connectors_Result_Page() throws Throwable {

	}

	@Then("^user enters value Wire and selects RS Pro Black$")
	public void user_enters_value_Wire_and_selects_RS_Pro_Black() throws Throwable {
		searchProductPage = homePage.searchProductThree();
	}

	@Then("^user lands on RS Pro Black Result Page$")
	public void user_lands_on_RS_Pro_Black_Result_Page() throws Throwable {

	}

}
