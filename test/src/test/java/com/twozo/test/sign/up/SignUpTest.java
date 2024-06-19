package com.twozo.test.sign.up;

import com.twozo.page.sign.in.SignIn;
import com.twozo.test.BaseTest;

import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    @Test(enabled = true)
    public void signUpWithValidDetails() {
        SignIn signIn = SignIn.getInstance(webAutomationDriver);

        signIn.switchToSignUp().signUp("aei@gmail.com", "New User", "New$Password123",
                "New$Password123", "aei", "Marketing");

        //assertTrue(signUp.switchToDeal().isDealPageDisplayed());
    }
}
