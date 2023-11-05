package Final_Project.Pages;

import org.openqa.selenium.By;

public class AccountsPath {
    public final static By AccountsButton = By.linkText("Accounts");
    public final static By AccountsTable = By.xpath("//table/tbody/tr");
    public final static By ShowPer10 = By.xpath("//div[2]/div/div/div[3]/select/option[2]");
    public final static By ShowPer25 = By.xpath("//div[2]/div/div/div[3]/select/option[3]");
    public final static By ShowPer50 = By.xpath("//div[2]/div/div/div[3]/select/option[4]");
    public static By email = By.name("email");
    public static By title = By.id("title");
    public static By Fname = By.name("firstName");
    public static By Lname = By.name("lastName");
    public static By gender = By.id("gender");
    public static By Marital = By.name("maritalStatus");
    public static By employment = By.name("employmentStatus");
    public static By DOB = By.name("dateOfBirth");
    public static void Name(String Value){
        By.name(Value);

    }
    public static By Id(String Value){
        By.id(Value);
        return null;

    }

}
