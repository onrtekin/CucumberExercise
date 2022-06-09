package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.JqeryscriptPage;
import utilities.Driver;

public class JqeryscriptStepDefinitions {
JqeryscriptPage jqeryscript=new JqeryscriptPage();
    @Then("ikinci emojinin ustunu tiklar")
    public void ikinci_emojinin_ustunu_tiklar() {
        jqeryscript.ikinciEmoji.click();


    }
    @Then("altta cikan butun emojileri secer")
    public void altta_cikan_butun_emojileri_secer() {


        for (int i = 78; i <142 ; i++) {
            Driver.getDriver().findElement(By.xpath("(//img[@draggable='false'])["+i+"]")).click();

        }

    }

    @Then("emoji iframe girer")
    public void emojiIframeGirer() {
        Driver.getDriver().switchTo().frame(jqeryscript.iFrame);

    }

    @And("kullanici ana iframe geri doner")
    public void kullaniciAnaIframeGeriDoner() {
        Driver.getDriver().switchTo().defaultContent();

    }

    @And("kullanici formu doldurur")
    public void kullaniciFormuDoldurur() {
        jqeryscript.textareabox.sendKeys("Hello");
        jqeryscript.nameOfactivitiesTextbox.sendKeys("manzana");
        jqeryscript.nameOfflagsTextbox.sendKeys("trabajar");
        jqeryscript.nameOfobjectsTextbox.sendKeys("hijos");
        jqeryscript.nameOfsymbolsTextbox.sendKeys("mujer");
        jqeryscript.nameOfFoodTextbox.sendKeys("padre");
        jqeryscript.nameOfSmilesTextbox.sendKeys("madre");
        jqeryscript.nameOfNatureTextbox.sendKeys("ciudad");
        jqeryscript.nameOfplacesTextbox.sendKeys("pais");
    }

    @And("apply butonuna basar")
    public void applyButonunaBasar() {
        jqeryscript.applyButton.click();

    }
}
