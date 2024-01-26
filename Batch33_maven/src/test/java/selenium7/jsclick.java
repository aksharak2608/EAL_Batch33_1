package selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import helper.utilis;
import helper.utils1;

public class jsclick extends utils1{
	
	
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(5000);
	  String curl=driver.getCurrentUrl();
	  System.out.println(curl);
	  
	  //hard assertion the execution stops here
	 // Assert.assertEquals(curl, "https://www.google.com/sd", "wrong url launched");
	  
	  SoftAssert sk= new SoftAssert();
	 sk.assertEquals(curl, "https://www.google.com/sd", "wrong url launched");
	  
		WebElement ele= driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		ele.sendKeys("hello");
		WebElement button=driver.findElement(By.xpath("(//input[@value='Google Search'][@name='btnK'])[2]"));

		JavascriptExecutor je= (JavascriptExecutor)driver;
		je.executeScript("arguments[0].click()", button);
		Thread.sleep(5000);
	//	je.executeScript("window.scrollBy(0,500)");
	//	WebElement scrollele=driver.findElement(By.xpath("//h3[text()='Hello! - Super Simple Songs']"));
		
	//	je.executeScript("arguments[0].scrollIntoView(true)", scrollele);
  
  
 
}
}