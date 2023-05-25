package ngantester.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
 WebDriver driver;
 public SignInPage(WebDriver driver)
 {
  this.driver = driver;
 }
 private By emailInput = By.id("email");
 private By passwordlInput = By.id("password");
 private By signinBtn = By.xpath("//button[@type='submit')]");
 public DashboardPage signIn(String emailValue, String passwordVale)

 {
  driver.findElement(emailInput).sendKeys(emailValue);
  driver.findElement(passwordlInput).sendKeys(passwordVale);
  driver.findElement(signinBtn).click();
 return  new DashboardPage(driver);
 }

}


