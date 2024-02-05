package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		 WebElement demo_webshop_verification= driver.findElement(By.cssSelector("#nivo-slider"));
          if(demo_webshop_verification.isDisplayed()) {
        	  System.out.println("you are in demowebshop page  ");
        	  driver.findElement(By.cssSelector("a[href='/digital-downloads']")).click();
        	//WebElement digital_download_verification = driver.findElement(By.cssSelector(".page-title"));
        	//  driver.findElement(By.x)
        	//  if(digital_download_verification.isDisplayed()) {
        		  System.out.println("You are in digital download page");
        		  List<WebElement> values = driver.findElements(By.cssSelector("input[value='Add to cart']"));
        		 // values .remove(2);
      			for(WebElement web_elements : values) {
      				web_elements.click();
      				Thread.sleep(1000);
      			}
      			driver.findElement(By.cssSelector(".cart-label")).click();
      			WebElement shopping_cart=driver.findElement(By.cssSelector("div[class='page-title']"));
    			if(shopping_cart.isDisplayed()) {
    				System.out.println("You are in shopping cart page");
    			List <WebElement> remove_from_cart= driver.findElements(By.cssSelector("[name='removefromcart']"));
    			 remove_from_cart.remove(1); // to not select the 2nd element else will be removed
    			for(WebElement removefromCart : remove_from_cart) {
    				removefromCart.click();
    				Thread.sleep(1000);
    			}
    			driver.findElement(By.cssSelector("input[value='Update shopping cart']")).click();
    			WebElement orderSummary= driver.findElement(By.cssSelector("div[class='order-summary-content']"));
    			if(orderSummary.isDisplayed()) {
    				System.out.println("Your shopping cart is cleared");
    				Thread.sleep(1000); 
    				//driver.close();
    			}else
    				System.out.println("Your shopping cart is not cleared");
    			}else
    				System.out.println("You are not in shopping cart page");
        	  }else 
        		  System.out.println("You are not in digital download page"); 
             
          }
   
          
	}


