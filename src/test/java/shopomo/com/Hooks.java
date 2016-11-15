package shopomo.com;

import Utils.AutomationConstant;
import Utils.BrowserFactoryManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

//junit is only with @test, when we dont use feature file we use junit
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by VRINDA on 14/11/2016.
 */
public class Hooks {


    @Before
    public static void setup() {
        System.out.println("calling browser factory");
      BrowserFactoryManager.openBrowser();
    }

    @After
    public static void teardown() {
        BrowserFactoryManager.closeBrowser();
    }
}
