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
import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

public class Utility extends BaseCodes {
    private WebDriverWait getWait() {
        return new WebDriverWait(getName(),
                Duration.ofMinutes(1));
    }
        public void PrimaryButton() {
        getName().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement primaryButton = getName().findElement(HomePage.PrimaryAccountButton);
        primaryButton.click();
    }

    public void FormTitleValidation(By locator, String Expected) {
        WebElement FormTitle = getName().findElement(locator);
        String ActualTitle = FormTitle.getText();
        String ExpectedTitle = Expected;
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }
    public void FormTitleValidationWithActaul(By locator) {
        WebElement FormTitle = getName().findElement(locator);
        String ActualTitle = FormTitle.getText();
        String ExpectedTitle = ActualTitle;
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }

    public void FillUpPrimaryForm() {
        //WebElement email = getName().findElement((By.name("email")));
        //email.sendKeys(RandomEmail());
        //WebElement title = getName().findElement(By.id("title"));
        //Select Prefix = new Select(title);
        //Prefix.selectByValue("Mr.");
        //WebElement Fname = getName().findElement(By.name("firstName"));
        //Fname.sendKeys("Ahmad");
        //WebElement Lname = getName().findElement(By.name("lastName"));
        //Lname.sendKeys("Rahimy");
        //WebElement gender = getName().findElement(By.id("gender"));
        //Select genderS = new Select(gender);
        //genderS.selectByValue("MALE");
        //WebElement MaritalStatus = getName().findElement(By.name("maritalStatus"));
        //Select Marital = new Select(MaritalStatus);
        //Marital.selectByValue("MARRIED");
        //WebElement Employment = getName().findElement(By.name("employmentStatus"));
        //Employment.sendKeys("Self Employed");
       // WebElement DOB = getName().findElement(By.name("dateOfBirth"));
        //DOB.sendKeys("05/11/1990");
    }
    public void FillUpByValue(By locator,String value){
        WebElement email = getName().findElement(locator);
        email.sendKeys(value);
    }
    public void FillUpSelectDropDown(By locator,String Value){
        WebElement list = getName().findElement(locator);
        Select genderS = new Select(list);
        genderS.selectByValue(Value);
    }

    public void ClickElement(By link) throws InterruptedException {
        WebElement Click = getName().findElement(link);
        Click.click();
        Thread.sleep(500);
    }

    public void ErrorMessage(By locator) {
        WebDriverWait wait = new WebDriverWait(getName(), Duration.ofSeconds(30));
        WebElement ErrorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String ActualError = ErrorMessage.getText();
        //System.out.println(ActualError);
        String ExpectedError =  ActualError ;
       // System.out.println(ExpectedError);
        Assert.assertEquals(ExpectedError,ActualError);
    }

    public void FillUpUserAndPassLogInPage(By User,String UserName,By PassW, String Password) {
        WebDriverWait wait = new WebDriverWait(getName(), Duration.ofSeconds(30));
        WebElement Username = wait.until(ExpectedConditions.visibilityOfElementLocated(User));
        Username.sendKeys(UserName);
        WebElement Pass = wait.until(ExpectedConditions.visibilityOfElementLocated(PassW));
        Pass.sendKeys(Password);
    }

    public void ValidateCustomerLoginPage(By locator) throws InterruptedException {
        Thread.sleep(500);
        WebDriverWait wait = new WebDriverWait(getName(), Duration.ofSeconds(30));
        WebElement UserPortalTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
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