package Final_Project.Steps;

import Final_Project.Pages.HomePage;
import Final_Project.Utility.Utility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount extends Utility {
    @When("Fill Up the Form")
    public void FillUpForm() {FillUpPrimaryForm();}
    @Then("Click Create Account")
    public void Click () throws InterruptedException {ClickElement(HomePage.CreateAccount);}
    @Then("Validate sign up page and email address")
    public void validatesignup(){ValidationSignUp();}
}


