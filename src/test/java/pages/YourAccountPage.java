package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAccountPage extends BasePage {

    public YourAccountPage (WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@id=\"addresses-link\"]")
    private WebElement addAddressesButtonYourAccountPage;

    public void addAddressesButtonYourAccountPageClick () {
        addAddressesButtonYourAccountPage.click();
    }
}
