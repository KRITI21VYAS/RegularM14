package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsernamePasswordNotification {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(1000);
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_A);
		rbt.keyPress(KeyEvent.VK_D);
		rbt.keyPress(KeyEvent.VK_M);
		rbt.keyPress(KeyEvent.VK_I);
		rbt.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);	
		rbt.keyRelease(KeyEvent.VK_N);	
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyPress(KeyEvent.VK_A);
		rbt.keyPress(KeyEvent.VK_D);
		rbt.keyPress(KeyEvent.VK_M);
		rbt.keyPress(KeyEvent.VK_I);
		rbt.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);
		rbt.keyRelease(KeyEvent.VK_A);	
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		WebElement text = driver.findElement(By.xpath("//h3[text()='Basic Auth']"));
		if(text.isDisplayed()) {
			System.out.println("you have signed in successfully");
		}else {
			System.out.println("unsuccessfull");
		}
		
		
		
		

	}

}
