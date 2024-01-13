package selenium6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helper.utilis;

public class jsclick2 {
	static WebDriver driver;
	
	
  @Test
  public void f() throws InterruptedException {
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
  @Test
  public void f1() throws InterruptedException {
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
  @AfterMethod
  public void afterm()
  {
	  driver.close();
  }
  
  @BeforeClass
	public void beforet() {
		  driver=utilis.Ibrowser("chrome", "https://www.google.com/");
	}
}
