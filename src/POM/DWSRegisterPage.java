package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSRegisterPage {
	 public DWSRegisterPage(WebDriver driver){
			PageFactory.initElements(driver,this);
		}
	 
	 @FindBy(id="gender-female")
		WebElement Gender;
		public void femaleGender() {
			Gender.click();
		}
		
     @FindBy(id="FirstName")
		WebElement FirstName;
		public void firstName() {
		 FirstName.sendKeys("kriti");
	   }
		
	 @FindBy(id="LastName")
		WebElement LastName;
		public void lastName() {
		 LastName.sendKeys("Vyas");
	 }
		
		 @FindBy(id="Email")
			WebElement Email;
			public void email() {
			 Email.sendKeys("kkpp@gmail.com");
		   }
			
			 @FindBy(id="Password")
				WebElement Password;
				public void password() {
					Password.sendKeys("k223344");
			   }
				
		 @FindBy(id="ConfirmPassword")
		    WebElement ConfirmPassword;
			public void confirmPassword() {
				ConfirmPassword.sendKeys("k223344");
     	   }
			
			 @FindBy(id="register-button")
				WebElement RegisterButton;
				public void registerButton() {
				 RegisterButton.click();;
			   }
					
			
			
		
			
			

}
