package selenium6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Amazon_Pages.orangeHRMHome;
import Amazon_Pages.orangeHRMLogin;
import Amazon_Pages.orangeHRMMYinfo;
import helper.utilis;

public class updatenicknameOrange {
	public static WebDriver driver;
  @Test//(priority=1)
  public void f2() throws InterruptedException {
	  orangeHRMLogin oblogin= new orangeHRMLogin(driver);
	  oblogin.EnterUsername();
	  oblogin.EnterPassword();
	  oblogin.login();
	  
	  orangeHRMHome obhome= new orangeHRMHome(driver);
	  Thread.sleep(5000);
	  obhome.myinfoclick();
	  orangeHRMMYinfo obmyinfo = new orangeHRMMYinfo(driver);
	  Thread.sleep(5000);
	  obmyinfo.enternickname();
	  obhome.Recruitment();
	  
	
	  
  }
  
  //dependsOnMethods will make sure the method is executed after the depenedent metjod
  @Test(dependsOnMethods = "f2")
  //@Test(priority=2)
  public void f1save() throws InterruptedException
  {
	  orangeHRMMYinfo obmyinfo = new orangeHRMMYinfo(driver);
	  Thread.sleep(3000);
	  obmyinfo.save();
  }
  
  @Test//(priority=3)
  public void f4() throws InterruptedException
  {
	  orangeHRMMYinfo obmyinfo = new orangeHRMMYinfo(driver);
	  Thread.sleep(3000);
	  obmyinfo.enterotherid();
  }
  @AfterMethod
  public void aftermethod()
  {
	  utilis.Screenshots(driver);
  }
  
  @BeforeClass
  public void beforeclass()
  {
	/*  System.setProperty("webdriver.chrome.driver","D:\\EAI\\workspace\\Batch33_maven\\webdriver\\chromedriver.exe");
	  driver=new  ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");*/
	  
	  
	  //insted of above 3 steps use the method created in utility. IBrowser
	  try {
		  
	  
	  driver=utilis.Ibrowser("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(2000);
	  
	  }catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
  
  @AfterClass
  public void Afterclass()
  {
	  
  }
}
