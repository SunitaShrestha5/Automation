package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

 class PlanPricing
{

    public static void main(String[] args)
    {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver","C:/Users/PercoidIT/Downloads/chromedriver_win32/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
        driver=new ChromeDriver(chromeOptions);
        driver.get("https://wordpress.com/");
        driver.findElement(By.xpath("//a[@title='Plans & Pricing']")).click();
    }
}
