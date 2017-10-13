package RetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

public class RetryAnalyzer implements IRetryAnalyzer {
	private int retryCount = 0;
	private int maxRetryCount = 1;
	public int ctr1 = 0;
	public int ctr2 = 0;

	@Override
	public boolean retry(ITestResult result) {
		if (!result.isSuccess()) {
			if (retryCount < maxRetryCount) {
				retryCount++;
				result.setStatus(ITestResult.SUCCESS);
				String message = Thread.currentThread().getName() + ": Error in " + result.getName() + " Retrying "
						+ (maxRetryCount + 1 - retryCount) + " more times";
				System.out.println(message);
				Reporter.log("message");
				return true;
			} else {
				result.setStatus(ITestResult.FAILURE);
			}
		}
		return false;
	}
}