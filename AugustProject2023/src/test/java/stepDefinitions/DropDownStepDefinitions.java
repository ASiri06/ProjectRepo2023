package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.BasePage;
import pageObjects.DropDownPage;
import pageObjects.FormAuthenticationPage;

public class DropDownStepDefinitions extends WebConnector {


    private DropDownPage dropDownPage = new DropDownPage();

    @Given("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        dropDownPage.clickLogin();

    }
    @When("the user select {string} from the dropdown list")
    public void the_user_select_from_the_dropdown_list(String selectOption) {
        dropDownPage.selectOptionFromDropdown(selectOption);
       //dropDownPage.setDropdown(selectOption);

    }
    @Then("the user should see the {string} option is selected in the dropdown list")
    public void the_user_should_see_the_option_is_selected_in_the_dropdown_list(String selectOption) {
        String actualText = dropDownPage.getSelectedOption();
       // Assert.assertEquals(selectOption, actualText);

    }

}
