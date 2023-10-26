package Final_Project.Utility;

import Final_Project.BaseCodes.BaseCodes;
import Final_Project.Pages.HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utility extends BaseCodes {
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

    public void PrimaryButton() {
        getName().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement primaryButton = getName().findElement(HomePage.PrimaryAccountButton);
        primaryButton.click();
    }

    public void FormTitleValidation() {
        WebElement FormTitle = getName().findElement(HomePage.HomePageTitle);
        String ActualTitle = FormTitle.getText();
        String ExpectedTitle = "Create Primary Account Holder";
        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }
    public void FillUpPrimaryForm () {
        WebElement email = getName().findElement((By.name("email")));
        email.sendKeys("life11day@usa.com");
        WebElement title = getName().findElement(By.id("title"));
        Select Prefix = new Select(title);
        Prefix.selectByValue("Mr.");
        WebElement Fname = getName().findElement(By.name("firstName"));
        Fname.sendKeys("Ahmad");
        WebElement Lname = getName().findElement(By.name("lastName"));
        Lname.sendKeys("Rahimy");
        WebElement gender = getName().findElement(By.id("gender"));
        Select genderS = new Select(gender);
        genderS.selectByValue("MALE");
        WebElement MaritalStatus = getName().findElement(By.name("maritalStatus"));
        Select Marital = new Select(MaritalStatus);
        Marital.selectByValue("MARRIED");
        WebElement Employment = getName().findElement(By.name("employmentStatus"));
        Employment.sendKeys("Self Employed");
        WebElement DOB = getName().findElement(By.name("dateOfBirth"));
        DOB.sendKeys("05/11/1990");
            }
            public void ClickElement(By link) throws InterruptedException {
                WebElement Click = getName().findElement(link);
                Click.click();
                Thread.sleep(10000);
            }
            public void ValidationSignUp(){
        WebDriverWait wait = new WebDriverWait(getName(),Duration.ofSeconds(30));
                WebElement Title = wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.PrimaryAccountTitle));
                String ActualTitle = Title.getText();
                System.out.println(ActualTitle);
                String ExpectedTitle = "Sign up your account";
                System.out.println(ExpectedTitle);
                Assert.assertEquals(ExpectedTitle,ActualTitle);
                WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.EmailPrimaryAccTitle));
                String emailActual = Title.getText();
                System.out.println(emailActual);
                String ExpectedEmail = "life11day@usa.com";
                System.out.println(ExpectedEmail);
                Assert.assertEquals(ExpectedTitle,ActualTitle);
            }
}