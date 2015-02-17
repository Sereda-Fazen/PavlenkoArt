package pages.Ordering;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dima on 16.02.2015.
 */
public class OrderingPage extends PageObject {

    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 20000;

            @FindBy(id = "payment_address_firstname")
            protected WebElement firstn;
            public void setAddName() {enter("Alex").into(firstn);}

            @FindBy(id = "payment_address_email")
            protected WebElement email;
            public void setAddEmail() {enter("fazen7@mail.ru").into(email);}

            @FindBy(id = "payment_address_telephone")
            protected WebElement phone;
            public void setAddPhone() {enter("0936631070").into(phone);}

            @FindBy(id = "payment_address_city")
            protected WebElement city;
            public void setAddCity() {enter("Kharkov").into(city);}

            @FindBy(id = "payment_address_address_1")
            protected WebElement adress;
            public void setAddAdress() {enter("street Kibalchicha").into(adress);}

            @FindBy(id = "confirm_comment")
            protected WebElement comment;
            public void setAddComment() {enter("Test comment").into(comment);}

            @FindBy(id = "confirm_order")
            protected WebElement order;



    public OrderingPage(WebDriver driver) { super(driver, CATALOG_WAIT_FOR_TIMEOUT);}


            public void SetAddName() { setAddName();}
            public void SetAddEmail() { setAddEmail();}
            public void SetAddPhone() { setAddPhone();}
            public void SetAddCity() { setAddCity();}
            public void SetAddAdress() { setAddAdress();}
            public void SetAddComment() { setAddComment();}
            public void SetOrder() {clickOn(order);}



}


