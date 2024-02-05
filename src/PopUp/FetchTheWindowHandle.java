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

public class FetchTheWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		String parent = driver.getWindowHandle();//only give the parent/current window handle
		System.out.println(parent);
		Actions a = new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		WebElement twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
		Thread.sleep(2000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Twitter']")));
		// Set<String> twitter = driver.getWindowHandles();//will give the handles of both window bcz first it will always give the parent window handle
		a.moveToElement(twitter).keyDown(Keys.SHIFT).click().build().perform();
		
		 
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		 child.remove(parent);//yeh bas remove kiya yaa ni ye batayega ,return type is boolean
		for (String str : child) {
		driver.switchTo().window(str);
		
		}
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Not now']")));
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Not now']")).click();
		
		System.out.println("script is successfull");
		//driver.close();
		//driver.switchTo().window(parent);
		//driver.close();
	}

}