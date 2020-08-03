package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utilities {
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to read configurations properties file
	 */
	

	public  String readPropertiesFile(String key) throws IOException {

		FileInputStream fis = null;
		Properties prop = null;
		String fileName=System.getProperty("user.dir") + "//src//main//java//configs//globalParameters.properties";

		try {
			fis = new FileInputStream(fileName);
			prop = new Properties();
			prop.load(fis);

		} 
		catch(FileNotFoundException e) {
			e.printStackTrace();

		} catch(IOException ioe) {
			ioe.printStackTrace();

		} finally {
			fis.close();
		}
		return prop.getProperty(key);
	}
}

