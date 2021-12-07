package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LogInPage;
import pages.YourAccountPage;

import java.util.concurrent.TimeUnit;

public class AddingNewAddress {

    private static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void openLogInPage() {
        driver.get("https://mystore-testlab.coderslab.pl/");
        HomePage homePage = new HomePage(driver);
        homePage.signInButtonHomePageClick();

        LogInPage logInPage = new LogInPage(driver);
        logInPage.loginIntoExistingAccount();

        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.addAddressesButtonYourAccountPageClick();


    }
}
