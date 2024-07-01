package com.twozo.web.driver.waits;

import com.twozo.web.driver.service.ExplicitWaitHandler;
import com.twozo.web.element.web.page.element.WebPageElementImpl;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@NonNull
@AllArgsConstructor
public class ExplicitWaitHandlerImpl implements ExplicitWaitHandler {

    private final WebDriver webDriver;

    @Override
    public void waitTillVisible(WebPageElementImpl webPageElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(webPageElement.getWebElement()));
    }
}
