package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityForRegistration {
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
	public static void RegistrationTestScript()
	{
		driver.get("https://demowebshop.tricentis.com/");
	WebElement demoWebPageVerification	= driver.findElement(By.cssSelector("div[class='topic-html-content-title']"));
	if(demoWebPageVerification.isDisplayed()) {
		System.out.println("You are in demoWebShop Page");
		driver.findElement(By.cssSelector(".ico-register")).click();
	WebElement registerPageVerification	= driver.findElement(By.cssSelector("div[class='page-title']"));
		if(registerPageVerification.isDisplayed()) {
			System.out.println("You are in Registration Page");
			driver.findElement(By.cssSelector("#gender-female")).click();
			driver.findElement(By.id("FirstName")).sendKeys("KRITI");
			driver.findElement(By.name("LastName")).sendKeys("VYAS");
			driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("vyas1112@gmail.com");
			driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("v987654");
			driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("v987654");
			driver.findElement(By.cssSelector("input[class='button-1 register-next-step-button']")).click();
	        WebElement registrationCompleted =driver.findElement(By.cssSelector("div[class='result']"));
			if(registrationCompleted.isDisplayed()) {
				System.out.println("Registration is completed");
			}else
				System.out.println("Registration is  not completed");	
		}else
			System.out.println("You are not in Registration Page");
	}else
		System.out.println("You are not in demoWebShop Page");
	
	}
	public static void main(String[] args)
	{
		ChromeBrowser();
		RegistrationTestScript();
		CloseBrowser();
		}
	}
