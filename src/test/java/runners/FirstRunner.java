package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/firstFeature.feature", // klasor verirsen klasorun içindeki tüm dosyalar çalışr
        glue = "stepdefinitions"
)
public class FirstRunner {





}
