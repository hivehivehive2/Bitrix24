package step_defs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utility.ConfigurationReader;
import utility.Driver;
import org.openqa.selenium.TakesScreenshot;
import utility.Utilities;

import java.util.concurrent.TimeUnit;

public class Hooks {


    public static WebDriver driver;
    public static Scenario currentScenario;

    @Before
    public void setUp(Scenario s){
        currentScenario = s; // embading ScreenShot (method)
        System.out.println("Setting up...");
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        String url = ConfigurationReader.get("url");
        driver.get(url);
        Utilities.waitFor(2);

        //GIVES DATE(TIME), MESSAGE and URL, without SCREENSHOT (because of False)
        Utilities.logInfo("Successfully navigated to "+url,false);
    }

    @After
    public void tearDown(){
        driver.quit();
        Driver.closeDriver();
    }

}

