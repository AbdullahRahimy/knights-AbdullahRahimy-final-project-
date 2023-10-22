package Final_Project.Steps;

import Final_Project.Utility.Utility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class HomePageVal extends Utility {

    @When("Validate Title and Login Button")
    public void ValidationP() {Validation();}
    @When("Click to Primary Account Button")
    public void PrimaryBu(){PrimaryButton();}
    @Then("Validate Title Create Primary Account Holder")
    public void FormTitle(){FormTitleValidation();}

}