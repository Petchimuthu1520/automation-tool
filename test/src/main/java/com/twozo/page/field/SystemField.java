package com.twozo.page.field;

import com.twozo.web.element.service.WebPageElement;

public record SystemField(WebPageElement dragAndDropIcon, WebPageElement fieldName, WebPageElement fieldType,
                          WebPageElement addViewCheckbox, WebPageElement addView, WebPageElement requiredCheckbox,
                          WebPageElement required, WebPageElement hideIcon) {
}
