package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UseWindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		 String dws = driver.getWindowHandle();
		 System.out.println(dws);
		 Actions a = new Actions(driver);
		WebElement book = driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
		a.moveToElement(book);
		book.click();	
		 Set<String> books = driver.getWindowHandles();
		 System.out.println(books);
		 driver.quit();	 	
	}
}
