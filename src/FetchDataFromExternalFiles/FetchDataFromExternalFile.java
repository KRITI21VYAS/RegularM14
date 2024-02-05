package FetchDataFromExternalFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class FetchDataFromExternalFile // we can also do this by using dataProvider
{ 
	@Test
	public void loginDWS() throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		driver.get("https://demowebshop.tricentis.com/login"); 
		driver.findElement(By.cssSelector(".ico-login")).click();
		File file = new File("C:\\Users\\91831\\OneDrive\\loginfile.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sheet = wbf.getSheet("Sheet1");
		String email = sheet.getRow(0).getCell(0).toString();
		String password = sheet.getRow(0).getCell(1).toString();
		driver.findElement(By.cssSelector(".email")).sendKeys(email);
		driver.findElement(By.cssSelector(".password")).sendKeys(password);
		driver.findElement(By.cssSelector("#RememberMe")).click();
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		
	}
}
