package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver) {
        super(driver);
    }

    //sign in button
    @FindBy (xpath = "//*[@id=\"_desktop_user_info\"]/div/a")
    private WebElement signInButtonHomePage;
    //search bar
    @FindBy (xpath = "//*[@id=\"search_widget\"]/form/input[2]")
    private WebElement searchBarHomePage;
    //search button
    @FindBy (xpath = "//*[@id=\"search_widget\"]/form/button")
    private WebElement searchButtonHomePage;

    public void signInButtonHomePageClick() {
        signInButtonHomePage.click();
    }

    public void searchProductHomePage() {
        searchBarHomePage.sendKeys("Hummingbird Printed Sweater");
        searchButtonHomePage.click();
    }
}
