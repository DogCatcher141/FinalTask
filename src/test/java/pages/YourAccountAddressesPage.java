package pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAccountAddressesPage extends BasePage{

    public YourAccountAddressesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/form/section/div[1]/div[1]/input")
    private WebElement aliasInputYourAccountAddressesPage;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/form/section/div[6]/div[1]/input")
    private WebElement addressInputYourAccountAddressesPage;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/form/section/div[8]/div[1]/input")
    private WebElement zipPostalCodeInputYourAccountAddressesPage;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/form/section/div[9]/div[1]/input")
    private WebElement cityInputYourAccountAddressesPage;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select")
    private WebElement countryFromDropListYourAccountAddressesPage;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select/option[2]")
    private WebElement unitedKingdomDropListOptionOnYourAccountAddressesPage;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/form/section/div[11]/div[1]/input")
    private WebElement phoneInputYourAccountAddressesPage;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/form/footer/button")
    private WebElement saveButtonYourAccountAddressesPage;


    @When("I enter \"<alias>\" in the Alias input")
    public void fillAliasInput(){
        aliasInputYourAccountAddressesPage.sendKeys();
    }

    @And("I enter \"<address>\" in the Address input")
    public void fillAddressInput(){
        addressInputYourAccountAddressesPage.sendKeys();
    }

    @And("I enter \"<zip/postal code>\" in the Zip/Postal Code input")
    public void fillZipPostalCodeInput(){
        zipPostalCodeInputYourAccountAddressesPage.sendKeys();
    }

    @And("I enter \"<city>\" in the City input")
    public void fillCityInput(){
        cityInputYourAccountAddressesPage.sendKeys();
    }

    @And("I enter \"<country>\" from the Country droplist")
    public void fillCountryInput(){
        countryFromDropListYourAccountAddressesPage.click();
        unitedKingdomDropListOptionOnYourAccountAddressesPage.click();
    }

    @And("I enter \"<phone>\" in the Phone input")
    public void fillPhoneInput(){
        phoneInputYourAccountAddressesPage.sendKeys();
    }

}
