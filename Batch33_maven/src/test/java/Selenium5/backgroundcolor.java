package Selenium5;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.utilis;

public class backgroundcolor {
	static WebDriver driver;
	public static void main(String args[])
	{
		driver=utilis.Ibrowser("chrome", "https://www.amazon.in/");
		
		WebElement ele=driver.findElement(By.xpath("//h2[text()='Makeup products']"));
		utilis.WaitForElemnetVisibility(ele);
	
		
		utilis.borderElement(driver, ele);
		
		
	}
	

}
