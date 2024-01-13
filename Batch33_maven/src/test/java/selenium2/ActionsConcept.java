package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcept {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\EAI\\workspace\\Batch33_maven\\webdriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement CNA= driver.findElement(By.xpath("//a[@role='button' and @class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		
		
		Actions act= new Actions(driver);
		//act.click(CNA);
		
		act.moveToElement(CNA).click().build().perform();
		Thread.sleep(3000);
		//act.contextClick().build().perform();
		
		WebElement fn= driver.findElement(By.xpath("//input[starts-with(@name,'firstname')]"));
		fn.sendKeys("akshara");
		
	}

}
