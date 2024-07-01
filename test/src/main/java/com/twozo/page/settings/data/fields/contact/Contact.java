package com.twozo.page.settings.data.fields.contact;

import com.twozo.page.field.FieldElement;
import com.twozo.page.field.FieldType;
import com.twozo.page.field.SystemField;
import com.twozo.page.settings.Settings;
import com.twozo.web.driver.service.WebAutomationDriver;
import com.twozo.web.element.finder.Element;
import com.twozo.web.element.locator.LocatorType;
import com.twozo.web.element.service.WebPageElement;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Contact extends Settings {

    private static Contact contact;

    private String firstNameDiv;
    private String lastNameDiv;
    private String emailDiv;
    private String phonesDiv;
    private String companyDiv;
    private String designationDiv;
    private String salesOwnerDiv;
    private String facebookDiv;
    private String twitterDiv;

    private SystemField firstNameField;
    private SystemField lastNameField;
    private SystemField emailsField;
    private SystemField phonesField;
    private SystemField companyField;
    private SystemField designationField;
    private SystemField salesOwnerField;
    private SystemField facebookField;
    private SystemField twitterField;

    private WebPageElement addSystemFieldsButton;
    private WebPageElement addSelectedFieldsButton;
    private WebPageElement addCustomFieldButton;
    private WebPageElement customField;
    private WebPageElement selectCustomFieldType;
    private WebPageElement customFieldAddButton;
    private WebPageElement choice;
    private WebPageElement addChoice;

    protected Contact(final WebAutomationDriver webAutomationDriver) {
        super(webAutomationDriver);
    }

    public static Contact getInstance(final WebAutomationDriver webAutomationDriver) {

        //  if (Objects.isNull(addDeal)) {
        contact = new Contact(webAutomationDriver);
        //}

        return contact;
    }

    public String getFirstNameDiv() {

        if (Objects.isNull(firstNameDiv)) {
            firstNameDiv = getFieldBlock(ContactSystemField.FIRST_NAME);
        }

        return firstNameDiv;
    }

    public String getLastNameDiv() {

        if (Objects.isNull(lastNameDiv)) {
            lastNameDiv = getFieldBlock(ContactSystemField.LAST_NAME);
        }

        return lastNameDiv;
    }

    public String getEmailDiv() {

        if (Objects.isNull(emailDiv)) {
            emailDiv = getFieldBlock(ContactSystemField.EMAILS);
        }

        return emailDiv;
    }

    public String getPhonesDiv() {

        if (Objects.isNull(phonesDiv)) {
            phonesDiv = getFieldBlock(ContactSystemField.PHONES);
        }

        return phonesDiv;
    }

    public String getCompanyDiv() {

        if (Objects.isNull(companyDiv)) {
            companyDiv = getFieldBlock(ContactSystemField.COMPANY);
        }

        return companyDiv;
    }

    public String getDesignationDiv() {

        if (Objects.isNull(designationDiv)) {
            designationDiv = getFieldBlock(ContactSystemField.DESIGNATION);
        }

        return designationDiv;
    }

    public String getSalesOwnerDiv() {

        if (Objects.isNull(salesOwnerDiv)) {
            salesOwnerDiv = getFieldBlock(ContactSystemField.SALES_OWNER);
        }

        return salesOwnerDiv;
    }

    public String getFacebookDiv() {

        if (Objects.isNull(facebookDiv)) {
            facebookDiv = getFieldBlock(ContactSystemField.FACEBOOK);
        }

        return facebookDiv;
    }

    public String getTwitterDiv() {

        if (Objects.isNull(twitterDiv)) {
            twitterDiv = getFieldBlock(ContactSystemField.TWITTER);
        }

        return twitterDiv;
    }

    private SystemField getFirstNameField() {

        if (Objects.isNull(firstNameField)) {

            firstNameField = new SystemField(findByXpath(getFirstNameDiv() + FieldElement.NON_DRAGGABLE), findByXpath(
                    getFirstNameDiv() + "//*[text()='First Name']"), findByXpath(getFirstNameDiv() + FieldType.TEXT),
                    findByXpath(getFirstNameDiv() + FieldElement.CHECKED_CHECKBOX), findByXpath(getFirstNameDiv() + FieldElement.ADD_VIEW),
                    findByXpath(getFirstNameDiv() + FieldElement.CHECKED_CHECKBOX), findByXpath(getFirstNameDiv() + FieldElement.REQUIRED), null);
        }

        return firstNameField;
    }

    private SystemField getLastNameField() {

        if (Objects.isNull(lastNameField)) {

            lastNameField = new SystemField(findByXpath(getLastNameDiv() + FieldElement.NON_DRAGGABLE), findByXpath(
                    getLastNameDiv() + "//*[text()='Last Name']"), findByXpath(getLastNameDiv() + FieldType.TEXT),
                    findByXpath(getLastNameDiv() + FieldElement.UNCHECKED_CHECKBOX), findByXpath(getLastNameDiv() + FieldElement.ADD_VIEW),
                    findByXpath(getLastNameDiv() + FieldElement.UNCHECKED_CHECKBOX), findByXpath(getLastNameDiv() + FieldElement.REQUIRED), null);
        }

        return lastNameField;
    }

    private SystemField getEmailsField() {

        if (Objects.isNull(emailsField)) {

            emailsField = new SystemField(findByXpath(getEmailDiv() + FieldElement.NON_DRAGGABLE), findByXpath(
                    getEmailDiv() + "//*[text()='Emails']"), findByXpath(getEmailDiv() + FieldType.EMAILS),
                    findByXpath(getEmailDiv() + FieldElement.CHECKED_CHECKBOX), findByXpath(getEmailDiv() + FieldElement.ADD_VIEW),
                    findByXpath(getEmailDiv() + FieldElement.CHECKED_CHECKBOX), findByXpath(getEmailDiv() + FieldElement.REQUIRED), null);
        }

        return emailsField;
    }

    private SystemField getPhonesField() {

        if (Objects.isNull(phonesField)) {

            phonesField = new SystemField(findByXpath(getPhonesDiv() + FieldElement.NON_DRAGGABLE), findByXpath(
                    getPhonesDiv() + "//*[text()='Phones']"), findByXpath(getPhonesDiv() + FieldType.PHONES),
                    findByXpath(getPhonesDiv() + FieldElement.CHECKED_CHECKBOX), findByXpath(getPhonesDiv() + FieldElement.ADD_VIEW),
                    findByXpath(getPhonesDiv() + FieldElement.CHECKED_CHECKBOX), findByXpath(getPhonesDiv() + FieldElement.REQUIRED), null);
        }

        return phonesField;
    }

    public SystemField getCompanyField() {

        if (Objects.isNull(companyField)) {

            companyField = new SystemField(findByXpath(getCompanyDiv() + FieldElement.DRAGGABLE), findByXpath(
                    getCompanyDiv() + "//*[text()='Company']"), findByXpath(getCompanyDiv() + FieldType.COMPANY),
                    findByXpath(getCompanyDiv() + FieldElement.CHECKED_CHECKBOX), findByXpath(getCompanyDiv() + FieldElement.ADD_VIEW),
                    findByXpath(getCompanyDiv() + FieldElement.UNCHECKED_CHECKBOX), findByXpath(getCompanyDiv() + FieldElement.REQUIRED), null);
        }

        return companyField;
    }

    public SystemField getDesignationField() {

        if (Objects.isNull(designationField)) {

            designationField = new SystemField(findByXpath(getDesignationDiv() + FieldElement.DRAGGABLE), findByXpath(
                    getDesignationDiv() + "//*[text()='Designation']"), findByXpath(getDesignationDiv() + FieldType.TEXT),
                    findByXpath(getDesignationDiv() + FieldElement.CHECKED_CHECKBOX), findByXpath(getDesignationDiv() + FieldElement.ADD_VIEW),

                    findByXpath(getDesignationDiv() + FieldElement.UNCHECKED_CHECKBOX), findByXpath(getDesignationDiv() + FieldElement.REQUIRED), null);
        }

        return designationField;
    }

    public SystemField getSalesOwnerField() {

        if (Objects.isNull(salesOwnerField)) {

            salesOwnerField = new SystemField(findByXpath(getSalesOwnerDiv() + FieldElement.DRAGGABLE), findByXpath(
                    getSalesOwnerDiv() + "//*[text()='Sales Owner']"), findByXpath(getSalesOwnerDiv() + FieldType.OWNER),
                    findByXpath(getSalesOwnerDiv() + FieldElement.CHECKED_CHECKBOX), findByXpath(getSalesOwnerDiv() + FieldElement.ADD_VIEW),
                    findByXpath(getSalesOwnerDiv() + FieldElement.CHECKED_CHECKBOX), findByXpath(getSalesOwnerDiv() + FieldElement.REQUIRED), null);
        }

        return salesOwnerField;
    }

    public SystemField getFacebookField() {

        if (Objects.isNull(facebookField)) {

            facebookField = new SystemField(findByXpath(getFacebookDiv() + FieldElement.DRAGGABLE), findByXpath(
                    getFacebookDiv() + "//*[text()='Facebook']"), findByXpath(getFacebookDiv() + FieldType.TEXT),
                    findByXpath(getFacebookDiv() + FieldElement.CHECKED_CHECKBOX), findByXpath(getFacebookDiv() + FieldElement.ADD_VIEW),
                    findByXpath(getFacebookDiv() + FieldElement.UNCHECKED_CHECKBOX), findByXpath(getFacebookDiv() + FieldElement.REQUIRED), null);
        }

        return facebookField;
    }

    public SystemField getTwitterField() {

        if (Objects.isNull(twitterField)) {

            twitterField = new SystemField(findByXpath(getFacebookDiv() + FieldElement.DRAGGABLE), findByXpath(
                    getTwitterDiv() + "//*[text()='Twitter']"), findByXpath(getTwitterDiv() + FieldType.TEXT),
                    findByXpath(getTwitterDiv() + FieldElement.UNCHECKED_CHECKBOX), findByXpath(getTwitterDiv() + FieldElement.ADD_VIEW),
                    findByXpath(getTwitterDiv() + FieldElement.UNCHECKED_CHECKBOX), findByXpath(getTwitterDiv() + FieldElement.REQUIRED), null);
        }

        return twitterField;
    }

    public WebPageElement getAddSystemFieldsButton() {

        if (Objects.isNull(addSystemFieldsButton)) {

            addSystemFieldsButton = findByText("System Fields");
        }

        return addSystemFieldsButton;
    }

    public WebPageElement getAddSelectedFieldsButton() {

        if (Objects.isNull(addSelectedFieldsButton)) {

            addSelectedFieldsButton = findByText("Add Selected Fields");
        }

        return addSelectedFieldsButton;
    }

    public WebPageElement getAddCustomFieldButton() {

        if (Objects.isNull(addCustomFieldButton)) {

            addCustomFieldButton = findByText("Custom Field");
        }

        return addCustomFieldButton;
    }

    public WebPageElement getCustomField() {

        if (Objects.isNull(customField)) {

            customField = findByXpath("(//*[@aria-invalid='false'])[2]");
        }

        return customField;
    }

    public WebPageElement getSelectCustomFieldType() {

        if (Objects.isNull(selectCustomFieldType)) {

            selectCustomFieldType = findByXpath("//*[text()='Cancel']/../../../..//*[text()='Text']");
        }

        return selectCustomFieldType;
    }

    public WebPageElement getCustomFieldAddButton() {

        if (Objects.isNull(customFieldAddButton)) {

            customFieldAddButton = findByXpath(FieldElement.ADD_Button);
        }

        return customFieldAddButton;
    }

    public WebPageElement getChoice() {

        if (Objects.isNull(choice)) {

            choice = findByText("Choice");
        }

        return choice;
    }

    public WebPageElement getAddChoice() {

        if (Objects.isNull(addChoice)) {

            addChoice = findByText("Add Choice");
        }

        return addChoice;
    }

    private boolean check(final SystemField systemField) {
        final List<WebPageElement> elementsToCheck = Arrays.asList(
                systemField.dragAndDropIcon(),
                systemField.fieldName(),
                systemField.fieldType(),
                systemField.addViewCheckbox(),
                systemField.addView(),
                systemField.requiredCheckbox(),
                systemField.required()
        );

        for (final WebPageElement element : elementsToCheck) {

            if (!isDisplayed(element)) {
                return false;
            }
        }

        return true;
    }

    private String getFieldBlock(ContactSystemField contactSystemFieldName) {

        int rowNumber = 1;
        String xpath = "((//*[@class='css-11x1d9z'])[%d]/div/div/div/p)[1]";

        while (!contactSystemFieldName.getName().equals(getText(findByXpath(String.format(xpath, rowNumber))))) {
            rowNumber++;
        }

        return String.format("(//*[@class='css-11x1d9z'])[%d]", rowNumber);
    }

    public String getMenuBlock(final String fieldName) {

        int rowNumber = 1;
        String xpath = "(//*[@class='css-u4p24i'])[%d]";

        while (!fieldName.equals(getText(findByXpath(String.format(xpath, rowNumber))))) {
            rowNumber++;
        }

        return String.format("(//*[@class='css-u4p24i'])[%d]", rowNumber);
    }

    private WebPageElement addSystemFieldToList(final String fieldName) {
        return findByXpath(String.format(getMenuBlock(fieldName) + "//*[@type='checkbox']"));
    }

    public void checkSystemFields() {
        check(getFirstNameField());
        check(getLastNameField());
        check(getEmailsField());
        check(getPhonesField());
        check(getCompanyField());
        check(getDesignationField());
        check(getSalesOwnerField());
        check(getFacebookField());
        check(getTwitterField());
    }

    public void addSystemField() {
        click(getAddSystemFieldsButton());
        click(addSystemFieldToList(ContactSystemField.LIFECYCLE_STAGE.getName()));
        click(getAddSelectedFieldsButton());
    }

    public void addCustomField(final String customFieldName, final String fieldType) {

        if (fieldType.equalsIgnoreCase("dropdown") || fieldType.equalsIgnoreCase("multi select")) {

            click();

        }
        click(getAddCustomFieldButton());
        send(getCustomField(), customFieldName);
        click(getSelectCustomFieldType());
        dropdown(fieldType);
        click(getCustomFieldAddButton());
    }

    public void check() {
        hover(new Element(LocatorType.XPATH, "//*[text()='Facebook']", true));
    }
}

