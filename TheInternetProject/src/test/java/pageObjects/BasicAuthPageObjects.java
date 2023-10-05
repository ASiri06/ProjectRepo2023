package pageObjects;

import browserControl.WebConnector;
import org.openqa.selenium.By;

public class BasicAuthPageObjects extends WebConnector {

    /***************************Locators*************************/



    /*******************Getters and Setters**********************/

    public void setUserName(String username) {


    }
    public void setPassword(String password){
        BasePage.findElement(By.name(password));

    }
    public void clickSignIn(){
        driver.findElement(By.partialLinkText("Sign in")).click();

    }
}
