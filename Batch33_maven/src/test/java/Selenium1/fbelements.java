package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbelements {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\EAI\\workspace\\Batch33_maven\\webdriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//WebElement username=driver.findElement(By.id("email"));
		
		//WebElement username=driver.findElement(By.name("email"));
		WebElement username=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		
		
		username.sendKeys("akshara");
	//	WebElement fp=driver.findElement(By.linkText("Forgotten password?"));
		
		WebElement cna=driver.findElement(By.partialLinkText("Create new"));
		cna.click();
		Thread.sleep(3000);
		
		Select day= new Select(driver.findElement(By.id("day")));
		List<WebElement> dayoption=day.getOptions();
		for(WebElement d1:dayoption)
		{
			System.out.println(d1.getText());
		}
		
	//	day.selectByIndex(10);
		//day.selectByValue("25");
		day.selectByVisibleText("23");
		
	}

}
