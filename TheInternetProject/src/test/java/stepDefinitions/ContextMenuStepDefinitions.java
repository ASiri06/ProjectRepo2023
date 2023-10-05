package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ContextMenuPageObjects;

import java.time.Duration;

public class ContextMenuStepDefinitions extends WebConnector {

private ContextMenuPageObjects contextMenuPage = new ContextMenuPageObjects();
    @Given("the user right click on the box")
    public void the_user_right_click_on_the_box() {
    contextMenuPage.clickOnBox();


    }
    @Given("the user see {string} text in the alert")
    public void the_user_see_text_in_the_alert(String expectedText) {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        String actualText = alert.getText();
        Assert.assertEquals(expectedText, actualText);
    }


    @Then("the user accepts the alert")
    public void the_user_accepts_the_alert() {
        driver.switchTo().alert().accept();

    }
}
