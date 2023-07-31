package Com.Ecommerce.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WaitUtils {
	WebDriver mydriverl = null;

	public static int IMPLICIT_WAIT = 15;

	public static int PAGE_LOAD_TIMEOUT = 15;

	
	public void waitUtil(final WebDriver driver) {
		this.mydriverl=driver;
	}
	
	public void modifyImplicitwaitTime(final long seconds) {
		this.mydriverl.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
}
