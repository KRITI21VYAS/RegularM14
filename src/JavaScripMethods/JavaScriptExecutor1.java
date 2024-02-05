package JavaScripMethods;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://skillrary.com/");
		JavascriptExecutor je = (JavascriptExecutor) driver;
		//je.executeScript("Window.ScrollBy(0,1000);");
		je.executeScript("Window.ScrollTo(0,-1000);");

	}

}
