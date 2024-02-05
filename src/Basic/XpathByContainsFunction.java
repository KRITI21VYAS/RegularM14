package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsFunction 
{

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		 WebElement demo_webshop_verification= driver.findElement(By.cssSelector("#nivo-slider"));
          if(demo_webshop_verification.isDisplayed())
          {
        	  System.out.println("you are in demowebshop page  ");
        	  driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();  

	      }
	}
}
