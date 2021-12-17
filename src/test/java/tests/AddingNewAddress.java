package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LogInPage;
import pages.YourAccountAddressesPage;
import pages.YourAccountPage;

import java.util.concurrent.TimeUnit;

public class AddingNewAddress {

    private static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void openLogInPage() {
        //open my store main page
        driver.get("https://mystore-testlab.coderslab.pl/");
        HomePage homePage = new HomePage(driver);
        homePage.signInButtonHomePageClick();
        //log in
        LogInPage logInPage = new LogInPage(driver);
        logInPage.loginIntoExistingAccount();
        //open your account page
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.addAddressesButtonYourAccountPageClick();
        //open your addresses page
        YourAccountAddressesPage yourAccountAddressesPage = new YourAccountAddressesPage(driver);
        yourAccountAddressesPage.addingNewAddressesOnYourAccountAddressesPage("test 2", "test address 2", "11-111", "test city 2", "United Kingdom", "000 555 000");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        yourAccountAddressesPage.addAddressConfirmation();
        Assert.assertEquals("Address successfully added!", yourAccountAddressesPage.addAddressConfirmation());


    }
}
