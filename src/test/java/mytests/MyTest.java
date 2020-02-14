package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

/* To retry/re run the failed TestCase
 * 1)@Test level--we implemented retry logic by implementing IRetryAnalyzer interface at @Test level
 * 2)At Run time--we implemented retry logic by implementing IRetryAnalyzer interface and then create another
 * 	class which implement IAnnotationTransformer interface which have transform().
*/
public class MyTest {
	
	
	//@Test(retryAnalyzer= Analyzer.RetryAnalyzer.class)//it will retry 3 times
	@Test //no need to to write it will execute automatically for multiple TestCase,if we implementing 
	      //IAnnotationTransformer interface
	public void testcase1() {
		Assert.assertEquals(false, true);
	}
	
	
	@Test
	public void testcase2() {
		Assert.assertEquals(false, true);
	}
	
	

	@Test//get pass so no retry will be done on this testcase.
	public void testcase3() {
		Assert.assertEquals(true, true);
	}
	
	
}
