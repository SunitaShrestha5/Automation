package Facebook;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Locale;

public class BrowserClass {
    public static WebDriver driver;

    public void Browser(String browser){
        switch (browser.toLowerCase(Locale.ROOT))
        {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
                driver = new ChromeDriver(chromeOptions);
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            default:
                driver = null;
                break;
        }
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }
}

