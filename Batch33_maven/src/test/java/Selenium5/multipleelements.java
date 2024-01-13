package Selenium5;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.utilis;

public class multipleelements {
	static WebDriver driver;
	public static void main(String args[])
	{
		driver=utilis.Ibrowser("chrome", "https://www.amazon.in/");
		
		List<WebElement> All_links= driver.findElements(By.xpath("//a"));
		System.out.println(All_links.size());
		Iterator<WebElement> itr= All_links.iterator();
		while(itr.hasNext())
		{
			WebElement ele=itr.next();
			System.out.println(ele.getText());
			System.out.println(ele.getAttribute("href"));
		}
	}
	

}
