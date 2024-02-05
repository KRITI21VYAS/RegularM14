package Assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void dws() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		driver.get("https://demowebshop.tricentis.com/login");
		String given_url="https://demowebshop.tricentis.com/lgin";
		System.out.println("just after exception occured");
		String current_url=driver.getCurrentUrl();
		Assert.assertEquals(given_url, current_url);//hards assert---all methods are static bcz of that we are calling it directly
		//Assert.assertNotEquals(given_url,current_url);
		System.out.println("successfull");
		
		driver.quit();
	}

}
