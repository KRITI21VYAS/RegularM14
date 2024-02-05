package PopUp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertActionAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html ");
		Actions a = new Actions(driver);	
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		for (WebElement web : options) {
			a.moveToElement(right_click).contextClick().build().perform();
			web.click();
			Thread.sleep(2000);
			Alert al = driver.switchTo().alert();
			System.out.println(al.getText());
			al.accept();
			Thread.sleep(2000);
		}
		driver.close();	}
	}


