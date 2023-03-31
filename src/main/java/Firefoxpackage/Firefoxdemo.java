package Firefoxpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdemo
{
    public static void main(String[] args) {

        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","C:/Users/PercoidIT/Downloads/geckodriver-v0.32.2-win-aarch64/geckodriver.exe");
        driver=new FirefoxDriver();

    }
}
