package Final_Project.Steps;

import Final_Project.Pages.HomePage;
import Final_Project.Utility.Utility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageVal extends Utility {

    @When("Validate Title and Login Button")
    public void Validation() {
        getName().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        String title = getName().getTitle();
        System.out.println("Website Title " + title);
        String expectedTitle = "Tek Insurance UI";
        Assert.assertEquals(expectedTitle, title);
        System.out.println("Test Passed");
        WebDriverWait wait = new WebDriverWait(getName(), Duration.ofSeconds(30));
        By loginButton = HomePage.PrimaryAccountButton;
        WebElement LoginButtonVis = getName().findElement(loginButton);
        Assert.assertNotNull(LoginButtonVis);
    }
    @When("Click to Primary Account Button")
    public void PrimaryBu(){PrimaryButton();}
    @Then("Validate Title Create Primary Account Holder")
    public void FormTitle(){FormTitleValidation(HomePage.HomePageTitle,"Create Primary Account Holder");}

    @Then("Validate the error message")
    public void EmailExistError(){ErrorMessage(HomePage.ErrorMessageEmail);}
}