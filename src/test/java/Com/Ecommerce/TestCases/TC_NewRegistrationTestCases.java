package Com.Ecommerce.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClas.Ecommerce_BaseClass;
import Com.Ecommerce.PageClasses.TC_NewRegistration;
import net.bytebuddy.utility.RandomString;

public class TC_NewRegistrationTestCases extends Ecommerce_BaseClass {

	@Test
	public void Registration() throws InterruptedException {

		TC_NewRegistration TNR = new TC_NewRegistration();

		TNR.NewRegistration();
		logger.info("Click on the registration tab");

		TNR.Selectgender();
		logger.info("Select gender");

		TNR.SetFirstName("Ketan");
		logger.info("Enter users first name");

		TNR.SetLastName("Patil");
		logger.info("Enter users Last name");

		String Name = RandomString.make(5);
		TNR.SetEmail(Name + "Ketan@gmail.com");
		logger.info("Enter users mailid");

		TNR.SetPasword("Pune@123");
		logger.info("Enter users password");

		TNR.SetConfirmedPass("Pune@123");

		TNR.RegButton();
		logger.info("Click on the registration tab");

		Thread.sleep(2000);

		boolean Test = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"))
				.isDisplayed();

		if (Test == true) {
			logger.info("registration test case pass");
			AssertJUnit.assertTrue(true);
		} else {
			logger.info("registration test case pass");
			AssertJUnit.assertTrue(false);

		}
		}

}
