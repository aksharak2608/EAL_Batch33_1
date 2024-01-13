package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsConceptDraganddrop {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\EAI\\workspace\\Batch33_maven\\webdriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement signin= driver.findElement(By.xpath("//span[text()='Account & Lists']/span"));
		
		
		Actions act= new Actions(driver);
		act.moveToElement(signin).build().perform();
		Thread.sleep(3000);
		WebElement prime=driver.findElement(By.xpath("//span[text()='Your Prime Video']"));
		
		act.moveToElement(prime).click().build().perform();
		
	}

}
