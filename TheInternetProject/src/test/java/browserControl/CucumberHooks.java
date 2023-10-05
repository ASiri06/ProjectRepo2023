package browserControl;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CucumberHooks extends WebConnector{
//    public class PassingInURL {
//        WebDriver driver;
//        String username;
//        String password;
//        String domain;
//        String url;

    @Before
    public void setup() {
        openBrowser();
//        WebDriverManager.edgedriver().setup();
//        driver = new EdgeDriver();
//        username = "admin";
//        password = "admin";
//        domain = "the-internet.herokuapp.com/basic_auth";

    }
    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take a screenshot
            final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            // embed it in the report
            scenario.attach(screenshot, "image/png", scenario.getName().replace(" ", "_") + "_ErrorScreenshot");
        }
        closeBrowser();
    }
    @After
    public void teardown() {
        closeBrowser();
    }
    }




