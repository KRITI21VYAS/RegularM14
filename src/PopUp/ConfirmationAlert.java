package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

     public class ConfirmationAlert {
    	 public static void main(String[] args) throws InterruptedException {
    		 WebDriver driver = new ChromeDriver();
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
             driver.get("https://demo.automationtesting.in/Alerts.html ");
             driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
            Alert a = driver.switchTo().alert();
            a.accept();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
            a.dismiss();
            driver.close();
		}
         
}
