package Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
@FindBy(xpath ="//a[text()=\"Today's Deals\"]") WebElement todaysdeals;
// driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")); above stmt is similar
public void  Booktodaydeal()
{
	todaysdeals.click();
}

//page factory constructor.
public HomePage(WebDriver driver)
{
	this.driver= driver;
	PageFactory.initElements(driver, this);
}
}
