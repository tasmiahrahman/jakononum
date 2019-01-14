package home.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {

	ChromeDriver dr;

	Common(ChromeDriver dr) {// Constructor of Common class.
		this.dr = dr;
	}
	
	public void myGet(String url) throws InterruptedException {
		dr.get(url);

		Thread.sleep(1000);

	}
	public WebElement clickAndType(WebElement ele) {// return type

		return ele;
	}
	public boolean verifyElementDisplay(By by) {

		boolean j = dr.findElement(by).isDisplayed();
		return j;
	}

}
