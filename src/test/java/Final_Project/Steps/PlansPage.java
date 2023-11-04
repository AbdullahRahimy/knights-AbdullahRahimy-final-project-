package Final_Project.Steps;

import Final_Project.Pages.PlansPagePaths;
import Final_Project.Utility.Utility;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PlansPage extends Utility {
    @Then("Click Plans Button")
    public void ClickPlans(){
    ClickButton(PlansPagePaths.PlansButton);
    }
@Then("Validate {int} data is present")
public void SizeofTable(int ExpectedRow){
   int ActualRowSIze = ValidateSizeOfTable(PlansPagePaths.PlansTable);
    Assert.assertEquals("Validate Table Rows", ExpectedRow,ActualRowSIze);}
    @Then("Validate Date Created for DATATable {string} and {string}")
    public void DateValidationPlans(String ExpectedCreated, String ExpectedExpiry){
        String ActualCreatedDate = ValidateTextOfTable(PlansPagePaths.PlansTableCreatedDate);
        String ActualExpiryDate = ValidateTextOfTable(PlansPagePaths.PlansTableExpiryDate);
        Assert.assertEquals("Validation of Created Date",ExpectedCreated,ActualCreatedDate);
        Assert.assertEquals("Validation of Expiry Date", ExpectedExpiry,ActualExpiryDate);
}

}