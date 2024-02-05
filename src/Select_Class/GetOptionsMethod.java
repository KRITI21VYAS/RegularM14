package Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/91831/Downloads/demo-1.html");
		Thread.sleep(2000);
		WebElement multidropdown = driver.findElement(By.id("multiple_cars"));
		Select sel = new Select(multidropdown);
		List<WebElement> all_Options = sel.getOptions();
		for (WebElement a : all_Options) {
			a.click();
		}
		Thread.sleep(5000);
		for (WebElement b: all_Options) {
			System.out.println(b.getText());
		}
		
		
		
			

	}

}
