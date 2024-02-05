package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyingParticularWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		Actions a = new Actions(driver);
		String giver_twitter_title = "nopCommerce (@nopCommerce) / X";
		driver.get("https://demowebshop.tricentis.com/");
		String DWS_Window = driver.getWindowHandle();
		System.out.println(DWS_Window);
		
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		 WebElement twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
		
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Twitter']")));
        a.moveToElement(twitter).keyDown(Keys.SHIFT).click().keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(2000);
        
        
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
       a.moveToElement(facebook).keyDown(Keys.SHIFT).click().keyUp(Keys.SHIFT).build().perform();
       
        
       Set<String> window_handles = driver.getWindowHandles();
       for (String str : window_handles) {
		driver.switchTo().window(str);
		String Current_twitter_title = "nopCommerce (@nopCommerce) / X";
		if(giver_twitter_title.contains(Current_twitter_title)) {
			//Thread.sleep(1000);
			System.out.println("hi");
			a.keyDown(Keys.ALT).click().keyDown(Keys.TAB).click().build().perform();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Not now']")));
			 driver.findElement(By.xpath("//span[text()='Not now']")).click();
			System.out.println("script is successfull");
		}
		 
	}
        
        
	}

}
