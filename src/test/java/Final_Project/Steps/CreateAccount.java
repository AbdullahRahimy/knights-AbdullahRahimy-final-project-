package Final_Project.Steps;

import Final_Project.Pages.AccountsPath;
import Final_Project.Pages.HomePage;
import Final_Project.Utility.Utility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateAccount extends Utility {
    @When("Fill Up the Form")
    public void FillUpForm() {
        //FillUpPrimaryForm();
        FillUpByValue(AccountsPath.email,RandomEmail());
        FillUpSelectDropDown(AccountsPath.title,"Mr.");
        FillUpByValue(AccountsPath.Fname,"Ahmad");
        FillUpByValue(AccountsPath.Lname,"Rahimy");
        FillUpSelectDropDown(AccountsPath.gender,"MALE");
        FillUpSelectDropDown(AccountsPath.Marital,"MARRIED");
        FillUpByValue(AccountsPath.employment,"Self Employed");
        FillUpByValue(AccountsPath.DOB,"05/11/1990");

        }
    @When("Fill Up the Form with Existed Email")
    public void FillUpFormExistedEmail() {
        //FillUpPrimaryForm();
        FillUpByValue(AccountsPath.email,"life2day@usa.com");
        FillUpSelectDropDown(AccountsPath.title,"Mr.");
        FillUpByValue(AccountsPath.Fname,"Ahmad");
        FillUpByValue(AccountsPath.Lname,"Rahimy");
        FillUpSelectDropDown(AccountsPath.gender,"MALE");
        FillUpSelectDropDown(AccountsPath.Marital,"MARRIED");
        FillUpByValue(AccountsPath.employment,"Self Employed");
        FillUpByValue(AccountsPath.DOB,"05/11/1990");

    }
    @Then("Click Create Account")
    public void Click () throws InterruptedException {ClickElement(HomePage.CreateAccount);}
    @Then("Validate sign up page and email address")
    public void ValidationSignUp() {
        WebDriverWait wait = new WebDriverWait(getName(), Duration.ofSeconds(30));
        WebElement Title = wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.PrimaryAccountTitle));
        String ActualTitle = Title.getText();
        //System.out.println(ActualTitle);
        String ExpectedTitle = "Sign up your account";
        //System.out.println(ExpectedTitle);
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.EmailPrimaryAccTitle));
        String emailActual = Title.getText();
        //System.out.println(emailActual);
        String ExpectedEmail = emailActual;
        //System.out.println(ExpectedEmail);
        Assert.assertEquals(ExpectedEmail, emailActual);
    }
}


