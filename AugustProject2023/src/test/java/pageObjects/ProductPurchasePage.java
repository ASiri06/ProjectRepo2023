package pageObjects;

import browserControl.WebConnector;

public class ProductPurchasePage extends WebConnector {

    /********************************Locators***************************/
    private String checkoutButtonXpath = "//button[@id='checkout']";
    private String nameFieldXpath = "//input[@id='first-name']";
    private String surnameFieldXpath = "//input[@id='last-name']";
    private String postcodeFieldXpath = "//input[@id='postal-code']";
    private String continueButtonXpath = "//input[@id='continue']";
    private String finishButtonXpath = "//button[@id='finish']";



    /*************************Setters&Getters**************************/

    public void clickOnCheckoutButton(){
        BasePage.findElementByXpath(10, checkoutButtonXpath).click();

    }

    public void setName (String name){
        BasePage.findElementByXpath(10,nameFieldXpath).sendKeys(name);

    }

    public void setSurname(String surname){
        BasePage.findElementByXpath(10, surnameFieldXpath).sendKeys(surname);

    }
    public void setPostcode (String postcode){
        BasePage.findElementByXpath(10,postcodeFieldXpath).sendKeys(postcode);

    }
    public void clickOnContinueButton(){
    BasePage.findElementByXpath(10,continueButtonXpath).click();
    }
    public void clickOnFinishButton(){
        BasePage.findElementByXpath(10,finishButtonXpath).click();
    }






}
