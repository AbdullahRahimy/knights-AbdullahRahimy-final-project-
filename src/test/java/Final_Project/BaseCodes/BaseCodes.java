package Final_Project.BaseCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCodes {
    public static WebDriver chrome;
    public WebDriver getName() {
        return chrome;
    }
    public void Chrome(){
        chrome = new ChromeDriver();
        chrome.get("https://dev.insurance.tekschool-students.com/ ");
        chrome.manage().window().maximize();
    }

    public void quit(){
        chrome.quit();
    }
}
