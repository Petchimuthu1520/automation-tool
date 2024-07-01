package com.twozo.test.settings;

import com.twozo.page.settings.data.fields.contact.Contact;
import com.twozo.page.settings.data.fields.contact.ContactSystemField;
import com.twozo.test.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SettingsTest extends BaseTest {

    @Test
    public void checkSystemFields(){
        signIn.signIn("nxi@gmail.com", "A$12345a").switchToSettings().switchToContact().
                checkSystemFields();
    }

    @Test
    public void addSystemFields(){
        Contact contact = signIn.signIn("nxi@gmail.com", "A$12345a").switchToSettings().switchToContact();
        contact.addSystemField();
        //Assert.assertTrue(contact.isDisplayed(contact.getMenuBlock(contact.findByXpath())));
    }

    @Test
    public void addCustomField(){
        signIn.signIn("nxi@gmail.com", "A$12345a").switchToSettings().switchToContact().
                addCustomField("nedsdw","dropdown");
    }

}
