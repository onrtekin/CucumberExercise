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

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement newButton;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement positionTextBox;

    @FindBy(xpath = "//input[@id='DTE_Field_office']")
    public WebElement officeTextBox;

    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extnTextBox;

    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDateTextBox;

    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salaryTextBox;

  @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButton;

  @FindBy(xpath = "//input[@type='search']")
    public WebElement searchTextBox;

  @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement aramaSonucuIlkElement;








}
