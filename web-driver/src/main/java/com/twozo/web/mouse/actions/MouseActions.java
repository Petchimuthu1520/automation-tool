package com.twozo.web.mouse.actions;

import com.twozo.web.element.finder.Element;
import com.twozo.web.mouse.action.MouseAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public interface MouseActions {

    static MouseActions getInstance(final WebDriver webDriver, final Actions actions) {
        return new MouseActionsImpl(webDriver, actions);
    }
//
//    MouseActions keyDown(final CharSequence key);
//
//    MouseActions keyDown(final Element element, final CharSequence key);
//
//    MouseActions keyUp(final CharSequence key);
//
//    MouseActions keyUp(final Element element, final CharSequence key);
//
//    MouseActions sendKeys(final CharSequence... keys);
//
//    MouseActions sendKeys(final Element element, final CharSequence... keys);
//
//    MouseActions clickAndHold();
//
//    MouseActions clickAndHold(final Element element);
//
//    MouseActions release(final Element element);
//
//    MouseActions release();
//
//    MouseActions scrollToElement(final Element element);
//
//    MouseActions click();
//
//    MouseActions click(final Element element);
//
//    MouseActions doubleClick();
//
//    MouseActions doubleClick(final Element element);
//
    MouseActions moveToElement(final Element element);
//
//    MouseActions moveToElement(final Element element, final int xOffset, final int yOffset);
//
//    MouseActions moveToLocation(final int xCoordinate, final int yCoordinate);
//
//    MouseActions rightClick();
//
//    MouseActions rightClick(final Element element);
//
//    MouseActions dragAndDrop(final Element source, final Element destination);
//
//    MouseActions dragAndDropBy(final Element source, final int xOffset, final int yOffset);

    MouseAction build();

    void perform();


}
