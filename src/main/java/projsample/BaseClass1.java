package projsample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

	public static WebDriver driver;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void urllaunch(String url) {
		driver.get(url);

	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void impwait(int time) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	public static void fillTextBox(WebElement e, String value) {

		e.sendKeys(value);
			
	}
	public static String getAttribute(WebElement e) {
		String text = e.getAttribute("value");
		return text;
		
	}
	public static void btnclick(WebElement e) {
		e.click();
	}
	public static void moveToElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e);
		
		
	}
	public static void dragAndDrop(WebElement e,WebElement u) {
		Actions a=new Actions(driver);
		a.dragAndDrop(e, u).perform();
	}
	public static void selectbyindex(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	public static WebElement findElement(String locatorname,String value) {
		WebElement e=null;
		if(locatorname.equals("id")){
		e=driver.findElement(By.id(value));
		} else if(locatorname.equals("name")) {
		e=driver.findElement(By.name(value));
	}else if(locatorname.equals("xpath")) {
		
	}
	return e;
		
		
	
		}	



		
		
}
