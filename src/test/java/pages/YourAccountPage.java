package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAccountPage extends BasePage {

    public YourAccountPage (WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@href=\"https://mystore-testlab.coderslab.pl/index.php?controller=addresses\"]")
    private WebElement addAddressesButtonYourAccountPage;

    @FindBy (xpath = "//*[@id=\"_desktop_logo\"]/a")
    private WebElement homePageButtonYourAccountPage;

    public void addAddressesButtonYourAccountPageClick() {
        addAddressesButtonYourAccountPage.click();
    }

    public void homePageButtonYourAccountPageClick() {
        homePageButtonYourAccountPage.click();
    }
}
