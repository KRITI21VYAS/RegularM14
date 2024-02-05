package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://woodlandworldwide.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getPageSource());
    
	}

}
