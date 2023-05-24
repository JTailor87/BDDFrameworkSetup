package StepDefinitions;

import io.cucumber.java.en.*;
import org.example.factory.DriverFactory;
import org.example.pages.DemoPage;
import org.testng.Assert;

import java.time.Duration;

public class DemoSteps {
    private DemoPage demoPage = new DemoPage(DriverFactory.getDriver());

    @Given("User opens a URL {string}")
    public void user_opens_a_url(String url) {
        DriverFactory.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        DriverFactory.getDriver().get(url);
    }

    @When("User enter {string} in search window")
    public void user_enter_in_search_window(String text) {
        demoPage.enterSearchText(text);
    }
    @When("User click the search button")
    public void user_click_the_search_button() {
        demoPage.clickSearch();
    }
    @When("User click the selenium link")
    public void user_click_the_selenium_link() {
        demoPage.clickSelenium();
    }
    @Then("User validate page title is {string}")
    public void user_validate_page_title_is(String Title) {
        Assert.assertEquals(Title, demoPage.validatePageTitle(), "Page titles are not same");
    }
}
