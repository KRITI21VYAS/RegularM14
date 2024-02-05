package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://meet.google.com/");
	  String Currenttitle=driver.getTitle();
	  System.out.println(Currenttitle);
	  String givenTitle = "Google Meet: Online Web and Video Conferencing Calls | Google Workspace";
	  if(Currenttitle.equals(givenTitle)) {
		  System.out.println("Title is same");
	  }
	  else
		  System.out.println("Title is not same ");
	  driver.close();
	  
	}
	

}
