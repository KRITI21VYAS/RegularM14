package Actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownAndKeyUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Actions a = new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyUp(Keys.PAGE_DOWN).build().perform();//key press krne k baad key ko release bhi to krte hai
		a.keyDown(Keys.PAGE_UP).build().perform();
		a.keyUp(Keys.PAGE_UP).build().perform();

	}

}
