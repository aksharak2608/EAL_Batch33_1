package selenium6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import helper.utilis;

public class amazonecapc {
	public static WebDriver driver;
  @Test
  public void f() throws InterruptedException {
driver=utilis.Ibrowser("chrome", "https://www.amazon.in/");
	  amazontest.entercapcha(driver);
WebElement amazonicon= driver.findElement(By.xpath("//a[@id='nav-logo-sprites' or @id='nav-bb-logo']"));
//(//div[@class='glow-toaster-footer']//span)[1]

WebDriverWait w= new WebDriverWait(driver,Duration.ofMinutes(3));
w.until(ExpectedConditions.visibilityOf(amazonicon));
JavascriptExecutor je= (JavascriptExecutor)driver;
je.executeScript("arguments[0].click()", amazonicon);

Thread.sleep(1000);

driver.findElement(By.xpath("//*[text()=\"Today's Deals\"]")).click();

	  
  }
}
