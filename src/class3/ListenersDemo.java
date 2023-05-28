package class3;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener {

    @Override
    public void onTestStart(ITestResult result){
        System.out.println("Start a test with a name "+result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("Test passed, we take screen shoot");
    }
    @Override
    public void onTestSkipped(ITestResult result){
        System.out.println("Finished passed "+result.getName());
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result){
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }
    @Override
    public void onFinish(ITestContext context){
        ITestListener.super.onFinish(context);
    }
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("The case failed i will report");
    }
}
