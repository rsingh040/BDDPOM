package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {

	@FindBy(name="searchbar")
	WebElement searchBox;
	
	@FindBy(id="button-search")
	WebElement searchBtn;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	@FindBy(id="signup")
	WebElement signUp;
	
	@FindBy(id="cart")
	WebElement cartBtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
//	Actions
//	logintoApp
//	signUp
//	viewcart
//	searchItem
//	
	public SearchItemPage searchItem(String strItem) {
		
		searchBox.sendKeys(strItem);
		searchBtn.click();
		return new SearchItemPage();
	}
	
	
	
}
