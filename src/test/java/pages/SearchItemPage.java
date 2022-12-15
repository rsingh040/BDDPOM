package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchItemPage extends TestBase {

	
	@FindBy(css="ul > li.preview")
	WebElement item;
	
	@FindBy(xpath="//button[contains(text(), 'Add to cart')]")
	WebElement addtoCartBtn;
	
	public SearchItemPage() {
		
		PageFactory.initElements(driver, this);
	}
	public boolean isItemListed() {
		return item.isDisplayed();
	}
	
	public void selectItem() {
			item.click();
			
		
	}

	public void addToCart() {
	      addtoCartBtn.click();
	

}
}
