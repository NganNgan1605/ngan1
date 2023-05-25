package ngantester.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class ProjectPage {
    private WebDriver driver;
    public ProjectPage(WebDriver driver)
    {
        this.driver = driver;
    }
    private String pageText = "Projects";
    private String url = "/projects/all_projects";
    private By hederPageText = By.tagName("h1");
    private By addProjectBtn = By.xpath("//a[@title='Add project']");

    public boolean verifyUrl()
    {
        System.out.println(driver.getCurrentUrl());
        System.out.println(url);
        return driver.getCurrentUrl().contains(url);
    }
    public boolean verifyElement()
    {
        return driver.findElement(hederPageText).getText().equals(pageText);
    }
 public AddProductPage addProject()
    {
        driver.findElement(addProjectBtn).click();
        return new AddProductPage(driver);
    }
}

