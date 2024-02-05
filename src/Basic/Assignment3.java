package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		String currentUrl=driver.getCurrentUrl();
		String givenUrl = "https://demowebshop.tricentis.com/login";
		if(currentUrl.equals(givenUrl)) {
			System.out.println("url is same");
			driver.findElement(By.className("ico-register")).click();
			
		}else 
			System.out.println("url is not same");
	
		String currentTitle = driver.getTitle();
		String givenTitle= "Demo Web Shop. Register";
		if(currentTitle.equals(givenTitle)) {
			  System.out.println("Title is same");
			  driver.findElement(By.cssSelector("input[value='F']")).click();
				driver.findElement(By.cssSelector("input[data-val='true']")).sendKeys("pavitra");
				driver.findElement(By.cssSelector("input[data-val-required='Last name is required.']")).sendKeys("kadam");
				driver.findElement(By.cssSelector("input[data-val-required='Email is required.']")).sendKeys("pkv@gmail.com");
				driver.findElement(By.cssSelector("input[data-val-required='Password is required.']")).sendKeys("p12345");
				driver.findElement(By.cssSelector("input[data-val-equalto='The password and confirmation password do not match.']")).sendKeys("p12345");
				driver.findElement(By.cssSelector("input[value='Register']")).click();
				Thread.sleep(2000);
		  }
		  else
			  System.out.println("Title is not same ");
		


	}

}
