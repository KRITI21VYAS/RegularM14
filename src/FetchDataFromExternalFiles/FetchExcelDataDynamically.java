package FetchDataFromExternalFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FetchExcelDataDynamically
{
  @DataProvider(name="login")
  public Object[][] login() throws EncryptedDocumentException, IOException 
  {
	 File file = new File("C:\\Users\\91831\\OneDrive\\loginfile.xlsx"); 
	 FileInputStream fis= new FileInputStream(file);
	 Workbook wbf = WorkbookFactory.create(fis);
	 Sheet sheet = wbf.getSheet("Sheet1");
	int row = sheet.getPhysicalNumberOfRows();
	int column = sheet.getRow(0).getPhysicalNumberOfCells();
     Object[][]obj=new Object[row][column];
     for (int i = 0; i < row; i++)
     {
		for (int j = 0; j < column; j++) {
			obj[i][j]=sheet.getRow(i).getCell(j).toString();
		}
	}
     return obj;
  }

     @Test(dataProvider="login")
     public void receiver()
     {
	 
     }
}