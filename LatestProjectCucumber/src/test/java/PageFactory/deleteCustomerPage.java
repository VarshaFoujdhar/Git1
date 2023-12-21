package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deleteCustomerPage 
{
	WebDriver driver;
	public deleteCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[@href='DeleteCustomerInput.php']")
	WebElement deleteElement;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement dCustomerid;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Dsubmit;
	
	public void deleteCustomerIdlink()
	{
		deleteElement.click();
	}
	public void enterCustomerid(String Cid)
	{
		dCustomerid.sendKeys(Cid);
	}
	public void clickonsubmitToDelete()
	{
		Dsubmit.click();
	}

}
