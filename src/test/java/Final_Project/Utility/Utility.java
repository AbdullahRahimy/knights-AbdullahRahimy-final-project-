package Final_Project.Utility;

import Final_Project.BaseCodes.BaseCodes;
import Final_Project.Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;cd 
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
        By loginButton = By.xpath("//div[1]/div/div[2]/div/div/a");
        WebElement LoginButtonVis = getName().findElement(loginButton);
        Assert.assertNotNull(LoginButtonVis);
    }

    public void PrimaryButton() {
        getName().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement primaryButton = getName().findElement(By.xpath("//div[1]/div/div[2]/div/div/a"));
        primaryButton.click();
    }

    public void FormTitleValidation() {
        WebElement FormTitle = getName().findElement(By.xpath("//div[2]/div/div/div/h2"));
        String ActualTitle = FormTitle.getText();
        String ExpectedTitle = "Create Primary Account Holder";
        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }
}