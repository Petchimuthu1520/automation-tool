package com.web.driver.element.impl;

import com.web.driver.element.finders.ElementFinder;
import com.web.driver.element.service.Information;
import com.web.driver.element.service.Interaction;
import com.web.driver.element.service.WebPageElement;

import org.openqa.selenium.WebElement;

/**
 * The {@code WebPageElementImpl} provides various services related to {@link WebPageElement}s.
 * It encapsulates interaction, information retrieval, and element finding functionalities.
 *
 * <p>This class initializes and delegates interaction, information,
 * and element finding operations to their respective service instances.</p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public final class WebPageElementImpl implements WebPageElement {
    private final Interaction interaction;
    private final Information information;
    private final ElementFinder elementFinder;

    public WebPageElementImpl(final WebElement element) {
        this.interaction = Interaction.getInstance(element);
        this.information = Information.getInstance(element);
        this.elementFinder = ElementFinder.getInstance(element);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementFinder getElementfinder() {
        return elementFinder;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Interaction interact() {
        return interaction;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Information getInformer() {
        return information;
    }
}
