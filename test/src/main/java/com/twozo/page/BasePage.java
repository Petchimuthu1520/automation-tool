package com.twozo.page;

import com.twozo.web.driver.service.ExplicitWaitHandler;
import com.twozo.web.driver.service.PageInformationProvider;
import com.twozo.web.driver.service.WebAutomationDriver;
import com.twozo.web.driver.service.WebNavigator;
import com.twozo.web.element.finder.Element;
import com.twozo.web.element.locator.LocatorType;
import com.twozo.web.element.service.ElementFinder;
import com.twozo.web.element.service.ElementInformationProvider;
import com.twozo.web.element.service.ElementInteraction;
import com.twozo.web.element.service.WebPageElement;
import com.twozo.web.mouse.actions.MouseActions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BasePage {

    protected WebAutomationDriver webAutomationDriver;
    protected ElementFinder elementFinder;
    protected WebNavigator webNavigator;
    protected PageInformationProvider pageInformationProvider;
    protected MouseActions mouseActions;
    protected ExplicitWaitHandler explicitWaitHandler;

    protected BasePage(final WebAutomationDriver webAutomationDriver) {
        this.webAutomationDriver = webAutomationDriver;
        this.elementFinder = webAutomationDriver.getElementFinder();
        this.webNavigator = webAutomationDriver.getWebNavigator();
        this.pageInformationProvider = webAutomationDriver.getPageInformationProvider();
        this.mouseActions = webAutomationDriver.getMouseActions();
        this.explicitWaitHandler = webAutomationDriver.getExplicitWaitHandler();
    }

    protected final WebPageElement findElement(final Element element) {
        return elementFinder.getWebPageElement(element);
    }

    protected final Collection<WebPageElement> findElements(final Element element) {
        return elementFinder.getWebPageElements(element);
    }

    protected final WebPageElement findAboveElement(final Collection<Element> elements) {
        return elementFinder.findAboveElement(elements);
    }

    protected final WebPageElement findBelowElement(final Collection<Element> elements) {
        return elementFinder.findBelowElement(elements);
    }

    protected final WebPageElement findNearElement(final Collection<Element> elements) {
        return elementFinder.findNearElement(elements);
    }

    protected final WebPageElement findLeftElement(final Collection<Element> elements) {
        return elementFinder.findLeftElement(elements);
    }

    protected final WebPageElement findRightElement(final Collection<Element> elements) {
        return elementFinder.findRightElement(elements);
    }

    public WebPageElement findByXpath(final String xpath) {
        return findElement(new Element(LocatorType.XPATH, xpath, true));
    }

    protected Collection<WebPageElement> findElementsByXpath(final String xpath) {
        return findElements(new Element(LocatorType.XPATH, xpath, true));
    }

    protected WebPageElement findByText(final String value) {
        return findByXpath(String.format("//*[text()='%s']", value));
    }

    protected final void send(final WebPageElement webPageElement, final String value) {
        getElementInteraction(webPageElement).sendKeys(value);
    }

    protected final void click(final WebPageElement webPageElement) {
        getElementInteraction(webPageElement).click();
    }

    protected final void selectDate(final Element element, final Month month, final int date, final int year) {
        final String xpath = "//button[text()='%d']";

        click(findBelowElement(List.of(
                new Element(LocatorType.XPATH, "//button[@aria-label='Choose date']", false),
                element)));
        click(findByXpath("//button[@aria-label='calendar view is open, switch to year view']"));
        click(findByText(String.format(xpath, year)));
        final WebPageElement div = findLeftElement(List.of(
                new Element(LocatorType.TAG_NAME, "div", false),
                new Element(LocatorType.XPATH,
                        "//button[@aria-label='calendar view is open, switch to year view']", true)));

        while (!getText(div).equals(String.format("%s %d", month.getName(), year))) {
            click(findByXpath("//button[@aria-label='Next month']"));
        }

        click(findByXpath(String.format(xpath, date)));
    }

    public final boolean isDisplayed(final WebPageElement webPageElement) {
        return getElementInformationProvider(webPageElement).isDisplayed();
    }

    protected final String getText(final WebPageElement webPageElement) {
        return getElementInformationProvider(webPageElement).getText();
    }

    protected final List<String> getTexts(final Collection<WebPageElement> webPageElement) {
        final List<String> names = new ArrayList<>();

        for (WebPageElement field : webPageElement) {
            names.add(getText(field));
        }
        return names;
    }

    protected String getAttribute(final WebPageElement webPageElement, String attributeName) {
        return getElementInformationProvider(webPageElement).getAttribute(attributeName);
    }

    protected final void dropdown(final String option) {
        select(option, "li");
    }

    protected final void dropdownMenu(final String option) {
        select(option, "div");
    }

    protected final void hover(final Element element) {
        mouseActions.moveToElement(element).build().perform();
    }

    private void select(final String option, final String dropdownType) {
        for (final WebPageElement element : findElements(new Element(LocatorType.TAG_NAME, dropdownType, true))) {

            if (getText(element).equalsIgnoreCase(option)) {
                click(element);
                break;
            }
        }
    }

    private ElementInformationProvider getElementInformationProvider(final WebPageElement webPageElement) {
        return webPageElement.getElementInformationProvider();
    }

    private ElementInteraction getElementInteraction(final WebPageElement webPageElement) {
        return webPageElement.interact();
    }
}
