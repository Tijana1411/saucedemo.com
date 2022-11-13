package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInPage extends BaseTest {
    @FindBy(id = "user-name")
    WebElement userName;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(css = "[name=\"login-button\"]")
    WebElement logInButton;

    public LogInPage() {
        PageFactory.initElements(driver, this);
    }

    public LogInPage fillUserName(String stringUS) {
        wdWait.until(ExpectedConditions.elementToBeClickable(userName));
        userName.clear();
        userName.sendKeys(stringUS);
        return this;
    }

    public LogInPage fillPassword(String stringPass) {
        wdWait.until(ExpectedConditions.elementToBeClickable(password));
        password.clear();
        password.sendKeys(stringPass);
        return this;
    }

    public LogInPage clickOnButton() {
        wdWait.until(ExpectedConditions.elementToBeClickable(logInButton));
        logInButton.click();
        return this;
    }





}
