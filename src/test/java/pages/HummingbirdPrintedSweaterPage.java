package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HummingbirdPrintedSweaterPage extends BasePage{
    public HummingbirdPrintedSweaterPage (WebDriver driver){
        super(driver);
    }

    //regular price
    @FindBy (className = "regular-price")
    private WebElement regularPrice;
    //discount
    @FindBy (xpath = "//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[2]/div/span[2]")
    private WebElement discount;
    //current price
    @FindBy (xpath = "//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[2]/div/span[1]")
    private WebElement currentPrice;
    //size
    @FindBy (xpath = "//*[@id=\"group_1\"]")
    private WebElement size;
    //quantity
    @FindBy (xpath = "//*[@id=\"quantity_wanted\"]")
    private WebElement quantity;
    //add to cart button
    @FindBy (xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")
    private WebElement addToCartButton;
    @FindBy (xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")
    private WebElement proceedToCheckoutButton;

    /*extracting data*/
    //expected price
    public double expectedPrice(){
        double regularPriceDouble;
        String regularPriceString = regularPrice.getText();
        String regularPriceNumbersOnly = regularPriceString.replaceAll("€","");
        regularPriceDouble = Double.parseDouble(regularPriceNumbersOnly);

        double discountDouble;
        String discountString = discount.getText();
        String discountNumbersOnly = discountString.replaceAll("\\D+","");
        discountDouble = Double.parseDouble(discountNumbersOnly);

        double expectedPriceDouble = regularPriceDouble - (regularPriceDouble * discountDouble / 100);

        return expectedPriceDouble;
    }
    //current price with discount
    public double currentPrice(){
        double currentPriceDouble;
        String currentPriceString = currentPrice.getText();
        String currentPriceNumbersOnly = currentPriceString.replaceAll("€","");
        currentPriceDouble = Double.parseDouble(currentPriceNumbersOnly);

        return currentPriceDouble;
    }

    /*actions*/
    //selecting size
    public void selectingSize(String sizeInput){
        size.sendKeys(sizeInput);
    }
    //choosing quantity
    public void choosingQuantity(String quantityInput){
        quantity.clear();
        quantity.sendKeys(quantityInput);
    }
    //adding product to cart
    public void addToCartButtonClick(){
        addToCartButton.sendKeys(Keys.ENTER);
    }
    //go to checkout
    public void proceedToCheckoutButtonClick(){
        proceedToCheckoutButton.click();
    }
}

