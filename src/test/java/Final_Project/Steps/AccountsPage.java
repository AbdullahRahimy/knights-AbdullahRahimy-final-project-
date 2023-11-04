package Final_Project.Steps;

import Final_Project.Pages.AccountsPath;
import Final_Project.Pages.PlansPagePaths;
import Final_Project.Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AccountsPage extends Utility {
    @Then("Click Accounts Button")
    public void ClickAccounts(){
        ClickButton(AccountsPath.AccountsButton);
    }
    @Then("Validate {int} data is present in Accounts")
    public void SizeofTable(int ExpectedRow){
        int ActualRowSIze = ValidateSizeOfTable(PlansPagePaths.PlansTable);
        Assert.assertEquals("Validate Table Rows", ExpectedRow,ActualRowSIze);}
    @Then("Change the Show Per Page to {int} and Validate")
    public void ShowPerCase10(int ValuePerPage) throws InterruptedException {
        ClickButton(AccountsPath.ShowPer10);
        ValidationShowPerPage(ValuePerPage);
    //Thread.sleep(500);
    }


    @And("then change to {int} and Validate")
    public void ShowPerCase25 (int ValuePerPage) throws InterruptedException {
        ClickButton(AccountsPath.ShowPer25);
        ValidationShowPerPage(ValuePerPage);
        //Thread.sleep(500);
    }

    @And("and to {int} and Validate")
    public void andToAndValidate(int ValuePerPage) throws InterruptedException {
        ClickButton(AccountsPath.ShowPer50);
        ValidationShowPerPage(ValuePerPage);
        //Thread.sleep(500);
    }
}