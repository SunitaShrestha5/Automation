package Facebook;

import Facebook.BrowserClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Month;

public class Registration extends BrowserClass {
    WebDriverWait wait;
    public Registration(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @FindBy(xpath = "//a[contains(text(),'Create new account')]")
    WebElement RegistrationButton;
    @FindBy(xpath = "//button[@name='websubmit']")
    WebElement Signup;
    @FindBy(xpath = "//input[@name='firstname']")
    WebElement FirstName;
    @FindBy(xpath = "//input[@name='lastname']")
    WebElement LastName;
    @FindBy(xpath = "//input[@name='reg_email__']")
    WebElement EmailNumber;
    @FindBy(xpath = "//input[@name='reg_passwd__']")
    WebElement Password;
    @FindBy(xpath = "//span/input[@value='2']")
    WebElement Gender;
    @FindBy(xpath = "//select[@id='month']")
    WebElement Month;
    public Select getMonth(){
        return new Select(Month);
    }
    @FindBy(xpath = "//select[@id='day']")
    WebElement Day;
    public Select getDay(){
        return new Select(Day);
    }
    @FindBy(xpath = "//select[@id='year']")
    WebElement Year;
    public Select getYear(){
        return new Select(Year);
    }
    public void RegistrationFB(){
        RegistrationButton.click();
        FirstName.sendKeys("Test");
        LastName.sendKeys("Test");
        EmailNumber.sendKeys("9843969555");
        Password.sendKeys("Test");
        Gender.click();
        getMonth().selectByValue("10");
        getDay().selectByValue("28");
        getYear().selectByValue("1998");
        Signup.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='websubmit']")));

        /*boolean status = Signup.isDisplayed();
        if(status){
            System.out.println("Displayed");
        }else {
            System.out.println("Not Displayed");
        }*/
    }


}
