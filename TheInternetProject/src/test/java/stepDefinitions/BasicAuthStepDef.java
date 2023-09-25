package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import pageObjects.BasicAuthPageObjects;

public class BasicAuthStepDef extends WebConnector {

    private BasicAuthPageObjects basicAuthPage = new BasicAuthPageObjects();

    @Given("the user enters {string} in username field")
    public void the_user_enters_in_username_field(String username) {
        basicAuthPage.setUserName(username);


    }
    @Given("the user enters {string} in password field")
    public void the_user_enters_in_password_field(String password) {
        basicAuthPage.setPassword(password);

    }
    @Given("the user clicks on Sign in button")
    public void the_user_clicks_on_sign_in_button() {
        basicAuthPage.clickSignIn();

    }
}
