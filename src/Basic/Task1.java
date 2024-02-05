package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		String currentUrl = driver.getCurrentUrl();
		String givenUrl= "https://demowebshop.tricentis.com/login";
		if(currentUrl.equals(givenUrl)) {
			System.out.println("demo web shop url is same");
		}else
			System.out.println("demo web shop url is not same");
		driver.close();

	}

}
