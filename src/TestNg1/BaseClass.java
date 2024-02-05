package TestNg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
     @BeforeClass
       public void beforeClass() {
    	driver = new ChromeDriver();
		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));		
    }
     
     @BeforeMethod
     public void beforeMethod() {
    	 driver.get("https://demowebshop.tricentis.com/login"); 
     }
     @AfterMethod
     public void afterMethod() {
    	driver.findElement(By.xpath("//a[text()='Log out']")).click();
    	 
     }
     
     @AfterClass
     public void afterClass() {
    	 driver.quit();
     }
     
	
}
