package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("file:///C:/Users/91831/Downloads/demo-1.html");
	    Thread.sleep(2000);
		WebElement multiSelectDropDown = driver.findElement(By.xpath("//select[@id='standard_cars']"));
		Thread.sleep(2000);
		Select sel = new Select(multiSelectDropDown);
		sel.selectByIndex(1);
		sel.selectByValue("bmw");
		sel.selectByVisibleText("Ford");
		

	}

}
