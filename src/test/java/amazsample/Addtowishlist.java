package amazsample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import projsample.BaseClass1;

public class Addtowishlist  extends BaseClass1{
	
	
	public Addtowishlist  () {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addtocart;
	
	public WebElement getAddtocart() {
		System.out.println("--------done1");
		System.out.println("--------done2");
		System.out.println("--------done3");
		System.out.println("--------done4");
		return addtocart;
	}

	
	

}
