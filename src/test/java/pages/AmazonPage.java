package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unilities.Driver;

public class AmazonPage {

    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy( id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy( xpath = "h1//div/span")
    public WebElement resultNumber;
}
