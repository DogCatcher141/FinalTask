package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver) {

        super(driver);
    }

    @FindBy (xpath = "//*[@id=\"_desktop_user_info\"]/div/a")
    private WebElement signInButtonHomePage;

    public void signInButtonHomePageClick() {
        signInButtonHomePage.click();
    }
}
