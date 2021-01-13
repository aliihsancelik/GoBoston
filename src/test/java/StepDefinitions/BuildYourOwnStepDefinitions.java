package StepDefinitions;

import Pages.BuildYourOwnPage;
import Utilities.BrowserUtil;
import io.cucumber.java.en.*;
import org.apache.log4j.Logger;
import org.junit.Assert;

public class BuildYourOwnStepDefinitions {

    private static final Logger logger = Logger.getLogger(BuildYourOwnStepDefinitions.class);

    BuildYourOwnPage buildYourOwnPage = new BuildYourOwnPage();

    @When("I navigate to Build Your Own Page")
    public void i_navigate_to_Build_Your_Own_Page() {

        logger.info("Navigating to Build Your Own Page");
        buildYourOwnPage.buildYourOwnModule.click();
    }

    @When("I add first attraction to cart then click checkout")
    public void i_add_first_attraction_to_cart_then_click_checkout() {

        logger.info("Adding first attraction to the cart and clicking the checkout");
        BrowserUtil.waitForClickablility(buildYourOwnPage.firstAttraction , 5);
        buildYourOwnPage.firstAttraction.click();
        BrowserUtil.waitFor(2);
        buildYourOwnPage.checkout.click();
    }

    @When("I choose the date {string} for the current month and continue to payment")
    public void i_choose_the_date_for_the_current_month_and_continue_to_payment(String day) {

        logger.info("Choosing the date and clicking the continue to payment");
        BrowserUtil.waitFor(1);
        buildYourOwnPage.dateDropDown.click();
        BrowserUtil.waitFor(1);
        buildYourOwnPage.pickDay(day).click();
        BrowserUtil.waitForClickablility(buildYourOwnPage.continuePayment, 5);
        buildYourOwnPage.continuePayment.click();
    }

    @Then("I should be on {string} page")
    public void i_should_be_on_page(String page) {

        logger.info("Verifying the text in payment method page");
        BrowserUtil.waitForVisibility(buildYourOwnPage.paymentPageText, 5);
        Assert.assertTrue(buildYourOwnPage.paymentPageText.getText().contains(page));
    }

}
