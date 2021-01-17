package AndroidCalculator.pages;

import AndroidCalculator.utils.ExtentReports.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ButtonsFunctionsMethods {

    private final AndroidDriver<AndroidElement> driver;

    public ButtonsFunctionsMethods (AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Number buttons
    @AndroidFindBy(id = "com.android.calculator2:id/digit_0")
    private AndroidElement num0;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_1")
    private AndroidElement num1;
    @AndroidFindBy (id = "com.android.calculator2:id/digit_2")
    private AndroidElement num2;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_3")
    private AndroidElement num3;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_4")
    private AndroidElement num4;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_5")
    private AndroidElement num5;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_6")
    private AndroidElement num6;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_7")
    private AndroidElement num7;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_8")
    private AndroidElement num8;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_9")
    private AndroidElement num9;

    // Input field
    @AndroidFindBy(id = "com.android.calculator2:id/formula")
    private AndroidElement formula;

    // Result field
    @AndroidFindBy(id = "com.android.calculator2:id/result")
    private AndroidElement result;

    // Function buttons
    @AndroidFindBy(id = "com.android.calculator2:id/op_add")
    private AndroidElement plus;
    @AndroidFindBy(id = "com.android.calculator2:id/op_sub")
    private AndroidElement minus;
    @AndroidFindBy(id = "com.android.calculator2:id/op_mul")
    private AndroidElement multiply;
    @AndroidFindBy(id = "com.android.calculator2:id/op_div")
    private AndroidElement divide;
    @AndroidFindBy(id = "com.android.calculator2:id/op_pct")
    private AndroidElement percentage;

    // Other buttons
    @AndroidFindBy(id = "com.android.calculator2:id/eq")
    private AndroidElement equals;
    @AndroidFindBy(id = "com.android.calculator2:id/dec_point")
    private AndroidElement decimal_point;
    @AndroidFindBy(id = "com.android.calculator2:id/del")
    private AndroidElement backspace;
    @AndroidFindBy(id = "com.android.calculator2:id/op_clr")
    private AndroidElement clear;

    // Memory function buttons
    @AndroidFindBy(id = "com.android.calculator2:id/memory_clear")
    private AndroidElement memory_clear;
    @AndroidFindBy(id = "com.android.calculator2:id/memory_recall")
    private AndroidElement memory_recall;
    @AndroidFindBy(id = "com.android.calculator2:id/memory_plus")
    private AndroidElement memory_plus;
    @AndroidFindBy(id = "com.android.calculator2:id/memory_minus")
    private AndroidElement memory_minus;

    public void Sum() {
        ExtentTestManager.getTest().log(LogStatus.INFO,"2) Insert number 1.5 in Calculator");
        num1.click();
        decimal_point.click();
        num5.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"3) Press plus ➡ +");
        plus.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"4) Press number 2 ");
        num2.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"5) Press equals ➡ =");
        equals.click();
    }

    public void Subtract () {
        ExtentTestManager.getTest().log(LogStatus.INFO,"2) Press number 5");
        num5.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"3) Press minus ➡ -");
        minus.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"4) Press number 1");
        num1.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"5) Press minus ➡ -");
        minus.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"6) Press number 9");
        num9.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"7) Press equals ➡ =");
        equals.click();
    }

    public void Multiply() {
        ExtentTestManager.getTest().log(LogStatus.INFO,"2) Press number 4");
        num4.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"3) Press multiply ➡ *");
        multiply.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"4) Press number 1");
        num1.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"5) Press multiply ➡ *");
        multiply.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"6) Press number 0");
        num0.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"7) Press equals ➡ =");
        equals.click();
    }

    public void Divide() {
        ExtentTestManager.getTest().log(LogStatus.INFO,"2) Insert number 12 in Calculator");
        num1.click();
        num2.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"3) Press divide ➡ /");
        divide.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"4) Press number 2");
        num2.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"5) Press divide ➡ /");
        divide.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"6) Press number 3");
        num3.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"7) Press equals ➡ =");
        equals.click();

    }

    public void DivideByZero() {
        ExtentTestManager.getTest().log(LogStatus.INFO,"2) Insert number 78 in Calculator");
        num7.click();
        num8.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"3) Press divide ➡ /");
        divide.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"4) Press number 2");
        num2.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"5) Press divide ➡ /");
        divide.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"6) Press number 0");
        num0.click();
    }

    public void CombinedOperations() {
        ExtentTestManager.getTest().log(LogStatus.INFO,"2) Insert number 123 in Calculator");
        num1.click();
        num2.click();
        num3.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"3) Press divide ➡ /");
        divide.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"4) Insert number 3");
        num3.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"5) Press multiply ➡ *");
        multiply.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"6) Insert number 5");
        num5.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"7) Press plus ➡ +");
        plus.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"8) Insert number 20");
        num2.click();
        num0.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"9) Press minus ➡ -");
        minus.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"10) Insert number 125");
        num1.click();
        num2.click();
        num5.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"11) Press plus ➡ +");
        plus.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"12) Press number 5");
        num5.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"13) Press equals ➡ =");
        equals.click();
    }

    public void Percentage() {
        ExtentTestManager.getTest().log(LogStatus.INFO,"2) Insert number 25 in Calculator");
        num2.click();
        num5.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"3) Press button percentage ➡ %");
        percentage.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"4) Insert number 200");
        num2.click();
        num0.click();
        num0.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"5) Press equals ➡ =");
        equals.click();
    }

    public void MemoryPlus() {
        ExtentTestManager.getTest().log(LogStatus.INFO,"2) Insert number 86 in Calculator");
        num8.click();
        num6.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"3) Press button M+");
        memory_plus.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"4) Press button C");
        clear.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"5) Press button MR");
        memory_recall.click();
    }

    public void MemoryMinus() {
        ExtentTestManager.getTest().log(LogStatus.INFO,"2) Insert number 86 in Calculator");
        num8.click();
        num6.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"3) Press button M+");
        memory_plus.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"4) Press button C");
        clear.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"5) Press button MR");
        memory_recall.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"6) Insert number 6");
        num6.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"7) Press button M-");
        memory_minus.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"8) Press button C");
        clear.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"9) Press button MR");
        memory_recall.click();
    }

    public void CombineMemoryFunctionsAndMemoryClear() {
        ExtentTestManager.getTest().log(LogStatus.INFO,"2) Insert number 35 in Calculator");
        num3.click();
        num5.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"3) Press M+ button");
        memory_plus.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"4) Press C button");
        clear.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"5) Press MR button");
        memory_recall.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"6) Insert number 65 in Calculator");
        num6.click();
        num5.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"7) Press M+ button");
        memory_plus.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"8) Press C button");
        clear.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"9) Press MR button");
        memory_recall.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"10) Insert number 50 in Calculator");
        num5.click();
        num0.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"11) Press M- button");
        memory_minus.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"12) Press C button");
        clear.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"13) Press MR button");
        memory_recall.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"14) Press MC button");
        memory_clear.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"15) Press C button");
        clear.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"16) Press MR button");
        memory_recall.click();
    }

    public void Backspace() {
        ExtentTestManager.getTest().log(LogStatus.INFO,"2) Insert number 25004 in Calculator");
        num2.click();
        num5.click();
        num0.click();
        num0.click();
        num4.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"3) Press button backspace delete 2x");
        backspace.click();
        backspace.click();
    }

    public void Clear() {
        ExtentTestManager.getTest().log(LogStatus.INFO,"2) Insert number 63200 in Calculator");
        num6.click();
        num3.click();
        num2.click();
        num0.click();
        num0.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"3) Press button C");
        clear.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public AndroidElement ReadResultAfterEquals() {
        formula.toString();
        return formula;
    }

    public AndroidElement ReadResultBeforeEquals() {
        result.toString();
        return result;
    }

    public void CloseApp() {
        driver.terminateApp("com.android.calculator2");
        driver.navigate().back();
    }
}
