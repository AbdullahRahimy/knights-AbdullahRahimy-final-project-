package Final_Project.Pages;

import org.openqa.selenium.By;

public class PlansPagePaths {
    public final static By PlansButton = By.linkText("Plans");
    public final static By PlansTable = By.xpath("//table/tbody/tr");
    public final static By PlansTableCreatedDate = By.xpath("//table/tbody/tr[1]/td[4]");
    public final static By PlansTableExpiryDate = By.xpath("//table/tbody/tr[1]/td[5]");
}
