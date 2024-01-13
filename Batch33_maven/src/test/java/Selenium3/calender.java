package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","D:\\EAI\\workspace\\Batch33_maven\\webdriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.expedia.com/");
		
		WebElement cal=driver.findElement(By.xpath("//button[@name='EGDSDateRange-date-selector-trigger']"));
		cal.click();
		Thread.sleep(4000);
		WebElement date=driver.findElement(By.xpath("//div[@class='uitk-month uitk-month-double uitk-month-double-left']//descendant::div[text()='21']"));
		
		date.click();
	
		WebElement done= driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-layout-flex-item']"));
		done.click();
		
	}

}
