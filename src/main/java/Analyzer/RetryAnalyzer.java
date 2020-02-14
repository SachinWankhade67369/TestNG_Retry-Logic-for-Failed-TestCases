package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//IRetryAnalyzer is an interface which is coming from TestNG which have unimplemented method called
//retry(ITestResult r) which return boolean value.
public class RetryAnalyzer implements IRetryAnalyzer{
	
	int counter=0;
	int retryLimit=3;
	
	public boolean retry(ITestResult result) {
		
		if(counter < retryLimit) {
			counter++;
			return true;
		}
		return false;
		
	}

}
