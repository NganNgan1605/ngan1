package ngantester.testcases;

import ngantester.commons.BaseSetup;
import ngantester.pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class SignInTest extends BaseSetup {
    private WebDriver driver;
    private SignInPage signInPage;
    @BeforeClass
    public void setupBrowser()
    {
        driver = getDriver();
    }
@Test
    public void signInPage() throws InterruptedException {
    signInPage = new SignInPage(driver);

    signInPage.signIn("admin@demo.com","riseDemo");
    Thread.sleep(2000);
}

@AfterClass
    public void closeBrowser()
{
        driver.close();
}
}



