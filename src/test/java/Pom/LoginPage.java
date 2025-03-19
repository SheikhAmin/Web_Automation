package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    //constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Locator
    By txt_username_loc = By.cssSelector("input[type='text']");
    By txt_email_address_loc = By.cssSelector("input[data-qa='signup-email']");
    By txt_signupBtn_loc = By.cssSelector("button[data-qa='signup-button']");

    //Action Methods

    public void setUserName(String user){
        driver.findElement(txt_username_loc).sendKeys(user);
    }

    public void setEmailAddress(String email){
        driver.findElement(txt_email_address_loc).sendKeys(email);
    }

    public void clickSignUp(){
        driver.findElement(txt_signupBtn_loc).click();
    }


}
