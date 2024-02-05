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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FetchDataFromExcel {
	@DataProvider(name="login")
	public Object[][] sender() throws EncryptedDocumentException, IOException{
		Object[][] obj=new Object[2][2];
		File file = new File("C:\\Users\\91831\\OneDrive\\loginfile.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sheet = wbf.getSheet("Sheet1");
		obj[0][0]=sheet.getRow(0).getCell(0).toString();
		obj[0][1]=sheet.getRow(0).getCell(1).toString();
		obj[1][0]=sheet.getRow(1).getCell(0).toString();
		obj[1][1]=sheet.getRow(1).getCell(1).toString();
			return obj;	
	}
	@Test(dataProvider="login")
	public void receiver(String email,String password)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		driver.get("https://demowebshop.tricentis.com/login"); 
		driver.findElement(By.cssSelector(".ico-login")).click();
		driver.findElement(By.cssSelector(".email")).sendKeys(email);
		driver.findElement(By.cssSelector(".password")).sendKeys(password);
		driver.findElement(By.cssSelector("#RememberMe")).click();
		
	}
}


