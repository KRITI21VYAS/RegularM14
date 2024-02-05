package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteDWSRegisterPage 
{
	@Test
	  public void receiver() {
		  WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			DWSHomePage dhs=new DWSHomePage(driver); 
			dhs.register();
			DWSRegisterPage drs =new DWSRegisterPage(driver);
			drs.femaleGender();
			drs.firstName();
			drs.lastName();
			drs.email();
			drs.password();
			drs.confirmPassword();
			drs.registerButton();
	}			
}
