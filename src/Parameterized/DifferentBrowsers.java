package Parameterized;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DifferentBrowsers
{ 
	WebDriver driver;
	@Parameters("Driver")
	@Test
	public void browsers(String div)
	{
		if(div.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
			System.out.println("i am from chrome browser");
			Reporter.log("ChromeBrowser");
		}else if(div.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
			System.out.println("i am from edge browser");
			Reporter.log("inside reporter log-edgeBrowser");
		}else if(div.equalsIgnoreCase("fireFox")) {
			driver= new FirefoxDriver();
			System.out.println("i am from FireFox browser");
			Reporter.log("FireFoxBrowser");
		}else {
			System.out.println("driver not found");
		}
		
		
		
		
	}

}
