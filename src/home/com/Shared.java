package home.com;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shared {
	ChromeDriver dr;

	Shared(ChromeDriver dr) {
		this.dr = dr;
	}
	@After
	public void blueFly() throws InterruptedException {
		
		Common c= new Common(dr);
		c.myGet("https://www.bluefly.com/");
		c.clickAndType(dr.findElement(By.xpath(".//*[@id='vesitem-1121881539498754385086637']/a/span[1]"))).click();
		c.clickAndType(dr.findElement(By.xpath(".//*[@id='vesitem-1121881539498754385086637']/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div[1]/a/span"))).click();
		c.dr.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		c.clickAndType(dr.findElement(By.xpath(".//*[@id='maincontent']/div[3]/div[1]/div[4]/ol/li[1]/div/div[2]/h2/a"))).click();
		c.clickAndType(dr.findElement(By.id("keelo-item-842"))).click();
		Thread.sleep(4000);
		c.dr.findElement(By.id("product-addtocart-button")).click();
		//c.clickAndType(dr.findElement(By.xpath(".//*[@=id'product-addtocart-button']"))).click();
		//c.clickAndType(dr.findElement(By.cssSelector("#product-addtocart-button"))).click();
		//c.clickAndType(dr.findElements(By.id("")).get(0)).getAttribute("product-addtocart-button");
	}
}
