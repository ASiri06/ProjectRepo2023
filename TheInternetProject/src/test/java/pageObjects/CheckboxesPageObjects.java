package pageObjects;

public class CheckboxesPageObjects {
    /***************************Locators*************************/
    private String checkbox1 = "//form[@id='checkboxes']/input[1]";

    private String checkbox2 = "//form[@id='checkboxes']/input[2]";



    /*******************Getters and Setters**********************/

    public void clickOnCheckbox1 (){
        BasePage.findElementByXpath(10,checkbox1).click();
    }
    public void clickOnCheckbox2 (){
        BasePage.findElementByXpath(10,checkbox2).click();
    }


}
