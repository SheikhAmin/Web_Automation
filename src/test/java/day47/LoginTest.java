package day47;

import Pom.LoginPage;
import Pom.SignUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.automationexercise.com/login");
        driver.manage().window().maximize();
    }

    @Test
    void testSignUp(){
        SignUp obj = new SignUp(driver);
        obj.setName("Sheikh Amin");
        obj.setEmailAddress("sheikamin.ael-b@gmail.com");
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
        obj.clickContinue();
    }
    /*
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

     */
}
