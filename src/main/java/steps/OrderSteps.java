package steps;

import pages.Order.OrderPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;



public class OrderSteps extends ScenarioSteps {
    OrderPage orderPage;

    public OrderSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void start_browser() {
        OrderPage loginPage = getPages().get(OrderPage.class);
        loginPage.open();
    }

    @Step
    public void addOrder() {
        orderPage.SetAddOrder();
    }



}


