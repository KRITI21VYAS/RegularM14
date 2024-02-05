package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		Actions action = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		action.moveToElement(men).perform();
		//action.perform();
		driver.findElement(By.xpath("//a[@data-reactid='31']")).click();
		driver.quit();
		 
	}

}
