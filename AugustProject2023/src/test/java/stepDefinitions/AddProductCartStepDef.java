package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.AddProductCartPage;

import java.time.Duration;

public class AddProductCartStepDef extends WebConnector {

    private AddProductCartPage AddProdPage= new AddProductCartPage();
    @When("the user click on “Add to cart” button")
    public void the_user_click_on_add_to_cart_button() {
        AddProdPage.clickOnAddToCartButton();

    }
    @When("the user click on the cart icon")
    public void the_user_click_on_the_cart_icon() {
        AddProdPage.clickOnMiniCartButton();

    }
    @Then("the user should see {string} on the cart page")
    public void the_user_should_see_on_the_cart_page(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));

    }
    @When("user clicks on Sauce Labs Back Pack link")
    public void user_clicks_on_sauce_labs_back_pack_link() {
        AddProdPage.clickOnBackpackProductLink();

    }


}
