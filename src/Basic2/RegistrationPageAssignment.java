package Basic2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPageAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Register.html ");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("kriti");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("vyas");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("ishaan park bhopal");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kv@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9123456789");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		driver.findElement(By.id("msdd")).click();
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("English")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Hindi")).click();
		Thread.sleep(5000);
		 driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\91831\\Downloads\\6. API testing.pdf");
		 Thread.sleep(5000);
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select sel = new Select(skills);
		Thread.sleep(2000);
		sel.selectByVisibleText("Java");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement country=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@role='combobox']")));	 
		Thread.sleep(2000);
		Select sl=new Select(country);
		sl.selectByIndex(5);
		Thread.sleep(2000);
		WebElement year_box = driver.findElement(By.id("yearbox"));
		Select yrs = new Select(year_box);
		Thread.sleep(2000);
		yrs.selectByVisibleText("1998");
		Thread.sleep(1000);
		
		WebElement month_box = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select mnt= new Select(month_box);
		mnt.selectByVisibleText("October");
		Thread.sleep(1000);
		
		WebElement date = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select dt= new Select(date);
		dt.selectByVisibleText("21");
		Thread.sleep(1000);
		
		driver.findElement(By.id("firstpassword")).sendKeys("Kv@211");
		driver.findElement(By.id("secondpassword")).sendKeys("Kv@211");
		driver.findElement(By.id("submitbtn")).click();
		
		
		
		
		
	}

}
