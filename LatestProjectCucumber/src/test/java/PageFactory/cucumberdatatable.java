package PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;

public class cucumberdatatable 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pin;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement mnumber;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;
     
	public cucumberdatatable(WebDriver driver)
    {
   	this.driver = driver;
   	// we have to intialise all the elements present in pagefactory
   	PageFactory.initElements(driver,this);
   	
    }
	public void datatable(DataTable credentials) throws InterruptedException 
	{
		//we are converting the datatable into list storing it in data list
	     List<List<String>> userslist = credentials.asLists(String.class);
	     
	     // we are sending data in pin field
	     enterPin(userslist.get(0).get(0));
	     
	     // we are sending data to mobile number
	     enterMobileNumber(userslist.get(0).get(1));
	     
         //we are sending  numbers to email 
	     enterEmail(userslist.get(0).get(2));
	     
         // we are sending the data to password
	     enterPassword(userslist.get(0).get(3));
	}
		public void enterPin(String pinvalue) 
		{
			pin.sendKeys(pinvalue);
		}
		public void enterMobileNumber(String mobilenumber) 
		{
			mnumber.sendKeys(mobilenumber);
		}
		public void enterEmail(String emailid)
		{
			email.sendKeys(emailid);
		}
		public void enterPassword(String password)
		{
			pwd.sendKeys(password);
		}
	
}
