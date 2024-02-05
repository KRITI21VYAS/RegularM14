package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependentXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		Thread.sleep(10000);
		WebElement thirdElement=driver.findElement(By.xpath("(//a[text()='Music 2'])[3]/../../div[3]/div[1]/span"));
		System.out.println(thirdElement.getText());
		Thread.sleep(10000);
		WebElement SecondElement = driver.findElement(By.xpath("//a[text()='3rd Album']/parent::h2/parent::div/child::div[3]/child::div[1]"));	
		System.out.println(SecondElement.getText());

	}

}

