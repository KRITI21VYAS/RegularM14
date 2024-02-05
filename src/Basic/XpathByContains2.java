package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		 WebElement demo_webshop_verification= driver.findElement(By.cssSelector("#nivo-slider"));
          if(demo_webshop_verification.isDisplayed())
          {
        	  System.out.println("you are in demowebshop page  ");
        	  driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
        	  Thread.sleep(1000);
        	  driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).click();
        	  Thread.sleep(1000);
        	  driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]")).click();
        	  Thread.sleep(1000);
        	  driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
        	  Thread.sleep(1000);
        	  driver.findElement(By.xpath("(//a[contains(text(),'Jewelry')])[1]")).click();
        	  Thread.sleep(1000);
        	  driver.findElement(By.xpath("(//a[contains(text(),'Gift Cards')])[1]")).click();
        	  
        	  

	      }
	}

}
