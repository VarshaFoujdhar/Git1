package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import constants.Constants1;

public class baseClass 
{
	public static WebDriver driver;
	public static String browsername;
	
	
	static ReadDataFromProperty obj2 = new ReadDataFromProperty();
	
	
	public static WebDriver initializeDriver() 
	{
//		driver = new ChromeDriver();
//		// get chrome driver and maximize it 
//		driver.manage().window().maximize();
//		//get the url from excel class
//		try {
//			driver.get(GetdataFromExcel.geturl());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//return the url this will navigate user to webpage
//		return driver;
		
		
		try {
			browsername = ReadDataFromProperty.readdataFromProperty().getProperty("browser");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			try {
				driver.get(GetdataFromExcel.geturl());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
		}
		
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			try {
				driver.get(GetdataFromExcel.geturl());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
		}
		
		else if(browsername.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			try {
				driver.get(GetdataFromExcel.geturl());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
		}
		else
		{
			System.out.println("Incorrect Browser selected");
		}
		
			return driver;
		}
	
   // getting the title of page and calling it in stepdefinition
	public static void getTitleofPage()
	{
		String Title = driver.getTitle();
		System.out.println("Title of the page is :  "+ Title);
	}
	// add hardcoded wait and call it in stepdefinition 
	public static void AddHardcodedWait() throws InterruptedException {
		Thread.sleep(3000);
	}
	// we will write the code to take screenshot of the issue
	public static void takesScreenshotMethod() throws IOException
	{
		TakesScreenshot srcshot = (TakesScreenshot)driver;
		File SrcFile = srcshot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(Constants1.SCREENSHOT_PATH);
		FileUtils.copyFile(SrcFile, DestFile);
		
	}
	// the below methods is written to scroll down the page
	public static void ScrollDown()
	{
		
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,500)");
		
	}
	 
	

}

