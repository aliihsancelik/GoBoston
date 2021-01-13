package StepDefinitions;

import Pages.PlanYourTripPage;
import Utilities.BrowserUtil;
import Utilities.DataGenerator;
import Utilities.Driver;
import io.cucumber.java.en.*;
import org.apache.log4j.Logger;

import static org.junit.Assert.*;

public class TripPlanStepDefinitions {


    private static final Logger logger = Logger.getLogger(TripPlanStepDefinitions.class);

    PlanYourTripPage planYourTripPage = new PlanYourTripPage();


    @Given("I am on {string} Page")
    public void i_am_on_Page(String page) {

         logger.info("Verifying the first location");
         assertTrue(Driver.getDriver().getTitle().contains(page));
    }


    @When("I navigate to Plan your trip Page")
    public void i_navigate_to_Plan_your_trip_Page() {

         logger.info("Navigating to the Plan your trip page");
         planYourTripPage.planYourTrip.click();
    }

    @When("I fill the user information and click the Get Your Guidebook button")
    public void i_fill_the_user_information_and_click_the_Get_Your_Guidebook_button() {

         logger.info("Filling the user information for a trip plan");
         planYourTripPage.firstName.sendKeys(DataGenerator.createUserInfo().get("firstName"));
         planYourTripPage.lastName.sendKeys(DataGenerator.createUserInfo().get("lastName"));
         planYourTripPage.email.sendKeys(DataGenerator.createUserInfo().get("email"));
         planYourTripPage.travelDates.click();
         planYourTripPage.plannedDate.click();
         planYourTripPage.privacyBox.click();
         planYourTripPage.submit.click();
    }

    @Then("I should be able to download my guidebook")
    public void i_should_be_able_to_download_my_guidebook() {

         logger.info("Clicking download and verifying the url after clicking download");
         String beforeDownloadUrl = Driver.getDriver().getCurrentUrl();
         BrowserUtil.waitForClickablility(planYourTripPage.download,5);
         planYourTripPage.download.click();
         BrowserUtil.waitFor(3);
         assertNotEquals(beforeDownloadUrl , Driver.getDriver().getCurrentUrl());
    }

}
