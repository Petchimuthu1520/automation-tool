package com.twozo.web.status;

import com.twozo.commons.exception.provider.StatusCodeProvider;
import com.twozo.commons.exception.service.StatusCode;
import com.twozo.commons.exception.registry.StatusCodeRegistry;

/**
 * <p>
 * Standardizes handling of common statuses like invalid and duplicate inputs with specific codes
 * for effective identification.
 * </p>
 *
 * <p>
 * Dynamically generates unique codes using a base and specific code for each type, with the base code
 * registered once to avoid redundancy.
 * </p>
 *
 * <p>
 * Example usage:
 * <pre>
 * {@code
 * // Throwing an ELEMENT_CLICK_INTERCEPTED exception
 * throw TestException.get(WebDriverStatusCode.ELEMENT_CLICK_INTERCEPTED);
 *
 * // Throwing a ELEMENT_NOT_VISIBLE exception
 * throw TestException.get(WebDriverStatusCode.ELEMENT_NOT_VISIBLE);
 * }
 * </pre>
 * </p>
 *
 * @author Petchimuthu
 * @version 1.0
 * @see StatusCode
 */
public enum WebDriverStatusCode implements StatusCode {

    ELEMENT_CLICK_INTERCEPTED(1),
    ELEMENT_NOT_SELECTABLE(2),
    ELEMENT_NOT_VISIBLE(3);

    private static final StatusCodeProvider STATUS_CODE_PROVIDER = new StatusCodeProvider();
    private static final int BASE_CODE = 200;
    private static boolean isBaseCodeRegistered = false;

    private final int code;

    WebDriverStatusCode(final int code) {
        this.code = code;
    }

    static {
        register();
    }

    /**
     * <p>
     * Registers the base status code if it's not already registered.
     * Ensures that the base status code is registered only once.
     * </p>
     */
    private static void register() {
        if (!isBaseCodeRegistered) {
            StatusCodeRegistry.register(BASE_CODE, WebDriverStatusCode.class.getSimpleName());
            isBaseCodeRegistered = true;
        }
    }

    /**
     * <p>
     * Retrieves the status code associated with the status.
     * </p>
     *
     * @return The status code generated based on the base code and specific code.
     */
    @Override
    public int getStatusCode() {
        return STATUS_CODE_PROVIDER.get(BASE_CODE, code);
    }
}
