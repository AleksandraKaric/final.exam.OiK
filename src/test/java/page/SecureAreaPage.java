package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SecureAreaPage extends BaseTest {

    public SecureAreaPage (){
        PageFactory.initElements(driver,this);
    }

    @FindBy (id="flash")
    WebElement successfulLoginMessage;

    @FindBy (css = ".icon-2x.icon-signout")
    WebElement logoutButton;

    public boolean succesfullLoginMessageIsDisplayed (){
        wdWait.until(ExpectedConditions.visibilityOf(successfulLoginMessage));
        return successfulLoginMessage.isDisplayed();
    }

    public String successfulLoginMessageGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(successfulLoginMessage));
        return successfulLoginMessage.getText();
    }

    public void logoutButtonClick (){
        wdWait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();
    }
}
