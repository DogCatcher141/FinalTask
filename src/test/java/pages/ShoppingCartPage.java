package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ShoppingCartPage extends BasePage{
    public ShoppingCartPage (WebDriver driver) {
        super(driver);
    }

    /*addresses*/
    //address alias
    @FindBy (xpath = "//span[@class='address-alias h4']")
    private WebElement addressAlias;
    //addresses continue button
    @FindBy (xpath = "//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button")
    private WebElement addressesContinue;
    /*shipping methods*/
    //shipping method PrestaShop
    @FindBy (xpath = "//*[@id=\"delivery_option_1\"]")
    private WebElement prestaShopShippingMethod;
    //shipping method continue button
    @FindBy (xpath = "//*[@id=\"js-delivery\"]/button")
    private WebElement shippingMethodContinue;
    /*payment*/
    //pay by check payment method
    @FindBy (xpath = "//*[@id=\"payment-option-1\"]")
    private WebElement payByCheckPaymentMethod;
    //I agree to the terms etc. (no one reads those anyway)
    @FindBy (xpath = "//*[@id=\"conditions_to_approve[terms-and-conditions]\"]")
    private WebElement termsOfService;
    //order button
    @FindBy (xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button")
    private WebElement orderButton;

    //clicking on address alias
    public void addressAliasClick(){
        addressAlias.click();
        addressesContinue.click();
    }
    //choosing PrestaShop shopping method
    public void choosingPrestaShopShoppingMethod(){
        prestaShopShippingMethod.click();
        shippingMethodContinue.click();
    }
    //choosing Pay by Check payment method
    public void choosingPaymentMethod(){
        payByCheckPaymentMethod.click();
        termsOfService.click();
        orderButton.click();
    }
    //taking a screenshot
    public void takingScreenshot() throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src, new File("C:\\Users\\piotr\\Documents\\CodersLab\\FinalTask\\src\\attachments"));
    }


}