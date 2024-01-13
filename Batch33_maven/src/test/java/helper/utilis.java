package helper;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utilis {
	static WebDriver driver;

	public static WebDriver Ibrowser(String NameOfBrowser, String url) {
		if (NameOfBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\EAI\\workspace\\Batch33_maven\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (NameOfBrowser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"D:\\EAI\\workspace\\Batch33_maven\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		return driver;

	}
	
	
	public static void Screenshots(WebDriver driver)
	{
		Date obj= new Date();
	String fname=	obj.toString().replace(" ", "_").replace(":", "_");
		System.out.println(fname);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\EAI\\workspace\\Batch33_maven\\pictures\\"+fname+".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void WaitForElemnetPresence(By by)
	{
		 WebDriverWait wl= new WebDriverWait(driver,Duration.ofMillis(10000));
			wl.until(ExpectedConditions.presenceOfElementLocated(by));
			
	}
	
	
	public static void WaitForElemnetVisibility(WebElement ele)
	{
		 WebDriverWait wl= new WebDriverWait(driver,Duration.ofMillis(0));
			wl.until(ExpectedConditions.visibilityOf(ele));
	}
	public static void scrollToPageDown(WebDriver driver)
	{
		JavascriptExecutor je= (JavascriptExecutor)driver;
		je.executeScript("window.scrollTo(1,document.body.scrollHeight)");
		
	}

	public static void blinkelement(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor je=(JavascriptExecutor)driver;
		
		for(int i=0;i<50;i++)
		{
			je.executeScript("arguments[0].style.backgroundColor='rgb(255,0,0)'", ele);
			je.executeScript("arguments[0].style.backgroundColor='rgb(0,255,0)'", ele);
			
		}
	}
		public static void borderElement(WebDriver driver, WebElement ele)
		{

JavascriptExecutor je=(JavascriptExecutor)driver;
		
		je.executeScript("arguments[0].style.border='3px solid red'", ele);
		}
	
	
	public static void displayalert(WebDriver driver) throws InterruptedException
	{

		
		JavascriptExecutor je= (JavascriptExecutor)driver;
		je.executeScript("alert('Test completed')");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}
		
		
	}
	
	

