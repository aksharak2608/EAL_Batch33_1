package selenium6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestwithfailandskipped {
  @Test//5
  public void f() {
	  System.out.println("test method");
  }
  @Test
  public void f1() {
	  System.out.println("test method");
	  Assert.assertEquals(true, false);
  }
  
  @Test(dependsOnMethods = "f1")
  public void f2() {
	  System.out.println("test method");
	  Assert.assertEquals(true, false);
  }
  @BeforeMethod//4
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod//6
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

  @BeforeClass//3
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass//7
  public void afterClass() {
	  System.out.println("afterClass");
  }

  @BeforeTest//2
  public void beforeTest() {
	  System.out.println("beforeTest");
  }

  @AfterTest//8
  public void afterTest() {
	  System.out.println("afterTest");
  }

  @BeforeSuite  //1
  public void beforeSuite() {
	  System.out.println("beforeSuite");
  }

  @AfterSuite//9
  public void afterSuite() {
	  System.out.println("afterSuite");
  }

}
