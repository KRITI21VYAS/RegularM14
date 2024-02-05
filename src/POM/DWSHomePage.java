package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DWSHomePage 
{
	
  public DWSHomePage(WebDriver driver) //constructor
   {
	 PageFactory.initElements(driver, this);
   }
  
   @FindBy(id="small-searchterms") //finding the web element
   WebElement SearchField;   //variable for doing action
   public void searchField() {    //method which is performing the action on the webElement {
	   SearchField.sendKeys("kriti");  
   }
   
   @FindBy(xpath="//input[@class='button-1 search-box-button']")
   WebElement SearchButton;     //variable for doing action
   public void searchButton() {
	   SearchButton.click();
   }
   
   @FindBy(xpath="//a[text()='Register']")
   WebElement Register;
   public void register(){
    	Register.click();
    }
    
    @FindBy(xpath="//a[text()='Log in']")
    WebElement Login;
   public void login(){
     	Login.click();
     	
     }
     
     
     @FindBy(xpath="//a[text()='Shopping cart']")
     WebElement Shopping_Cart;
   public void shopping_Cart(){
    	  Shopping_Cart.click();
      }
      
      
      @FindBy(xpath="//a[text()='Wishlist']")
      WebElement WishList;
   public void Wishlist(){
	    WishList.click();
       }
      
   
   @FindBy(xpath="(//a[contains(text(),'Books')])[1]")
   WebElement Books;
    public void books(){
  	  Books.click();
    }
    
    @FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
    WebElement Computers;
     public void computers(){
   	  Computers.click();
     }
     
    
    @FindBy(xpath="(//a[contains(text(),'Electronics')])[1]")
    WebElement Electronics;
     public void electronics(){
    	 Electronics.click();
     }
     
     
     @FindBy(xpath="(//a[contains(text(),'Apparel & Shoes')])[1]")
     WebElement Apparel_Shoes;
      public void apparel_shoes() {
    	  Apparel_Shoes.click();
      }
      
      @FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
      WebElement Jewelry;
       public void jewelry(){
    	   Jewelry.click();
       }
       
       @FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]")
       WebElement GiftCards;
       public void giftCards() {
    	   GiftCards.click();
       }
       

       @FindBy(id="newsletter-email")
       WebElement NewsLetter;
       public void newsLetterSignUp() {
    	   NewsLetter.sendKeys("pkv@gmail.com");     
       }
       
       @FindBy(id="newsletter-subscribe-button")
       WebElement NewsLetterSubscribe;
       public void newsLetterSubscribe() {
    	   NewsLetterSubscribe.click();    
       }
       
       
      
}
