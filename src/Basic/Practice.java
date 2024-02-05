package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice
{	
  public static WebDriver driver;
  public static void ChromeBrowser()
  {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
  }
  public static void CloseBrowser() {
		driver.close();
	}
  public static void OpenDWS() {
		driver.get("https://demowebshop.tricentis.com/");
	}
	
		
}
	


