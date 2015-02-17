package pages.Good;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoodPage extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 20000;

    @FindBy(className = "buyButton")
    private WebElement addGood;


    public GoodPage(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }


    public void SetAddGood() {
        clickOn(addGood);
    }





}
