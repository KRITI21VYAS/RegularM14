package WaitingConditions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		WebElement Create_account_Verification = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		if(Create_account_Verification.isDisplayed()) {
			System.out.println("you are in login page");
		}else
			System.out.println("not in login page");
	}

}
