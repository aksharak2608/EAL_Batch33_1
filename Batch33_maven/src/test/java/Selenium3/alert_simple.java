package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_simple {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","D:\\EAI\\workspace\\Batch33_maven\\webdriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement simplealert=driver.findElement(By.xpath("//button[@id='alertButton']"));
		simplealert.click();
		String alerttest=driver.switchTo().alert().getText();
		System.out.println(alerttest);
		driver.switchTo().alert().accept();
		
	}

}
