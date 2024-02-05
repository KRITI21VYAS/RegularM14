package Basic2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBusAssignment {

	public static void main(String[] args) {
		ChromeOptions chrome_options = new ChromeOptions();
		chrome_options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(chrome_options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));  
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("bhopal");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Bhopal']")));
		driver.findElement(By.id("dest")).sendKeys("pune");

	}

}
