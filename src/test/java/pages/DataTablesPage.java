package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablesPage {
    public DataTablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//body[@class='editor wide hero index']")
    public WebElement dataTablesHomePage;

    @FindBy(xpath = "//*[text()='Login / Register']")
    public WebElement loginRegisterButton;

    @FindBy(xpath = "//input[@id='DTE_Field_register-username']")
    public WebElement createUserNameTextBox;

    @FindBy(xpath = "//input[@id='DTE_Field_register-email']")
    public WebElement createEmailTextBox;

    @FindBy(xpath = "//input[@id='DTE_Field_register-password1']")
    public WebElement createPasswordTextBox;

    @FindBy(xpath = "//input[@id='DTE_Field_register-password2']")
    public WebElement createPasswordConfirmTextBox;

    @FindBy(xpath = "//*[text()='Sign-in / Register']")
    public WebElement signInRegisterButton;

    @FindBy(xpath = "//*[text()='Your account']")
    public WebElement yourAccount;

    @FindBy(xpath = "//input[@id='DTE_Field_signin-username']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='DTE_Field_signin-password']")
    public WebElement passwordTextBox;







}
