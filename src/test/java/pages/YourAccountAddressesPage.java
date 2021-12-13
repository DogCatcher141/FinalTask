package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAccountAddressesPage extends BasePage{

    public YourAccountAddressesPage(WebDriver driver) {
        super(driver);
    }

    //create new address button
    @FindBy (xpath = "//*[@id=\"content\"]/div[@class='addresses-footer']/a")
    private WebElement createNewAddressButtonYourAccountAddressesPage;

    /*form*/
    //alias
    @FindBy (xpath = "//*[@id=\"content\"]/div/div/form/section/div[1]/div[1]/input")
    private WebElement aliasInputYourAccountAddressesPage;
    //address
    @FindBy (xpath = "//*[@id=\"content\"]/div/div/form/section/div[6]/div[1]/input")
    private WebElement addressInputYourAccountAddressesPage;
    //zip/postal code
    @FindBy (xpath = "//*[@id=\"content\"]/div/div/form/section/div[8]/div[1]/input")
    private WebElement zipPostalCodeInputYourAccountAddressesPage;
    //city
    @FindBy (xpath = "//*[@id=\"content\"]/div/div/form/section/div[9]/div[1]/input")
    private WebElement cityInputYourAccountAddressesPage;
    //country
    @FindBy (xpath = "//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select")
    private WebElement countryFromDropListYourAccountAddressesPage;
    //country - united kingdom
    @FindBy (xpath = "//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select/option[2]")
    private WebElement unitedKingdomDropListOptionOnYourAccountAddressesPage;
    //phone
    @FindBy (xpath = "//*[@id=\"content\"]/div/div/form/section/div[11]/div[1]/input")
    private WebElement phoneInputYourAccountAddressesPage;
    //save button
    @FindBy (xpath = "//*[@id=\"content\"]/div/div/form/footer/button")
    private WebElement saveButtonYourAccountAddressesPage;
    //address creation confirmation notification
    @FindBy (xpath = "//*[@id=\"notifications\"]/div/article/ul/li")
    private WebElement addAddressConfirmationYourAccountAddressesPage;

    /*existing address*/
    //alias
    @FindBy (xpath = "//*[@id=\"address-18216\"]/div[1]/h4")
    private WebElement addressAliasExistingAddressYourAccountAddressesPage;

    public void addAddressesButtonYourAccountAddressesPageClick () {
        createNewAddressButtonYourAccountAddressesPage.click();
    }

    public void addingNewAddressesOnYourAccountAddressesPage(String alias, String address, String zipPostalCode, String city, String country, String phone){
        aliasInputYourAccountAddressesPage.click();
        aliasInputYourAccountAddressesPage.sendKeys(alias);

        addressInputYourAccountAddressesPage.click();
        addressInputYourAccountAddressesPage.sendKeys(address);

        zipPostalCodeInputYourAccountAddressesPage.click();
        zipPostalCodeInputYourAccountAddressesPage.sendKeys(zipPostalCode);

        cityInputYourAccountAddressesPage.click();
        cityInputYourAccountAddressesPage.sendKeys(city);

        countryFromDropListYourAccountAddressesPage.click();
        countryFromDropListYourAccountAddressesPage.sendKeys(country);

        phoneInputYourAccountAddressesPage.click();
        phoneInputYourAccountAddressesPage.sendKeys(phone);

        saveButtonYourAccountAddressesPage.click();
    }

    public String addAddressConfirmation(){
        return addAddressConfirmationYourAccountAddressesPage.getText();
    }

    public String existingAddressAliasYourAccountAddressesPage(){
        return addressAliasExistingAddressYourAccountAddressesPage.getText();
    }
}
