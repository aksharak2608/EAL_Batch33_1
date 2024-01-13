package selenium4;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","D:\\EAI\\workspace\\Batch33_maven\\webdriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.expedia.com/");
		
		WebElement cal=driver.findElement(By.xpath("//button[@name='EGDSDateRange-date-selector-trigger']"));
		cal.click();
		Thread.sleep(4000);
		WebElement date=driver.findElement(By.xpath("(//table[@aria-label='December 2023']//div[@class='uitk-day-button uitk-day-selectable uitk-day-clickable'])[3]"));
		
		date.click();
	
		WebElement done= driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-layout-flex-item']"));
		done.click();
		
		Screenshots();
	}
	public static void Screenshots()
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\EAI\\workspace\\Batch33_maven\\pictures\\abc.jpg");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
