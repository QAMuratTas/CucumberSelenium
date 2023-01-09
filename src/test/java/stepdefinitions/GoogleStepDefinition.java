package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.GoogleSearchPage;
import utilities.Driver;

public class GoogleStepDefinition {
    @Given("Kullanici google sayfasindadir")
    public void kullaniciGoogleSayfasindadir() {
        Driver.getDriver().get("https://www.google.com");
    }

    @When("Kullanici samsung kelimesini arar")
    public void kullaniciSamsungKelimesiniArar() {
        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("samsung");
    }

    @Then("Kullanici sayfada samsung kelimesi gectigini dogrular")
    public void kullaniciSayfadaSamsungKelimesiGectiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));
        Driver.closeDriver();

    }

    @When("Kullanici nutella kelimesini arar")
    public void kullaniciNutellaKelimesiniArar() {
        GoogleSearchPage nt =new GoogleSearchPage (Driver.getDriver());
        nt.searchFor("nutella");
    }

    @Then("Kullanici sayfada nutella kelimesi gectigini dogrular")
    public void kullaniciSayfadaNutellaKelimesiGectiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("nutella"));
        Driver.closeDriver();
    }
}