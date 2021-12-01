package amazsample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import projsample.BaseClass1;


public class Addtocart extends BaseClass1{
	public void emp() {
		
		System.out.println("test1");
		
	}
	
	
	public Addtocart  () {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addtocart;
	
	public WebElement getAddtocart() {
		return addtocart;
	}

	
	

}
