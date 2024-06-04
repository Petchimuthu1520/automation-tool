package com.twozo.web.driver.page.information;

import lombok.AllArgsConstructor;
import lombok.NonNull;

import org.openqa.selenium.WebDriver;

/**
 * <p>
 * The {@code PageInformationProviderImpl} retrieves information about the browser.
 * </p>
 *
 * <p>
 * Retrieve various information about the browser, such as the current URL, page title, and page source.
 * </p>
 *
 * @author Petchimuthu
 * @version 1.0
 * @see PageInformationProvider
 */
@NonNull
@AllArgsConstructor
public final class PageInformationProviderImpl implements PageInformationProvider {

    private final WebDriver driver;

    /**
     * {@inheritDoc}
     *
     * @param url The URL to navigate to.
     */
    @Override
    public void get(final String url) {
        driver.get(url);
    }

    /**
     * {@inheritDoc}
     *
     * @return The current URL of the browser.
     */
    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    /**
     * {@inheritDoc}
     *
     * @return The title of the current page.
     */
    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    /**
     * {@inheritDoc}
     *
     * @return The source code of the current page.
     */
    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }
}
