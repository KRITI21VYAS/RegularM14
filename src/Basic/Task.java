package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.abhibus.com/");
		driver.navigate().back();
		String CurrentTitle=driver.getTitle();
		String givenTitle ="Demo Web Shop. Login";
		if(CurrentTitle.equals(givenTitle))
		{ 
			System.out.println("Title is same");
		  }
		  else
			  System.out.println("Title is not same ");
		  
		  
			
		
		
	}

}
