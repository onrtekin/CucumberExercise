package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HerokuPage;

public class HerokuStepDefinitions {

    HerokuPage herokuPage=new HerokuPage();


    @Then("{int} defa add element butonuna basar")
    public void defa_add_element_butonuna_basar(int sayida) {
        for (int i = 1; i <sayida ; i++) {
            herokuPage.addElementButton.click();
        }

    }

    @And("{int} defa delete element butonuna basar")
    public void defaDeleteElementButonunaBasar(int sayi) {

        for (int i = 1; i <sayi ; i++) {
            herokuPage.deleteElementButton.click();

        }
    }
}
