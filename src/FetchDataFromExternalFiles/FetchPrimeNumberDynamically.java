package FetchDataFromExternalFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FetchPrimeNumberDynamically
{
  public static void main(String[] args) throws EncryptedDocumentException, IOException {
	  primeNum();
	
}
  
   public static void primeNum() throws EncryptedDocumentException, IOException
   {
	   File file= new File("C:\\Users\\91831\\OneDrive\\excel\\PrimeNumDataFetch.xlsx");//location of excel file
	    FileInputStream fis = new FileInputStream(file);//to read data from excel file
	    Workbook wbf = WorkbookFactory.create(fis);//representing the entire Excel workbook
	    Sheet sheet = wbf.getSheet("Sheet1");//to get the sheet from excel workbook
	    int row = sheet.getPhysicalNumberOfRows();
	   int column = sheet.getRow(0).getPhysicalNumberOfCells();
	   Object[][] obj=new Object[row][column];
	    for (int i = 0; i < row; i++)
	    {
	    	for (int j = 0; j < column; j++) 
	    	{
	    		
	    		int num = (int)Double.parseDouble(sheet.getRow(i).getCell(j).toString());	
	    		boolean isPrime= getPrime(num);
	    		if(isPrime==true) {
	    			System.out.println(num + "no is prime");
	    		}else {
	    			System.out.println(num +"no is not prime");
	    		}
			}
			
		}
	        
   }
    
    public static boolean getPrime(int num) {
    	for (int i = 2; i < num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
    	
    }
   
}

