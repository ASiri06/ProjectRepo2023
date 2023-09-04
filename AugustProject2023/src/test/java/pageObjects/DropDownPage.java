package pageObjects;

import browserControl.WebConnector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage extends WebConnector {

    /**************************Locators**********************/

     String loginButtonXPath = "//input[@id='login-button']";
     String filterButtonXPath = "//select[@class='product_sort_container']";
    private String dropdownOptionAZXpath = "//option[@value='az']";

    /************************Getters and Setters****************/

    public void clickLogin() {
        BasePage.findElementByXpath(10, loginButtonXPath).click();

    }
    public void selectOptionFromDropdown(String selectOption) {

        WebElement dropdown = BasePage.findElementByXpath(10, filterButtonXPath);
        Select select = new Select(dropdown);
        select.selectByVisibleText(selectOption);

    }

    public String getSelectedOption() {
        return BasePage.findElementByXpath(10, filterButtonXPath).getText();
    }


}





