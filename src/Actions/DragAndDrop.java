package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions a = new Actions(driver);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source = driver.findElement(By.id("box6"));
		WebElement target = driver.findElement(By.id("box106"));		
		a.dragAndDrop(source, target).build().perform();
		
		WebElement source2 = driver.findElement(By.id("box7"));
		WebElement target2 = driver.findElement(By.id("box107"));
		a.dragAndDrop(source2, target2).build().perform();
		
		WebElement source3 = driver.findElement(By.id("box3"));
		WebElement target3 = driver.findElement(By.id("box103"));
			a.dragAndDrop(source3, target3).build().perform();
		
		WebElement source4 = driver.findElement(By.id("box1"));
		WebElement target4 = driver.findElement(By.id("box105"));
		a.dragAndDrop(source4, target4).build().perform();
		WebElement colour = driver.findElement(By.xpath("//div[@style='visibility: visible; background-color: rgb(0, 255, 0);']"));
		if(colour.isDisplayed()) {
         System.out.println("you have selected right option");}
		else {
			 System.out.println("you have selected wrong option");
	}
	}
}
