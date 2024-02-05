package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demo.automationtesting.in/Alerts.html ");
        
        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
        Alert a = driver.switchTo().alert();
        a.sendKeys("kriti");
        a.accept();
       WebElement confirm = driver.findElement(By.xpath("//p[text()='Hello kriti How are you today']"));
       if(confirm.isDisplayed()) {
    	   System.out.println("successfull");
       }else
    	   System.out.println("not sussessfull");
	}

}
