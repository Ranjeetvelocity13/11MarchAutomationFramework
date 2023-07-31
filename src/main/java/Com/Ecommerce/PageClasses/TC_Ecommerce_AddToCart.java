package Com.Ecommerce.PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import Com.Ecommerce.BaseClas.Ecommerce_BaseClass;
import Com.Ecommerce.Utilities.GenericUtils;

public class TC_Ecommerce_AddToCart extends Ecommerce_BaseClass {

	//1.
	public TC_Ecommerce_AddToCart() {
		
		PageFactory.initElements(driver, this);
	}	
	//2.	
	//diff  - pom and page factory
	
	@FindBy(xpath = "//a[contains(text(),'Computers ')]")
	public WebElement Com;
	
	@FindBy(xpath = "//a[contains(text(),'Notebooks ')]")
	public WebElement Notebook;
	
	@FindBy(xpath = "//a[contains(text(),'Apple MacBook Pro 13-inch')]")
	public WebElement SelectMackbook;
	
	@FindBy(id = "add-to-cart-button-4")
	private WebElement Addtocart;
	
	@FindBy(xpath = "//p[contains(text(),'The product has been added to your ')]")
	public WebElement Message;
		
	@FindBy(xpath = "//span[@title=\"Close\"]")
	public WebElement CloseTab;
		
	//3.
	public void NoteBook() {
		Notebook.click();
	}
	public void SelectProduct() {	
		GenericUtils.ClickElementUsingJavaScript(SelectMackbook, driver);
	}
	public void AdsToCart() {
		Addtocart.click();
	}	
	public void ProductAdded() {
		Message.isDisplayed();
	}
	public void Close() {
		CloseTab.click();
	}
	
    public void Product() {
		
		By input1=By.xpath("//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]");
		
	    boolean result=GenericUtils.Waitforelement(driver, input1, 20).isDisplayed();
	    
		if (result == true) {
			logger.info("add tocart test case pass");
			AssertJUnit.assertTrue(true);
		} else {
			logger.info("addto cart test case failed");
			AssertJUnit.assertTrue(false);

		} 
		
	}
	
}

