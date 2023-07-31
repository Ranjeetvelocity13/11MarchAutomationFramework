package Com.Ecommerce.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration {

	Properties pro;

	public ReadConfiguration() {

		File src = new File(
				"/Users/ranjeetkendre/eclipse-workspace/11March_Automation__Framework/Configuration/Confiig.properties");
		pro = new Properties();
		try {
			FileInputStream fis = new FileInputStream(src);
			try {
				pro.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			} // Read a properties list(key and element paris from the input byte stram)
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public String getApplicationURL() {
		String URL = pro.getProperty("BaseURL");
		return URL;
	}

	public String Username() {

		String Username = pro.getProperty("Username");
		return Username;

	}

	public String Password() {

		String Password = pro.getProperty("Password");
		return Password;

	}

	public String GetChromepath() {

		String Chromepath = pro.getProperty("Chromdriver");
		return Chromepath;

	}
	public String GetFirefox() {

		String Firefox = pro.getProperty("Firefox");
		return Firefox;

	}

}
