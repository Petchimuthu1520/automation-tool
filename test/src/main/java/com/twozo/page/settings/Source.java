package com.twozo.page.settings;

public enum Source {

    DEAL("Deal"),
    CONTACT("Contact"),
    COMPANY("Company"),
    PRODUCT("Product");

    private final String name;

    Source(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
