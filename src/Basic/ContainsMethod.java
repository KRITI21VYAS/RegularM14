package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.ktm.com/");
		String currentTitleKtm=driver.getTitle();
		System.out.println(currentTitleKtm);
		driver.get("https://www.royalenfield.com/");
		driver.navigate().back();
		String givenTitleKtm="KTM - READY TO RACE";
		if(givenTitleKtm.contains(currentTitleKtm))
		{
			System.out.println("you are in ktm webpage");
		}else
			System.out.println("you are in royalenfield webpage");
		driver.navigate().forward();

	}

}
