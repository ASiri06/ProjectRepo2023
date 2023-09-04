package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.FormAuthenticationPage;
import utilities.ConstantUtils;

public class FormAuthenticationStepDefinitions extends WebConnector {

    private FormAuthenticationPage formAuthPage = new FormAuthenticationPage();
    @Given("the user navigates to the homepage")
    public void the_user_navigates_to_the_homepage() {
        driver.get(ConstantUtils.BASE_URL);

    }
    @When("the user enters {string} in username field")
    public void the_user_enters_standard_user_in_username_field( String username) {
        formAuthPage.setUserName(username);
    }


    @When("the user enters and {string} in password field")
    public void the_user_enters_and_secret_sauce_in_password_field(String password) { formAuthPage.setPassword(password);}


        @When("the user click on the login button")
        public void the_user_click_on_the_login_button () {
        formAuthPage.clickLogin();

        }
        @Then("the user should see text {string}")
        public void the_user_should_see_text (String expectedText){
            Assert.assertTrue(driver.getPageSource().contains(expectedText));

        }

        @When ("the user login with {string} username and {string} password")
    public void the_user_login_with_username_and_password(String username, String password){
        formAuthPage.setUserName(username);
        formAuthPage.setPassword(password);
        formAuthPage.clickLogin();
        }
    @Then("the user see text {string} on the page")
    public void the_user_see_text (String expectedText){
        Assert.assertTrue(driver.getPageSource().contains(expectedText));

    }



    }





