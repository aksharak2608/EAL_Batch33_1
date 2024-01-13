package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\EAI\\workspace\\Batch33_maven\\webdriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.xpath("//input[@name='field-keywords']"));
		search.sendKeys("pen");
		Actions ac= new Actions(driver);
	//	ac.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).build().perform();
		//ac.click().build().perform();
		ac.keyDown(Keys.CONTROL).sendKeys("A").build().perform();
		Thread.sleep(2000);
		//ac.keyDown(Keys.CONTROL).sendKeys("X").build().perform();
		ac.keyDown(Keys.DELETE).build().perform();
	}
}
