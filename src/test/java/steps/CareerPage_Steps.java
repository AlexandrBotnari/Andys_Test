package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import utlis.Action;

public class CareerPage_Steps {
    Action action = new Action();


    @And("^clicks on random checkboxes$")
    public void ClicksOnRandomCheckboxes() throws InterruptedException {
        action.EnterDataInRandomField();

    }

    @Then("^Checkboxes React on clicks$")
    public void CheckboxesReactOnClicks(){

    }
}
