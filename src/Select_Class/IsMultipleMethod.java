package Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91831/Downloads/demo-1.html");
		Thread.sleep(2000);
		WebElement multidropdown = driver.findElement(By.id("multiple_cars"));
		WebElement singledropdown = driver.findElement(By.id("standard_cars"));
		
		Select s1 = new Select(multidropdown);
		Select s2 = new Select(singledropdown);
		if(s1.isMultiple())//is multiple method
		{
			System.out.println("you are in s1 dropdown");
			Thread.sleep(2000);
		List<WebElement> all_Options = s1.getOptions();
		for (WebElement a : all_Options) {
			a.click();
			Thread.sleep(2000);
		}
		s1.deselectAll();//to deselect all the selected fields
		System.out.println("deselected");
		Thread.sleep(2000);	
		}else {
			System.out.println("you are in s2 dropdown");
			
			
		}
		

	}

}
