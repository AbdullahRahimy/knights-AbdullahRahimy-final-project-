package Final_Project.Pages;

import org.openqa.selenium.By;

public class LoginPage{
    public final static By LoginButton = By.xpath("//div[1]/div/div[1]/div/a[2]");
    public final static By UserName = By.name("username");
    public final static By Password = By.name("password");
    public final static By Login = By.xpath("//div[2]/div/div/div/div/form/div/div[3]/button[1]");
    public final static By TitleUserPortal = By.xpath("//div[1]/div/div[1]/div/h2");
    public final static By PassError = By.xpath("(//div[@role='alert'])[1]");


}
