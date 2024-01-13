package Selenium5;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.utilis;

public class calenderwithjs {
	static WebDriver driver;
	public static void main(String args[])
	{
		driver=utilis.Ibrowser("chrome", "https://www.hyrtutorials.com/p/calendar-practice.html");
		//12/20/2023
		WebElement cal=driver.findElement(By.xpath("//input[@id='first_date_picker']"));
		cal.click();
		String input="12/29/2023";
		
		enterdatebyjs(driver, cal, input);
		
		utilis.scrollToPageDown(driver);
		
		
		
		}
	
	public static void enterdatebyjs(WebDriver driver, WebElement ele, String dvale)
	{

		JavascriptExecutor je= (JavascriptExecutor)driver;
		je.executeScript("arguments[0].setAttribute('value','"+dvale+"')", ele);
	}
	}
	
