package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class UtilityForLogin {
	public static WebDriver driver;
	public static void ChromeBrowser()
	{
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	}
	public static void CloseBrowser() 
	{	
		driver.close();	
	}
	public static void LoginTextScript(){
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement LoginVerification= driver.findElement(By.cssSelector("div[class='page-title']"));
		if(LoginVerification.isDisplayed()) {
			System.out.println("You are in login page");
			driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("vyas1112@gmail.com");
			driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("v987654");
			driver.findElement(By.cssSelector("input[id='RememberMe']")).click();
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
			WebElement Login_Verification= driver.findElement(By.cssSelector("div[id='nivo-slider']"));
			if(Login_Verification.isDisplayed()) {
				System.out.println("You have successfully logged in");
			}else
				System.out.println("You have not logged in");	
		}else
			System.out.println("You are not in login page");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeBrowser();
		LoginTextScript();
		Thread.sleep(1000);
		CloseBrowser() ;
	}

}
