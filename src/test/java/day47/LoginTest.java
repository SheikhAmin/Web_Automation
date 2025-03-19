package day47;

import Pom.LoginPage;
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
