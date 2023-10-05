package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.AddRemoveElementsPageObjects;
import pageObjects.BasePage;
import utilities.ConstantUtils;

import java.time.Duration;

public class AddRemoveElementsStepDef extends WebConnector {

    private AddRemoveElementsPageObjects  AddRemElPage = new AddRemoveElementsPageObjects();
    @Given("the user navigates to homepage")
    public void the_user_navigates_to_homepage() {
       driver.get(ConstantUtils.BASE_URL);
    }
    @Given("the user clicks on the {string} link")
    public void the_user_clicks_on_the_link(String linkText) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.partialLinkText(linkText))).click();

    }
    @Given("the user can see {string} text")
    public void the_user_can_see_text(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));

    }
    @Then("the user clicks on the Add Element button")
    public void the_user_clicks_on_the_add_element_button() {
        AddRemElPage.clickOnAddElementButton();


    }
    @Then("the user can click on the Delete button")
    public void the_user_can_click_on_the_delete_button() {
        AddRemElPage.clickOnDeleteElement();
    }




}
