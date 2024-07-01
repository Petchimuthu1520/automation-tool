package com.twozo.page.field;

public enum CommonFields {

    TAGS("Tags"),
    SALES_OWNER("Sales Owner"),
    SOURCE("Source"),
    TERRITORY("Territory");

    private final String name;

    CommonFields(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
