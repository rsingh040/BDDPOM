package stepDefs;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckOutPage;
import pages.HomePage;
import pages.SearchItemPage;

public class OrderStepDef extends TestBase{
	
	HomePage homePage;
	SearchItemPage searchItemPage;
	CheckOutPage checkOutPage;

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	   initialize();
	   System.out.println("User is on Home Page");
	}
	@When("User search an item {string}")
	public void user_search_an_item(String strItem) {
	    homePage = new HomePage();
	    searchItemPage = homePage.searchItem(strItem);
	    		
	}
		
	@Given("Item must be displayed")
	public void item_must_be_displayed() {
	    searchItemPage = new SearchItemPage();
		searchItemPage.isItemListed();
	}
	
	@When("User Add Item to Cart")
	public void user_add_item_to_cart() {
		searchItemPage = new SearchItemPage();
		searchItemPage.selectItem();
		searchItemPage.addToCart();
	}
	
	@Then("Item must be listed in cart")
	public void item_must_be_listed_in_cart() {
	
		checkOutPage = new CheckOutPage();
		checkOutPage.isItemListed();
		checkOutPage.checkout();
	}

}
