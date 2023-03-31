package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class Nexus
{
    public static void main(String[] args)
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:/Users/PercoidIT/Downloads/chromedriver_win32/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
        driver=new ChromeDriver(chromeOptions);
        driver.get("http://ntyqasso.nexustargeting.com/Account/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3Dmvc%26redirect_uri%3Dhttp%253A%252F%252Fntyqacoresystem.nexustargeting.com%252Fsignin-oidc%26response_type%3Dcode%2520id_token%26scope%3Dopenid%2520profile%26response_mode%3Dform_post%26nonce%3D638155821350563268.MWM4Nzk1NWItZWVmZC00YWY3LWFhYzItNGMxNDUxYTk2ZmFmMTA5NDMyOTMtMGM3YS00ZTVmLWJiMGMtYzAwNjgwNzg1M2Zk%26state%3DCfDJ8MZRD63fBnFImJTC6y3bHadsgSvp9AVdx0NacvdPZGwpQNylTRq4Cd7s0WjAgTrcSFc9_7eNNnvrpHIOCwsyyXhcWbPXGK6zqBzcrQl-9rxsCR2LcJI76W9KRq5erMyQ4esKXZzqucuF7I7apokjJuH1ulpszZ1ynRpOkYhbPwnhWMvIj2IDPh-4bu3j-xU07HEkwFxT3jkigFQQlBeFAN3c8cRhqaWF5JVGXgKMPNHQs6nJNZeA9yh46_8zdkrbnmtkRSitgKJQxkrBF5M5WO9vsPiaPFzZfxwefDmxw0XfZxn8ui9LqlLdmMIGHYyMPLG84PxH_FaIiWKBR0rVttqZ2kzFALLGeHPZ0KuPK1qY%26x-client-SKU%3DID_NETSTANDARD2_0%26x-client-ver%3D6.11.0.0");
        driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("ntycmadmin");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("stage9999");
        driver.findElement(By.xpath("//button[@name='button']")).click();
        driver.findElement(By.xpath("//div[@class='multiselect-dropdown']")).click();
        driver.findElement(By.xpath("//div[@class='dropdown-list']")).click();


        //driver.findElement(By.xpath("//span[@class='dropdown-btn']")).click();
        //driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();

        //WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
        //wait.until(ExpectedConditions.);



    }
}
