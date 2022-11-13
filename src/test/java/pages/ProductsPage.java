package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsPage extends BaseTest {
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement productOne;
    @FindBy(css = "[class=\"shopping_cart_badge\"]")
    WebElement badge;
    @FindBy(id="item_4_title_link")
    WebElement productTwo;
    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElement getProductTwoInTheCart;
    @FindBy(id="shopping_cart_container")
    WebElement shopingCart;


    public ProductsPage() {
        PageFactory.initElements(driver, this);
    }



    public boolean badgeIsDisplayed() {
        wdWait.until(ExpectedConditions.elementToBeClickable(badge));
        return badge.isDisplayed();

    }

    public String textBadge() {
        return badge.getText();
    }

    public ProductsPage clickOnAddButton() {
        jsExecutor.executeScript("window.scrollBy(0,500)");
        wdWait.until(ExpectedConditions.elementToBeClickable(productOne));
        productOne.click();
        return this;

    }

    public ProductsPage productTwoDisplay()
    {
        jsExecutor.executeScript("window.scrollBy(0,-500)");
        wdWait.until(ExpectedConditions.elementToBeClickable(productTwo));
        productTwo.click();
        return this;

    }

   public ProductsPage addProductTwoInTheCart(){
        wdWait.until(ExpectedConditions.elementToBeClickable(getProductTwoInTheCart));
        getProductTwoInTheCart.click();
        return this;

  }

  public  ProductsPage clickOnCart(){
        //wdWait.until(ExpectedConditions.elementToBeClickable(shopingCart));
        shopingCart.click();
        return this;
  }

    }






