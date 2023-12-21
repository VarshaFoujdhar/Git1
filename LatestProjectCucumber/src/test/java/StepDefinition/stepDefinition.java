
package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import PageFactory.createCustomerPageNew;
import PageFactory.cucumberdatatable;
import PageFactory.deleteCustomerPage;
import PageFactory.editCutomerpage;
import PageFactory.loginScenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.baseClass;

public class stepDefinition extends baseClass
{
	// to fulfill first step we will initialize driver
    WebDriver driver=	baseClass.initializeDriver();
    
    
    
    //we need to create object in order to call the constructor and 
    //driver is given bcz its parametrised
    loginScenario obj = new loginScenario(driver);
    
  //Create an object and import the pagefactory 
    createCustomerPageNew object = new createCustomerPageNew(driver);
    
    // created object to get the details from cucumber table
    cucumberdatatable object1 = new cucumberdatatable(driver);
    
    
    //created object to get customer details to edit the details
    editCutomerpage object2 = new editCutomerpage(driver);
    
    //created object to delete customer details
    deleteCustomerPage object3 = new deleteCustomerPage(driver);
    
    
    // in the below we only call the methods we dont create methods in stepdefinition
    @Given("User logins into the application")
    public void user_logins_into_the_application() throws IOException 
    {
        
    	System.out.println("User login is successfull");
    	
    	
    }

    @Given("User will enter the {string}")
    public void user_will_enter_the(String Username) throws InterruptedException
    {
        
    	obj.enteruserId(Username);
    	AddHardcodedWait();
    }

    @Given("user will Enter the {string}")
    public void user_will_enter_the1(String Password) 
    {
        obj.enterPassword(Password);
        
    }

    @When("user will click on the login button")
    public void user_will_click_on_the_login_button() throws InterruptedException 
    {
    	obj.clickonSubmit();
    	AddHardcodedWait();
    }

    @Then("User will be navigated to home page.")
    public void user_will_be_navigated_to_home_page()
    {
    	getTitleofPage();  
    	//this method is being called from base class
    	
    	
    }
    
    @Given("User is landed on the homepage of the application.")
    public void user_is_landed_on_the_homepage_of_the_application() throws IOException 
    {
    	System.out.println("User landed in the hompage successfully");
    	takesScreenshotMethod();
    	System.out.println("Screenshot of homepage is captured successfully");
        
    }
    
    
    
    @Then("User will click on the New Customer link")
    public void user_will_click_on_the_new_customer_link() throws InterruptedException 
    {
        object.clickOnNewCustomerLink();
        Thread.sleep(3000);
    }

    @Then("User will enter the customer name as  {string}")
    public void user_will_enter_the_customer_name_as(String CName) throws InterruptedException 
    {
    	Thread.sleep(3000);
        object.addCustomerName(CName);
    }

    @Then("User will select Gender")
    public void user_will_select_gender() 
    {
        object.selectGender();
    }

    @Then("user will enter the Date of birth {string}")
    public void user_will_enter_the_date_of_birth(String DOB) 
    {
        object.enterDOB(DOB);
    }
    
    @Given("user will enter the address {string}")
    public void user_will_enter_the_address(String Addr) 
    {
        object.enteraddr(Addr);
    }

    @Given("user will enter the city name {string}")
    public void user_will_enter_the_city_name(String City) 
    {
    	object.city(City);
    }

    @Given("user will enter the State name {string}")
    public void user_will_enter_the_state_name(String State) 
    {
       object.state(State);
    }
    
    @Given("user will enter the pin name {string}")
    public void user_will_enter_the_pin_name(String pin) 
    {
    	object1.enterPin(pin);
        
    }

    @Given("user will enter the mobile number {string}")
    public void user_will_enter_the_mobile_number(String mnumber)
    {
    	 object1.enterMobileNumber(mnumber);
       
    }

    @Given("user will enter the email number {string}")
    public void user_will_enter_the_email_number(String email) 
    {
    	object1.enterEmail(email);
        
    }

    @Given("user will enter the password {string}")
    public void user_will_enter_the_password(String pwd) 
    {
    	object1.enterPassword(pwd);
        
    }
    @When("user will click on the submit button.")
    public void user_will_click_on_the_submit_button() throws InterruptedException 
    {
       object.submit();
       AddHardcodedWait();
       
    }
    @Then("new customer id is created successfully.")
    public void new_customer_id_is_created_successfully() throws IOException 
    {
    	ScrollDown();
        takesScreenshotMethod();
        System.out.println("New customer  id is created successfully..!!");
        
    }
    @Then("get the customer id to edit the customer.")
    public void get_the_customer_id_to_edit_the_customer() 
    {
    	String str = object.getid();
    	System.out.println("The cid is captured successfully:  "+ str);
    }
    //Below implementation methods are for edit customer page
    
    
    @Given("User landed on the home page.")
    public void user_landed_on_the_home_page() 
    {
        System.out.println("User landed on homepage successfully..!!");
    }

    @Given("User will click on edit cutomer link.")
    public void user_will_click_on_edit_cutomer_link() 
    {
        object2.clickEditCustomerPage();
    }
    @Given("User will enter customer id {string}.")
    public void user_will_enter_customer_id(String Cid) throws InterruptedException 
    {
    	Thread.sleep(3000);
        object2.clickCustomerId(Cid);
        
    }
    

    @Given("user will click on submit button.")
    public void user_will_click_on_submit_button() throws InterruptedException 
    {
        object2.clickOnSubmitButton();
    }
    

    @Then("user should click ok on the alert message.")
    public void user_should_click_ok_on_the_alert_message() throws InterruptedException 
    {
    	
    	Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
    }
    
    // Below implementation methods are related to edit customer page.
    
    @Given("User will click on delete cutomer link.")
    public void user_will_click_on_delete_cutomer_link() throws InterruptedException 
    {
    	
    	object3.deleteCustomerIdlink();
        
    }

    @Given("User will enter customer id to be deleted {string}.")
    public void user_will_enter_customer_id_to_be_deleted(String Cid) throws InterruptedException 
    {
    	Thread.sleep(3000);
        object3.enterCustomerid(Cid);
    }

    @Given("user will click on submit button to delete customer.")
    public void user_will_click_on_submit_button_to_delete_customer() throws InterruptedException 
    {
       object3.clickonsubmitToDelete();
       
    }

    @Then("user will click ok on the alert message and capture the message.")
    public void user_will_click_ok_on_the_alert_message_and_capture_the_message() throws InterruptedException 
    {
    	Thread.sleep(3000);
    	Alert alert = driver.switchTo().alert();
        String confirmMessage = alert.getText();
        System.out.println(confirmMessage);
        alert.accept();
        System.out.println("Customer Id deleted successfully..!!");
        String deletedMessage = alert.getText();
        System.out.println(deletedMessage);
    }
    
    
    
}	
