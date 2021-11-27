package amazsample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import projsample.BaseClass1;

public class Product extends BaseClass1 {
	public Product() {
		PageFactory.initElements(driver, this);
		
	}
	

	@CacheLookup
	@FindBys({@FindBy(xpath="//input[@name='field-keywords']"), @FindBy(xpath="//input[@id='twotabsearchtextbox']") })
	private WebElement search;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement search1;
	
	@FindBy(xpath="//span[text()='OnePlus Nord CE 5G (Charcoal Ink, 8GB RAM, 128GB Storage)']")
	private WebElement product;

	
	
	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearch1() {
		return search1;
	}

	public WebElement getProduct() {
		return product;
	}
	
}
