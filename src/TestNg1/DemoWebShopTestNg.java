package TestNg1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebShopTestNg {
	@Test
	public static void m1()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	@Test
	public static void z1()
	{
		System.out.println("i am from a1 method");
	}
	
	@Test
	public static void x1()
	{
		System.out.println("i am from x1 method");
	}
//------------------------------	
	public static void b1() 
	{
	       System.out.println("i am from b1");// will not execute , main method is required bcz it is not using testng annotation
		}
	public static void main(String[] args)
	{
		b1();
	}
	
	

}
