package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationexercisePages;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class AutomationexerciseStepDefinitions {
    AutomationexercisePages automationexercise=new AutomationexercisePages();
    Actions actions=new Actions(Driver.getDriver());


    @Given("kullanici automationexercise sayfasina gider")
    public void kullanici_automationexercise_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("automationsUrl"));
    }

    @Then("anasayfanin basariyla goruntulendigini dogrular")
    public void anasayfanin_basariyla_goruntulendigini_dogrular() {
        Assert.assertTrue(automationexercise.homePage.isDisplayed());
    }

    @Then("signup login button basar")
    public void signup_login_button_basar() {
        automationexercise.signupLoginButton.click();


    }

    @Then("yeni kullanici bolumunde name, email girerek signup buttonuna basar")
    public void yeni_kullanici_bolumunde_name_email_girerek_signup_buttonuna_basar() {
        automationexercise.newUserName.sendKeys("omer");
        automationexercise.newUserEmail.sendKeys("omer2@hotmail.com");
        automationexercise.signupButton.click();

    }

    @Then("Enter Account Information yazisinin gorunur oldugunu dogrular")
    public void enter_account_ınformation_yazisinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(automationexercise.enterAccountInformation.isDisplayed());


    }

    @Then("kayit formunu doldurur")
    public void kayit_formunu_doldurur() {
        automationexercise.title.click();
        automationexercise.kayitPassword.sendKeys("12345");
        Select selectDay=new Select(automationexercise.drapDownDay);
        selectDay.selectByValue("20");
        Select selectMonth=new Select(automationexercise.drapDowvMonths);
        selectMonth.selectByValue("8");
        Select selectYear=new Select(automationexercise.drapDowvYears);
        selectYear.selectByValue("2000");
        automationexercise.firstName.sendKeys("omer");
        automationexercise.lastName.sendKeys("faik");
        automationexercise.address.sendKeys("Safranbolu");
        Select selectCountry=new Select(automationexercise.drapDowvCountry);
        selectCountry.selectByValue("Canada");
        automationexercise.state.sendKeys("Turkey");
        automationexercise.city.sendKeys("Karabuk");
        automationexercise.zipcode.sendKeys("78600");
        automationexercise.mobileNumber.sendKeys("55502521252");



    }

    @Then("create account buttonuna basar")
    public void create_account_buttonuna_basar() {
        automationexercise.createAccountButton.click();
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();

    }

    @And("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));



    }

    @Then("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String arananKelime=istenenKelime;
        Assert.assertTrue(actualUrl.contains(arananKelime));


    }

    @And("dogru email girer")
    public void emailVePasswordunuGirer() {
      automationexercise.loginEmail.sendKeys(ConfigReader.getProperty("validEmail"));

    }

    @And("login button basar")
    public void loginButtonBasar() {
        automationexercise.loginButton.click();

    }

    @And("login oldugunu dogrular")
    public void loginOldugunuDogrular() {
        Assert.assertTrue(automationexercise.logged.isDisplayed());

    }

    @And("dogru password girer")
    public void dogruPasswordGirer() {
        automationexercise.loginPassword.sendKeys(ConfigReader.getProperty("validPassword"));

    }

    @And("yanlis password girer")
    public void yanlisPasswordGirer() {
        automationexercise.loginPassword.sendKeys(ConfigReader.getProperty("wrongPassword"));

    }

    @And("login olamadigini dogrular")
    public void loginOlamadiginiDogrular() {
       Assert.assertTrue(automationexercise.emailorPasswordIncorrect.isDisplayed());


    }

    @And("yanlis email girer")
    public void yanlisEmailGirer() {
        automationexercise.loginEmail.sendKeys(ConfigReader.getProperty("wrongEmail"));

    }

    @And("new user signup yazisinin goruntulendigini dogrular")
    public void newUserSignupYazisininGoruntulendiginiDogrular() {
        Assert.assertTrue(automationexercise.newUserSignup.isDisplayed());

    }

    @And("email adresi zaten var hatasinin gorunur oldugunu test eder")
    public void emailAdresiZatenVarHatasininGorunurOldugunuTestEder() {
        Assert.assertTrue(automationexercise.emailAddressAlreadyExists.isDisplayed());

    }

    @And("kullanici contact us butonuna basar")
    public void kullaniciContactUsButonunaBasar() {
        automationexercise.contactButton.click();

    }

    @And("get in touch yazisinin grunur oldugunu test eder")
    public void getInTouchYazisininGrunurOldugunuTestEder() {
        Assert.assertTrue(automationexercise.getInTouch.isDisplayed());

    }

    @And("kullanici name, email, subject,your message bolumlerini doldurur")
    public void kullaniciNameEmailSubjectYourMessageBolumleriniDoldurur() {
        automationexercise.contactName.sendKeys(ConfigReader.getProperty("name"));
        automationexercise.contactEmail.sendKeys(ConfigReader.getProperty("validEmail"));
        automationexercise.contactSubject.sendKeys("Hola");
        automationexercise.contactYourMessage.sendKeys("Quiero rebajas porfavor");


    }

    @And("kullanici submit butonuna basar")
    public void kullaniciSubmitButonunaBasar() {
        automationexercise.contactSubmitButton.click();

    }

    @And("gelen uyari mesajina tamam i tiklar")
    public void gelenUyariMesajinaTamamITiklar() {
        Driver.getDriver().switchTo().alert().accept();

    }

    @And("basariyla gonderildigini gosteren yazinin gorunur oldugunu test eder")
    public void basariylaGonderildiginiGosterenYazininGorunurOldugunuTestEder() {

        Assert.assertTrue(automationexercise.succesYourMessage.isDisplayed());

    }

    @And("home butonuna basar")
    public void homeButonunaBasar() {
        automationexercise.homeButton.click();

    }

    @Then("kullanici products butonuna basar")
    public void kullaniciProductsButonunaBasar() {
        automationexercise.productsButton.click();

    }

    @And("tum urunler sayfasinin goruntulendigini test eder")
    public void tumUrunlerSayfasininGoruntulendiginiTestEder() {
        Assert.assertTrue(automationexercise.allProductsPage.isDisplayed());

    }

    @And("tum urunlerin goruntulendigini test eder")
    public void tumUrunlerinGoruntulendiginiTestEder() {
        Assert.assertTrue(automationexercise.allProducts.isDisplayed());

    }

    @And("kullanici ilk urunu goruntuleye tiklar")
    public void kullaniciIlkUrunuGoruntuleyeTiklar() {
        automationexercise.ilkUrunView.click();

    }

    @And("ilk urunun detaylarinin goruntulendigini test eder")
    public void ilkUrununDetaylarininGoruntulendiginiTestEder() {
        Assert.assertTrue(automationexercise.ilkUrunDetay.isDisplayed());

    }
}
