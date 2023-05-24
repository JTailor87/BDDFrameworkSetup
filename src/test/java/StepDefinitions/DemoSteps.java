package StepDefinitions;

import io.cucumber.java.en.*;
import org.example.factory.DriverFactory;

import java.time.Duration;

public class DemoSteps {

    @Given("User opens a URL {string}")
    public void user_opens_a_url(String url) {
        DriverFactory.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        DriverFactory.getDriver().get(url);
    }
}
