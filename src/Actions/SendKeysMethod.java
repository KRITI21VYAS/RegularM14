package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String given_url = "https://demowebshop.tricentis.com/";
		String Current_url = driver.getCurrentUrl();
		if(given_url.equals(Current_url)) {
			System.out.println("you are in demo web shop page");
			WebElement search_field = driver.findElement(By.id("small-searchterms"));
		    Actions	a=new Actions(driver);
		   if( search_field.isEnabled()) {
			   System.out.println("search_field is enabled");
			   a.moveToElement(search_field).click().sendKeys("Books").build().perform();
			   driver.findElement(By.xpath("//input[@type='submit']")).click();
			   System.out.println("script is successfull");
		   }else {
			   System.out.println("search_field is not enabled");  
		   }
			
		} else
		{
			System.out.println("you are not in demo web shop page");
		}
	}

}
