package TestNg1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test(priority=1)
	public void ktmBike()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ktm.com/");	
		driver.quit();
	}
	
	@Test(priority=2,dependsOnMethods="yamahaBike")
	public void heroBike()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.heromotocorp.com/");
		driver.quit();
	}
	
	@Test(priority=3)
	public void pumaShoes()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://in.puma.com/");	
		driver.quit();
	}
	
	@Test(priority=4)
	public void yamahaBike()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.yamaha-motor-india.com/");	
		driver.quit();
	}

}
