package popup;

import browserControl.WebConnector;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthPopup extends WebConnector {
    public void handleAuth(){
        String username = "admin";
        String password = "admin";
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
        driver.switchTo().alert().sendKeys("admin");
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.quit();
    }
}
