package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class JqeryscriptPage{

    public JqeryscriptPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//iframe[@id='emoojis']")
    public WebElement iFrame;

    @FindBy(xpath = "(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")
    public WebElement ikinciEmoji;


    @FindBy(xpath = "(//img[@draggable='false'])[78]")
    public WebElement ikinciEmojiAlt;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement textareabox;

    @FindBy(xpath = "//input[@id='smiles']")
    public WebElement nameOfSmilesTextbox;

    @FindBy(xpath = "//input[@id='food']")
    public WebElement nameOfFoodTextbox;

    @FindBy(xpath = "//input[@id='smiles']")
    public WebElement nameOfNatureTextbox;

    @FindBy(xpath = "//input[@id='activities']")
    public WebElement nameOfactivitiesTextbox;

    @FindBy(xpath = "//input[@id='places']")
    public WebElement nameOfplacesTextbox;

    @FindBy(xpath = "//input[@id='objects']")
    public WebElement nameOfobjectsTextbox;

    @FindBy(xpath = "//input[@id='symbols']")
    public WebElement nameOfsymbolsTextbox;

    @FindBy(xpath = "//input[@id='flags']")
    public WebElement nameOfflagsTextbox;

    @FindBy(xpath = "//button[@id='send']")
    public WebElement applyButton;



}
