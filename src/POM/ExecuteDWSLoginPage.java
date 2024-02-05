package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteDWSLoginPage {
	@Test
	  public void receiver() {
		  WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			DWSHomePage dhs=new DWSHomePage(driver); 
			dhs.login();
			DWSLoginPage dls= new DWSLoginPage(driver); 
			dls.email();
			dls.password();
			dls.rememberMe();
			dls.login();
			dls.logout();
			dhs.register();
			
			
	}
}
