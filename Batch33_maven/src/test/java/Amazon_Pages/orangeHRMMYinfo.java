package Amazon_Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orangeHRMMYinfo {
	WebDriver driver;

	@FindBy (xpath="//label[text()='Nickname']//parent::div//following-sibling::div/input") WebElement nickname;
	
	@FindBy(xpath="//label[text()='Other Id']//parent::div//following-sibling::div/input") WebElement OtherId;
	@FindBy(xpath="//p[text()=' * Required']//following-sibling::button") WebElement Save;
	
	public void enternickname() throws InterruptedException
	{
	//	WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(1000));
	//	w.until(ExpectedConditions.visibilityOf(nickname));
		
		nickname.sendKeys("paul");
	}
	
	public void enterotherid()
	{
		OtherId.sendKeys("test");
	}
	
	public void save()
	{
		JavascriptExecutor je= (JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,500)");
		Save.click();
	}
	public orangeHRMMYinfo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
