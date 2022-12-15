package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckOutPage extends TestBase{
	
	@FindBy(css="ul > li")
	WebElement itemList;
	
	@FindBy(xpath="//button[contains(text(), 'Checkout')]")
	WebElement checkOutCartBtn;
	
	public CheckOutPage() {
		
		PageFactory.initElements(driver, this);
	}
	public boolean isItemListed() {
		return itemList.isDisplayed();
	}
//	
//	public void selectItem() {
//			item.click();
//			
		

	public void checkout() {
		checkOutCartBtn.click();
	

}

}
