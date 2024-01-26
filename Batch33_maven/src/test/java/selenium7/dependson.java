package selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.utilis;
import helper.utils1;

public class dependson extends utils1 {
	@Test(priority=1)
	public void test1() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("adfaf");
		By u_by=By.xpath("//input[@name='username']");

		WebElement username=driver.findElement(u_by);
		
		username.sendKeys("Admin");
		String user=username.getText();
		System.out.println(user);
		Assert.assertEquals(user, "Admin");
		
	}
	
	@Test(priority=2, dependsOnMethods = "test1")
	public void test2()
	{
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
	}

}
