package pageObjects;

import browserControl.WebConnector;

public class AddRemoveElementsPageObjects extends WebConnector {

    /***********************Loctors*******************************/

    private String addElementXpath = "//button[@onclick='addElement()']";
    private String deleteElementXpath = "//div[@id='elements']";



    /*******************Getters and Setters***********************/

    public void clickOnAddElementButton (){
        BasePage.findElementByXpath(10,addElementXpath);
    }
    public void clickOnDeleteElement(){
        BasePage.findElementByXpath(10,deleteElementXpath);
    }
}
