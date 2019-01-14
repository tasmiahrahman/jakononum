package home.com;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static ChromeDriver dr;
	
	@BeforeClass
	public static void open() throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
			dr = new ChromeDriver();
			dr.manage().window().maximize();
			
	}


	@AfterClass
	public static void close() throws InterruptedException {
		Thread.sleep(2000);
		dr.quit();
	}
}
