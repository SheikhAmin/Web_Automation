package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUp {
    private final WebDriver driver;

    //Constructor
    public SignUp(WebDriver driver){this.driver = driver;}

    //Locators
    By txt_Name = By.cssSelector("input[placeholder='Name']");
    By txt_EmailAddress = By.cssSelector("[data-qa='signup-email']");
    By txt_btnSignUp = By.cssSelector("[data-qa='signup-button']");
    By txt_btnGender = By.cssSelector("input#id_gender1");
    By txt_Password = By.cssSelector("[data-qa='password']");
    By txt_Day = By.cssSelector("[data-qa='days']");
    By txt_Month = By.cssSelector("[data-qa='months']");
    By txt_Year = By.cssSelector("[data-qa='years']");
    By txt_Newsletter = By.cssSelector("#newsletter");
    By txt_Offer = By.cssSelector("#optin");
    By txt_FirstName = By.cssSelector("[data-qa='first_name']");
    By txt_LastName = By.cssSelector("[data-qa='last_name']");
    By txt_Company = By.cssSelector("[data-qa='company']");
    By txt_Address = By.cssSelector("[data-qa='address']");
    By txt_Address2 = By.cssSelector("[data-qa='address2']");
    By txt_Country = By.cssSelector("[data-qa='country']");
    By txt_State = By.cssSelector("[data-qa='state']");
    By txt_City = By.cssSelector("[data-qa='city']");
    By txt_ZipCode = By.cssSelector("#zipcode");
    By txt_MobileNum = By.cssSelector("#mobile_number");
    By txt_btn_CreateAccount = By.cssSelector("button[data-qa='create-account']");
    By txt_btn_Continue = By.cssSelector("[data-qa='continue-button']");


    // assign name
    public void setName(String name){
        driver.findElement(txt_Name).sendKeys(name);
    }

    // assign email address
    public void setEmailAddress(String email){
        driver.findElement(txt_EmailAddress).sendKeys(email);
    }

    // click sign up
    public void clickSignUp(){
        driver.findElement(txt_btnSignUp).click();
    }

    // select gender
    public void setGender(){
        driver.findElement(txt_btnGender).click();
    }

    // assign password
    public void setPassword(String pass) {
        driver.findElement(txt_Password).sendKeys(pass);
    }

    // select day
    public void setDay(String day) {
        WebElement dayDropdown = driver.findElement(txt_Day);
        Select select = new Select(dayDropdown);
        select.selectByVisibleText(day);
    }

    // select month
    public void setMonth(String month) {
        WebElement monthDropdown = driver.findElement(txt_Month);
        Select select = new Select(monthDropdown);
        select.selectByVisibleText(month);
    }

    // select year
    public void setYear(String year) {
        WebElement yearDropdown = driver.findElement(txt_Year);
        Select select = new Select(yearDropdown);
        select.selectByVisibleText(year);
    }

    // checkbox for newsletter
    public void clickNewsLetter() {
        driver.findElement(txt_Newsletter).click();
    }

    // checkbox for offer
    public void clickOffer() {
        driver.findElement(txt_Offer).click();
    }

    // assign first name
    public void setFirstName(String first_name) {
        driver.findElement(txt_FirstName).sendKeys(first_name);
    }

    // assign last name
    public void setLastName(String last_name) {
        driver.findElement(txt_LastName).sendKeys(last_name);
    }

    // assign company name
    public void setCompany(String company) {
        driver.findElement(txt_Company).sendKeys(company);
    }

    // provide address
    public void setAddress(String address) {
        driver.findElement(txt_Address).sendKeys(address);
    }

    // provide address 2
    public void setAddress2(String address2) {
        driver.findElement(txt_Address2).sendKeys(address2);
    };

    // provide city name
    public void setCity(String city) {
        driver.findElement(txt_City).sendKeys(city);
    };

    // provide state name
    public void setState(String state) {
        driver.findElement(txt_State).sendKeys(state);
    };

    // provide country name
    public void setCountry(String country) {
        WebElement countryDropdown = driver.findElement(txt_Country);
        Select select = new Select(countryDropdown);
        select.selectByVisibleText(country);
    };

    // provide zip code
    public void setZipCode(String zipcode) {
        driver.findElement(txt_ZipCode).sendKeys(zipcode);
    };

    // provide mobile number
    public void setMobileNum(String mobile_num) {
        driver.findElement(txt_MobileNum).sendKeys(mobile_num);
    };

    // click create account btn
    public void clickCreateAccount() {
        driver.findElement(txt_btn_CreateAccount).click();
    };

    // click continue btn
    public void clickContinue() {
        driver.findElement(txt_btn_CreateAccount).click();
    };
}
