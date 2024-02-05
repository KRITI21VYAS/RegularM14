package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		//when there is no direct locator than we go for css Selector Locator
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       driver.navigate().to("https://demowebshop.tricentis.com/login");
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Mobile");
       driver.findElement(By.cssSelector("input[type='Submit']")).click();
       Thread.sleep(2000);
	}

}
