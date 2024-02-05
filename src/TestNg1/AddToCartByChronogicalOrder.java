package TestNg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AddToCartByChronogicalOrder {
	WebDriver driver;
	@BeforeClass
	public void openTheBrowser() {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));		
	}
	
	@BeforeClass
	public void login() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
	}
	
	@AfterClass
	public void closeTheBrowser() {
		driver.close();
	}
	

}
