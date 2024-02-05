package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSLoginPage {
	 public DWSLoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="Email")
	WebElement Email;
	public void email() {
		Email.sendKeys("pkv@gmail.com");
	}
	
	
	@FindBy(id="Password")
	WebElement Password;
	public void password() {
		Password.sendKeys("p12345");
	}
	
	@FindBy(xpath="//label[contains(text(),'Remember me')]")
	WebElement RememberMe;
	public void rememberMe(){
		RememberMe.click();
	}
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement Login;
	public void login(){
		Login.click();
	}
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement LogOut;
	public void logout(){
		LogOut.click();
	}
	
	
	
	
	

}
