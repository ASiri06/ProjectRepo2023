package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import pageObjects.BasicAuthPageObjects;

public class BasicAuthStepDef extends WebConnector {

    private BasicAuthPageObjects basicAuthPage = new BasicAuthPageObjects();

/@Given("the user should see {string}")
    public void the_user_should_see(String string) {

    }
    @Given("the user enters {string} in prompt field")
    public void the_user_enters_in_prompt_field(String string) {

    }
    @Given("the user clicks on Sign in button")
    public void the_user_clicks_on_sign_in_button() {
       
    }

}
