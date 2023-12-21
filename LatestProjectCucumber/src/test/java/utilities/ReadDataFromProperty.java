package utilities;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import constants.Constants1;

public class ReadDataFromProperty 
{
	public static Properties readdataFromProperty() throws IOException
	{
	
		FileReader reader = new FileReader(Constants1.PROPERTYFILEPATH);
		// we have to create an object 
		Properties prop = new Properties();
		prop.load(reader);
		return prop;
		
	}
	public static void writeDataToProperty(Properties prop) throws IOException {
	    // Create a FileWriter object for the properties file
	    FileWriter writer = new FileWriter(Constants1.PROPERTYFILEPATH);

	    // Store the properties in the file
	    prop.store(writer, "Updated Properties");
        
	    Properties prop1 = new Properties();
	    prop1.setProperty("key1", "value1");
	    prop1.setProperty("key2", "value2");

	    // Call the method to write data to the properties file
	    writeDataToProperty(prop1);
	    // Close the FileWriter
	    writer.close();
	}

}
