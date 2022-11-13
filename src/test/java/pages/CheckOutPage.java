package pages;

import base.BaseTest;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.jws.WebService;

public class CheckOutPage extends BaseTest {
    @FindBy(id="first-name")
    WebElement firstName;
    @FindBy(id="last-name")
    WebElement lastName;
    @FindBy(id="postal-code")
    WebElement zipCode;
    @FindBy(id="continue")
    WebElement continueButton;
    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    public CheckOutPage fillFirstName(String stringName){
        wdWait.until(ExpectedConditions.elementToBeClickable(firstName));
        firstName.clear();
        firstName.sendKeys(stringName);
        return this;

    }

    public CheckOutPage fillLastName(String stringLastName){
        wdWait.until(ExpectedConditions.elementToBeClickable(lastName));
        lastName.clear();
        lastName.sendKeys(stringLastName);
        return this;

    }

    public CheckOutPage fillZipCode(String stringZip){
        wdWait.until(ExpectedConditions.elementToBeClickable(zipCode));
        zipCode.clear();
        zipCode.sendKeys(stringZip);
        return this;

    }

    public CheckOutPage clickOnContinue(){
        wdWait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
        return this;
    }
}
