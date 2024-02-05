package Assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert
{  @Test
	public void soft_assert()
  {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
	driver.get("https://demowebshop.tricentis.com/login");
	String given_url="https://demowebshop.tricentis.com/logi";
	String current_url=driver.getCurrentUrl();
	SoftAssert a = new SoftAssert();
	a.assertEquals(given_url, current_url);
	//System.out.println("before the false condition");
	//a.assertNotEquals(given_url, current_url);
	//System.out.println("after false ");
	System.out.println("soft assert successfull");	
     System.out.println("HELLO");
	a.assertAll();
	System.out.println("after false AND ASSERT ALL");
	System.out.println(" soft assert successfull");	
	driver.quit();
  }

}
