package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.GoogleSearchforHomeWork;
import utilities.Driver;

public class GoogleSearchHw {
    @Given("I have gone to the Google page")
    public void iHaveGoneToTheGooglePage() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @When("I add {string} to the search box")
    public void iAddToTheSearchBox(String text) {
        GoogleSearchforHomeWork sr =new GoogleSearchforHomeWork(Driver.getDriver());
        sr.searchForhw("cucumber");

    }

    @And("click the Search Button")
    public void clickTheSearchButton() {
        GoogleSearchforHomeWork srEnter =new GoogleSearchforHomeWork(Driver.getDriver());
        srEnter.searchEnter();

    }

    @Then("The title confirms that cucumber is written")
    public void theTitleConfirmsThatCucumberIsWritten() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("cucumber"));

    }
}
