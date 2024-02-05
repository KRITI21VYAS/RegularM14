package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	
	static WebDriver driver;
	static String given_Login_Title = "Demo Web Shop";
	 static String given_addtocart_title = "Demo Web Shop. $25 Virtual Gift Card";
	
	public static void ChromeBrowser() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	}
	public static void CloseBrowser()
	{
    driver.close();
	}
	public static void relativeXpath() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/");
		String current_login_title = driver.getTitle();
		if(given_Login_Title.equals(current_login_title))
		{
			System.out.println("You are in Demo WebShop page");

		 driver.findElement(By.xpath("//input[@value='Add to cart'][1]")).click();		
		// String current_addtocart_title=driver.getTitle();
		 Thread.sleep(2000);
	 String current_addtocart_title = driver.getTitle();
		//System.out.println(given_addtocart_title);
		//System.out.println(current_addtocart_title);
	 Thread.sleep(2000);
		if(given_addtocart_title.equals(current_addtocart_title)) {
			System.out.println("You are in add to cart page");
			Thread.sleep(2000);
			String[]details= {"kriti","kv@gmail.com","pavitra","pv@gmail.com"};
			List<WebElement> giftcard = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
			Thread.sleep(2000);
			int i =0;
			for(WebElement web:giftcard) {
				
				web.sendKeys(details[i++]);
				Thread.sleep(2000);
			}
			
		}
		else {
			System.out.println("You are not in add to cart page");
		}
		}else 
		{
			System.out.println("You are not in Demo WebShop page");
		}
		
		
	}
	
	

	public static void main(String[] args) throws InterruptedException
	{
		ChromeBrowser();
		relativeXpath();
		

	}

}
