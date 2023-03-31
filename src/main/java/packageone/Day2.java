package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day2
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver","C:/Users/PercoidIT/Downloads/chromedriver_win32/chromedriver.exe");
       // driver=new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
        driver=new ChromeDriver(chromeOptions);
        driver.get("https://wordpress.com/start/user?ref=wplogin");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz@gmail.com");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("xyzabc");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("xyz1234");
       //Thread.sleep(200);
        //driver.quit();
    }
}
