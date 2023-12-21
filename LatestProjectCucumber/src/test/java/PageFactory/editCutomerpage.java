package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class editCutomerpage 
{
	WebDriver driver;
	// create a parameterised constructor
	public editCutomerpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	// add the xpaths below
	@FindBy(xpath="//a[@href='EditCustomer.php']")
	WebElement editCustomer;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement customerid;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement submitbutton;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitEdited;
	
	
	
	public void clickEditCustomerPage()
	{
		editCustomer.click();
	}
    public void clickCustomerId(String Cid)
    {
    	
    	customerid.sendKeys(Cid);
    }
    public void clickOnSubmitButton() throws InterruptedException
    {
    	submitbutton.click();
    	Thread.sleep(3000);
    	submitEdited.click();
    }
    
	
}
