package com.twozo.web.mouse.action;

import org.openqa.selenium.interactions.Action;

public interface MouseAction {

    static MouseAction getInstance(Action action) {
        return new MouseActionImpl(action);
    }

    void perform();
}
