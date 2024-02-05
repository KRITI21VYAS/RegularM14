package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Register']")).click();
		Actions a=new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).sendKeys("C:\\Users\\91831\\Pictures\\Screenshots\\Screenshot(1).png");
		

	}

}
