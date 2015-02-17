package tests;

import org.junit.Assert;
import steps.GoodSteps;
import steps.HomeSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import steps.OrderSteps;
import steps.OrderingSteps;

import java.io.IOException;

import static org.hamcrest.Matchers.is;

/**
 * Created by rb on 19.01.15.
 */
public class BeforeClass {

    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver driver;
    @Steps
    public HomeSteps compare;
    @Steps
    public GoodSteps compare1;
    @Steps
    public OrderSteps compare2;
    @Steps
    public OrderingSteps userInfo;


    @Before
    public void myTest() throws Exception {
      System.setProperty("webdriver.chrome.driver", "C:\\Test\\DriverBrowsers\\chromedriver.exe");
        compare.start_browser();
        driver.manage().window().maximize();
    }

    @After
    public void close() throws IOException {
        driver.close();
    }



}
