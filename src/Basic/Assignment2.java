package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Kriti");
		driver.findElement(By.id("LastName")).sendKeys("Vyas");
		driver.findElement(By.id("Email")).sendKeys("Kritivyas10@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("kv9876");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("kv9876");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(4000);
		driver.close();
		
		

	}

}
