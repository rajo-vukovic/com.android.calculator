package AndroidCalculator.utils.Listeners;



import AndroidCalculator.tests.BaseTest;
import AndroidCalculator.utils.ExtentReports.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    private int count = 0;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {
            int maxTry = 0;
            if (count < maxTry) {
                count++;
                iTestResult.setStatus(ITestResult.FAILURE);
                extendReportsFailOperations(iTestResult);
                return true;
            }
        }
        else {
            iTestResult.setStatus(ITestResult.SUCCESS);
        }
        return false;
    }

    public void extendReportsFailOperations(ITestResult iTestResult) {
        Object testClass = iTestResult.getInstance();
        AndroidDriver ADriver = ((BaseTest) testClass).driver;
        String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) ADriver).getScreenshotAs(OutputType.BASE64);
        ExtentTestManager.getTest().log(LogStatus.FAIL, "Test Failed",
                ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
    }
}

