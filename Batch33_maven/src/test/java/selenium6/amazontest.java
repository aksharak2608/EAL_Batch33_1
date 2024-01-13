package selenium6;

import org.testng.annotations.Test;

import Amazon_Pages.HomePage;
import helper.utilis;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class amazontest {
	static WebDriver driver;
  @Test
  public void f() {
	  HomePage ob= new HomePage(driver);
	  ob.Booktodaydeal();
  }
  @BeforeClass
  public void beforeClass() {
	  driver=utilis.Ibrowser("chrome", "https://www.Amazon.com/");
	  entercapcha();
	  driver.findElement(By.xpath("//a[@id='nav-logo-sprites' or @id='nav-bb-logo']")).click();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
public static void entercapcha(WebDriver driver)
{
	By ele=By.xpath("//a[@id='nav-logo-sprites' or @id='nav-bb-logo']");
	WebDriverWait w= new WebDriverWait(driver, Duration.ofMinutes(2));
	w.until(ExpectedConditions.visibilityOfElementLocated(ele));
}
  
  
}
