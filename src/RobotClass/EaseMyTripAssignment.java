package RobotClass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class EaseMyTripAssignment {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
			
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
	}

}
