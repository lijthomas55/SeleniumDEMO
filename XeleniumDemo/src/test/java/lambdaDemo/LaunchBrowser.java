package lambdaDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser 
{
	@Test
	public void testGoogle()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://bespoke-scone-ba3a56.netlify.app/");
		String title = driver.getTitle();
		assert(title.equals(""));
		//System.out.println(title);
		driver.quit();
	}
	/*
	@Test
	public void testWalmart()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com/");
		String title = driver.getTitle();
		assert(title.equals("Walmart | Rolling back prices since 1999."));
		//System.out.println(title);
		driver.quit();
	}*/
}