package com.twozo.page.settings.data.fields.contact;

public enum ContactSystemField {

    FIRST_NAME("First Name"),
    LAST_NAME("Last Name"),
    EMAILS("Emails"),
    PHONES("Phones"),
    COMPANY("Company"),
    DESIGNATION("Designation"),
    SALES_OWNER("Sales Owner"),
    LIFECYCLE_STAGE("Lifecycle Stage"),
    SOURCE("Source"),
    TERRITORY("Territory"),
    TAGS("Tags"),
    DATE_OF_BIRTH("Date Of Birth"),
    DEPARTMENT("Department"),
    ADDRESS("Address"),
    FACEBOOK("Facebook"),
    TWITTER("Twitter"),
    LINKED_IN("LinkedIn"),
    SUBSCRIPTION_STATUS("Subscription Status"),
    SUBSCRIPTION_TYPES("Subscription Types"),
    UNSUBSCRIBE_REASON("Unsubscribe reason"),
    OTHER_UNSUBSCRIBE_REASON("Other unsubscribe reason"),
    WEB_FORM("Web Form");

    private final String name;

    ContactSystemField(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
