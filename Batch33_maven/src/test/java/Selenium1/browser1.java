package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser1 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\EAI\\workspace\\Batch33_maven\\webdriver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	System.out.println(driver.getWindowHandle());
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().to("https://www.selenium.dev/");
	System.out.println(driver.getWindowHandle());
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	String title=driver.getTitle();
	String url= driver.getCurrentUrl();
	System.out.println(url);
	//System.out.println(driver.getPageSource());
	System.out.println(title);
	driver.close();
	}

}
