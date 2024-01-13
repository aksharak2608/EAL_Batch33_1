package selenium4;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\EAI\\workspace\\Batch33_maven\\webdriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		 
		WebElement Today_deals=driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		WaitForElemnet(Today_deals);
		Actions ac= new Actions(driver);
	ac.keyDown(Keys.CONTROL).build().perform();
	Today_deals.click();
	Today_deals.click();
	ac.keyUp(Keys.CONTROL).build().perform();
		String current_sessionid=driver.getWindowHandle();
		System.out.println(current_sessionid);
		Set<String> multiple_window=driver.getWindowHandles();
		System.out.println(multiple_window.size());
		Iterator<String> itr=multiple_window.iterator();
	//	Thread.sleep(8000);
		while(itr.hasNext())
		{
		String sessionid=itr.next();
		System.out.println(sessionid);
		if(!current_sessionid.equalsIgnoreCase(sessionid)) {
		driver.switchTo().window(sessionid);
		}
		}
		//Thread.sleep(8000);
		driver.switchTo().window(current_sessionid);

	}
	
	static void WaitForElemnet(WebElement ele)
	{
		 WebDriverWait wl= new WebDriverWait(driver,Duration.ofMillis(0));
			wl.until(ExpectedConditions.visibilityOf(ele));
	}
	
}
