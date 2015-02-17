package steps;

import pages.Home.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;



public class HomeSteps extends ScenarioSteps {
    HomePage homePage;

    public HomeSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void start_browser() {
        HomePage loginPage = getPages().get(HomePage.class);
        loginPage.open();
    }

    @Step
    public void addMore() {
        homePage.setAddFilter();
    }



}


