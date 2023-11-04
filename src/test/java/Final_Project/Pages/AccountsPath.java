package Final_Project.Pages;

import org.openqa.selenium.By;

public class AccountsPath {
    public final static By AccountsButton = By.linkText("Accounts");
    public final static By AccountsTable = By.xpath("//table/tbody/tr");
    public final static By ShowPer10 = By.xpath("//div[2]/div/div/div[3]/select/option[2]");
    public final static By ShowPer25 = By.xpath("//div[2]/div/div/div[3]/select/option[3]");
    public final static By ShowPer50 = By.xpath("//div[2]/div/div/div[3]/select/option[4]");
}
