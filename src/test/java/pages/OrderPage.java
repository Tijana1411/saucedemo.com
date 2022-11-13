package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OrderPage extends BaseTest {
    @FindBy(id="finish")
    WebElement finish;
    public OrderPage(){
        PageFactory.initElements(driver,this);
    }

    public OrderPage clickOnFinishButton(){
        wdWait.until(ExpectedConditions.elementToBeClickable(finish));
        finish.click();
        return this;
    }
}
