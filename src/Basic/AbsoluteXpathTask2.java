package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//click on search after entering a value i.e. search by using xpath
public class AbsoluteXpathTask2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/form/input[1]")).sendKeys("mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/form/input[2]")).click();
	}

}
