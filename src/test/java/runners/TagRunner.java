package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//sadece smoke tagine sahip olan senaryoları çalıştıran runner
@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/features/",
        glue = "stepdefinitions",
        tags = "@smoke or @regression", // diğer tagleri de çalıştırmak için araya or koyarak tagleri yazıyoruz.
        dryRun = false

)


public class TagRunner {
}
