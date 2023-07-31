package Com.Ecommerce.Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int count =0;  //failed
	int Retrylimit =1; //pass
	public boolean retry(ITestResult result) {
		if(count<Retrylimit) {
			count++;  
			return true;
		}
		
		return false;
	}

	
}
