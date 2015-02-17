package steps;

import jxl.common.Assert;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.Ordering.OrderingPage;

import javax.validation.constraints.AssertTrue;


/**
 * Created by Dima on 16.02.2015.
 */
public class OrderingSteps extends ScenarioSteps {

    OrderingPage orderingPage;

    public OrderingSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void start_browser() {
        OrderingPage loginPage = getPages().get(OrderingPage.class);
        loginPage.open();
    }

    @Step
    public void addName() {
        orderingPage.setAddName();
    }
    @Step
    public void addEmail() {
        orderingPage.setAddEmail();
    }
    @Step
    public void addPhone() {
        orderingPage.setAddPhone();
    }
    @Step
    public void addCity() {
        orderingPage.setAddCity();
    }
    @Step
    public void addAdress() {
        orderingPage.setAddAdress();
    }
    @Step
    public void addComment() {
        orderingPage.setAddComment();
    }
    @Step
    public void addOrderBuy(){
        orderingPage.SetOrder();
    }


}

