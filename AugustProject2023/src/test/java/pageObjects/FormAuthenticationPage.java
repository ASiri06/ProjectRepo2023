package pageObjects;
import browserControl.WebConnector;

public class FormAuthenticationPage extends WebConnector {

    /**********************Locators**********************/

    private String usernameFieldXPath = "//input[@id='user-name']";
    private String passwordFieldXPath = "//input[@id='password']";
    private String loginButtonXPath = "//input[@id='login-button']";

    /***************Setters and Getters *****************/


    public void setUserName(String username) {

        BasePage.findElementByXpath(10, usernameFieldXPath).sendKeys(username);

    }
    public void setPassword(String password){
        BasePage.findElementByXpath(10, passwordFieldXPath).sendKeys(password);
    }
    public void clickLogin(){
        BasePage.findElementByXpath(10,loginButtonXPath).click();
    }



}