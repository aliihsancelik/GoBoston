package StepDefinitions;

import Pages.BuildYourOwnPage;
import Utilities.BrowserUtil;
import Utilities.Driver;
import io.cucumber.java.en.*;

public class BuildYourOwnStepDefinitions {

    BuildYourOwnPage buildYourOwnPage = new BuildYourOwnPage();

    @When("I navigate to Build Your Own Page")
    public void i_navigate_to_Build_Your_Own_Page() {

        buildYourOwnPage.buildYourOwnModule.click();
    }

    @When("I add first attraction to cart then click checkout")
    public void i_add_first_attraction_to_cart_then_click_checkout() {

        BrowserUtil.waitForClickablility(buildYourOwnPage.firstAttraction , 5);
        buildYourOwnPage.firstAttraction.click();
        buildYourOwnPage.checkout.click();
    }

    @When("I choose the date {string} for the current month and continue to payment")
    public void i_choose_the_date_for_the_current_month_and_continue_to_payment(String day) {

        BrowserUtil.waitForClickablility(buildYourOwnPage.dateDropDown , 5);
        buildYourOwnPage.dateDropDown.click();

    }

    @Then("I should be on {string} page")
    public void i_should_be_on_page(String page) {

    }

}
