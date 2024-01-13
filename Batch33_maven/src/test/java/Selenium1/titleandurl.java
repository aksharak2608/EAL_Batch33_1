package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titleandurl {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\EAI\\workspace\\Batch33_maven\\webdriver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	String actualtitle=driver.getTitle();
	if(actualtitle.equals("Google1"))
	{
		System.out.println("title matched");
	}
	else
	{
		System.out.println("title not matched");
	}
	
	String actualurl=driver.getCurrentUrl();
	if(actualurl.equals("https://www.google.com/"))
	{
		System.out.println("url matched");
	}
	else
	{
		System.out.println("url not matched");
	}
	driver.manage().window().fullscreen();
	}
}
