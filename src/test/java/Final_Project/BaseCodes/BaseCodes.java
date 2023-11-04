package Final_Project.BaseCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseCodes {
    public static WebDriver chrome;
    public WebDriver getName() {
        return chrome;
    }
    public void Chrome(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        chrome = new ChromeDriver(options);
        //chrome = new ChromeDriver();
        chrome.get("https://dev.insurance.tekschool-students.com/ ");
        chrome.manage().window().maximize();
    }

    public void quit(){
        chrome.quit();
    }
}
