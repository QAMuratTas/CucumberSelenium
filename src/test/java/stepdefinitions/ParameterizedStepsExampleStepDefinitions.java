package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParameterizedStepsExampleStepDefinitions {

    private int int1,int2;

    @Given("Ilk Sayi {int}")
    public void ılkSayi(int sayi) {
        int1 = sayi;
    }

    @And("Ikinci sayi {int}")
    public void ıkinciSayi(int sayi) {
        int2=sayi;
    }

    @When("Bu sayilari + operatorune sokarsam")
    public void buSayilariOperatoruneSokarsam() {

    }

    @Then("Sonuc {int} olmalidir")
    public void sonucOlmalidir(int arg0) {
    }
}
