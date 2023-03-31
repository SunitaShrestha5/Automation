import Facebook.BrowserClass;
import Facebook.Registration;

public class FBRegistration extends BrowserClass {
    Registration registration;
    public void Setup(){
        String browser = "chrome";
        Browser(browser);
        registration = new Registration(driver);
    }
    public void SignUpTest(){
        registration.RegistrationFB();
    }
    public static void main(String[] args) {
        FBRegistration fr = new FBRegistration();
        fr.Setup();
        fr.SignUpTest();
    }

}

