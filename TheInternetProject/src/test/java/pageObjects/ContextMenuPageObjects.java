package pageObjects;

import browserControl.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPageObjects extends WebConnector {
/***************************Locators**********************************/

private String boxXpath = "//div[@id='hot-spot']";



/************************Setters and Getters*************************/

public void clickOnBox(){
   //BasePage.findElementByXpath(10,boxXpath);
    WebElement element = driver.findElement(By.xpath(boxXpath));
    Actions action = new Actions(driver);
    action.contextClick(element).perform();
}

}
