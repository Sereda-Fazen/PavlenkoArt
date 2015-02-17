package steps;

import pages.Good.GoodPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;



public class GoodSteps extends ScenarioSteps {
    GoodPage goodPage;

    public GoodSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void start_browser() {
        GoodPage loginPage = getPages().get(GoodPage.class);
        loginPage.open();
    }

    @Step
    public void addGood() {goodPage.SetAddGood();}


}


