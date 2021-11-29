package amazsample;

import java.util.Set;

import projsample.BaseClass1;

public class Mainpage extends BaseClass1 {

	public static void main(String[] args) {
		browserLaunch();
		urllaunch("https://www.amazon.in/");
		impwait(20);
		maximize();

		Login lg = new Login();
		lg.getAccountinfo().click();
		lg.getEmail().sendKeys("keerthina75@gmail.com");
		lg.getContinuebtn().click();
		lg.getPassword().sendKeys("986442312");
		lg.getSignin().click();

		Product pr = new Product();
		pr.getSearch().sendKeys("1+ mobile");
		pr.getSearch1().click();
		pr.getProduct().click();

		String parentid = driver.getWindowHandle();
		System.out.println(parentid);

		Set<String> allid = driver.getWindowHandles();
		System.out.println(allid);

		for (String eachid : allid) {
			if (!parentid.equals(eachid)) {
				driver.switchTo().window(eachid);
			}
		}

		Addtocart add = new Addtocart();
		add.getAddtocart().click();
		System.out.println("Sample");
		System.out.println("new code");
		System.out.println("Sample");
		System.out.println("new code");
		System.out.println("Sample");
		System.out.println("new code");

	}

}
