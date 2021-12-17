package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    public CheckoutPage (WebDriver driver) {
        super(driver);
    }

    //proceed to checkout button
    @FindBy (xpath = "//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")
    private WebElement proceedToCheckoutButton;

    //proceed to checkout button click
    public void proceedToCheckoutButtonClick(){
        proceedToCheckoutButton.click();
    }
}