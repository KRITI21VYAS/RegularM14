package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenKalkiFashionProductNewWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.kalkifashion.com/in/");
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='level0 cmsb519-lg:text-center cmsb519-relative cmsb519-min-h-[42px] cmsb519-flex']/div"));
	    Actions a = new Actions(driver);
	    for (WebElement web : products) {
			a.moveToElement(web).keyDown(Keys.SHIFT).click().build().perform();
		}
	    driver.quit();
	}

}
