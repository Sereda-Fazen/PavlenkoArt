package pages.Order;



import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OrderPage extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 20000;

    @FindBy(xpath = "html/body/div[7]/div/div/div[1]/div/div/form/div[2]/div/div[1]/a")
    private WebElement addOrder;


    public OrderPage(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }


    public void SetAddOrder() {
        clickOn(addOrder);
    }





}
