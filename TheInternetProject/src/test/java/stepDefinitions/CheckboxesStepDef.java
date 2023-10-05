package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.CheckboxesPageObjects;

public class CheckboxesStepDef extends WebConnector {

    private CheckboxesPageObjects CheckboxesPage = new CheckboxesPageObjects();

    @Given("the user clicks on the checkbox1")
    public void the_user_clicks_on_the_checkbox1() {
        CheckboxesPage.clickOnCheckbox1();


    }

    @Then("the checkbox1 is selected")
    public void the_checkbox1_is_selected() {
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        System.out.println("checkbox1.isDisplayed()" + checkbox1.isDisplayed());
        if (checkbox1.isDisplayed()) {
            System.out.println("Checkbox1 is displayed");
        } else {
            System.out.println("Checkbox1 is not displayed");
        }
        System.out.println("checkbox1.isSelected()" + checkbox1.isSelected());

        if (checkbox1.isSelected()) {

            System.out.println("Checkbox1 is selected");

        } else {
            System.out.println("Checkbox1 is not selected");
        }
    }
        @Given("the user clicks on the checkbox2")
        public void the_user_clicks_on_the_checkbox2() {
            CheckboxesPage.clickOnCheckbox2();
        }

        @Then("the checkbox2 is not selected")
        public void the_checkbox2_is_not_selected() {
            WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
            System.out.println("checkbox2.isDisplayed()" + checkbox2.isDisplayed());
            if (checkbox2.isDisplayed()) {
                System.out.println("Checkbox2 is displayed");

            } else {
                System.out.println("Checkbox2 is not displayed");
            }
            System.out.println("checkbox2.isSelected()" + checkbox2.isSelected());

            if (checkbox2.isSelected()) {

                System.out.println("Checkbox2 is selected");

            } else {
                System.out.println("Checkbox2 is not selected");
            }


        }
    @Then("the checkbox2 is selected")
    public void the_checkbox2_is_selected() {
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        System.out.println("checkbox2.isDisplayed()" + checkbox2.isDisplayed());
        if (checkbox2.isDisplayed()) {
            System.out.println("Checkbox2 is displayed");

        } else {
            System.out.println("Checkbox2 is not displayed");
        }
        System.out.println("checkbox2.isSelected()" + checkbox2.isSelected());

        if (checkbox2.isSelected()) {

            System.out.println("Checkbox2 is selected");
            //checkbox2.click();

        } else {
            System.out.println("Checkbox2 is not selected");
        }


    }

    }
