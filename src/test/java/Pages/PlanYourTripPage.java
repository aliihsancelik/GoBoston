package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlanYourTripPage extends BasePage {


    @FindBy(xpath = "(//a[contains(text(),'Plan your trip')])[3]")
    public WebElement planYourTrip;

    @FindBy(css = "#edit-first-name")
    public WebElement firstName;

    @FindBy(css = "#edit-last-name")
    public WebElement lastName;

    @FindBy(css = "#edit-email")
    public WebElement email;

    @FindBy(css = "#edit-travel-date")
    public WebElement travelDates;

   @FindBy(xpath = "//a[contains(text(),'29')]")
   public WebElement plannedDate;

    @FindBy(css = "#edit-subscription")
    public WebElement privacyBox;

    @FindBy(css = "#edit-actions-submit")
    public WebElement submit;

    @FindBy(xpath = "//a[contains(text(),'Download your guide')]")
    public WebElement download;




}
