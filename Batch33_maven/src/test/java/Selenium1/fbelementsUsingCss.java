package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbelementsUsingCss {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\EAI\\workspace\\Batch33_maven\\webdriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		
		WebElement username=driver.findElement(By.cssSelector("input#email"));
		username.sendKeys("akshara");
		WebElement password=driver.findElement(By.cssSelector("input._6luy._55r1._9npi"));
		password.sendKeys("abcd");
	
	
		
	}

}
