package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OrderingProductTest {

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
    public void orderingProduct() throws IOException {
        //opening store's main page
        driver.get("https://mystore-testlab.coderslab.pl/");
        HomePage homePage = new HomePage(driver);
        homePage.signInButtonHomePageClick();

        //logging in
        LogInPage logInPage = new LogInPage(driver);
        logInPage.loginIntoExistingAccount();

        //returning to home page
        YourAccountPage yourAccountPage= new YourAccountPage(driver);
        yourAccountPage.homePageButtonYourAccountPageClick();

        //searching for a product
        homePage.searchProductHomePage();

        //opening product page
        SearchPage searchPage = new SearchPage(driver);
        searchPage.hummingbirdPrintedSweaterLinkSearchPageClick();

        //checking discount
        HummingbirdPrintedSweaterPage hummingbirdPrintedSweaterPage = new HummingbirdPrintedSweaterPage(driver);
        Assert.assertEquals(hummingbirdPrintedSweaterPage.expectedPrice(), hummingbirdPrintedSweaterPage.currentPrice(), 0.001);
        //selecting size
        hummingbirdPrintedSweaterPage.selectingSize("m");
        //choosing quantity
        hummingbirdPrintedSweaterPage.choosingQuantity("1");
        //adding product to the cart
        hummingbirdPrintedSweaterPage.addToCartButtonClick();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        //proceed to checkout
        hummingbirdPrintedSweaterPage.proceedToCheckoutButtonClick();

        //opening shopping cart page
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.proceedToCheckoutButtonClick();

        //selecting address
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.addressAliasClick();
        //choosing shopping method
        shoppingCartPage.choosingPrestaShopShoppingMethod();
        //choosing payment method and confirming order
        shoppingCartPage.choosingPaymentMethod();
        //taking a screenshot of order confirmation
        shoppingCartPage.takingScreenshot();

    }
}
