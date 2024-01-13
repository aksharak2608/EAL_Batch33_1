package selenium4;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import helper.utilis;

public class launchbrowser {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		driver=utilis.Ibrowser("chrome","https://www.amazon.com/");
		utilis.Screenshots(driver);
		WebElement All=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		utilis.WaitForElemnetPresence(By.xpath("//select[@id='searchDropdownBox']"));
		All.click();
		Select All_op=new Select(All);
		List<WebElement> all_options=All_op.getOptions();
		Iterator<WebElement> opt=all_options.iterator();
		while(opt.hasNext())
		{
			WebElement e=opt.next();
			System.out.println(e.getText());
		}
		
		
		
	}

}
