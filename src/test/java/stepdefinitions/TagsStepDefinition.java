package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepDefinition {
    @Given("Smoke Test icin hazirliklar yapildi")
    public void smokeTestIcinHazirliklarYapildi() {
    }

    @When("Smoke Test Calistiginda")
    public void smokeTestCalistiginda() {
        System.out.println("Somoke Test Calisti");
    }

    @Then("Smoke Test basarili olmali")
    public void smokeTestBasariliOlmali() {
    }

    @Given("Regression Test icin hazirliklar yapildi")
    public void regressionTestIcinHazirliklarYapildi() {
    }

    @When("Regression Test Calistiginda")
    public void regressionTestCalistiginda() {
        System.out.println("Regression Test Calisti");

    }

    @Then("Regression Test basarili olmali")
    public void regressionTestBasariliOlmali() {
    }
}
