package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions a = new Actions(driver);
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		a.moveToElement(right_click).contextClick(right_click).build().perform();
	 WebElement delete_option = driver.findElement(By.xpath("//span[text()='Delete']"));
	 delete_option.click();
	 try {
		 delete_option.isEnabled();
		 System.out.println("pop-up is not displaying"); 
		 
	} catch (Exception e) {
		 System.out.println("pop-up is  displaying"); }			
	}
}
