package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));	
		Actions a = new Actions(driver);
		a.contextClick(right_click).build().perform();
		//List<WebElement> b = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']"));
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		if(edit.isDisplayed()) {
          System.out.println("context click successfull");		
	}else
		System.out.println("context click unsuccessfull");
	}
}
