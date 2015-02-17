package tests;

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

/**
 * Created by rb on 19.01.15.
 */
public class BeforeClass {

    @Managed(uniqueSession = true, driver = "firefox")
    public WebDriver driver;
    @Steps
    public HomeSteps compare;
    @Steps
    public GoodSteps compare1;
    @Steps
    public OrderSteps compare2;
    // Form
        public @Steps OrderingSteps name;
        public @Steps OrderingSteps email;
        public @Steps OrderingSteps phone;
        public @Steps OrderingSteps city;
        public @Steps OrderingSteps adress;
        public @Steps OrderingSteps comment;
        public @Steps OrderingSteps orderbue;



    @Before
    public void myTest() throws Exception {
        compare.start_browser();
        driver.manage().window().maximize();
    }

    @After
    public void close() throws IOException {
        driver.close();
    }

}
