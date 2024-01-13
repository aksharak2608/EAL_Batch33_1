package Selenium5;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.utilis;

public class JSclick {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException
	{
		driver=utilis.Ibrowser("chrome", "https://www.google.com/");
		WebElement ele= driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		ele.sendKeys("hello");
		WebElement button=driver.findElement(By.xpath("(//input[@value='Google Search'][@name='btnK'])[2]"));
//	utilis.WaitForElemnetVisibility(button);
	//button.click();
		JavascriptExecutor je= (JavascriptExecutor)driver;
		je.executeScript("arguments[0].click()", button);
		Thread.sleep(5000);
	//	je.executeScript("window.scrollBy(0,500)");
		WebElement scrollele=driver.findElement(By.xpath("//h3[text()='Hello! - Super Simple Songs']"));
		
		je.executeScript("arguments[0].scrollIntoView(true)", scrollele);
		
	}
	

}
