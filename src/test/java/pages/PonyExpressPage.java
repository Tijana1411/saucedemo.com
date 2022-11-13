package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PonyExpressPage extends BaseTest {

    @FindBy(css = "[class=\"complete-text\"]")
    WebElement message;

    public PonyExpressPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean messageIsDisplayed() {
        wdWait.until(ExpectedConditions.elementToBeClickable(message));
        return message.isDisplayed();

    }

    public String orderSuccessText() {
        wdWait.until(ExpectedConditions.elementToBeClickable(message));
        return message.getText();
    }
}
