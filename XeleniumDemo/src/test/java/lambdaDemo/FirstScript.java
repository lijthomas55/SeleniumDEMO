package lambdaDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;
import java.util.concurrent.* ;

public class FirstScript {

   private static WebDriver driver = null;
	
	public static void main(String[] args)
	{

	        System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
        	driver = new ChromeDriver();
	        driver.get("https:\\www.triblive.com");
        	String myHeader = "";

	        List<WebElement> headlines = driver.findElements(By.className("headline"));

	        System.out.println(headlines.size());

	        for (WebElement webElement : headlines) 
		{
	            String name = webElement.getText();
        	    System.out.println(name);
	        }
        
	        myHeader = driver.findElement(By.xpath("//h2[@class='focus']")).getText();
        	System.out.println("myHeader is "+myHeader);
        
        
	}
	
	
}