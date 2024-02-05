package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91831/Downloads/demo-1.html");
		Thread.sleep(2000);
		WebElement selectElement= driver.findElement(By.cssSelector("select[id='standard_cars']"));//to select single element from drop down menu
		Thread.sleep(2000);
		Select sel=new Select(selectElement);
		sel.selectByVisibleText("Mercedes");
		Thread.sleep(2000);
		sel.selectByValue("hda");
		Thread.sleep(2000);
		sel.selectByIndex(8);
		Thread.sleep(2000);
	    driver.close();	
	}

}
