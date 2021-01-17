package AndroidCalculator.utils.ExtentReports;


import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

    private static ExtentReports extent;

    public synchronized static ExtentReports getReporter() {
        if (extent == null) {
            //Set HTML reporting file location
            String workingDir = System.getProperty("user.dir");
            extent = new ExtentReports(workingDir + "\\ExtentReports\\ExtentReportResults.html", true);
            extent.addSystemInfo("Project Name","Automation testing of Android app - Calculator");
            extent.addSystemInfo("Platform Name", "Android");
            extent.addSystemInfo("Platform Version", "8.0.0");
            extent.addSystemInfo("Device Name", "Huawei P10 lite");
            extent.addSystemInfo("App Name", "Calculator");
            extent.addSystemInfo("Tester","Rajo V.");
            extent.addSystemInfo("Host Name", "");
            extent.addSystemInfo("User Name", "");
        }
        return extent;
    }
}
