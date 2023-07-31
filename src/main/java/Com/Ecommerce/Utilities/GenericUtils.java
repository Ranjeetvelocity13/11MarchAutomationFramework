package Com.Ecommerce.Utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Ecommerce.BaseClas.Ecommerce_BaseClass;
import io.netty.handler.timeout.TimeoutException;

public class GenericUtils extends Ecommerce_BaseClass {
	
	
	public static String getScreenshotAs(String TestCasename,WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

		String Name = "- Screenshot -" + Timestamp;

	    Path resourceDirectory = Paths.get("src","test","resources");
		
		String absolutePath = resourceDirectory.toFile().getAbsolutePath();
		
		System.out.println(absolutePath);
				
		String destination = absolutePath+"/Screenshot/" + TestCasename + "" + Name + ".png";

		FileUtils.copyFile(source, new File(destination));

		return destination;
		
	}
	
	public static void ClickElementUsingJavaScript(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	
	}
	
	
	public static  WebElement Waitforelement(WebDriver driver, By Locator, int timout) {
		
	WebDriverWait MyWait = new WebDriverWait(driver, Duration.ofSeconds(timout));
	
	MyWait.until(ExpectedConditions.presenceOfElementLocated(Locator));
	
    return driver.findElement(Locator);
	
    
	}

}
