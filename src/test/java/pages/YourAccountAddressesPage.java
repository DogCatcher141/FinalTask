package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    /*notifications*/
    //address creation confirmation
    @FindBy (xpath = "//*[@id=\"notifications\"]/div/article/ul/li")
    private WebElement addAddressConfirmationYourAccountAddressesPage;
    //address deletion confirmation
    @FindBy (xpath = "//*[@id=\"notifications\"]/div/article/ul/li")
    private WebElement deleteAddressConfirmationYourAccountAddressesPage;

    /*existing address*/
    //alias
    @FindBy (xpath = "//h4[text()='address 1']")
    private WebElement aliasExistingAddressYourAccountAddressesPage;
    //delete button
    @FindBy (xpath = "//span[text()='Delete']")
    private WebElement deleteButtonExistingAddressYourAccountAddressesPage;
    //address body
    @FindBy (xpath = "//address")
    private WebElement addressBody;

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
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(addAddressConfirmationYourAccountAddressesPage));

        return addAddressConfirmationYourAccountAddressesPage.getText();
    }

    public String existingAddressAliasYourAccountAddressesPage(){
        return aliasExistingAddressYourAccountAddressesPage.getText();
    }

    public String existingAddressBodyGetText(){
        return addressBody.getText();
    }

    public void deletingExistingAddressYourAccountAddressesPage(){
        deleteButtonExistingAddressYourAccountAddressesPage.click();
    }

    public String deleteAddressConfirmation(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(deleteAddressConfirmationYourAccountAddressesPage));

        return deleteAddressConfirmationYourAccountAddressesPage.getText();
    }
}
