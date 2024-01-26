package selenium7;

import org.testng.annotations.Test;

public class groups {
	@Test(groups= {"windows.smoke"})
	public void test()
	{
		System.out.println("test");
	}
	@Test(groups= {"windows.smoke", "linux.regression"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(groups= {"windows.sanity","smoke"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(groups= {"smoke", "regression"})
	public void test3()
	{
		System.out.println("test3");
	}
	@Test(groups= {"regression"})
	public void test4()
	{
		System.out.println("test4");
	}
	@Test(groups= {"regression"})
	public void test5()
	{
		System.out.println("test5");
	}
	

}
