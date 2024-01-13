package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","D:\\EAI\\workspace\\Batch33_maven\\webdriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,1000)");
		WebElement checkbox1=driver.findElement(By.xpath("//td[text()='Roland Mendel']/preceding-sibling::td/input"));
		checkbox1.click();
		
		WebElement country=driver.findElement(By.xpath("//td[text()='Roland Mendel']//following-sibling::td[1]"));
		String contry_value=country.getText();
		System.out.println(contry_value);
		WebElement salary=driver.findElement(By.xpath("//td[text()='Roland Mendel']//following-sibling::td[2]"));
		int salary_value=Integer.valueOf(salary.getText());
		System.out.println(salary_value);
		
		
	}

}
