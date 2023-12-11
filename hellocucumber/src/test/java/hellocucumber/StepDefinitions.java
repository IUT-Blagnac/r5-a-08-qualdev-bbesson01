package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }


    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
    public String day;

    @Given("today is {string}")
    public void today_is_sunday(String string) {
        day= string;
    }
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
    }
    @Then("I should be told {string}")
    public String i_should_be_told(String string) {
        return "Nope";
    }


    
}
