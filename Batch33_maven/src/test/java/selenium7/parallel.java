package selenium7;

import org.testng.annotations.Test;

public class parallel {
  @Test(threadPoolSize = 3, invocationCount=5)
  //invocationCount executes that method with that many times.
  public void f() {
	  
	  System.out.println("hello thread id is "+Thread.currentThread().getId());
  }
  
  @Test(threadPoolSize = 3, invocationCount=5)
  //invocationCount executes that method with that many times.
  public void f1() {
	  
	  System.out.println("hello1 thread id is"+Thread.currentThread().getId());
  }
}
