package Basic2;

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
		driver.switchTo().frame(0);
		WebElement phnNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("regEmail")));
		phnNo.sendKeys("9123456789");
		

	}

}
