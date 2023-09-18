package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageObjects.ProductPurchasePage;

public class ProductPurchaseStepDef extends WebConnector {

    private ProductPurchasePage prodPurPage = new ProductPurchasePage();



    @Given("the user clicks on Checkout button")
    public void the_user_clicks_on_checkout_button() {
        prodPurPage.clickOnCheckoutButton();

    }
    @Given("the user enters {string}  in name field")
    public void the_user_enters_in_name_field(String name) {
        prodPurPage.setName(name);
    }
    @Given("the user enters {string}  in surname field")
    public void the_user_enters_siri_in_surname_field(String surname) {
       prodPurPage.setSurname(surname);
    }
    @Given("the user enters {string}  in zip postal code field")
    public void the_user_enters_w3_7pw_in_zip_postal_code_field(String postcode) {
      prodPurPage.setPostcode(postcode);
    }
    @Given("the user clicks on the continue button")
    public void the_user_clicks_on_the_continue_button() {
        prodPurPage.clickOnContinueButton();

    }
    @Given("the user clicks on the Finish button")
    public void the_user_clicks_on_the_finish_button() {
        prodPurPage.clickOnFinishButton();

    }
    @Then("the user should see {string} text")
    public void the_user_should_see_thank_you_for_your_order_text(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));


    }

}
