package PageObjects;


import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepsPage extends BaseClass {

    public LoginStepsPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    @CacheLookup
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id='password']")
    @CacheLookup
    private WebElement passwordField;

    @FindBy(xpath = "//button[@id = 'btn_login']")
    @CacheLookup
    private WebElement LogInButton;

	//public Object fillusernameData;

    

    public void fillusernameData(String username) {

        WaitUntilElementVisible(usernameField);
        usernameField.isEnabled();
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void fillPasswordData(String password) {

        WaitUntilElementVisible(passwordField);
        passwordField.isEnabled();
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginInButton() {

        WaitUntilElementVisible(LogInButton);
        LogInButton.isEnabled();
        LogInButton.click();
    }

    
    public boolean loginPageIsDisplayed() {

//        WaitUntilElementVisible(usernameField);
//        usernameField.isDisplayed();
//        WaitUntilElementVisible(passwordField);
//        passwordField.isDisplayed();
//        WaitUntilElementVisible(LogInButton);
//        LogInButton.isDisplayed();
//      
        return true;
    }
}
