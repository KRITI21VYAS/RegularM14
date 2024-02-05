package JavaScripMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.Argument;

public class Scroll_Into_View {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.get("https://skillrary.com/");	
		//WebElement learnMore = driver.findElement(By.xpath("//a[text()=' LEARN MORE']"));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement customer = driver.findElement(By.xpath("//a[text()='New products']"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		//je.executeScript("arguments[0].scrollIntoView(false);",customer);//with this "true" targeted element will present at top ,if false it will present at bottom
		je.executeScript("arguments[0].scrollIntoView(true);",customer);
	}

}
