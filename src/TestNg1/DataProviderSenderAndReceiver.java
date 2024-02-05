package TestNg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSenderAndReceiver extends BaseClass {
	
	@DataProvider(name="login")
	public Object[][] sender(){    //here we are not fetching the data
		Object[][] obj=new Object[2][2];
		obj[0][0]="pkv@gmail.com";
		obj[0][1]="p12345";
		obj[1][0]="pkv@gmail.com";
		obj[1][1]="p12345";
			return obj;	
	}
	
	@Test(dataProvider="login")
	public void receiver(String email,String password)
	{	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		driver.get("https://demowebshop.tricentis.com/login"); 
		driver.findElement(By.cssSelector(".ico-login")).click();
		driver.findElement(By.cssSelector(".email")).sendKeys(email);
		driver.findElement(By.cssSelector(".password")).sendKeys(password);
		driver.findElement(By.cssSelector("#RememberMe")).click();
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
	}
}
