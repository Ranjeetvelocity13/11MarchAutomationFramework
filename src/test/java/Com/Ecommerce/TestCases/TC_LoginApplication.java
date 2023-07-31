package Com.Ecommerce.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClas.Ecommerce_BaseClass;
import Com.Ecommerce.PageClasses.TC_Ecommerce_Login_Page;
import Com.Ecommerce.Utilities.GenericUtils;

public class TC_LoginApplication extends Ecommerce_BaseClass{

	@Test
	public void Login() throws InterruptedException, IOException {
		
	
	TC_Ecommerce_Login_Page TEL =new TC_Ecommerce_Login_Page();
		
		TEL.SetUsername(Username);
		logger.info("Enter the user email");
		
		Thread.sleep(2000);
		
		TEL.SetPassword(password);
		logger.info("Enter the user password");
		
		TEL.ClickButton();
		logger.info("Click on the login button");

		String Title=driver.getTitle();
		
		if(Title.equals("nopCommerce demo store")) {
			
			AssertJUnit.assertTrue(true);
			logger.info("Login test case pass");

		}
		else {
			GenericUtils.getScreenshotAs(Title, driver);
			AssertJUnit.assertTrue(false);
			logger.info("Login test case failed");
		}

	}
}
