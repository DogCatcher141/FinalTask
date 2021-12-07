package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {

    public LogInPage (WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@id=\"login-form\"]/section/div[1]/div[1]/input")
    private WebElement emailInputLogInPage;

    @FindBy (xpath = "//*[@id=\"login-form\"]/section/div[2]/div[1]/div/input")
    private WebElement passwordInputLogInPage;

    @FindBy (xpath = "//*[@id=\"submit-login\"]")
    private WebElement signInButtonLogInPage;

    public void loginIntoExistingAccount() {
        emailInputLogInPage.sendKeys("omhdpisfgebuwqfxti@kvhrw.com");
        passwordInputLogInPage.sendKeys("Test1234%");
        signInButtonLogInPage.click();
    }
}