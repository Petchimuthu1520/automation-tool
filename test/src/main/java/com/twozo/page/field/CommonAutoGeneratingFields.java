package com.twozo.page.field;

public enum CommonAutoGeneratingFields {

    ID("Id"),
    UPDATED_BY("Updated By"),
    CREATED_AT("Created At"),
    RECENT_NOTE("Recent Note"),
    CREATED_BY("Created By"),
    UPDATED_AT("Updated At"),
    LAST_ASSIGNED_AT("Last Assigned At"),
    LAST_ACTIVITY_DATE("Last Activity Date"),
    NEXT_ACTIVITY_DATE("Next Activity Date"),
    LAST_EMAIL_RECEIVED("Last Email Received"),
    LAST_EMAIL_SENT("Last Email Sent");

    private final String name;

    CommonAutoGeneratingFields(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
