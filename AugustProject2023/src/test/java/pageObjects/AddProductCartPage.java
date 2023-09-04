package pageObjects;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductCartPage extends WebConnector {

    /*******************************Locators**************************************/

    private String addToCartPLPXpath = "//button[@id='add-to-cart-sauce-labs-backpack']";
    private String miniCartButtonXpath = "//a[@class='shopping_cart_link']";
    private String addToCartPDPXpath = "";
    private String sauceLabBackpackProductXpath ="//a[@id='item_4_title_link']";




    /*********************************Getters and Setters*************************/

    public void clickOnAddToCartButton(){
        BasePage.findElementByXpath(10,addToCartPLPXpath).click();
    }
    public void clickOnMiniCartButton (){
        BasePage.findElementByXpath(10,miniCartButtonXpath).click();
    }

    public void clickOnBackpackProductLink(){
        BasePage.findElementByXpath(10,sauceLabBackpackProductXpath);
    }


}
