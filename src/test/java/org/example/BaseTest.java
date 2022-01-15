package org.example;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{
    BrowserManager browserManager= new BrowserManager();

    @AfterMethod
    public void closeBrowser(ITestResult result){
        if (!result.isSuccess()){
            captureScreenshot(result.getName());
        }

        browserManager.closeBrowser();
    }

    public void tearDownBrowser()
    {
        browserManager.closeBrowser();
    }

    @BeforeMethod
    public void setUpBrowser()
    {
       browserManager.openBrowser();

    }


}
