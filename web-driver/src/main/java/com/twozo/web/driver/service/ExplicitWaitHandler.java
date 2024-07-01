package com.twozo.web.driver.service;

import com.twozo.web.driver.waits.ExplicitWaitHandlerImpl;
import com.twozo.web.element.web.page.element.WebPageElementImpl;

import org.openqa.selenium.WebDriver;


public interface ExplicitWaitHandler {

    static ExplicitWaitHandler getInstance(final WebDriver driver) {
        return new ExplicitWaitHandlerImpl(driver);
    }

    void waitTillVisible(WebPageElementImpl webPageElement);

}
