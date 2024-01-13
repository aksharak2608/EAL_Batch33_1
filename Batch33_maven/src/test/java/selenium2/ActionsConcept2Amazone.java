package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcept2Amazone {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\EAI\\workspace\\Batch33_maven\\webdriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest= driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		Actions act= new Actions(driver);
		act.dragAndDrop(src, dest).build().perform();
		driver.switchTo().defaultContent();
		WebElement resize=driver.findElement(By.xpath("//a[text()='Resizable']"));
		resize.click();
		
	}

}
