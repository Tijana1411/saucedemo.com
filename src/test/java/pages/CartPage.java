package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BaseTest {
    @FindBy(id = "item_2_title_link")
    WebElement product1;
    @FindBy(id = "item_4_title_link")
    WebElement product2;
    @FindBy(id = "remove-sauce-labs-onesie")
    WebElement removeButton;
    @FindBy(css = "[class=\"shopping_cart_badge\"]")
    WebElement badge;
    @FindBy(id="checkout")
    WebElement checkout;


    public CartPage() {
        PageFactory.initElements(driver, this);
    }

    public CartPage remove() {
        wdWait.until(ExpectedConditions.elementToBeClickable(removeButton));
        removeButton.click();
        return this;
    }

    public boolean product1IsDisplayed() {
        wdWait.until(ExpectedConditions.elementToBeClickable(product1));
        return product1.isDisplayed();
    }

    public boolean product2IsDisplayed() {
        wdWait.until(ExpectedConditions.elementToBeClickable(product2));
        return product2.isDisplayed();
    }

    public String stringBadge() {
        return badge.getText();
    }

    public CartPage clickOnCheckout(){
        wdWait.until(ExpectedConditions.elementToBeClickable(checkout));
        checkout.click();
        return this;
    }


}
