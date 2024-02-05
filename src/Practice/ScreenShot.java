package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenShot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(45));
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replace(":", "-");
		driver.get("https://www.javatpoint.com/selenium-waits");
		//to scroll down the webpage
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//h2[text()='What is Selenium Waits?']")));
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		//To take screenshot of entire webpage
		TakesScreenshot ss = (TakesScreenshot)driver;
		File from = ss.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\91831\\OneDrive\\excel\\"+time+".png");
		FileHandler.copy(from,to);
		a.keyDown(Keys.PAGE_UP).build().perform();
		a.keyDown(Keys.PAGE_UP).build().perform();
		a.keyDown(Keys.PAGE_UP).build().perform();
		WebElement postman = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' Postman']")));
		postman.click();
		WebElement element = driver.findElement(By.className("imageright"));
		File fr = element.getScreenshotAs(OutputType.FILE);
		File t=new File("C:\\Users\\91831\\OneDrive\\excel\\"+time+".png");
		FileHandler.copy(fr, t);
		driver.quit();
	}

}
