package Final_Project.Steps;

import Final_Project.Utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Hooks extends Utility {
    @Before
    public void OpenBrowser() {
        Chrome();
    }
    //@After
    public void Exit() {
        quit();
    }
}