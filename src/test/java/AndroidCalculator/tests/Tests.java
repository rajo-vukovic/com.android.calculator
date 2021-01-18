package AndroidCalculator.tests;

import AndroidCalculator.pages.ButtonsFunctionsMethods;
import AndroidCalculator.utils.ExtentReports.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidElement;
import org.springframework.core.annotation.Order;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Tests extends BaseTest {

    @Order
    @Test (priority = 1)
    public void Sum (Method method) {
        ExtentTestManager.startTest(method.getName(), "Test of sum two numbers.");
        ExtentTestManager.getTest().log(LogStatus.INFO,"1) Open Android app - Calculator");
        ButtonsFunctionsMethods sum = new ButtonsFunctionsMethods(driver);
        ButtonsFunctionsMethods formula = new ButtonsFunctionsMethods(driver);
        sum.Sum();
        AndroidElement result = formula.ReadResultAfterEquals();
        ExtentTestManager.getTest().log(LogStatus.INFO,"6) Expected result is: 5 ➡ Observe test");
        Assert.assertEquals(result.getText(),"5");
    }

    @Order
    @Test (priority = 0)
    public void Subtract (Method method) {
        ExtentTestManager.startTest(method.getName(), "Test of subtraction three numbers.");
        ExtentTestManager.getTest().log(LogStatus.INFO,"1) Open Android app - Calculator");
        ButtonsFunctionsMethods sub = new ButtonsFunctionsMethods(driver);
        ButtonsFunctionsMethods formula = new ButtonsFunctionsMethods(driver);
        sub.Subtract();
        AndroidElement result = formula.ReadResultAfterEquals();
        ExtentTestManager.getTest().log(LogStatus.INFO,"8) Expected result is: -5 ➡ Observe test");
        Assert.assertEquals(result.getText(), "−5");
    }

    @Order
    @Test (priority = 2)
    public void Multiply (Method method) {
        ExtentTestManager.startTest(method.getName(), "Test of multiplication three numbers.");
        ExtentTestManager.getTest().log(LogStatus.INFO,"1) Open Android app - Calculator");
        ButtonsFunctionsMethods mul = new ButtonsFunctionsMethods(driver);
        ButtonsFunctionsMethods formula = new ButtonsFunctionsMethods(driver);
        mul.Multiply();
        AndroidElement result = formula.ReadResultAfterEquals();
        ExtentTestManager.getTest().log(LogStatus.INFO,"8) Expected result is: 0 ➡ Observe test");
        Assert.assertEquals(result.getText(),"0");
    }

    @Order
    @Test (priority = 3)
    public void Divide (Method method) {
        ExtentTestManager.startTest(method.getName(), "Test of dividing three numbers.");
        ExtentTestManager.getTest().log(LogStatus.INFO,"1) Open Android app - Calculator");
        ButtonsFunctionsMethods div = new ButtonsFunctionsMethods(driver);
        ButtonsFunctionsMethods formula = new ButtonsFunctionsMethods(driver);
        div.Divide();
        AndroidElement result = formula.ReadResultAfterEquals();
        ExtentTestManager.getTest().log(LogStatus.INFO,"8) Expected result is: 2 ➡ Observe test");
        Assert.assertEquals(result.getText(),"2");
    }

    @Order
    @Test (priority = 4)
    public void DivideByZero (Method method) {
        ExtentTestManager.startTest(method.getName(), "Test of dividing number(s) by the zero.");
        ExtentTestManager.getTest().log(LogStatus.INFO,"1) Open Android app - Calculator");
        ButtonsFunctionsMethods divbyzero = new ButtonsFunctionsMethods(driver);
        ButtonsFunctionsMethods formula = new ButtonsFunctionsMethods(driver);
        divbyzero.DivideByZero();
        AndroidElement result = formula.ReadResultBeforeEquals();
        ExtentTestManager.getTest().log(LogStatus.INFO,"7) Expected result is: Can't divide by 0 ➡ Observe test");
        Assert.assertEquals(result.getText(),"Can't divide by 0");
    }

    @Order
    @Test (priority = 5)
    public void CombinedOperations (Method method) {
        ExtentTestManager.startTest(method.getName(), "Test of combination of calculate operations (divide, subtract, multiply and addition).");
        ExtentTestManager.getTest().log(LogStatus.INFO,"1) Open Android app - Calculator");
        ButtonsFunctionsMethods co = new ButtonsFunctionsMethods(driver);
        ButtonsFunctionsMethods formula = new ButtonsFunctionsMethods(driver);
        co.CombinedOperations();
        AndroidElement result = formula.ReadResultAfterEquals();
        ExtentTestManager.getTest().log(LogStatus.INFO,"14) Expected result is: 105 ➡ Observe test");
        Assert.assertEquals(result.getText(),"105");
    }

    @Order
    @Test (priority = 6)
    public void Percentage (Method method) {
        ExtentTestManager.startTest(method.getName(), "Test of calculation percent.");
        ExtentTestManager.getTest().log(LogStatus.INFO,"1) Open Android app - Calculator");
        ButtonsFunctionsMethods perc = new ButtonsFunctionsMethods(driver);
        ButtonsFunctionsMethods formula = new ButtonsFunctionsMethods(driver);
        perc.Percentage();
        AndroidElement result = formula.ReadResultAfterEquals();
        ExtentTestManager.getTest().log(LogStatus.INFO,"6) Expected result is: 50 ➡ Observe test");
        Assert.assertEquals(result.getText(),"50");
    }

    @Order
    @Test (priority = 7)
    public void BackspaceDelete (Method method) {
        ExtentTestManager.startTest(method.getName(), "Test of backspace deleting numbers.");
        ExtentTestManager.getTest().log(LogStatus.INFO,"1) Open Android app - Calculator");
        ButtonsFunctionsMethods bc = new ButtonsFunctionsMethods(driver);
        ButtonsFunctionsMethods formula = new ButtonsFunctionsMethods(driver);
        bc.Backspace();
        AndroidElement result = formula.ReadResultAfterEquals();
        ExtentTestManager.getTest().log(LogStatus.INFO,"4) Expected result is: 250 ➡ Observe test");
        Assert.assertEquals(result.getText(),"250");
    }

    @Order
    @Test (priority = 8)
    public void ClearNumbers (Method method) {
        ExtentTestManager.startTest(method.getName(), "Test of clearing numbers from calculator input.");
        ExtentTestManager.getTest().log(LogStatus.INFO,"1) Open Android app - Calculator");
        ButtonsFunctionsMethods cl = new ButtonsFunctionsMethods(driver);
        ButtonsFunctionsMethods formula = new ButtonsFunctionsMethods(driver);
        cl.Clear();
        AndroidElement result = formula.ReadResultAfterEquals();
        ExtentTestManager.getTest().log(LogStatus.INFO,"4) Expected result is: null ➡ Observe test");
        Assert.assertEquals(result.getText(),"");
    }

    @Order
    @Test  (priority = 9)
    public void MemoryPlus (Method method) {
        ExtentTestManager.startTest(method.getName(), "Test of calling number from memory of calculator.");
        ExtentTestManager.getTest().log(LogStatus.INFO,"1) Open Android app - Calculator");
        ButtonsFunctionsMethods mplus = new ButtonsFunctionsMethods(driver);
        ButtonsFunctionsMethods formula = new ButtonsFunctionsMethods(driver);
        mplus.MemoryPlus();
        AndroidElement result = formula.ReadResultAfterEquals();
        ExtentTestManager.getTest().log(LogStatus.INFO,"6) Expected result is: 86 ➡ Observe test");
        Assert.assertEquals(result.getText(),"86");
    }

    @Order
    @Test (priority = 11)
    public void MemoryMinus (Method method) {
        ExtentTestManager.startTest(method.getName(), "Test of calling number from memory of calculator and subtract number in memory while use m- button.");
        ExtentTestManager.getTest().log(LogStatus.INFO,"1) Open Android app - Calculator");
        ButtonsFunctionsMethods mminus = new ButtonsFunctionsMethods(driver);
        ButtonsFunctionsMethods formula = new ButtonsFunctionsMethods(driver);
        mminus.MemoryMinus();
        AndroidElement result = formula.ReadResultAfterEquals();
        ExtentTestManager.getTest().log(LogStatus.INFO,"10) Expected result is: 80 ➡ Observe test");
        Assert.assertEquals(result.getText(),"80");
    }

    @Order
    @Test  (priority = 10)
    public void CombineMemoryFunctionsAndMemoryClear (Method method) {
        ExtentTestManager.startTest(method.getName(), "Test of combined memory functions and clear number from memory.");
        ExtentTestManager.getTest().log(LogStatus.INFO,"1) Open Android app - Calculator");
        ButtonsFunctionsMethods cmfamc = new ButtonsFunctionsMethods(driver);
        ButtonsFunctionsMethods formula = new ButtonsFunctionsMethods(driver);
        cmfamc.CombineMemoryFunctionsAndMemoryClear();
        AndroidElement result = formula.ReadResultAfterEquals();
        ExtentTestManager.getTest().log(LogStatus.INFO,"17) Expected result is: null ➡ Observe test");
        Assert.assertEquals(result.getText(),"");
    }
}
