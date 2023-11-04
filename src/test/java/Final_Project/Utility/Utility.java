package Final_Project.Utility;

import Final_Project.BaseCodes.BaseCodes;
import Final_Project.Pages.AccountsPath;
import Final_Project.Pages.HomePage;
import Final_Project.Pages.LoginPage;
import Final_Project.Pages.PlansPagePaths;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PrivateKey;
import java.time.Duration;
import java.util.List;

public class Utility extends BaseCodes {
    private WebDriverWait getWait() {
        return new WebDriverWait(getName(), Duration.ofMinutes(1));
    }

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
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }

    public void FillUpPrimaryForm() {
        WebElement email = getName().findElement((By.name("email")));
        email.sendKeys("life13day@usa.com");
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
        Thread.sleep(2000);
    }

    public void ValidationSignUp() {
        WebDriverWait wait = new WebDriverWait(getName(), Duration.ofSeconds(30));
        WebElement Title = wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.PrimaryAccountTitle));
        String ActualTitle = Title.getText();
        System.out.println(ActualTitle);
        String ExpectedTitle = "Sign up your account";
        System.out.println(ExpectedTitle);
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.EmailPrimaryAccTitle));
        String emailActual = Title.getText();
        System.out.println(emailActual);
        String ExpectedEmail = "life13day@usa.com";
        System.out.println(ExpectedEmail);
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }

    public void ErrorMessage() {
        WebDriverWait wait = new WebDriverWait(getName(), Duration.ofSeconds(30));
        WebElement ErrorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.ErrorMessageEmail));
        String ActualError = ErrorMessage.getText();
        System.out.println(ActualError);
        String ExpectedError = "Account with email " + ActualError + " is exist";
        System.out.println(ExpectedError);
        // Assert.assertEquals(ExpectedError,ActualError);
    }

    public void FillUpUserAndPassLogInPage(String UserName, String Password) {
        WebDriverWait wait = new WebDriverWait(getName(), Duration.ofSeconds(30));
        WebElement Username = wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.UserName));
        Username.sendKeys(UserName);
        WebElement Pass = wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.Password));
        Pass.sendKeys(Password);
    }

    public void ValidateCustomerLoginPage() throws InterruptedException {
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(getName(), Duration.ofSeconds(30));
        WebElement UserPortalTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.TitleUserPortal));
        String TitleText = UserPortalTitle.getText();
        System.out.println(TitleText);
    }

    public void WrongEmailOrPassErrorLoginPage(By locater) {
        WebDriverWait wait = new WebDriverWait(getName(), Duration.ofSeconds(30));
        WebElement WrongPassUser = wait.until(ExpectedConditions.visibilityOfElementLocated(locater));
        String ErrorMessage = WrongPassUser.getText();
        System.out.println(ErrorMessage);
    }

    public void ClickButton(By Xpath) {
        WebDriverWait wait = new WebDriverWait(getName(), Duration.ofSeconds(30));
        WebElement ProfileButton = wait.until(ExpectedConditions.visibilityOfElementLocated(Xpath));
        ProfileButton.click();
    }

    public int ValidateSizeOfTable(By locator) {
        List<WebElement> TableList = WaitUntillVisibility(locator);
        return TableList.size();
    }

    public String ValidateTextOfTable(By locator) {
        WebDriverWait wait = new WebDriverWait(getName(), Duration.ofSeconds(30));
        WebElement Text = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return Text.getText();
    }

    private List<WebElement> WaitUntillVisibility(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void ValidationShowPerPage(int ValuePerPage) {
        int ActualRowSize = ValidateSizeOfTable(AccountsPath.AccountsTable);
        Assert.assertEquals("Validate Table Rows", ValuePerPage,ActualRowSize);
       // if (ValuePerPage != ActualRowSize) {
         //   System.out.println("Assertion failed: Expected " + ValuePerPage + " but got " + ActualRowSize);
        }
        public byte[] ScreenShot(){
            TakesScreenshot screenshot = (TakesScreenshot) getName();
            return screenshot.getScreenshotAs(OutputType.BYTES);

        }
    }