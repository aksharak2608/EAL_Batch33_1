package Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangeHRMHome {
	
	WebDriver driver;
	@FindBy(xpath="//*[text()='My Info']") WebElement Myinfo;
	
	@FindBy(xpath="//*[text()=Recruitment']") WebElement Recruitment;
	
	public void myinfoclick()
	{
		Myinfo.click();
	}
	public void Recruitment()
	{
		Recruitment.click();
	}
	
	
	public orangeHRMHome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
