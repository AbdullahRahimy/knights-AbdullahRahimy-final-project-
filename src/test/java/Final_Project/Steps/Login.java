package Final_Project.Steps;

import Final_Project.Pages.LoginPage;
import Final_Project.Utility.Utility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login extends Utility {
    @When("Click Login Button")
    public void ClickLogin() throws InterruptedException {ClickElement(LoginPage.LoginButton);}
    @When("Login with username as {string} and password as {string}")
    public void loginWithUserAndPassword(String User, String Pass) {
        FillUpUserAndPassLogInPage(LoginPage.UserName,User,LoginPage.Password,Pass);
    }
    @Then("Click SignIn Button")
    public void clickSignInButton() throws InterruptedException {
       ClickElement(LoginPage.Login);
    }
    @Then("Validate User Navigate to Customer Service Portal")
    public void validateCustomerServicePortal() throws InterruptedException {
        ValidateCustomerLoginPage(LoginPage.TitleUserPortal);
    }
    @Then("Validate Error Message")
    public void ErrorValidationLoginPage(){WrongEmailOrPassErrorLoginPage(LoginPage.PassError);}

}
