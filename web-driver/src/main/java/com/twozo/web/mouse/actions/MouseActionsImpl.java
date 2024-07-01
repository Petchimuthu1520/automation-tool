package com.twozo.web.mouse.actions;

import com.twozo.web.element.finder.Element;
import com.twozo.web.mouse.action.MouseAction;

import com.twozo.web.mouse.action.MouseActionImpl;
import lombok.AllArgsConstructor;
import lombok.NonNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

@NonNull
@AllArgsConstructor
public class MouseActionsImpl implements MouseActions {

    private final WebDriver webDriver;
    private final Actions actions;

//    @Override
//    public MouseActions keyDown(final CharSequence key) {
//        return new MouseActionsImpl(webDriver, actions.keyDown(key));
//    }
//
//    @Override
//    public MouseActions keyDown(final Element element, final CharSequence key) {
//        return new MouseActionsImpl(webDriver, actions.keyDown(webDriver.findElement(getByValue(element)), key));
//    }
//
//    @Override
//    public MouseActions keyUp(final CharSequence key) {
//        return new MouseActionsImpl(webDriver, actions.keyUp(key));
//    }
//
//    @Override
//    public MouseActions keyUp(final Element element, final CharSequence key) {
//        return new MouseActionsImpl(webDriver, actions.keyUp(webDriver.findElement(getByValue(element)), key));
//    }
//
//    @Override
//    public MouseActions sendKeys(final CharSequence... keys) {
//        return new MouseActionsImpl(webDriver, actions.sendKeys(keys));
//    }
//
//    @Override
//    public MouseActions sendKeys(final Element element, final CharSequence... keys) {
//        return new MouseActionsImpl(webDriver, actions.sendKeys(webDriver.findElement(getByValue(element)), keys));
//    }
//
//    @Override
//    public MouseActions clickAndHold() {
//        return new MouseActionsImpl(webDriver, actions.clickAndHold());
//    }
//
//    @Override
//    public MouseActions clickAndHold(final Element element) {
//        return new MouseActionsImpl(webDriver, actions.clickAndHold(webDriver.findElement(getByValue(element))));
//    }
//
//    @Override
//    public MouseActions release(final Element element) {
//        return new MouseActionsImpl(webDriver, actions.release(webDriver.findElement(getByValue(element))));
//    }
//
//    @Override
//    public MouseActions release() {
//        return new MouseActionsImpl(webDriver, actions.release());
//    }
//
//    @Override
//    public MouseActions scrollToElement(final Element element) {
//        return new MouseActionsImpl(webDriver, actions.scrollToElement(webDriver.findElement(getByValue(element))));
//    }
//
//    @Override
//    public MouseActions click() {
//        return new MouseActionsImpl(webDriver, actions.click());
//    }
//
//    @Override
//    public MouseActions click(final Element element) {
//        return null;
//    }
//
//    @Override
//    public MouseActions doubleClick() {
//        return null;
//    }
//
//    @Override
//    public MouseActions doubleClick(final Element element) {
//        return null;
//    }

    @Override
    public MouseActions moveToElement(final Element element) {
        return new MouseActionsImpl(webDriver, actions.moveToElement(webDriver.findElement(getByValue(element))));
    }

//
//    @Override
//    public MouseActions moveToElement(final Element element, final int xOffset, final int yOffset) {
//        return null;
//    }
//
//    @Override
//    public MouseActions moveToLocation(final int xCoordinate, final int yCoordinate) {
//        return null;
//    }
//
//    @Override
//    public MouseActions rightClick() {
//        return null;
//    }
//
//    @Override
//    public MouseActions rightClick(final Element element) {
//        return null;
//    }
//
//    @Override
//    public MouseActions dragAndDrop(final Element source, final Element destination) {
//        return null;
//    }
//
//    @Override
//    public MouseActions dragAndDropBy(final Element source, final int xOffset, final int yOffset) {
//        return null;
//    }

    @Override
    public MouseAction build() {
        return new MouseActionImpl(actions.build());
    }

    @Override
    public void perform() {

    }

    private By getByValue(final Element element) {
        return switch (element.locatorType()) {
            case ID -> By.id(element.value());
            case NAME -> By.name(element.value());
            case CLASS_NAME -> By.className(element.value());
            case XPATH -> By.xpath(element.value());
            case CSS_SELECTOR -> By.cssSelector(element.value());
            case LINKED_TEXT -> By.linkText(element.value());
            case PARTIALLY_LINKED_TEXT -> By.partialLinkText(element.value());
            case TAG_NAME -> By.tagName(element.value());
        };
    }
//    @Override
//    public MouseActions keyDown(final CharSequence key) {
//        return new MouseActionsImpl(actions.keyDown(key));
//    }
//
//    @Override
//    public MouseActions keyDown(final WebPageElement webPageElement, final CharSequence key) {
//        return new MouseActionsImpl(webAutomationDriver, actions.keyDown(webElement1, key));
//    }
//
//    @Override
//    public MouseActions keyUp(final CharSequence key) {
//        return new MouseActionsImpl(webAutomationDriver, actions.keyUp(key));
//    }
//
//    @Override
//    public MouseActions keyUp(final WebPageElement webPageElement, final CharSequence key) {
//        return new MouseActionsImpl(webAutomationDriver, actions.keyUp(webPageElement.getWebElement(), key));
//    }
//
//    @Override
//    public MouseActions sendKeys(final CharSequence... keys) {
//        return new MouseActionsImpl(webAutomationDriver, actions.sendKeys(keys));
//    }
//
//    @Override
//    public MouseActions sendKeys(final WebPageElement webPageElement, final CharSequence... keys) {
//        return new MouseActionsImpl(webAutomationDriver, actions.sendKeys(webPageElement.getWebElement(), keys));
//    }
//
//    @Override
//    public MouseActions clickAndHold() {
//        return new MouseActionsImpl(webAutomationDriver, actions.clickAndHold());
//    }
//
//    @Override
//    public MouseActions clickAndHold(final WebPageElement webPageElement) {
//        return new MouseActionsImpl(webAutomationDriver, actions.clickAndHold(webPageElement.getWebElement()));
//    }
//
//    @Override
//    public MouseActions release(final WebPageElement webPageElement) {
//        return new MouseActionsImpl(webAutomationDriver, actions.release(webPageElement.getWebElement()));
//    }
//
//    @Override
//    public MouseActions release() {
//        return new MouseActionsImpl(webAutomationDriver, actions.release());
//    }
//
//    @Override
//    public MouseActions scrollToElement(final WebPageElement webPageElement) {
//        return new MouseActionsImpl(webAutomationDriver, actions.scrollToElement(webPageElement.getWebElement()));
//    }
//
//    @Override
//    public MouseActions click() {
//        return new MouseActionsImpl(webAutomationDriver, actions.click());
//    }
//
//    @Override
//    public MouseActions click(final WebPageElement webPageElement) {
//        return new MouseActionsImpl(webAutomationDriver, actions.click(webPageElement.getWebElement()));
//    }
//
//    @Override
//    public MouseActions doubleClick() {
//        return new MouseActionsImpl(webAutomationDriver, actions.doubleClick());
//    }
//
//    @Override
//    public MouseActions doubleClick(final WebPageElement webPageElement) {
//        return new MouseActionsImpl(webAutomationDriver, actions.doubleClick(webPageElement.getWebElement()));
//    }
//
//    @Override
//    public MouseActions moveToElement(final WebPageElement webPageElement) {
//        return new MouseActionsImpl(webAutomationDriver, actions.moveToElement(webPageElement.getWebElement()));
//    }
//
//    @Override
//    public MouseActions moveToElement(final WebPageElement webPageElement, final int xOffset, final int yOffset) {
//        return new MouseActionsImpl(webAutomationDriver, actions.moveToElement(webPageElement.getWebElement(), xOffset, yOffset));
//    }
//
//    @Override
//    public MouseActions moveToLocation(final int xCoordinate, final int yCoordinate) {
//        return new MouseActionsImpl(webAutomationDriver, actions.moveToLocation(xCoordinate, yCoordinate));
//    }
//
//    @Override
//    public MouseActions rightClick() {
//        return new MouseActionsImpl(webAutomationDriver, actions.contextClick());
//    }
//
//    @Override
//    public MouseActions rightClick(final WebPageElement webPageElement) {
//        return new MouseActionsImpl(webAutomationDriver, actions.contextClick(webPageElement.getWebElement()));
//    }
//
//    @Override
//    public MouseActions dragAndDrop(final WebPageElement source, final WebPageElementImpl destination) {
//        return new MouseActionsImpl(webAutomationDriver, actions.dragAndDrop(source.getWebElement(), destination.getWebElement()));
//    }
//
//    @Override
//    public MouseActions dragAndDropBy(final WebPageElement source, final int xOffset, final int yOffset) {
//        return new MouseActionsImpl(webAutomationDriver, actions.dragAndDropBy(source.getWebElement(), xOffset, yOffset));
//    }
//
//    @Override
//    public MouseAction build() {
//        return new MouseActionImpl(actions.build());
//    }
//
//    @Override
//    public void perform() {
//        this.build().perform();
//    }
}
