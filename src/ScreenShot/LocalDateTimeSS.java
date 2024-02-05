package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LocalDateTimeSS {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		LocalDateTime time = LocalDateTime.now();
		String date=time.toString().replace(':', '-');
		TakesScreenshot ss=(TakesScreenshot)driver;
		
		File from = ss.getScreenshotAs(OutputType.FILE);
		 File to = new File("C:\\Users\\91831\\Pictures\\Screenshots\\"+date+".png");//will not replace previous with new
		 FileHandler.copy(from, to);
	}

}
