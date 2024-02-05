package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
       driver.navigate().to("https://www.hackerrank.com/");
       String hackerTitle=driver.getTitle();
       String givenHackerTitle="HackerRank - Online Coding Tests and Technical Interviews";
       
       driver.get("https://kritiqco1.testrail.io/");
       String testRailTitle=driver.getTitle();
       String giventestRailTitle = "Login - TestRail";
       driver.navigate().back();
       driver.navigate().forward();
       if(hackerTitle.equals(givenHackerTitle)) {
    	   System.out.println("hacker rank title is same");
       }else
    	   System.out.println("hacker rank title is not same");
       
       
	}

}
