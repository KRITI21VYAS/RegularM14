package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dream_11Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.dream11.com/");
		
		//BY USING ID  driver.switchTo().frame("send-sms-iframe");
		// driver.switchTo().frame(0); // using index
		
		WebElement element = driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']"));
		driver.switchTo().frame(element);
		WebElement phnNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("regEmail")));
		phnNo.sendKeys("9123456789");
		//driver.switchTo().parentFrame();//to  switch back the controller to immediate parent frame
		driver.switchTo().defaultContent();//to again switch back the controller to default parent frame
		WebElement options = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hamburger")));
		options.click();
	}
}
