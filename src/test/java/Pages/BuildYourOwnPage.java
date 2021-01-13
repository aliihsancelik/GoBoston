package Pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnPage extends BasePage {


    @FindBy(xpath = "(//button[contains(text(),'Add to cart')])[1]")
    public WebElement firstAttraction;

    @FindBy(xpath = "(//a[contains(text(),'Checkout')])[1]")
    public WebElement checkout;

    @FindBy(css = ".travel-date--datepicker")
    public WebElement dateDropDown;

    @FindBy(xpath = "(//a[contains(text(),'Continue to payment')])[1]")
    public WebElement continuePayment;

    @FindBy(xpath = "//h2[contains(text(),'Choose a payment method')]")
    public WebElement paymentPageText;


    public WebElement pickDay(String day){

        WebElement pickedDay = Driver.getDriver().findElement(By.xpath("//a[contains(text(),'"+day+"')]"));

        return pickedDay;
    }

}
