package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationexercisePages {
    public AutomationexercisePages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//html[@lang='en']")
    public WebElement homePage;

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement newUserName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement newUserEmail;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signupButton;

   @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement enterAccountInformation;

   @FindBy(xpath ="//input[@id='id_gender1']")
    public WebElement title;

   @FindBy(xpath = "//input[@type='password']")
    public WebElement kayitPassword;

  @FindBy(xpath = "//select[@id='days']")
    public WebElement drapDownDay;

  @FindBy(xpath = "//select[@id='months']")
    public WebElement drapDowvMonths;

  @FindBy(xpath = "//select[@id='years']")
    public WebElement drapDowvYears;

  @FindBy(xpath = "//input[@data-qa='first_name']")
  public WebElement firstName;

    @FindBy(xpath = "//input[@data-qa='last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@data-qa='address']")
    public WebElement address;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement drapDowvCountry;

    @FindBy(xpath = "//input[@data-qa='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@data-qa='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@data-qa='zipcode']")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@data-qa='mobile_number']")
    public WebElement mobileNumber;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//div//ul//li[9]")
    public WebElement logged;

    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement emailorPasswordIncorrect;

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUserSignup;

    @FindBy(xpath = "//*[text()='Email Address already exist!']")
    public WebElement emailAddressAlreadyExists;

    @FindBy(xpath = "//*[text()=' Contact us']")
    public WebElement contactButton;

    @FindBy(xpath = "//*[text()='Get In Touch']")
    public WebElement getInTouch;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement contactName;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement contactEmail;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement contactSubject;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement contactYourMessage;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement contactSubmitButton;

    @FindBy(xpath = "//div[@id='form-section']")
    public WebElement homeButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement succesYourMessage;

    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement productsButton;

    @FindBy(xpath = "//*[text()='All Products']")
    public WebElement allProductsPage;

    @FindBy(xpath = "//div[@class='features_items']")
    public WebElement allProducts;

    @FindBy(xpath = "(//*[text()='View Product'])[1]")
    public WebElement ilkUrunView;

    @FindBy(xpath = "//div[@class='product-details']")
    public WebElement ilkUrunDetay;



















}
