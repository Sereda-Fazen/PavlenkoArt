package pages.Home;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 20000;

    @FindBy(className = "btn-primary")
    private WebElement addMore;


    public HomePage(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }


    public void setAddFilter() {
        clickOn(addMore);
    }





}
