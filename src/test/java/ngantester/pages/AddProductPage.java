package ngantester.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;
import java.security.Key;

public class AddProductPage {
    private Actions actions;
    private WebDriver driver;
    public AddProductPage(WebDriver driver)
    {
        this.driver = driver;

    }
    private String pageText = "Add projects";
    private String url = "/projects/all_projects";
    private By hederPageText = By.id("ajaxModalTitle");
    private By titleInput = By.id("title");
    private By clientDropDown = By.xpath("//label[@for='client_id']/following-sibling::div");

    private By searchClientInput = By.xpath("//div[@id ='select2-drop']/div/input");
    private By desInput = By.id("description");
    private By startDateInput = By.id("start_date");
    private By deadLineInput = By.id("deadline");
    private By pricesInput = By.id("price");
    private By labelInput = By.xpath("//div[@id='s2id_project_labels']//input");
    private By saveBtn = By.xpath("//button[@type='submit']");
    public boolean verifyUrl() {
        System.out.println(driver.getCurrentUrl());
        System.out.println(url);
        return driver.getCurrentUrl().contains(url);

    }
    public boolean verifyElementText() {
        return driver.findElement(hederPageText).getText().equals(pageText);
    }
    public void saveProduct() throws InterruptedException {
        Assert.assertTrue(verifyElementText(),"khongphai");
        driver.findElement(titleInput).sendKeys("PD01");
        Thread.sleep(1000);
        driver.findElement(clientDropDown).click();
        Thread.sleep(1000);
        driver.findElement(searchClientInput).sendKeys("Open Source");
        Thread.sleep(1000);
        actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(desInput).sendKeys("Auto Description");
        driver.findElement(startDateInput).sendKeys("2021-08-25");
        driver.findElement(deadLineInput).sendKeys("2021-08-30");
        driver.findElement(pricesInput).sendKeys("4000");
        Thread.sleep(1000);
        driver.findElement(labelInput).sendKeys("public");
        Thread.sleep(1000);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(saveBtn).click();

    }

}
