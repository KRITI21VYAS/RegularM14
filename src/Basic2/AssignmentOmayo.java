package Basic2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentOmayo {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		WebElement facebook= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
		facebook.click();
		//do the verification of that page
		WebElement verifyPage = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		if(verifyPage.isDisplayed()) {
			System.out.println("verified");
		}else {
			System.out.println(" not verified");
		}
		

	}

}
