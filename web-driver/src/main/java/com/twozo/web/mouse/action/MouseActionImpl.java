package com.twozo.web.mouse.action;

import lombok.AllArgsConstructor;
import lombok.NonNull;

import org.openqa.selenium.interactions.Action;

@NonNull
@AllArgsConstructor
public class MouseActionImpl implements MouseAction{

    private final Action action;

    @Override
    public void perform() {
        action.perform();
    }
}
