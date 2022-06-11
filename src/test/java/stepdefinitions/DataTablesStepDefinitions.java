package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.ConfigReader;

public class DataTablesStepDefinitions {
    DataTablesPage dataTables=new DataTablesPage();
    @When("datatables anasayfada oldugunu test eder")
    public void datatables_anasayfada_oldugunu_test_eder() {
        Assert.assertTrue(dataTables.dataTablesHomePage.isDisplayed());


    }
    @When("kullanici login register butonuna basar")
    public void kullanici_login_register_butonuna_basar() {
        dataTables.loginRegisterButton.click();


    }
    @When("kullanici kayit icin gerekli formu doldurur")
    public void kullanici_kayit_icin_gerekli_formu_doldurur() {
        dataTables.createUserNameTextBox.sendKeys(ConfigReader.getProperty("dataTablesUserName"));
        dataTables.createEmailTextBox.sendKeys(ConfigReader.getProperty("dataTablesValidEmail"));
        dataTables.createPasswordTextBox.sendKeys(ConfigReader.getProperty("dataTablesValidPassword"));
        dataTables.createPasswordConfirmTextBox.sendKeys(ConfigReader.getProperty("dataTablesValidPassword"));



    }
    @When("kullanici sign in register butonuna basar")
    public void kullanici_sign_in_register_butonuna_basar() {
        dataTables.signInRegisterButton.click();


    }

    @And("kullanici login oldugunu test eder")
    public void kullaniciLoginOldugunuTestEder() {

        Assert.assertTrue(dataTables.yourAccount.isDisplayed());

    }

    @And("kullanici dogru email girer")
    public void kullaniciDogruEmailGirer() {
        dataTables.emailTextBox.sendKeys(ConfigReader.getProperty("dataTablesValidEmail"));

    }

    @And("kullanici dogru password girer")
    public void kullaniciDogruPasswordGirer() {
        dataTables.passwordTextBox.sendKeys(ConfigReader.getProperty("dataTablesValidPassword"));

    }

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dataTables.newButton.click();

    }

    @And("isim bolumune {string} girer")
    public void isimBolumuneGirer(String isim) {
        dataTables.firstNameTextBox.sendKeys(isim);

    }

    @And("soyisim bolumune {string} girer")
    public void soyisimBolumuneGirer(String soyIsim) {
        dataTables.lastNameTextBox.sendKeys(soyIsim);

    }

    @And("pozisyon bolumune {string} girer")
    public void pozisyonBolumuneGirer(String position) {
        dataTables.positionTextBox.sendKeys(position);

    }

    @And("office bolumune {string} girer")
    public void officeBolumuneGirer(String office) {
        dataTables.officeTextBox.sendKeys(office);

    }

    @And("extension bolumune {string} girer")
    public void extensionBolumuneGirer(String ext) {
        dataTables.extnTextBox.sendKeys(ext);

    }

    @And("start date bolumune {string} girer")
    public void startDateBolumuneGirer(String startdate) {
        dataTables.startDateTextBox.sendKeys(startdate);

    }

    @And("salary bolumune {string} girer")
    public void salaryBolumuneGirer(String salary) {
        dataTables.salaryTextBox.sendKeys(salary);


    }

    @And("create buttonuna basar")
    public void createButtonunaBasar() {
        dataTables.createButton.click();

    }

    @And("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String isimleAra) {
        dataTables.searchTextBox.sendKeys(isimleAra);

    }

    @And("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String isimVarmi) {
        Assert.assertTrue(dataTables.aramaSonucuIlkElement.getText().contains(isimVarmi));

    }
}
