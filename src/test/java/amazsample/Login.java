package amazsample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import projsample.BaseClass1;

public class Login extends BaseClass1 {

	public Login  () {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[text()='Account & Lists']")
    private WebElement accountinfo;
	
	@FindAll({@FindBy(xpath="//input[@name='email']"),@FindBy(xpath="//input[@type='email']")})
	private WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signin;
	
	public WebElement getSignin() {
		return signin;
	}

	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath="//span[@id='continue']")
	private WebElement continuebtn;

	public WebElement getAccountinfo() {
		return accountinfo;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	
	
}
