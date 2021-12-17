package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    public SearchPage (WebDriver driver) {
        super(driver);
    }

    //hummingbird printed sweater
    @FindBy (xpath = "//a[text()='Hummingbird printed sweater']")
    private WebElement hummingbirdPrintedSweaterLinkSearchPage;

    //clicking on hummingbird printed sweater product
    public void hummingbirdPrintedSweaterLinkSearchPageClick(){
        hummingbirdPrintedSweaterLinkSearchPage.click();
    }
}
