package com.twozo.test;

import com.twozo.page.sign.in.SignIn;
import com.twozo.web.driver.service.Driver;
import com.twozo.web.driver.service.WebAutomationDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class BaseTest {

    protected WebAutomationDriver webAutomationDriver;
    protected SignIn signIn;

    @BeforeMethod
    public void setUp() {
        webAutomationDriver = Driver.getInstance().getWebAutomationDriver();
        webAutomationDriver.getWebWindowHandler().maximize();
        webAutomationDriver.getImplicitWaitHandler().implicitWait(Duration.ofSeconds(10));
        webAutomationDriver.getWebNavigator().to("https://app.thelaunchclub.in/");
        signIn = SignIn.getInstance(webAutomationDriver);

    }

    @AfterMethod
    public void tearDown() {
        webAutomationDriver.quit();
    }

    public String takeScreenShot(final String TestName, final WebAutomationDriver driver) throws IOException {
        final File sourceFile = driver.getScreenshotAs(OutputType.FILE);
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
        final String timeStamp = dateFormat.format(new Date());
        final String path = System.getProperty("user.dir") + "\\reports\\" + TestName +"_" + timeStamp + ".png";
        final File file = new File(path);

        FileUtils.copyFile(sourceFile, file);

        return path;
    }
}
