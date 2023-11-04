package Final_Project.Steps;

import Final_Project.Pages.UserProfile;
import Final_Project.Utility.Utility;
import io.cucumber.java.en.Then;

public class UserProfileSteps extends Utility {
    @Then("Click Profile Button")
    public void ClickProfileButton() {
        ClickButton(UserProfile.ProfileButton);
    }

    @Then("Click LogOut")
    public void ClickLogoutButton() {
        ClickButton(UserProfile.LogoutButton);
    }
}
