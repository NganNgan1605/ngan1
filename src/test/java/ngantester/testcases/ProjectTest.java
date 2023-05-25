package ngantester.testcases;

import ngantester.commons.BaseSetup;
import ngantester.pages.AddProductPage;
import ngantester.pages.DashboardPage;
import ngantester.pages.ProjectPage;
import ngantester.pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectTest extends BaseSetup  {
    private WebDriver driver;
    private SignInPage signInPage;
    private DashboardPage dashboardPage;
    private ProjectPage projectPage;
    private AddProductPage addProductPage;
    @BeforeClass
    public void setupBrowse()
    {
       driver = getDriver();
    }
    @Test(priority = 1)
    public void signInPage() throws InterruptedException {
        signInPage = new SignInPage(driver);

        dashboardPage = signInPage.signIn("admin@demo.com","riseDemo");
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void openProjectPage() throws InterruptedException {
        //dashboardPage = new DashboardPage(driver);
        projectPage = dashboardPage.openProjectsPage();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void openAddProjectPage() throws InterruptedException {
        addProductPage = projectPage.addProject();
        //dashboardPage = new DashboardPage(driver);

        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void AddProject() throws InterruptedException {

      addProductPage.saveProduct();
        //dashboardPage = new DashboardPage(driver);

        Thread.sleep(2000);
    }
    @AfterClass
    public void closeBrowse() {
        driver.close();
    }

}
