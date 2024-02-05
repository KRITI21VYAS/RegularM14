package Basic2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStack 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(10000);
		WebElement login_verification=driver.findElement(By.xpath("//button[text()='Login']"));
		Thread.sleep(5000);
		
		if(login_verification.isDisplayed())
		{
			System.out.println("You are in Shoppers stack  Page");
			Thread.sleep(3000);
			driver.findElement(By.id("loginBtn")).click();
			Thread.sleep(3000);
			String given_loginpage_title="ShoppersStack | Login";
			String current_loginpage_title = driver.getTitle();
			if(given_loginpage_title.equals(current_loginpage_title)) {
				System.out.println("You are in Shoppers stack Login details Page");
				driver.findElement(By.xpath("//span[text()='Create Account']")).click();
				 WebElement signUpVerify= driver.findElement(By.xpath("//a[text()='signup']"));
				 if(signUpVerify.isDisplayed()) {
					 System.out.println("You are in create account page");
					 String[]name= {"kriti","vyas","1234567893","kvv@gmail.com"};
					List<WebElement> details = driver.findElements(By.xpath("//input[@type='text']"));
					int i=0;
					for(WebElement web: details) {
						web.sendKeys(name[i++]);
					}
					driver.findElement(By.cssSelector("input[id='Female']")).click();
					driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Kv21@PAV");
					driver.findElement(By.cssSelector("input[id='Confirm Password']")).sendKeys("Kv21@PAV");
					 WebElement checkBox = driver.findElement(By.xpath("(//input[@class='jss17'])[4]"));
					 checkBox.click();
					 if(checkBox.isSelected()) {
						 System.out.println("CheckBox is selected");
						WebElement registerButton = driver.findElement(By.cssSelector("button[id='btnDisabled']"));
						if(registerButton.isEnabled()) {
							System.out.println("Register button is enabled");
							registerButton.click();
							Thread.sleep(3000);
							driver.findElement(By.xpath("//a[text()='Sign In']")).click();
							Thread.sleep(3000);
							WebElement signupVerification= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[1]"));
							if(signupVerification.isDisplayed()) {
								System.out.println("You are in login page");
								driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kvv@gmail.com");
								driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Kv21@PAV");
								driver.findElement(By.xpath("//span[text()='Login']")).click();
							}else {
								System.out.println("you are not in login page");
							}
							}else {
							System.out.println("Register button is not enabled");
						}
						 
						 
					 }else {
						 System.out.println("select the checkBox");
					 }
					
					Thread.sleep(2000);
					
					 
				 }else {
					 System.out.println("You are not in create account page"); 
				 }
			}else {
				System.out.println("You are not in Shoppers stack Login  details Page");
			}
			
		}else 
		{
			System.out.println("You are not in Shoppers stack  Page");
		}
	}
}
	
	
	 
		
		
	

	

