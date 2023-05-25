package ngantester.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashboardPage {
    private WebDriver driver;
    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
    }
    private By projectsMenu = By.xpath("//ul[@id='sidebar-menu']//span[contains(text(),'Projects']");
   private String url = "/dashboard";
   public boolean verifyUrl()
   {
       System.out.println(driver.getCurrentUrl());
       System.out.println(url);
        return driver.getCurrentUrl().contains(url);
   }
   public ProjectPage openProjectsPage()
   {
       Assert.assertTrue(verifyUrl(), "khoong phai");
       driver.findElement(projectsMenu).click();
       return new ProjectPage(driver);
   }

}


