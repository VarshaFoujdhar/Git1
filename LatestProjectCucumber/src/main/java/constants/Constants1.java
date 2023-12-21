package constants;

public class Constants1 
{
	//public bcz should be accessible for all
		// static bcz its easy to call with class name no need to create object
		//final bcz it is fixed we dont change the value 
	   public static final String TESTDATAPATH = "G:\\Testdata04-12\\TestData.xlsx";
	   // path to store the screenshot image 
	   // math.random is given so that new images are created instead of replacing the same one
	   public static final String SCREENSHOT_PATH = "F:\\Grotech_Minds\\LatestProjectCucumber\\target\\screenshot"+Math.random()+"pic1.jpg";
       public static final String PROPERTYFILEPATH = "src/main/java/constants/GlobalData.properties";
       public static final String WRITEPATH = "G:\\Testdata04-12\\Test.xlsx";

}
