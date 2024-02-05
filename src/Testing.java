import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();//to open/Launch the browser
		driver.manage().window().maximize(); //to maximize the window
		//driver.manage().window().minimize();
		//to enter in a particular webpage/website
		driver.get("https://kritiqco1.testrail.io/index.php?/auth/login/L2Rhc2hib2FyZC1hZDcwMmI4MTlkYmVjOGU3ZDcyYWIwZjI3MjA2YmZkY2FhYWFjZjYxMjFiZDYxYTZlYWY4N2ViNDVmZjViNTRk");

	}

}
