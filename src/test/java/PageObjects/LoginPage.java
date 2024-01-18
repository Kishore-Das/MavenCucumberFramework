package PageObjects;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
    WebDriver driver;
    private static final By LoginBtn = By.xpath("//a[@href='/login']");
    private static final By UserID = By.xpath("//input[@data-qa='login-email']");
    private static final By Password = By.xpath("//input[@data-qa='login-password']");
    private static final By SubmitBtn = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

 public void clickOnSignInButton(){
     driver.findElement(LoginBtn).click();
 }
 public void enterUserID(){
        driver.findElement(UserID).clear();
        driver.findElement(UserID).sendKeys("abc");
 }

 public void enterPassword(){
     driver.findElement(Password).clear();
     driver.findElement(Password).sendKeys("xyz");
 }

 public void clickOnSubmitButton(){
     driver.findElement(SubmitBtn).click();
 }

}
