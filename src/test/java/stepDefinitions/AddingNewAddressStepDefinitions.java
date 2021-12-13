package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LogInPage;
import pages.YourAccountAddressesPage;
import pages.YourAccountPage;

import java.util.concurrent.TimeUnit;

public class AddingNewAddressStepDefinitions {
    private WebDriver driver;

    @Given ("User is already logged in and on Your Account Addresses page")
    public void openingYourAccountAddressesPage(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://mystore-testlab.coderslab.pl/");
        HomePage homePage = new HomePage(driver);
        homePage.signInButtonHomePageClick();

        LogInPage logInPage = new LogInPage(driver);
        logInPage.loginIntoExistingAccount();

        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.addAddressesButtonYourAccountPageClick();
    }

    @When ("User clicks on Create new address")
    public void clickingCreateNewAddressFormYourAccountAddressesPage(){
        YourAccountAddressesPage yourAccountAddressesPage = new YourAccountAddressesPage(driver);
        yourAccountAddressesPage.addAddressesButtonYourAccountAddressesPageClick();
    }


    @And ("^User enters \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\"$")
    public void fillingAddNewAddressesYourAccountAddressesPage(String alias, String address, String zipPostalCode, String city, String country, String phone){
        YourAccountAddressesPage yourAccountAddressesPage = new YourAccountAddressesPage(driver);
        yourAccountAddressesPage.addingNewAddressesOnYourAccountAddressesPage(alias, address, zipPostalCode, city, country, phone);

        Assert.assertEquals("Address successfully added!", yourAccountAddressesPage.addAddressConfirmation());
    }

    @Then ("^Check if \"(.*)\" data is correct$")
    public void checkingIfAddedAddressDataIsCorrect(String alias){
        YourAccountAddressesPage yourAccountAddressesPage = new YourAccountAddressesPage(driver);
        Assert.assertEquals(alias, yourAccountAddressesPage.existingAddressAliasYourAccountAddressesPage());
    }
}