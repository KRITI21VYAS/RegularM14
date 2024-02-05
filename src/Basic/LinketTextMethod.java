package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinketTextMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		String currentUrl=driver.getCurrentUrl();
		String givenUrl = "https://demowebshop.tricentis.com/login";
		String givenLoginTitle = "Demo Web Shop. Login";
		if(currentUrl.equals(givenUrl)) {
			System.out.println("successfully entered");
			driver.findElement(By.linkText("Log in")).click();
			String loginCurrentTitle=driver.getTitle();
			if(givenLoginTitle.contains(loginCurrentTitle)) {
				System.out.println("you are in login page");
				driver.close();
			}
		}else
			System.out.println("unsuccessfull");

	}

}
