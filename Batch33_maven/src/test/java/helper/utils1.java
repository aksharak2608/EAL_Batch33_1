package helper;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class utils1 {
public static WebDriver driver;
@Parameters({"browser","url"})
	@BeforeClass
	public void Ibrowser(String NameOfBrowser, String url) {
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

	}
	@AfterClass
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
		driver.close();
	}
/*	@Test
	public void tes()
	{
		
	}*/
}
