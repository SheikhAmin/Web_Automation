package day47;

import Pom.LoginPage;
import Pom.SignUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class LoginTest {
    WebDriver driver;
    @BeforeClass
    void setup(){
        ChromeOptions options = new ChromeOptions();

        // Disable address save prompts
        Map<String,Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service",false);
        prefs.put("profile.password_manager_enabled",false);
        options.setExperimentalOption("prefs",prefs);

        // optional: disable autofill completely
        options.addArguments("--disable-autofill");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.automationexercise.com/login");
        driver.manage().window().maximize();
    }

    @Test
    void testSignUp(){
        SignUp obj = new SignUp(driver);
        obj.setName("Sheikh Amin");
        obj.setEmailAddress("sheikamin.ab@gmail.com");
        obj.clickSignUp();
        obj.setGender();
        obj.setPassword("amin");
        obj.setDay("7");
        obj.setMonth("June");
        obj.setYear("1999");
        obj.clickNewsLetter();
        obj.clickOffer();
        obj.setFirstName("Sheikh");
        obj.setLastName("Amin");
        obj.setCompany("Dhaka Bank");
        obj.setAddress("244 East Nakhalpara Tejgaon, Dhaka-1215");
        obj.setAddress2("244 East Nakhalpara Tejgaon, Dhaka-1215");
        obj.setCountry("Canada");
        obj.setCity("Dhaka");
        obj.setState("Dhaka");
        obj.setZipCode("1215");
        obj.setMobileNum("01521255651");
        obj.clickCreateAccount();

        //obj.clickContinue();
    }

    void testLogin(){
        LoginPage lp = new LoginPage(driver);
        lp.setUserName("Amin_Faular");
        lp.setEmailAddress("email1942@gmail.com");
        lp.clickSignUp();
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }


}
