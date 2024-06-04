package com.twozo.web.driver.window;

import lombok.AllArgsConstructor;
import lombok.NonNull;

import org.openqa.selenium.WebDriver;

/**
 * <p>
 * The {@code WebWindowImpl} interacts with the browser window,such as maximizing, minimizing,
 * and toggling fullscreen mode.
 * </p>
 *
 * @author Petchimuthu
 * @version 1.0
 * @see WebWindow
 */
@NonNull
@AllArgsConstructor
public final class WebWindowImpl implements WebWindow {

    private final WebDriver.Window window;

    /**
     * {@inheritDoc}
     */
    @Override
    public void maximize() {
        window.maximize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void minimize() {
        window.minimize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void fullscreen() {
        window.fullscreen();
    }
}
