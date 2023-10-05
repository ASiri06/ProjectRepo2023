package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.BasePage;
import pageObjects.BasicAuthPageObjects;

import java.time.Duration;

public class BasicAuthStepDef extends WebConnector {

    private BasicAuthPageObjects basicAuthPage = new BasicAuthPageObjects();

//@Given("the user should see {string}")
//    public void the_user_should_see(String expectedText) {
//    Alert alert = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
//    String actualText = alert.getText();
//    Assert.assertEquals(expectedText,actualText);
//    }
@Given("the user enters  {string} in username field and enters {string} in password field")
public void the_user_enters_in_username_field_and_enters_in_password_field(String username, String password) {
    //driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//        String username = "admin";
//        String password = "admin";
//        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
        driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
        //driver.switchTo().alert().sendKeys("admin");

    }




    @Given("the user accepts the alert popup")
    public void the_user_accepts_the_popup() {
        Alert alert =  new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        alert.accept();

    }
}
