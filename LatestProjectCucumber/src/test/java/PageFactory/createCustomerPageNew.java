package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createCustomerPageNew
{
	WebDriver driver;
	//create a parametrised constructor to intialize the page factory
	public createCustomerPageNew(WebDriver driver)
	{
		// we are using this keyword bcz both have same name driver
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	@FindBy(xpath="//a[@href='addcustomerpage.php']")
	WebElement NewCustomerlink;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement Customer_name;
	
	@FindBy(xpath="//input[@value='f']")
	WebElement Gender;
	
	@FindBy(xpath="//input[@type='date']")
	WebElement DOB;
	
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement Addr1;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement City;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement State;
	
	@FindBy(xpath="//input[@name='sub']")
	WebElement Submit;
	
	@FindBy(xpath="//*[@id='customer']/tbody/tr[4]/td[2]")
	WebElement getid;
	
	public void clickOnNewCustomerLink()
	{
		NewCustomerlink.click();
	}
	//we have to create a page passing as a parameter
	public void addCustomerName(String custname)
	{
		// we have to pass same name mentioned in argument
		Customer_name.sendKeys(custname);
	}
	public void selectGender()
	{
		//select the gender
		Gender.click();
	}
	public void enterDOB(String DateofBirth)
	{
		//enter the date of birth
		DOB.sendKeys(DateofBirth);
	}
	public void enteraddr(String Addr)
	{
		//enter the address
		Addr1.sendKeys(Addr);
	}
	public void city(String city)
	{
		//enter the city name
		City.sendKeys(city);
	}
	public void state(String state)
	{
		//enter the state name
		State.sendKeys(state);
	}
	public void submit()
	{
		Submit.click();
	}
	public String getid()
	{
		return getid.getText();
		
	}

}
