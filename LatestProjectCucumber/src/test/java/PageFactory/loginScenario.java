package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.baseClass;

public class loginScenario extends baseClass
{
     WebDriver driver;
     
     //lets create a parameterized constructor to initialize the page factory 
     
     public loginScenario(WebDriver driver)
     {
    	this.driver = driver;
    	// we have to intialise all the elements present in pagefactory
    	PageFactory.initElements(driver,this);
    	
     }
	 @FindBy(xpath="//input[@type='text' and @name='uid']")
	 WebElement UserId;
	 
	 @FindBy(xpath="//input[@name='password']")
	 WebElement Password1;
	 
	 @FindBy(xpath="//input[@name='btnLogin']")
	 WebElement Login;
	 
	 // here we are passing only one parameter in the method below
	 //bcz  in feature file we have only one parameter
	 public void enteruserId(String Username) 
	 {
		UserId.sendKeys(Username);
		
	 }
	 
	 public void enterPassword(String Password)
	 {
		 Password1.sendKeys(Password);
		
	 }
	 // here we are not passing any parameter 
	 //bcz we dont have any parameter in feature file for this line
	 
	 public void clickonSubmit()
	 {
		 Login.click();
		 
	 }
	 
	 
	 
}
