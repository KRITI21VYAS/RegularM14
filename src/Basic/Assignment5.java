package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	    String currentUrl  =driver.getCurrentUrl();
	    String givenUrl = "https://demowebshop.tricentis.com/";
		if(currentUrl.equals(givenUrl)) {
			System.out.println("url is same, you are in demoWebShop page");
			driver.findElement(By.cssSelector("a[href='/digital-downloads']")).click();
			String currentTitle = driver.getTitle();
			String givenTitle = "Demo Web Shop. Digital downloads";
			if(currentTitle.equals(givenTitle)) {
				System.out.println("you are in digital download page");
			List<WebElement> values = driver.findElements(By.cssSelector("input[value='Add to cart']"));
			for(WebElement web_elements : values) {
				web_elements.click();
				Thread.sleep(1000);
			}
			driver.findElement(By.cssSelector(".cart-label")).click();
			
			//String givenTitleShoppingCart = "Demo Web Shop. Shopping Cart";
			
			//if(givenTitleShoppingCart.equals(driver.getTitle()))
			//{
			//	System.out.println("in shopping cart");
		//	}else
			//	System.out.println("not in shopping cart");
			
			// TO VERIFY THE PAGE BY USING WEB ELEMENT USING isDisplayed METHOD
			WebElement shopping_cart=driver.findElement(By.cssSelector("div[class='page-title']"));
			if(shopping_cart.isDisplayed()) {
				System.out.println("You are in shopping cart page");
			}else
				System.out.println("You are not in shopping cart page");
			
			}else
				System.out.println("you are not in digital download page");
		}     
		  driver.close();

	}

}
