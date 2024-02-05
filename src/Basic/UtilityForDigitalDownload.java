package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityForDigitalDownload{
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
		public static void DigitalDownloadTestScript() {
			driver.get("https://demowebshop.tricentis.com/");
			WebElement demoWebPageVerification	= driver.findElement(By.cssSelector("div[class='topic-html-content-title']"));
			if(demoWebPageVerification.isDisplayed()) {
				System.out.println("You are in demoWebShop Page");
				driver.findElement(By.cssSelector("a[href='/digital-downloads']")).click();
				WebElement digital_download_verification= driver.findElement(By.cssSelector("div[class='page-title']"));
				if(digital_download_verification.isDisplayed()) {
					System.out.println("You are in digital download Page");
					List<WebElement> values = driver.findElements(By.cssSelector("input[value='Add to cart']"));
	      			for(WebElement web_elements : values) {
	      				web_elements.click();
	      			}
	      			driver.findElement(By.cssSelector(".cart-label")).click();
	      			WebElement shopping_cart=driver.findElement(By.cssSelector("div[class='page-title']"));
	    			if(shopping_cart.isDisplayed()) {
	    				System.out.println("You are in shopping cart page");
	    				List <WebElement> remove_from_cart= driver.findElements(By.cssSelector("[name='removefromcart']"));
	    				for(WebElement removefromCart : remove_from_cart) {
	        				removefromCart.click();
	        			}
	    				driver.findElement(By.cssSelector("input[value='Update shopping cart']")).click();
	        			WebElement orderSummary= driver.findElement(By.cssSelector("div[class='order-summary-content']"));
	        			if(orderSummary.isDisplayed()) {
	        				System.out.println("Your shopping cart is cleared");
	        			}else
	        				System.out.println("Your shopping cart is not cleared");
	    		}else
	    				System.out.println("You are not in shopping cart page");
				}else
					System.out.println("You are not in digital download Page");
				}else
				System.out.println("You are not in demoWebShop Page");			
		}
		public static void main(String[] args) {
			ChromeBrowser();
			DigitalDownloadTestScript();
			CloseBrowser() ;
			
		}

	}


