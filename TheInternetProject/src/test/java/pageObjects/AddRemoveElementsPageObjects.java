package pageObjects;

import browserControl.WebConnector;

public class AddRemoveElementsPageObjects extends WebConnector {

    /***********************Loctors*******************************/

    private String addElementXpath = "//button[@onclick='addElement()']";
    private String deleteElementXpath = "//button[@onclick='deleteElement()']";



    /*******************Getters and Setters***********************/

    public void clickOnAddElementButton (){
        BasePage.findElementByXpath(10,addElementXpath).click();
    }
    public void clickOnDeleteElement(){
        BasePage.findElementByXpath(10,deleteElementXpath).click();
    }
}
