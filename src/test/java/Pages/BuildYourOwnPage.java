package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnPage extends BasePage {

    @FindBy(xpath = "(//button[contains(text(),'Add to cart')])[1]")
    public WebElement firstAttraction;

    @FindBy(xpath = "(//a[contains(text(),'Checkout')])[1]")
    public WebElement checkout;

    @FindBy(css = ".travel-date--calendar.travel-date-element.hasDatepicker")
    public WebElement dateDropDown;

    @FindBy(xpath = "//a[contains(text(),'29')]")
    public WebElement day;

}
