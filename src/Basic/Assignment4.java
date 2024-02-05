package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		String currentUrl=driver.getCurrentUrl();
		String givenUrl = "https://demowebshop.tricentis.com/login";
		if(currentUrl.equals(givenUrl)) {
			System.out.println("url is same");
			Thread.sleep(2000);
			//driver.findElement(By.className("a[class='ico-login']")).click(); we also have another way
			driver.findElement(By.cssSelector(".ico-login")).click();
			driver.findElement(By.cssSelector(".email")).sendKeys("pkv@gmail.com");
			driver.findElement(By.cssSelector(".password")).sendKeys("p12345");
			driver.findElement(By.cssSelector("#RememberMe")).click();
			driver.findElement(By.cssSelector(".button-1.login-button")).click();
			Thread.sleep(2000);
			
		}else 
			System.out.println("url is not same");
	
	}

}
